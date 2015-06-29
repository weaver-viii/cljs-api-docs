## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/pprint

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pprint</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint)
</td>
</tr>
</table>

 <samp>
(__pprint__ object)<br>
</samp>
 <samp>
(__pprint__ object writer)<br>
</samp>

---





Source code:

```clj
(defn pprint
  ([object]
   (let [sb (StringBuffer.)]
     (binding [*out* (StringBufferWriter. sb)]
       (pprint object *out*)
       (*print-fn* (str sb)))))
  ([object writer]
   (with-pretty-writer writer
                       (binding [*print-pretty* true]
                         (write-out object))
                       (if (not (= 0 (get-column *out*)))
                         (-write *out* \newline)))))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:812-823](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.cljs#L812-L823)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint"]))
```

```clj
{:ns "cljs.pprint",
 :name "pprint",
 :signature ["[object]" "[object writer]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_pprint",
 :source {:code "(defn pprint\n  ([object]\n   (let [sb (StringBuffer.)]\n     (binding [*out* (StringBufferWriter. sb)]\n       (pprint object *out*)\n       (*print-fn* (str sb)))))\n  ([object writer]\n   (with-pretty-writer writer\n                       (binding [*print-pretty* true]\n                         (write-out object))\n                       (if (not (= 0 (get-column *out*)))\n                         (-write *out* \\newline)))))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [812 823]},
 :full-name "cljs.pprint/pprint",
 :clj-symbol "clojure.pprint/pprint"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_pprint.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_pprint.cljsdoc)
</pre>

