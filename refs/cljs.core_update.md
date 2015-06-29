## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/update

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__update__ m k f)<br>
</samp>
 <samp>
(__update__ m k f x)<br>
</samp>
 <samp>
(__update__ m k f x y)<br>
</samp>
 <samp>
(__update__ m k f x y z)<br>
</samp>
 <samp>
(__update__ m k f x y z & more)<br>
</samp>

---




Source docstring:

```
'Updates' a value in an associative structure, where k is a
key and f is a function that will take the old value
and any supplied args and return the new value, and returns a new
structure.  If the key does not exist, nil is passed as the old value.
```

Source code:

```clj
(defn update
  ([m k f]
   (assoc m k (f (get m k))))
  ([m k f x]
   (assoc m k (f (get m k) x)))
  ([m k f x y]
   (assoc m k (f (get m k) x y)))
  ([m k f x y z]
   (assoc m k (f (get m k) x y z)))
  ([m k f x y z & more]
   (assoc m k (apply f (get m k) x y z more))))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4423-4437](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L4423-L4437)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/update"]))
```

```clj
{:ns "cljs.core",
 :name "update",
 :signature ["[m k f]"
             "[m k f x]"
             "[m k f x y]"
             "[m k f x y z]"
             "[m k f x y z & more]"],
 :history [["+" "0.0-2411"]],
 :type "function",
 :full-name-encode "cljs.core_update",
 :source {:code "(defn update\n  ([m k f]\n   (assoc m k (f (get m k))))\n  ([m k f x]\n   (assoc m k (f (get m k) x)))\n  ([m k f x y]\n   (assoc m k (f (get m k) x y)))\n  ([m k f x y z]\n   (assoc m k (f (get m k) x y z)))\n  ([m k f x y z & more]\n   (assoc m k (apply f (get m k) x y z more))))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4423 4437]},
 :full-name "cljs.core/update",
 :docstring "'Updates' a value in an associative structure, where k is a\nkey and f is a function that will take the old value\nand any supplied args and return the new value, and returns a new\nstructure.  If the key does not exist, nil is passed as the old value."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_update.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_update.cljsdoc)
</pre>

