## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array__ & args)<br>
</samp>

---

Creates a JavaScript array containing `args`.

The tagged literal `#js [1 2 3]` is equivalent to `(array 1 2 3)`

---

Example:

```clj
(array 1 2 3)
;;=> #js [1 2 3]

(apply array [1 2 3])
;;=> #js [1 2 3]

#js [1 2 3]
;;=> #js [1 2 3]
```

---
Example:

When creating nested JavaScript arrays, you can opt to use `clj->js` instead:

```clj
(array 1 2 (array 3 4))
;;=> #js [1 2 #js [3 4]]

(clj->js [1 2 [3 4]])
;;=> #js [1 2 #js [3 4]]
```

---

See Also:

[`cljs.core/aclone`](cljs.core_aclone.md)<br>
[`cljs.core/make-array`](cljs.core_make-array.md)<br>
[`cljs.core/clj->js`](cljs.core_clj-GTjs.md)<br>

---

Source docstring:

```
Creates a new javascript array.
@param {...*} var_args
```

Source code:

```clj
(defn ^array array
  [var-args]            ;; [& items]
  (let [a (js/Array. (alength (cljs.core/js-arguments)))]
    (loop [i 0]
      (if (< i (alength a))
        (do
          (aset a i (aget (cljs.core/js-arguments) i))
          (recur (inc i)))
        a))))
```

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:255-265](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L255-L265)</ins>
</pre>


---

```clj
(defmacro array [& rest]
  (let [xs-str (->> (repeat "~{}")
                    (take (count rest))
                    (interpose ",")
                    (apply core/str))]
    (vary-meta
      (list* 'js* (core/str "[" xs-str "]") rest)
      assoc :tag 'array)))
```

 <pre>
clojurescript @ r3126
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1674-1681](https://github.com/clojure/clojurescript/blob/r3126/src/clj/cljs/core.clj#L1674-L1681)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array"]))
```

```clj
{:description "Creates a JavaScript array containing `args`.\n\nThe tagged literal `#js [1 2 3]` is equivalent to `(array 1 2 3)`",
 :return-type array,
 :ns "cljs.core",
 :name "array",
 :signature ["[& args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/aclone"
           "cljs.core/make-array"
           "cljs.core/clj->js"],
 :full-name-encode "cljs.core_array",
 :source {:code "(defn ^array array\n  [var-args]            ;; [& items]\n  (let [a (js/Array. (alength (cljs.core/js-arguments)))]\n    (loop [i 0]\n      (if (< i (alength a))\n        (do\n          (aset a i (aget (cljs.core/js-arguments) i))\n          (recur (inc i)))\n        a))))",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/core.cljs",
          :lines [255 265]},
 :extra-sources ({:code "(defmacro array [& rest]\n  (let [xs-str (->> (repeat \"~{}\")\n                    (take (count rest))\n                    (interpose \",\")\n                    (apply core/str))]\n    (vary-meta\n      (list* 'js* (core/str \"[\" xs-str \"]\") rest)\n      assoc :tag 'array)))",
                  :repo "clojurescript",
                  :tag "r3126",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1674 1681]}),
 :examples [{:id "3a546d",
             :content "```clj\n(array 1 2 3)\n;;=> #js [1 2 3]\n\n(apply array [1 2 3])\n;;=> #js [1 2 3]\n\n#js [1 2 3]\n;;=> #js [1 2 3]\n```"}
            {:id "cca945",
             :content "When creating nested JavaScript arrays, you can opt to use `clj->js` instead:\n\n```clj\n(array 1 2 (array 3 4))\n;;=> #js [1 2 #js [3 4]]\n\n(clj->js [1 2 [3 4]])\n;;=> #js [1 2 #js [3 4]]\n```"}],
 :full-name "cljs.core/array",
 :docstring "Creates a new javascript array.\n@param {...*} var_args"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_array.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_array.cljsdoc)
</pre>

