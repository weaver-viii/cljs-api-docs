## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vary-meta

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vary-meta</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vary-meta)
</td>
</tr>
</table>

 <samp>
(__vary-meta__ obj f & args)<br>
</samp>

---

Returns an object of the same type and value as `obj`, with
`(apply f (meta obj) args)` as its metadata.

---

Example:

```clj
(def a ^:foo [1 2 3])
(def b (vary-meta a assoc :bar true))

(= a b)
;;=> true

(meta a)
;;=> {:foo true}

(meta b)
;;=> {:foo true, :bar true}
```

---

See Also:

[`cljs.core/alter-meta!`](cljs.core_alter-metaBANG.md)<br>
[`cljs.core/with-meta`](cljs.core_with-meta.md)<br>

---

Source docstring:

```
Returns an object of the same type and value as obj, with
(apply f (meta obj) args) as its metadata.
```

Source code:

```clj
(defn vary-meta
  ([obj f]
   (with-meta obj (f (meta obj))))
  ([obj f a]
   (with-meta obj (f (meta obj) a)))
  ([obj f a b]
   (with-meta obj (f (meta obj) a b)))
  ([obj f a b c]
   (with-meta obj (f (meta obj) a b c)))
  ([obj f a b c d]
   (with-meta obj (f (meta obj) a b c d)))
  ([obj f a b c d & args]
   (with-meta obj (apply f (meta obj) a b c d args))))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2958-2972](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L2958-L2972)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vary-meta"]))
```

```clj
{:description "Returns an object of the same type and value as `obj`, with\n`(apply f (meta obj) args)` as its metadata.",
 :ns "cljs.core",
 :name "vary-meta",
 :signature ["[obj f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/alter-meta!" "cljs.core/with-meta"],
 :full-name-encode "cljs.core_vary-meta",
 :source {:code "(defn vary-meta\n  ([obj f]\n   (with-meta obj (f (meta obj))))\n  ([obj f a]\n   (with-meta obj (f (meta obj) a)))\n  ([obj f a b]\n   (with-meta obj (f (meta obj) a b)))\n  ([obj f a b c]\n   (with-meta obj (f (meta obj) a b c)))\n  ([obj f a b c d]\n   (with-meta obj (f (meta obj) a b c d)))\n  ([obj f a b c d & args]\n   (with-meta obj (apply f (meta obj) a b c d args))))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2958 2972]},
 :examples [{:id "8cca62",
             :content "```clj\n(def a ^:foo [1 2 3])\n(def b (vary-meta a assoc :bar true))\n\n(= a b)\n;;=> true\n\n(meta a)\n;;=> {:foo true}\n\n(meta b)\n;;=> {:foo true, :bar true}\n```"}],
 :full-name "cljs.core/vary-meta",
 :clj-symbol "clojure.core/vary-meta",
 :docstring "Returns an object of the same type and value as obj, with\n(apply f (meta obj) args) as its metadata."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vary-meta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vary-meta.cljsdoc)
</pre>

