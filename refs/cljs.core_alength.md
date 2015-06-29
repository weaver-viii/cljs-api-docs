## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/alength

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/alength</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/alength)
</td>
</tr>
</table>

 <samp>
(__alength__ a)<br>
</samp>

---

For interop, it returns the length of a JavaScript array or string.

---

Example:

```clj
(def a #js [1 2 3])

(alength a)
;;=> 3

(.-length a)
;;=> 3

(aget a "length")
;;=> 3

(count a)
;;=> 3
```

---

See Also:

[`cljs.core/count`](cljs.core_count.md)<br>

---

Source docstring:

```
Returns the length of the array. Works on arrays of all types.
```

Source code:

```clj
(defn alength
  [array]
  (.-length array))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:101-104](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L101-L104)</ins>
</pre>


---

```clj
(defmacro alength [a]
  (list 'js* "~{}.length" a))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:851-852](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L851-L852)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/alength"]))
```

```clj
{:description "For interop, it returns the length of a JavaScript array or string.",
 :ns "cljs.core",
 :name "alength",
 :signature ["[a]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/count"],
 :full-name-encode "cljs.core_alength",
 :source {:code "(defn alength\n  [array]\n  (.-length array))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [101 104]},
 :extra-sources ({:code "(defmacro alength [a]\n  (list 'js* \"~{}.length\" a))",
                  :repo "clojurescript",
                  :tag "r1236",
                  :filename "src/clj/cljs/core.clj",
                  :lines [851 852]}),
 :examples [{:id "26f79f",
             :content "```clj\n(def a #js [1 2 3])\n\n(alength a)\n;;=> 3\n\n(.-length a)\n;;=> 3\n\n(aget a \"length\")\n;;=> 3\n\n(count a)\n;;=> 3\n```"}],
 :full-name "cljs.core/alength",
 :clj-symbol "clojure.core/alength",
 :docstring "Returns the length of the array. Works on arrays of all types."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_alength.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_alength.cljsdoc)
</pre>
