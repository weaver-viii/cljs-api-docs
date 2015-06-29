## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-obj

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-obj__ & keyvals)<br>
</samp>

---

Returns a new JavaScript object using the supplied mappings.

`keyvals` must be an even number of forms.

---

Example:

```clj
(js-obj "foo" 1 "bar" 2)
;;=> #js {:foo 1, :bar 2}
```

---

See Also:

[`cljs.core/array`](cljs.core_array.md)<br>

---


Source code:

```clj
(defn js-obj
  ([]
     (js* "{}"))
  ([& keyvals]
     (apply gobject/create keyvals)))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:785-789](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L785-L789)</ins>
</pre>


---

```clj
(defmacro js-obj [& rest]
  (let [kvs-str (->> (repeat "~{}:~{}")
                     (take (quot (count rest) 2))
                     (interpose ",")
                     (apply core/str))]
    (concat
     (list 'js* (core/str "{" kvs-str "}"))
     rest)))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:842-849](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L842-L849)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-obj"]))
```

```clj
{:description "Returns a new JavaScript object using the supplied mappings.\n\n`keyvals` must be an even number of forms.",
 :ns "cljs.core",
 :name "js-obj",
 :signature ["[& keyvals]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/array"],
 :full-name-encode "cljs.core_js-obj",
 :source {:code "(defn js-obj\n  ([]\n     (js* \"{}\"))\n  ([& keyvals]\n     (apply gobject/create keyvals)))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [785 789]},
 :extra-sources ({:code "(defmacro js-obj [& rest]\n  (let [kvs-str (->> (repeat \"~{}:~{}\")\n                     (take (quot (count rest) 2))\n                     (interpose \",\")\n                     (apply core/str))]\n    (concat\n     (list 'js* (core/str \"{\" kvs-str \"}\"))\n     rest)))",
                  :repo "clojurescript",
                  :tag "r1236",
                  :filename "src/clj/cljs/core.clj",
                  :lines [842 849]}),
 :examples [{:id "657cd7",
             :content "```clj\n(js-obj \"foo\" 1 \"bar\" 2)\n;;=> #js {:foo 1, :bar 2}\n```"}],
 :full-name "cljs.core/js-obj"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-obj.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-obj.cljsdoc)
</pre>

