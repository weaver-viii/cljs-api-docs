## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/pprint-logical-block

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/pprint-logical-block</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/pprint-logical-block)
</td>
</tr>
</table>

 <samp>
(__pprint-logical-block__ & args)<br>
</samp>

---




Source docstring:

```
Execute the body as a pretty printing logical block with output to *out* which
must be a pretty printing writer. When used from pprint or cl-format, this can be
assumed.

This function is intended for use when writing custom dispatch functions.

Before the body, the caller can optionally specify options: :prefix, :per-line-prefix
and :suffix.
```

Source code:

```clj
(defmacro pprint-logical-block
  [& args]
  (let [[options body] (parse-lb-options #{:prefix :per-line-prefix :suffix} args)]
    `(do (if (cljs.pprint/level-exceeded)
           (~'-write cljs.pprint/*out* "#")
           (do
             (cljs.core/binding [cljs.pprint/*current-level* (inc cljs.pprint/*current-level*)
                       cljs.pprint/*current-length* 0]
               (cljs.pprint/start-block cljs.pprint/*out*
                                        ~(:prefix options)
                                        ~(:per-line-prefix options)
                                        ~(:suffix options))
               ~@body
               (cljs.pprint/end-block cljs.pprint/*out*))))
         nil)))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:57-79](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/pprint.clj#L57-L79)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/pprint-logical-block"]))
```

```clj
{:ns "cljs.pprint",
 :name "pprint-logical-block",
 :signature ["[& args]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint_pprint-logical-block",
 :source {:code "(defmacro pprint-logical-block\n  [& args]\n  (let [[options body] (parse-lb-options #{:prefix :per-line-prefix :suffix} args)]\n    `(do (if (cljs.pprint/level-exceeded)\n           (~'-write cljs.pprint/*out* \"#\")\n           (do\n             (cljs.core/binding [cljs.pprint/*current-level* (inc cljs.pprint/*current-level*)\n                       cljs.pprint/*current-length* 0]\n               (cljs.pprint/start-block cljs.pprint/*out*\n                                        ~(:prefix options)\n                                        ~(:per-line-prefix options)\n                                        ~(:suffix options))\n               ~@body\n               (cljs.pprint/end-block cljs.pprint/*out*))))\n         nil)))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [57 79]},
 :full-name "cljs.pprint/pprint-logical-block",
 :clj-symbol "clojure.pprint/pprint-logical-block",
 :docstring "Execute the body as a pretty printing logical block with output to *out* which\nmust be a pretty printing writer. When used from pprint or cl-format, this can be\nassumed.\n\nThis function is intended for use when writing custom dispatch functions.\n\nBefore the body, the caller can optionally specify options: :prefix, :per-line-prefix\nand :suffix."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_pprint-logical-block.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_pprint-logical-block.cljsdoc)
</pre>

