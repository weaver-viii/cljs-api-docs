## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/list

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list)
</td>
</tr>
</table>

 <samp>
(__list__ & items)<br>
</samp>

---

Creates a new list containing `items`.

---


See Also:

[`cljs.core/vector`](cljs.core_vector.md)<br>
[`cljs.core/list?`](cljs.core_listQMARK.md)<br>

---


Source code:

```clj
(defn list [& xs]
  (let [arr (if (and (instance? IndexedSeq xs) (zero? (.-i xs)))
              (.-arr xs)
              (let [arr (array)]
                (loop [^not-native xs xs]
                  (if-not (nil? xs)
                    (do
                      (.push arr (-first xs))
                      (recur (-next xs)))
                    arr))))]
    (loop [i (alength arr) ^not-native r ()]
      (if (> i 0)
        (recur (dec i) (-conj r (aget arr (dec i))))
        r))))
```

 <pre>
clojurescript @ r2850
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2404-2417](https://github.com/clojure/clojurescript/blob/r2850/src/cljs/cljs/core.cljs#L2404-L2417)</ins>
</pre>


---

```clj
(defmacro list
  ([] '(.-EMPTY cljs.core/List))
  ([x & xs]
    `(-conj (list ~@xs) ~x)))
```

 <pre>
clojurescript @ r2850
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1414-1417](https://github.com/clojure/clojurescript/blob/r2850/src/clj/cljs/core.clj#L1414-L1417)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/list"]))
```

```clj
{:description "Creates a new list containing `items`.",
 :ns "cljs.core",
 :name "list",
 :signature ["[& items]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/vector" "cljs.core/list?"],
 :full-name-encode "cljs.core_list",
 :source {:code "(defn list [& xs]\n  (let [arr (if (and (instance? IndexedSeq xs) (zero? (.-i xs)))\n              (.-arr xs)\n              (let [arr (array)]\n                (loop [^not-native xs xs]\n                  (if-not (nil? xs)\n                    (do\n                      (.push arr (-first xs))\n                      (recur (-next xs)))\n                    arr))))]\n    (loop [i (alength arr) ^not-native r ()]\n      (if (> i 0)\n        (recur (dec i) (-conj r (aget arr (dec i))))\n        r))))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2404 2417]},
 :extra-sources ({:code "(defmacro list\n  ([] '(.-EMPTY cljs.core/List))\n  ([x & xs]\n    `(-conj (list ~@xs) ~x)))",
                  :repo "clojurescript",
                  :tag "r2850",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1414 1417]}),
 :full-name "cljs.core/list",
 :clj-symbol "clojure.core/list"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_list.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_list.cljsdoc)
</pre>

