## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/file-and-line

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__file-and-line__ exception depth)<br>
</samp>

---





Source code:

```clj
(defn file-and-line [exception depth]
  ;; TODO: flesh out
  (if-let [stack-element (and (string? (.-stack exception))
                              (some-> (.-stack exception)
                                      string/split-lines
                                      (get depth)
                                      string/trim))]
    (let [fname (js-filename stack-element)
          [line column] (js-line-and-column stack-element)
          [fname line column] (mapped-line-and-column fname line column)]
      {:file fname :line line :column column})
    {:file (.-fileName exception)
     :line (.-lineNumber exception)}))
```

 <pre>
clojurescript @ r3208
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:374-386](https://github.com/clojure/clojurescript/blob/r3208/src/cljs/cljs/test.cljs#L374-L386)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/file-and-line"]))
```

```clj
{:ns "cljs.test",
 :name "file-and-line",
 :type "function",
 :signature ["[exception depth]"],
 :source {:code "(defn file-and-line [exception depth]\n  ;; TODO: flesh out\n  (if-let [stack-element (and (string? (.-stack exception))\n                              (some-> (.-stack exception)\n                                      string/split-lines\n                                      (get depth)\n                                      string/trim))]\n    (let [fname (js-filename stack-element)\n          [line column] (js-line-and-column stack-element)\n          [fname line column] (mapped-line-and-column fname line column)]\n      {:file fname :line line :column column})\n    {:file (.-fileName exception)\n     :line (.-lineNumber exception)}))",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/cljs/cljs/test.cljs",
          :lines [374 386]},
 :full-name "cljs.test/file-and-line",
 :full-name-encode "cljs.test_file-and-line",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_file-and-line.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_file-and-line.cljsdoc)
</pre>

