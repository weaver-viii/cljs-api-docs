(ns cljs-api-gen.catalog
  (:require
    [me.raynes.fs :refer [mkdir]]
    [cljs-api-gen.config :refer [docs-repo-dir
                                 *output-dir*]]
    [cljs-api-gen.parse :refer [*repo-version*
                                parse-all]]
    [cljs-api-gen.repo-cljs :refer [clone-or-fetch-repos
                                    get-versions-to-parse
                                    verify-docs-repo-sync!
                                    checkout-version!
                                    get-repo-version
                                    cljs-tag->version]]
    [cljs-api-gen.repo-docs :refer [prepare-docs-repo!
                                    clear-docs-repo!
                                    commit-docs-repo!]]
    [cljs-api-gen.history :refer [get-symbol-history
                                  update-history!
                                  attach-history-to-items]]
    [cljs-api-gen.write :refer [dump-api-docs!]]

    ))

(defn create-catalog!
  [args]

  (println "\nCloning or updating repos...")
  (clone-or-fetch-repos)

  (prepare-docs-repo!)

  (let [[latest history] (get-symbol-history)
        [past-versions versions-left] (get-versions-to-parse latest)
        arg1 (first args)
        versions (if arg1
                   (try
                     (take (Integer/parseInt arg1) versions-left) ;; argument is number of versions to parse
                     (catch Exception e
                       (if (= (first arg1) \r) ;; argument is version number to check out
                         [arg1]
                         versions-left)))
                   versions-left)]

    (println "\nVerifying docs-repo is in sync with symbol-history...")
    (verify-docs-repo-sync! past-versions versions-left)

    (doseq [version versions]

      (println "\n=========================================================")
      (println "\nChecking out" version "...")
      (checkout-version! version)

      (binding [*output-dir* docs-repo-dir
                *repo-version* {"clojurescript" version
                                "clojure" (get-repo-version "clojure")}]
        (println "using Clojure version:" (get *repo-version* "clojure"))

        (println "\nParsing...")
        (let [parsed (parse-all)
              symbols (set (map :full-name parsed))]

          (clear-docs-repo!)

          (println "\nWriting updated history to" history-filename "...")
          (mkdir *output-dir*)
          (update-history! history version symbols)

          (println "\nWriting docs to" *output-dir*)
          (mkdir (str *output-dir* "/" docs-dir))
          (let [parsed (attach-history-to-items parsed (:version-map @history))]
            (dump-api-docs! parsed))

          (println "\nCommitting docs at tag" (cljs-tag->version version) "...")
          (commit-docs-repo!))

        (println "\nDone.")))))