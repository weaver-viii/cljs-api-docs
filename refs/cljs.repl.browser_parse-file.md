## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/parse-file

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3053"><img valign="middle" alt="[+] 0.0-3053" src="https://img.shields.io/badge/+-0.0--3053-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__parse-file__ file opts)<br>
</samp>

---





Source code:

```clj
(defn parse-file [file opts]
  (if (re-find #"http://localhost:9000/" file)
    (-> file
      (string/replace #"http://localhost:9000/" "")
      (string/replace (Pattern/compile (str "^" (util/output-directory opts) "/")) ""))
    (if-let [asset-root (:asset-root opts)]
      (string/replace file asset-root "")
      (throw
        (ex-info (str "Could not relativize URL " file)
          {:type :parse-stacktrace
           :reason :relativize-url})))))
```

 <pre>
clojurescript @ r3126
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:215-225](https://github.com/clojure/clojurescript/blob/r3126/src/clj/cljs/repl/browser.clj#L215-L225)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/parse-file"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "parse-file",
 :type "function",
 :signature ["[file opts]"],
 :source {:code "(defn parse-file [file opts]\n  (if (re-find #\"http://localhost:9000/\" file)\n    (-> file\n      (string/replace #\"http://localhost:9000/\" \"\")\n      (string/replace (Pattern/compile (str \"^\" (util/output-directory opts) \"/\")) \"\"))\n    (if-let [asset-root (:asset-root opts)]\n      (string/replace file asset-root \"\")\n      (throw\n        (ex-info (str \"Could not relativize URL \" file)\n          {:type :parse-stacktrace\n           :reason :relativize-url})))))",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [215 225]},
 :full-name "cljs.repl.browser/parse-file",
 :full-name-encode "cljs.repl.browser_parse-file",
 :history [["+" "0.0-3053"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_parse-file.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_parse-file.cljsdoc)
</pre>

