## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/print-length-loop

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/print-length-loop</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/print-length-loop)
</td>
</tr>
</table>

 <samp>
(__print-length-loop__ bindings & body)<br>
</samp>

---




Source docstring:

```
A version of loop that iterates at most *print-length* times. This is designed
for use in pretty-printer dispatch functions.
```

Source code:

```clj
(defmacro print-length-loop
  [bindings & body]
  (let [count-var (gensym "length-count")
        mod-body (pll-mod-body count-var body)]
    `(loop ~(apply vector count-var 0 bindings)
       (if (or (not cljs.core/*print-length*) (< ~count-var cljs.core/*print-length*))
         (do ~@mod-body)
         (~'-write cljs.pprint/*out* "...")))))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:92-101](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/pprint.clj#L92-L101)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/print-length-loop"]))
```

```clj
{:ns "cljs.pprint",
 :name "print-length-loop",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint_print-length-loop",
 :source {:code "(defmacro print-length-loop\n  [bindings & body]\n  (let [count-var (gensym \"length-count\")\n        mod-body (pll-mod-body count-var body)]\n    `(loop ~(apply vector count-var 0 bindings)\n       (if (or (not cljs.core/*print-length*) (< ~count-var cljs.core/*print-length*))\n         (do ~@mod-body)\n         (~'-write cljs.pprint/*out* \"...\")))))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [92 101]},
 :full-name "cljs.pprint/print-length-loop",
 :clj-symbol "clojure.pprint/print-length-loop",
 :docstring "A version of loop that iterates at most *print-length* times. This is designed\nfor use in pretty-printer dispatch functions."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_print-length-loop.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_print-length-loop.cljsdoc)
</pre>

