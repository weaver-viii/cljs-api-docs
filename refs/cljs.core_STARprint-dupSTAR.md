## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*print-dup\*

 <table border="1">
<tr>

<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-dup\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-dup*)
</td>
</tr>
</table>





Source docstring:

```
When set to logical true, objects will be printed in a way that preserves
their type when read in later.

Defaults to false.
```

Source code:

```clj
(def
  ^{:dynamic true
    :doc "When set to logical true, objects will be printed in a way that preserves
  their type when read in later.

  Defaults to false."}
  *print-dup* false)
```

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:71-77](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/core.cljs#L71-L77)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-dup*"]))
```

```clj
{:ns "cljs.core",
 :name "*print-dup*",
 :history [["+" "0.0-927"]],
 :type "dynamic var",
 :full-name-encode "cljs.core_STARprint-dupSTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"When set to logical true, objects will be printed in a way that preserves\n  their type when read in later.\n\n  Defaults to false.\"}\n  *print-dup* false)",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/core.cljs",
          :lines [71 77]},
 :full-name "cljs.core/*print-dup*",
 :clj-symbol "clojure.core/*print-dup*",
 :docstring "When set to logical true, objects will be printed in a way that preserves\ntheir type when read in later.\n\nDefaults to false."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STARprint-dupSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STARprint-dupSTAR.cljsdoc)
</pre>

