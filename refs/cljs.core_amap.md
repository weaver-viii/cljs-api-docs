## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/amap

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/amap</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/amap)
</td>
</tr>
</table>

 <samp>
(__amap__ a idx ret expr)<br>
</samp>

---

For quickly creating a new JavaScript array by mapping an expression `expr`
across a JavaScript array `a`.  The expression can use `ret` as the current
result, which is initialized to `a`.  It can also use `idx` to get the current
index.

---

Example:

```clj
(def a #js [1 2 3])
(amap a i ret (* 10 (aget a i)))
;;=> #js [10 20 30]
```

---
Example:

You can also use `ret` inside the mapped expression if you want to use the
current result:

```clj
(def a #js [1 2 3])
(amap a i ret (+ (if (pos? i)
                   (aget ret (dec i))
                   0)
                 (* 10 (aget a i))))
;;=> #js [10 30 60]
```

---

See Also:

[`cljs.core/map`](cljs.core_map.md)<br>

---

Source docstring:

```
Maps an expression across an array a, using an index named idx, and
return value named ret, initialized to a clone of a, then setting
each element of ret to the evaluation of expr, returning the new
array ret.
```

Source code:

```clj
(defmacro amap
  [a idx ret expr]
  `(let [a# ~a
         ~ret (aclone a#)]
     (loop  [~idx 0]
       (if (< ~idx  (alength a#))
         (do
           (aset ~ret ~idx ~expr)
           (recur (inc ~idx)))
         ~ret))))
```

 <pre>
clojurescript @ r2725
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1496-1509](https://github.com/clojure/clojurescript/blob/r2725/src/clj/cljs/core.clj#L1496-L1509)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/amap"]))
```

```clj
{:description "For quickly creating a new JavaScript array by mapping an expression `expr`\nacross a JavaScript array `a`.  The expression can use `ret` as the current\nresult, which is initialized to `a`.  It can also use `idx` to get the current\nindex.",
 :ns "cljs.core",
 :name "amap",
 :signature ["[a idx ret expr]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/map"],
 :full-name-encode "cljs.core_amap",
 :source {:code "(defmacro amap\n  [a idx ret expr]\n  `(let [a# ~a\n         ~ret (aclone a#)]\n     (loop  [~idx 0]\n       (if (< ~idx  (alength a#))\n         (do\n           (aset ~ret ~idx ~expr)\n           (recur (inc ~idx)))\n         ~ret))))",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/clj/cljs/core.clj",
          :lines [1496 1509]},
 :examples [{:id "3a7471",
             :content "```clj\n(def a #js [1 2 3])\n(amap a i ret (* 10 (aget a i)))\n;;=> #js [10 20 30]\n```"}
            {:id "0f57af",
             :content "You can also use `ret` inside the mapped expression if you want to use the\ncurrent result:\n\n```clj\n(def a #js [1 2 3])\n(amap a i ret (+ (if (pos? i)\n                   (aget ret (dec i))\n                   0)\n                 (* 10 (aget a i))))\n;;=> #js [10 30 60]\n```"}],
 :full-name "cljs.core/amap",
 :clj-symbol "clojure.core/amap",
 :docstring "Maps an expression across an array a, using an index named idx, and\nreturn value named ret, initialized to a clone of a, then setting\neach element of ret to the evaluation of expr, returning the new\narray ret."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_amap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_amap.cljsdoc)
</pre>

