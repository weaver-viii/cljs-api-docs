## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/alter-meta!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/alter-meta!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/alter-meta!)
</td>
</tr>
</table>

 <samp>
(__alter-meta!__ data f & args)<br>
</samp>

---

Alter the metadata of `data` to be `(apply f its-current-meta args)`.

Metadata of vars cannot be altered since they are statically determined at compile-time.

---

Example:

Metadata of symbols and collections can be altered:

```clj
(def a ^:foo [1 2 3])
(meta a)
;;=> {:foo true}

(alter-meta! a assoc :bar true)
(meta a)
;;=> {:foo true, :bar true}
```

Metadata of vars cannot be altered:

```clj
(def a [1 2 3])
(meta #'a)
;;=> {:arglists (), :test nil, :name a, :column 1, :line 1, :file "<cljs repl>", :doc nil, :ns cljs.user}

(alter-meta! #'a assoc :bar true)
(:bar (meta #'a))
;;=> nil
```

---

See Also:

[`cljs.core/with-meta`](cljs.core_with-meta.md)<br>
[`cljs.core/vary-meta`](cljs.core_vary-meta.md)<br>

---

Source docstring:

```
Atomically sets the metadata for a namespace/var/ref/agent/atom to be:

(apply f its-current-meta args)

f must be free of side-effects
```

Source code:

```clj
(defn alter-meta!
  [iref f & args]
  (set! (.-meta iref) (apply f (.-meta iref) args)))
```

 <pre>
clojurescript @ r2816
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8459-8466](https://github.com/clojure/clojurescript/blob/r2816/src/cljs/cljs/core.cljs#L8459-L8466)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/alter-meta!"]))
```

```clj
{:description "Alter the metadata of `data` to be `(apply f its-current-meta args)`.\n\nMetadata of vars cannot be altered since they are statically determined at compile-time.",
 :ns "cljs.core",
 :name "alter-meta!",
 :signature ["[data f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/with-meta" "cljs.core/vary-meta"],
 :full-name-encode "cljs.core_alter-metaBANG",
 :source {:code "(defn alter-meta!\n  [iref f & args]\n  (set! (.-meta iref) (apply f (.-meta iref) args)))",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8459 8466]},
 :examples [{:id "8378a0",
             :content "Metadata of symbols and collections can be altered:\n\n```clj\n(def a ^:foo [1 2 3])\n(meta a)\n;;=> {:foo true}\n\n(alter-meta! a assoc :bar true)\n(meta a)\n;;=> {:foo true, :bar true}\n```\n\nMetadata of vars cannot be altered:\n\n```clj\n(def a [1 2 3])\n(meta #'a)\n;;=> {:arglists (), :test nil, :name a, :column 1, :line 1, :file \"<cljs repl>\", :doc nil, :ns cljs.user}\n\n(alter-meta! #'a assoc :bar true)\n(:bar (meta #'a))\n;;=> nil\n```"}],
 :full-name "cljs.core/alter-meta!",
 :clj-symbol "clojure.core/alter-meta!",
 :docstring "Atomically sets the metadata for a namespace/var/ref/agent/atom to be:\n\n(apply f its-current-meta args)\n\nf must be free of side-effects"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_alter-metaBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_alter-metaBANG.cljsdoc)
</pre>

