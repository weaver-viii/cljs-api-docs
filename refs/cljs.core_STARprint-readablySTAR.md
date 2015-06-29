## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*print-readably\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-readably\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-readably*)
</td>
</tr>
</table>





Source docstring:

```
When set to logical false, strings and characters will be printed with
non-alphanumeric characters converted to the appropriate escape sequences.

Defaults to true
```

Source code:

```clj
(def
  ^{:dynamic true
    :doc "When set to logical false, strings and characters will be printed with
  non-alphanumeric characters converted to the appropriate escape sequences.

  Defaults to true"}
  *print-readably* true)
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:55-61](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L55-L61)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-readably*"]))
```

```clj
{:ns "cljs.core",
 :name "*print-readably*",
 :history [["+" "0.0-927"]],
 :type "dynamic var",
 :full-name-encode "cljs.core_STARprint-readablySTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"When set to logical false, strings and characters will be printed with\n  non-alphanumeric characters converted to the appropriate escape sequences.\n\n  Defaults to true\"}\n  *print-readably* true)",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [55 61]},
 :full-name "cljs.core/*print-readably*",
 :clj-symbol "clojure.core/*print-readably*",
 :docstring "When set to logical false, strings and characters will be printed with\nnon-alphanumeric characters converted to the appropriate escape sequences.\n\nDefaults to true"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARprint-readablySTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARprint-readablySTAR.cljsdoc)
</pre>

