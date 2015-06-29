## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/obj-map

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__obj-map__ & keyvals)<br>
</samp>

---




Source docstring:

```
keyval => key val
Returns a new object map with supplied mappings.
```

Source code:

```clj
(defn obj-map
  [& keyvals]
  (let [ks  (array)
        obj (js-obj)]
    (loop [kvs (seq keyvals)]
      (if kvs
        (do (.push ks (first kvs))
            (aset obj (first kvs) (second kvs))
            (recur (nnext kvs)))
        (cljs.core.ObjMap/fromObject ks obj)))))
```

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5722-5733](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L5722-L5733)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/obj-map"]))
```

```clj
{:ns "cljs.core",
 :name "obj-map",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-1443"]],
 :type "function",
 :full-name-encode "cljs.core_obj-map",
 :source {:code "(defn obj-map\n  [& keyvals]\n  (let [ks  (array)\n        obj (js-obj)]\n    (loop [kvs (seq keyvals)]\n      (if kvs\n        (do (.push ks (first kvs))\n            (aset obj (first kvs) (second kvs))\n            (recur (nnext kvs)))\n        (cljs.core.ObjMap/fromObject ks obj)))))",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5722 5733]},
 :full-name "cljs.core/obj-map",
 :docstring "keyval => key val\nReturns a new object map with supplied mappings."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_obj-map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_obj-map.cljsdoc)
</pre>

