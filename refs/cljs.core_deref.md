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

Source docstring:

```
Also reader macro: @var/@atom/@delay. Returns the
most-recently-committed value of ref. When applied to a var
or atom, returns its current state. When applied to a delay, forces
it if not already forced. See also - realized?.
```

Source code:

```clj
(defn deref
  [o]
  (-deref o))
```

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1152-1158](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L1152-L1158)</ins>
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
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1152 1158]},
 :full-name "cljs.core/deref",
 :clj-symbol "clojure.core/deref",
 :docstring "Also reader macro: @var/@atom/@delay. Returns the\nmost-recently-committed value of ref. When applied to a var\nor atom, returns its current state. When applied to a delay, forces\nit if not already forced. See also - realized?."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_deref.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_deref.cljsdoc)
</pre>

