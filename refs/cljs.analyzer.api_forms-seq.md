## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.analyzer.api/forms-seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3208"><img valign="middle" alt="[+] 0.0-3208" src="https://img.shields.io/badge/+-0.0--3208-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__forms-seq__ rdr)<br>
</samp>
 <samp>
(__forms-seq__ rdr filename)<br>
</samp>

---




Source docstring:

```
Seq of Clojure/ClojureScript forms from rdr, a java.io.Reader. Optionally
accepts a filename argument which will be used in any emitted errors.
```

Source code:

```clj
(defn forms-seq
  ([rdr] (ana/forms-seq* rdr nil))
  ([rdr filename] (ana/forms-seq* rdr filename)))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── clojure
            └── cljs
                └── analyzer
                    └── <ins>[api.clj:41-45](https://github.com/clojure/clojurescript/blob/r3308/src/main/clojure/cljs/analyzer/api.clj#L41-L45)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.analyzer.api/forms-seq"]))
```

```clj
{:ns "cljs.analyzer.api",
 :name "forms-seq",
 :signature ["[rdr]" "[rdr filename]"],
 :history [["+" "0.0-3208"]],
 :type "function",
 :full-name-encode "cljs.analyzer.api_forms-seq",
 :source {:code "(defn forms-seq\n  ([rdr] (ana/forms-seq* rdr nil))\n  ([rdr filename] (ana/forms-seq* rdr filename)))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/clojure/cljs/analyzer/api.clj",
          :lines [41 45]},
 :full-name "cljs.analyzer.api/forms-seq",
 :docstring "Seq of Clojure/ClojureScript forms from rdr, a java.io.Reader. Optionally\naccepts a filename argument which will be used in any emitted errors."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.analyzer.api_forms-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.analyzer.api_forms-seq.cljsdoc)
</pre>

