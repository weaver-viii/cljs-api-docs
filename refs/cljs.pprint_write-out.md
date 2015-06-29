## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/write-out

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/write-out</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/write-out)
</td>
</tr>
</table>

 <samp>
(__write-out__ object)<br>
</samp>

---




Source docstring:

```
Write an object to *out* subject to the current bindings of the printer control
variables. Use the kw-args argument to override individual variables for this call (and
any recursive calls).

*out* must be a PrettyWriter if pretty printing is enabled. This is the responsibility
of the caller.

This method is primarily intended for use by pretty print dispatch functions that
already know that the pretty printer will have set up their environment appropriately.
Normal library clients should use the standard "write" interface. 
```

Source code:

```clj
(defn write-out
  [object]
  (let [length-reached (and *current-length*
                            *print-length*
                            (>= *current-length* *print-length*))]
    (if-not *print-pretty*
      (pr object)
      (if length-reached
        (-write *out* "...") ;;TODO could this (incorrectly) print ... on the next line?
        (do
          (if *current-length* (set! *current-length* (inc *current-length*)))
          (*print-pprint-dispatch* object))))
    length-reached))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:725-747](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/pprint.cljs#L725-L747)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/write-out"]))
```

```clj
{:ns "cljs.pprint",
 :name "write-out",
 :signature ["[object]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_write-out",
 :source {:code "(defn write-out\n  [object]\n  (let [length-reached (and *current-length*\n                            *print-length*\n                            (>= *current-length* *print-length*))]\n    (if-not *print-pretty*\n      (pr object)\n      (if length-reached\n        (-write *out* \"...\") ;;TODO could this (incorrectly) print ... on the next line?\n        (do\n          (if *current-length* (set! *current-length* (inc *current-length*)))\n          (*print-pprint-dispatch* object))))\n    length-reached))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [725 747]},
 :full-name "cljs.pprint/write-out",
 :clj-symbol "clojure.pprint/write-out",
 :docstring "Write an object to *out* subject to the current bindings of the printer control\nvariables. Use the kw-args argument to override individual variables for this call (and\nany recursive calls).\n\n*out* must be a PrettyWriter if pretty printing is enabled. This is the responsibility\nof the caller.\n\nThis method is primarily intended for use by pretty print dispatch functions that\nalready know that the pretty printer will have set up their environment appropriately.\nNormal library clients should use the standard \"write\" interface. "}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_write-out.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_write-out.cljsdoc)
</pre>

