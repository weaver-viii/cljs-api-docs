## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/coll?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/coll?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/coll?)
</td>
</tr>
</table>

 <samp>
(__coll?__ x)<br>
</samp>

---

Returns true if `x` is a collection, false otherwise.

Lists, maps, sets, and vectors are collections.

---

Example:

```clj
(coll? [1 2 3])
;;=> true

(coll? '(1 2 3))
;;=> true

(coll? #{1 2 3})
;;=> true

(coll? {:foo 1 :bar 2})
;;=> true
```

Not collections:

```clj
(coll? "foo")
;;=> false

(coll? 123)
;;=> false

(coll? nil)
;;=> false
```

---

See Also:

[`cljs.core/seq?`](cljs.core_seqQMARK.md)<br>
[`cljs.core/list?`](cljs.core_listQMARK.md)<br>
[`cljs.core/sequential?`](cljs.core_sequentialQMARK.md)<br>

---

Source docstring:

```
Returns true if x satisfies ICollection
```

Source code:

```clj
(defn ^boolean coll?
  [x]
  (if (nil? x)
    false
    (satisfies? ICollection x)))
```

 <pre>
clojurescript @ r1934
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1087-1092](https://github.com/clojure/clojurescript/blob/r1934/src/cljs/cljs/core.cljs#L1087-L1092)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/coll?"]))
```

```clj
{:description "Returns true if `x` is a collection, false otherwise.\n\nLists, maps, sets, and vectors are collections.",
 :return-type boolean,
 :ns "cljs.core",
 :name "coll?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/seq?" "cljs.core/list?" "cljs.core/sequential?"],
 :full-name-encode "cljs.core_collQMARK",
 :source {:code "(defn ^boolean coll?\n  [x]\n  (if (nil? x)\n    false\n    (satisfies? ICollection x)))",
          :repo "clojurescript",
          :tag "r1934",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1087 1092]},
 :examples [{:id "d30884",
             :content "```clj\n(coll? [1 2 3])\n;;=> true\n\n(coll? '(1 2 3))\n;;=> true\n\n(coll? #{1 2 3})\n;;=> true\n\n(coll? {:foo 1 :bar 2})\n;;=> true\n```\n\nNot collections:\n\n```clj\n(coll? \"foo\")\n;;=> false\n\n(coll? 123)\n;;=> false\n\n(coll? nil)\n;;=> false\n```"}],
 :full-name "cljs.core/coll?",
 :clj-symbol "clojure.core/coll?",
 :docstring "Returns true if x satisfies ICollection"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_collQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_collQMARK.cljsdoc)
</pre>

