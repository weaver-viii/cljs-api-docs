## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/send-static

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-static__ {path :path, :as request} conn opts)<br>
</samp>

---





Source code:

```clj
(defn send-static [{path :path :as request} conn opts]
  (if (and (:static-dir opts)
           (not= "/favicon.ico" path))
    (let [path   (if (= "/" path) "/index.html" path)
          st-dir (:static-dir opts)
          local-path (cond->
                       (seq (for [x (if (string? st-dir) [st-dir] st-dir)
                                  :when (.exists (io/file (str x path)))]
                              (str x path)))
                       (complement nil?) first)
          local-path (if (nil? local-path)
                       (cond
                         (re-find #".jar" path)
                         (io/resource (second (string/split path #".jar!/")))
                         (re-find (Pattern/compile (System/getProperty "user.dir")) path)
                         (io/file (string/replace path (str (System/getProperty "user.dir") "/") ""))
                         :else nil)
                       local-path)]
      (if local-path
        (server/send-and-close conn 200 (slurp local-path)
          (condp #(.endsWith %2 %1) path
            ".html" "text/html"
            ".css" "text/css"
            ".html" "text/html"
            ".jpg" "image/jpeg"
            ".js" "text/javascript"
            ".cljs" "text/x-clojure"
            ".map" "application/json"
            ".png" "image/png"
            "text/plain"))
        (server/send-404 conn path)))
    (server/send-404 conn path)))
```

 <pre>
clojurescript @ r2342
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:64-95](https://github.com/clojure/clojurescript/blob/r2342/src/clj/cljs/repl/browser.clj#L64-L95)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/send-static"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "send-static",
 :type "function",
 :signature ["[{path :path, :as request} conn opts]"],
 :source {:code "(defn send-static [{path :path :as request} conn opts]\n  (if (and (:static-dir opts)\n           (not= \"/favicon.ico\" path))\n    (let [path   (if (= \"/\" path) \"/index.html\" path)\n          st-dir (:static-dir opts)\n          local-path (cond->\n                       (seq (for [x (if (string? st-dir) [st-dir] st-dir)\n                                  :when (.exists (io/file (str x path)))]\n                              (str x path)))\n                       (complement nil?) first)\n          local-path (if (nil? local-path)\n                       (cond\n                         (re-find #\".jar\" path)\n                         (io/resource (second (string/split path #\".jar!/\")))\n                         (re-find (Pattern/compile (System/getProperty \"user.dir\")) path)\n                         (io/file (string/replace path (str (System/getProperty \"user.dir\") \"/\") \"\"))\n                         :else nil)\n                       local-path)]\n      (if local-path\n        (server/send-and-close conn 200 (slurp local-path)\n          (condp #(.endsWith %2 %1) path\n            \".html\" \"text/html\"\n            \".css\" \"text/css\"\n            \".html\" \"text/html\"\n            \".jpg\" \"image/jpeg\"\n            \".js\" \"text/javascript\"\n            \".cljs\" \"text/x-clojure\"\n            \".map\" \"application/json\"\n            \".png\" \"image/png\"\n            \"text/plain\"))\n        (server/send-404 conn path)))\n    (server/send-404 conn path)))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [64 95]},
 :full-name "cljs.repl.browser/send-static",
 :full-name-encode "cljs.repl.browser_send-static",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_send-static.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_send-static.cljsdoc)
</pre>

