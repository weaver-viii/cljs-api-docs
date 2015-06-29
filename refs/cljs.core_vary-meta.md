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
 [obj f & args]
 (with-meta obj (apply f (meta obj) args)))
```

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2194-2198](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L2194-L2198)</ins>
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
 :source {:code "(defn vary-meta\n [obj f & args]\n (with-meta obj (apply f (meta obj) args)))",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2194 2198]},
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

