## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*print-meta\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-meta\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-meta*)
</td>
</tr>
</table>





Source docstring:

```
If set to logical true, when printing an object, its metadata will also
be printed in a form that can be read back by the reader.

Defaults to false.
```

Source code:

```clj
(def
  ^{:dynamic true
    :doc "If set to logical true, when printing an object, its metadata will also
  be printed in a form that can be read back by the reader.

  Defaults to false."}
  *print-meta* false)
```

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:63-69](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L63-L69)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-meta*"]))
```

```clj
{:ns "cljs.core",
 :name "*print-meta*",
 :history [["+" "0.0-927"]],
 :type "dynamic var",
 :full-name-encode "cljs.core_STARprint-metaSTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"If set to logical true, when printing an object, its metadata will also\n  be printed in a form that can be read back by the reader.\n\n  Defaults to false.\"}\n  *print-meta* false)",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/core.cljs",
          :lines [63 69]},
 :full-name "cljs.core/*print-meta*",
 :clj-symbol "clojure.core/*print-meta*",
 :docstring "If set to logical true, when printing an object, its metadata will also\nbe printed in a form that can be read back by the reader.\n\nDefaults to false."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARprint-metaSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARprint-metaSTAR.cljsdoc)
</pre>

