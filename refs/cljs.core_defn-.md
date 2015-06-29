## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defn-

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defn-</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defn-)
</td>
</tr>
</table>

 <samp>
(__defn-__ name & decls)<br>
</samp>

---

Same as `defn`, but adds `{:private true}` metadata to the definition.

Note: `:private` metadata is not currently enforced by the ClojureScript
compiler.

---


See Also:

[`cljs.core/defn`](cljs.core_defn.md)<br>

---

Source docstring:

```
same as defn, yielding non-public def
```

Source code:

```clj
(defmacro defn-
  [name & decls]
    (list* `defn (with-meta name (assoc (meta name) :private true)) decls))
```

 <pre>
clojure @ clojure-1.7.0-beta1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4717-4721](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta1/src/clj/clojure/core.clj#L4717-L4721)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defn-"]))
```

```clj
{:description "Same as `defn`, but adds `{:private true}` metadata to the definition.\n\nNote: `:private` metadata is not currently enforced by the ClojureScript\ncompiler.",
 :ns "cljs.core",
 :name "defn-",
 :signature ["[name & decls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/defn"],
 :full-name-encode "cljs.core_defn-",
 :source {:code "(defmacro defn-\n  [name & decls]\n    (list* `defn (with-meta name (assoc (meta name) :private true)) decls))",
          :repo "clojure",
          :tag "clojure-1.7.0-beta1",
          :filename "src/clj/clojure/core.clj",
          :lines [4717 4721]},
 :full-name "cljs.core/defn-",
 :clj-symbol "clojure.core/defn-",
 :docstring "same as defn, yielding non-public def"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_defn-.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_defn-.cljsdoc)
</pre>

