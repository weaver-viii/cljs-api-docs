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
(defn array
  [var-args]            ;; [& items]
  (.call (.-slice (.-prototype js/Array)) (cljs.core/js-arguments)))
```

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:130-134](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/core.cljs#L130-L134)</ins>
</pre>


---

```clj
(defmacro array [& rest]
  (let [xs-str (->> (repeat "~{}")
                    (take (count rest))
                    (interpose ",")
                    (apply core/str))]
    (list* 'js* (core/str "[" xs-str "]") rest)))
```

 <pre>
clojurescript @ r1895
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1191-1196](https://github.com/clojure/clojurescript/blob/r1895/src/clj/cljs/core.clj#L1191-L1196)</ins>
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
 :ns "cljs.core",
 :name "array",
 :signature ["[& args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/aclone"
           "cljs.core/make-array"
           "cljs.core/clj->js"],
 :full-name-encode "cljs.core_array",
 :source {:code "(defn array\n  [var-args]            ;; [& items]\n  (.call (.-slice (.-prototype js/Array)) (cljs.core/js-arguments)))",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/core.cljs",
          :lines [130 134]},
 :extra-sources ({:code "(defmacro array [& rest]\n  (let [xs-str (->> (repeat \"~{}\")\n                    (take (count rest))\n                    (interpose \",\")\n                    (apply core/str))]\n    (list* 'js* (core/str \"[\" xs-str \"]\") rest)))",
                  :repo "clojurescript",
                  :tag "r1895",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1191 1196]}),
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

