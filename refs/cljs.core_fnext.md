## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/fnext

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fnext</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fnext)
</td>
</tr>
</table>

 <samp>
(__fnext__ coll)<br>
</samp>

---

Same as `(first (next coll))`

---

Example:

```clj
(fnext [1 2 3])
;;=> 2

(fnext [1 2])
;;=> 2

(fnext [1])
;;=> nil

(fnext [])
;;=> nil
```

---

See Also:

[`cljs.core/ffirst`](cljs.core_ffirst.md)<br>
[`cljs.core/second`](cljs.core_second.md)<br>

---

Source docstring:

```
Same as (first (next x))
```

Source code:

```clj
(defn fnext
  [coll]
  (first (next coll)))
```

 <pre>
clojurescript @ r2505
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1093-1096](https://github.com/clojure/clojurescript/blob/r2505/src/cljs/cljs/core.cljs#L1093-L1096)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/fnext"]))
```

```clj
{:description "Same as `(first (next coll))`",
 :ns "cljs.core",
 :name "fnext",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/ffirst" "cljs.core/second"],
 :full-name-encode "cljs.core_fnext",
 :source {:code "(defn fnext\n  [coll]\n  (first (next coll)))",
          :repo "clojurescript",
          :tag "r2505",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1093 1096]},
 :examples [{:id "92383f",
             :content "```clj\n(fnext [1 2 3])\n;;=> 2\n\n(fnext [1 2])\n;;=> 2\n\n(fnext [1])\n;;=> nil\n\n(fnext [])\n;;=> nil\n```"}],
 :full-name "cljs.core/fnext",
 :clj-symbol "clojure.core/fnext",
 :docstring "Same as (first (next x))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_fnext.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_fnext.cljsdoc)
</pre>

