## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not=

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not=</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not=)
</td>
</tr>
</table>

 <samp>
(__not=__ x)<br>
</samp>
 <samp>
(__not=__ x y)<br>
</samp>
 <samp>
(__not=__ x y & more)<br>
</samp>

---

Returns the opposite of `=`.

Same as `(not (= x y))`

---


See Also:

[`cljs.core/=`](cljs.core_EQ.md)<br>
[`cljs.core/not`](cljs.core_not.md)<br>

---

Source docstring:

```
Same as (not (= obj1 obj2))
```

Source code:

```clj
(defn ^boolean not=
  ([x] false)
  ([x y] (not (= x y)))
  ([x y & more]
   (not (apply = x y more))))
```

 <pre>
clojurescript @ r1853
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2477-2482](https://github.com/clojure/clojurescript/blob/r1853/src/cljs/cljs/core.cljs#L2477-L2482)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/not="]))
```

```clj
{:description "Returns the opposite of `=`.\n\nSame as `(not (= x y))`",
 :return-type boolean,
 :ns "cljs.core",
 :name "not=",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/=" "cljs.core/not"],
 :full-name-encode "cljs.core_notEQ",
 :source {:code "(defn ^boolean not=\n  ([x] false)\n  ([x y] (not (= x y)))\n  ([x y & more]\n   (not (apply = x y more))))",
          :repo "clojurescript",
          :tag "r1853",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2477 2482]},
 :full-name "cljs.core/not=",
 :clj-symbol "clojure.core/not=",
 :docstring "Same as (not (= obj1 obj2))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_notEQ.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_notEQ.cljsdoc)
</pre>

