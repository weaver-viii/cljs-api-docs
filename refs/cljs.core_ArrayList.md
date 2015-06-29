## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ArrayList

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ArrayList.__ arr)<br>
</samp>

---





Source code:

```clj
(deftype ArrayList [^:mutable arr]
  Object
  (add [_ x] (.push arr x))
  (size [_] (alength arr))
  (clear [_] (set! arr (array)))
  (isEmpty [_] (zero? (alength arr)))
  (toArray [_] arr))
```

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7579-7585](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L7579-L7585)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ArrayList"]))
```

```clj
{:ns "cljs.core",
 :name "ArrayList",
 :type "type",
 :signature ["[arr]"],
 :source {:code "(deftype ArrayList [^:mutable arr]\n  Object\n  (add [_ x] (.push arr x))\n  (size [_] (alength arr))\n  (clear [_] (set! arr (array)))\n  (isEmpty [_] (zero? (alength arr)))\n  (toArray [_] arr))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7579 7585]},
 :full-name "cljs.core/ArrayList",
 :full-name-encode "cljs.core_ArrayList",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ArrayList.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ArrayList.cljsdoc)
</pre>

