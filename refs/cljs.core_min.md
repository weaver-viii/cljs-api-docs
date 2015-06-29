## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/min

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/min</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/min)
</td>
</tr>
</table>

 <samp>
(__min__ x)<br>
</samp>
 <samp>
(__min__ x y)<br>
</samp>
 <samp>
(__min__ x y & more)<br>
</samp>

---

Returns the least number argument.

---

Example:

```clj
(min 1 2 3 4)
;; => 1
```

Apply it to a collection:

```clj
(apply min [1 2 3 4])
;; => 1
```

---

See Also:

[`cljs.core/max`](cljs.core_max.md)<br>
[`cljs.core/min-key`](cljs.core_min-key.md)<br>

---

Source docstring:

```
Returns the least of the nums.
```

Source code:

```clj
(defn min
  ([x] x)
  ([x y] (cljs.core/min x y))
  ([x y & more]
   (reduce min (cljs.core/min x y) more)))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1112-1117](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1112-L1117)</ins>
</pre>


---

```clj
(defmacro min
  ([x] x)
  ([x y] (list 'js* "((~{} < ~{}) ? ~{} : ~{})" x y x y))
  ([x y & more] `(min (min ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:183-186](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L183-L186)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/min"]))
```

```clj
{:description "Returns the least number argument.",
 :ns "cljs.core",
 :name "min",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/max" "cljs.core/min-key"],
 :full-name-encode "cljs.core_min",
 :source {:code "(defn min\n  ([x] x)\n  ([x y] (cljs.core/min x y))\n  ([x y & more]\n   (reduce min (cljs.core/min x y) more)))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1112 1117]},
 :extra-sources ({:code "(defmacro min\n  ([x] x)\n  ([x y] (list 'js* \"((~{} < ~{}) ? ~{} : ~{})\" x y x y))\n  ([x y & more] `(min (min ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r1236",
                  :filename "src/clj/cljs/core.clj",
                  :lines [183 186]}),
 :examples [{:id "ab2de5",
             :content "```clj\n(min 1 2 3 4)\n;; => 1\n```\n\nApply it to a collection:\n\n```clj\n(apply min [1 2 3 4])\n;; => 1\n```"}],
 :full-name "cljs.core/min",
 :clj-symbol "clojure.core/min",
 :docstring "Returns the least of the nums."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_min.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_min.cljsdoc)
</pre>
