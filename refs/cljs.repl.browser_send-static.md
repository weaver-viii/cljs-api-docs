## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/send-static

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-static__ opts conn {path :path, :as request})<br>
</samp>

---





Source code:

```clj
(defn send-static [opts conn {path :path :as request}]
  (if (and (:static-dir opts)
           (not= "/favicon.ico" path))
    (let [path   (if (= "/" path) "/index.html" path)
          st-dir (:static-dir opts)]
      (if-let [local-path (seq (for [x (if (string? st-dir) [st-dir] st-dir)
                                     :when (.exists (io/file (str x path)))]
                                 (str x path)))]
        (send-and-close conn 200 (slurp (first local-path))
                        (condp #(.endsWith %2 %1) path
                          ".js" "text/javascript"
                          ".html" "text/html"
                          "text/plain"))
        (send-404 conn path)))
    (send-404 conn path)))
```

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:183-197](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L183-L197)</ins>
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
 :signature ["[opts conn {path :path, :as request}]"],
 :source {:code "(defn send-static [opts conn {path :path :as request}]\n  (if (and (:static-dir opts)\n           (not= \"/favicon.ico\" path))\n    (let [path   (if (= \"/\" path) \"/index.html\" path)\n          st-dir (:static-dir opts)]\n      (if-let [local-path (seq (for [x (if (string? st-dir) [st-dir] st-dir)\n                                     :when (.exists (io/file (str x path)))]\n                                 (str x path)))]\n        (send-and-close conn 200 (slurp (first local-path))\n                        (condp #(.endsWith %2 %1) path\n                          \".js\" \"text/javascript\"\n                          \".html\" \"text/html\"\n                          \"text/plain\"))\n        (send-404 conn path)))\n    (send-404 conn path)))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [183 197]},
 :full-name "cljs.repl.browser/send-static",
 :full-name-encode "cljs.repl.browser_send-static",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_send-static.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_send-static.cljsdoc)
</pre>

