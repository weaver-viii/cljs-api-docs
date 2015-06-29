## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/deref

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/deref</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/deref)
</td>
</tr>
</table>

 <samp>
(__deref__ x)<br>
</samp>

---

Returns the current value of atom `x`.

The `@` reader macro is often used instead of `deref`. `@foo` is the same thing
as `(deref foo)`.

---


See Also:

[`cljs.core/atom`](cljs.core_atom.md)<br>

---


Source code:

```clj
(defn deref
  [o]
  (-deref o))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:851-853](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L851-L853)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/deref"]))
```

```clj
{:description "Returns the current value of atom `x`.\n\nThe `@` reader macro is often used instead of `deref`. `@foo` is the same thing\nas `(deref foo)`.",
 :ns "cljs.core",
 :name "deref",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom"],
 :full-name-encode "cljs.core_deref",
 :source {:code "(defn deref\n  [o]\n  (-deref o))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [851 853]},
 :full-name "cljs.core/deref",
 :clj-symbol "clojure.core/deref"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_deref.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_deref.cljsdoc)
</pre>

