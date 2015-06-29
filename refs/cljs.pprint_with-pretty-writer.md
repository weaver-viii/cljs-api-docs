## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/with-pretty-writer

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__with-pretty-writer__ base-writer & body)<br>
</samp>

---





Source code:

```clj
(defmacro with-pretty-writer [base-writer & body]
  `(let [base-writer# ~base-writer
         new-writer# (not (pretty-writer? base-writer#))]
     (cljs.core/binding [~'*out* (if new-writer#
                         (make-pretty-writer base-writer# *print-right-margin* *print-miser-width*)
                         base-writer#)]
       ~@body
       (-ppflush ~'*out*))))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:17-24](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.clj#L17-L24)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/with-pretty-writer"]))
```

```clj
{:ns "cljs.pprint",
 :name "with-pretty-writer",
 :type "macro",
 :signature ["[base-writer & body]"],
 :source {:code "(defmacro with-pretty-writer [base-writer & body]\n  `(let [base-writer# ~base-writer\n         new-writer# (not (pretty-writer? base-writer#))]\n     (cljs.core/binding [~'*out* (if new-writer#\n                         (make-pretty-writer base-writer# *print-right-margin* *print-miser-width*)\n                         base-writer#)]\n       ~@body\n       (-ppflush ~'*out*))))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [17 24]},
 :full-name "cljs.pprint/with-pretty-writer",
 :full-name-encode "cljs.pprint_with-pretty-writer",
 :history [["+" "0.0-3255"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_with-pretty-writer.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_with-pretty-writer.cljsdoc)
</pre>

