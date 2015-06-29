## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/make-array

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/make-array</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/make-array)
</td>
</tr>
</table>

 <samp>
(__make-array__ size)<br>
</samp>

---

Creates an empty JavaScript array of size `size`.

---


See Also:

[`cljs.core/aclone`](cljs.core_aclone.md)<br>
[`cljs.core/array`](cljs.core_array.md)<br>

---

Source docstring:

```
Construct a JavaScript array of specified size. Accepts ignored type
argument for compatibility with Clojure.
```

Source code:

```clj
(defn ^array make-array
  ([size]
     (js/Array. size))
  ([type size]
     (make-array size)))
```

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:238-244](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L238-L244)</ins>
</pre>


---

```clj
(defmacro make-array
  [size]
  (vary-meta
    (if (core/number? size)
      `(array ~@(take size (repeat nil)))
      `(js/Array. ~size))
    assoc :tag 'array))
```

 <pre>
clojurescript @ r3148
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1683-1689](https://github.com/clojure/clojurescript/blob/r3148/src/clj/cljs/core.clj#L1683-L1689)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/make-array"]))
```

```clj
{:description "Creates an empty JavaScript array of size `size`.",
 :return-type array,
 :ns "cljs.core",
 :name "make-array",
 :signature ["[size]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :related ["cljs.core/aclone" "cljs.core/array"],
 :full-name-encode "cljs.core_make-array",
 :source {:code "(defn ^array make-array\n  ([size]\n     (js/Array. size))\n  ([type size]\n     (make-array size)))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [238 244]},
 :extra-sources ({:code "(defmacro make-array\n  [size]\n  (vary-meta\n    (if (core/number? size)\n      `(array ~@(take size (repeat nil)))\n      `(js/Array. ~size))\n    assoc :tag 'array))",
                  :repo "clojurescript",
                  :tag "r3148",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1683 1689]}),
 :full-name "cljs.core/make-array",
 :clj-symbol "clojure.core/make-array",
 :docstring "Construct a JavaScript array of specified size. Accepts ignored type\nargument for compatibility with Clojure."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_make-array.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_make-array.cljsdoc)
</pre>

