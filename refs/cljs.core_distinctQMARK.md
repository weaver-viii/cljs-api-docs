## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/distinct?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/distinct?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/distinct?)
</td>
</tr>
</table>

 <samp>
(__distinct?__ x)<br>
</samp>
 <samp>
(__distinct?__ x y)<br>
</samp>
 <samp>
(__distinct?__ x y & more)<br>
</samp>

---

Returns true if no two of the arguments are `=`

---

Example:

```clj
(distinct? 1)
;;=> true

(distinct? 1 2)
;;=> true

(distinct? 1 1)
;;=> false

(distinct? 1 2 3)
;;=> true

(distinct? 1 2 1)
;;=> false
```

Apply it a collection:

```clj
(apply distinct? [1 2 3])
;;=> true

(apply distinct? [1 2 1])
;;=> false
```

---

See Also:

[`cljs.core/distinct`](cljs.core_distinct.md)<br>

---

Source docstring:

```
Returns true if no two of the arguments are =
```

Source code:

```clj
(defn ^boolean distinct?
  ([x] true)
  ([x y] (not (= x y)))
  ([x y & more]
     (if (not (= x y))
     (loop [s #{x y} xs more]
       (let [x (first xs)
             etc (next xs)]
         (if xs
           (if (contains? s x)
             false
             (recur (conj s x) etc))
           true)))
     false)))
```

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1187-1201](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1187-L1201)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/distinct?"]))
```

```clj
{:description "Returns true if no two of the arguments are `=`",
 :return-type boolean,
 :ns "cljs.core",
 :name "distinct?",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/distinct"],
 :full-name-encode "cljs.core_distinctQMARK",
 :source {:code "(defn ^boolean distinct?\n  ([x] true)\n  ([x y] (not (= x y)))\n  ([x y & more]\n     (if (not (= x y))\n     (loop [s #{x y} xs more]\n       (let [x (first xs)\n             etc (next xs)]\n         (if xs\n           (if (contains? s x)\n             false\n             (recur (conj s x) etc))\n           true)))\n     false)))",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1187 1201]},
 :examples [{:id "b32799",
             :content "```clj\n(distinct? 1)\n;;=> true\n\n(distinct? 1 2)\n;;=> true\n\n(distinct? 1 1)\n;;=> false\n\n(distinct? 1 2 3)\n;;=> true\n\n(distinct? 1 2 1)\n;;=> false\n```\n\nApply it a collection:\n\n```clj\n(apply distinct? [1 2 3])\n;;=> true\n\n(apply distinct? [1 2 1])\n;;=> false\n```"}],
 :full-name "cljs.core/distinct?",
 :clj-symbol "clojure.core/distinct?",
 :docstring "Returns true if no two of the arguments are ="}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_distinctQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_distinctQMARK.cljsdoc)
</pre>

