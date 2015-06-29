## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/js-filename

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-filename__ stack-element)<br>
</samp>

---





Source code:

```clj
(defn js-filename [stack-element]
  (first (.split (last (.split stack-element "/out/")) ":")))
```

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:328-329](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/test.cljs#L328-L329)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/js-filename"]))
```

```clj
{:ns "cljs.test",
 :name "js-filename",
 :type "function",
 :signature ["[stack-element]"],
 :source {:code "(defn js-filename [stack-element]\n  (first (.split (last (.split stack-element \"/out/\")) \":\")))",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/test.cljs",
          :lines [328 329]},
 :full-name "cljs.test/js-filename",
 :full-name-encode "cljs.test_js-filename",
 :history [["+" "0.0-2496"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_js-filename.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_js-filename.cljsdoc)
</pre>

