## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/<

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/<</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/<)
</td>
</tr>
</table>

 <samp>
(__<__ x)<br>
</samp>
 <samp>
(__<__ x y)<br>
</samp>
 <samp>
(__<__ x y & more)<br>
</samp>

---

Returns true if each successive number argument is greater than the previous
one, false otherwise.

---

Example:

```clj
(< 1 2)
;;=> true

(< 2 1)
;;=> false

(< 1 1)
;;=> false

(< 2 3 4 5 6)
;;=> true
```

---

See Also:

[`cljs.core/<=`](cljs.core_LTEQ.md)<br>

---

Source docstring:

```
Returns non-nil if nums are in monotonically increasing order,
otherwise false.
```

Source code:

```clj
(defn ^boolean <
  ([x] true)
  ([x y] (cljs.core/< x y))
  ([x y & more]
     (if (cljs.core/< x y)
       (if (next more)
         (recur y (first more) (next more))
         (cljs.core/< y (first more)))
       false)))
```

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1210-1220](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L1210-L1220)</ins>
</pre>


---

```clj
(defmacro <
  ([x] true)
  ([x y] (bool-expr (list 'js* "(~{} < ~{})" x y)))
  ([x y & more] `(and (< ~x ~y) (< ~y ~@more))))
```

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:243-246](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/core.clj#L243-L246)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/<"]))
```

```clj
{:description "Returns true if each successive number argument is greater than the previous\none, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "<",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/<="],
 :full-name-encode "cljs.core_LT",
 :source {:code "(defn ^boolean <\n  ([x] true)\n  ([x y] (cljs.core/< x y))\n  ([x y & more]\n     (if (cljs.core/< x y)\n       (if (next more)\n         (recur y (first more) (next more))\n         (cljs.core/< y (first more)))\n       false)))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1210 1220]},
 :extra-sources ({:code "(defmacro <\n  ([x] true)\n  ([x y] (bool-expr (list 'js* \"(~{} < ~{})\" x y)))\n  ([x y & more] `(and (< ~x ~y) (< ~y ~@more))))",
                  :repo "clojurescript",
                  :tag "r1450",
                  :filename "src/clj/cljs/core.clj",
                  :lines [243 246]}),
 :examples [{:id "02e6d3",
             :content "```clj\n(< 1 2)\n;;=> true\n\n(< 2 1)\n;;=> false\n\n(< 1 1)\n;;=> false\n\n(< 2 3 4 5 6)\n;;=> true\n```"}],
 :full-name "cljs.core/<",
 :clj-symbol "clojure.core/<",
 :docstring "Returns non-nil if nums are in monotonically increasing order,\notherwise false."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_LT.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_LT.cljsdoc)
</pre>

