## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/with-meta

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/with-meta</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-meta)
</td>
</tr>
</table>

 <samp>
(__with-meta__ obj m)<br>
</samp>

---

Returns an object of the same type and value as `obj`, with map `m` as its
metadata.

---

Example:

```clj
(def a ^:foo [1 2 3])
(def b (with-meta a {:bar true}))

(= a b)
;;=> true

(meta a)
;;=> {:foo true}

(meta b)
;;=> {:bar true}
```

---

See Also:

[`cljs.core/alter-meta!`](cljs.core_alter-metaBANG.md)<br>
[`cljs.core/vary-meta`](cljs.core_vary-meta.md)<br>

---

Source docstring:

```
Returns an object of the same type and value as obj, with
map m as its metadata.
```

Source code:

```clj
(defn with-meta
  [o meta]
  (if (and (fn? o) (not (satisfies? IWithMeta o)))
    (MetaFn. o meta)
    (when-not (nil? o)
      (-with-meta o meta))))
```

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1693-1700](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L1693-L1700)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/with-meta"]))
```

```clj
{:description "Returns an object of the same type and value as `obj`, with map `m` as its\nmetadata.",
 :ns "cljs.core",
 :name "with-meta",
 :signature ["[obj m]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/alter-meta!" "cljs.core/vary-meta"],
 :full-name-encode "cljs.core_with-meta",
 :source {:code "(defn with-meta\n  [o meta]\n  (if (and (fn? o) (not (satisfies? IWithMeta o)))\n    (MetaFn. o meta)\n    (when-not (nil? o)\n      (-with-meta o meta))))",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1693 1700]},
 :examples [{:id "f189d4",
             :content "```clj\n(def a ^:foo [1 2 3])\n(def b (with-meta a {:bar true}))\n\n(= a b)\n;;=> true\n\n(meta a)\n;;=> {:foo true}\n\n(meta b)\n;;=> {:bar true}\n```"}],
 :full-name "cljs.core/with-meta",
 :clj-symbol "clojure.core/with-meta",
 :docstring "Returns an object of the same type and value as obj, with\nmap m as its metadata."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_with-meta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_with-meta.cljsdoc)
</pre>

