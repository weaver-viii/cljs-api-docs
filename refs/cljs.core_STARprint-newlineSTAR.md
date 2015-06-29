## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*print-newline\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2060"><img valign="middle" alt="[+] 0.0-2060" src="https://img.shields.io/badge/+-0.0--2060-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
When set to logical false will drop newlines from printing calls.
This is to work around the implicit newlines emitted by standard JavaScript
console objects.
```

Source code:

```clj
(def
  ^{:dynamic true
    :doc "When set to logical false will drop newlines from printing calls.
  This is to work around the implicit newlines emitted by standard JavaScript
  console objects."}
  *print-newline* true)
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:48-53](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/core.cljs#L48-L53)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-newline*"]))
```

```clj
{:ns "cljs.core",
 :name "*print-newline*",
 :docstring "When set to logical false will drop newlines from printing calls.\nThis is to work around the implicit newlines emitted by standard JavaScript\nconsole objects.",
 :type "dynamic var",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"When set to logical false will drop newlines from printing calls.\n  This is to work around the implicit newlines emitted by standard JavaScript\n  console objects.\"}\n  *print-newline* true)",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/core.cljs",
          :lines [48 53]},
 :full-name "cljs.core/*print-newline*",
 :full-name-encode "cljs.core_STARprint-newlineSTAR",
 :history [["+" "0.0-2060"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARprint-newlineSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARprint-newlineSTAR.cljsdoc)
</pre>

