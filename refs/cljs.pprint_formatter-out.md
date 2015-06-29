## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/formatter-out

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/formatter-out</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/formatter-out)
</td>
</tr>
</table>

 <samp>
(__formatter-out__ format-in)<br>
</samp>

---




Source docstring:

```
Makes a function which can directly run format-in. The function is
fn [& args] ... and returns nil. This version of the formatter macro is
designed to be used with *out* set to an appropriate Writer. In particular,
this is meant to be used as part of a pretty printer dispatch method.

format-in can be either a control string or a previously compiled format.
```

Source code:

```clj
(defmacro formatter-out
  [format-in]
  `(let [format-in# ~format-in
         cf# (if (string? format-in#) (cljs.pprint/cached-compile format-in#) format-in#)]
     (fn [& args#]
       (let [navigator# (cljs.pprint/init-navigator args#)]
         (cljs.pprint/execute-format cf# navigator#)))))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:133-145](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/pprint.clj#L133-L145)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/formatter-out"]))
```

```clj
{:ns "cljs.pprint",
 :name "formatter-out",
 :signature ["[format-in]"],
 :history [["+" "0.0-3255"]],
 :type "macro",
 :full-name-encode "cljs.pprint_formatter-out",
 :source {:code "(defmacro formatter-out\n  [format-in]\n  `(let [format-in# ~format-in\n         cf# (if (string? format-in#) (cljs.pprint/cached-compile format-in#) format-in#)]\n     (fn [& args#]\n       (let [navigator# (cljs.pprint/init-navigator args#)]\n         (cljs.pprint/execute-format cf# navigator#)))))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [133 145]},
 :full-name "cljs.pprint/formatter-out",
 :clj-symbol "clojure.pprint/formatter-out",
 :docstring "Makes a function which can directly run format-in. The function is\nfn [& args] ... and returns nil. This version of the formatter macro is\ndesigned to be used with *out* set to an appropriate Writer. In particular,\nthis is meant to be used as part of a pretty printer dispatch method.\n\nformat-in can be either a control string or a previously compiled format."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_formatter-out.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_formatter-out.cljsdoc)
</pre>

