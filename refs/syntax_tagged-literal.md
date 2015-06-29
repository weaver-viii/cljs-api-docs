## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/tagged-literal

 <table border="1">
<tr>
<td><samp>#</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc4)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#tagged-elements)
</td>
</tr>
</table>






Source code:

```clj
(defn- read-tagged [rdr initch opts pending-forms]
  (let [tag (read* rdr true nil opts pending-forms)]
    (if-not (symbol? tag)
      (reader-error rdr "Reader tag must be a symbol"))
    (if *suppress-read*
      (tagged-literal tag (read* rdr true nil opts pending-forms))
      (if-let [f (or (*data-readers* tag)
                     (default-data-readers tag))]
        (f (read* rdr true nil opts pending-forms))
        (if (.contains (name tag) ".")
          (read-ctor rdr tag opts pending-forms)
          (if-let [f *default-data-reader-fn*]
            (f tag (read* rdr true nil opts pending-forms))
            (reader-error rdr "No reader function for tag " (name tag))))))))
```

 <pre>
tools.reader @ tools.reader-0.9.2
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:800-813](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.2/src/main/clojure/clojure/tools/reader.clj#L800-L813)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/tagged-literal"]))
```

```clj
{:ns "syntax",
 :name "tagged-literal",
 :history [["+" "0.0-1211"]],
 :type "syntax",
 :full-name-encode "syntax_tagged-literal",
 :source {:code "(defn- read-tagged [rdr initch opts pending-forms]\n  (let [tag (read* rdr true nil opts pending-forms)]\n    (if-not (symbol? tag)\n      (reader-error rdr \"Reader tag must be a symbol\"))\n    (if *suppress-read*\n      (tagged-literal tag (read* rdr true nil opts pending-forms))\n      (if-let [f (or (*data-readers* tag)\n                     (default-data-readers tag))]\n        (f (read* rdr true nil opts pending-forms))\n        (if (.contains (name tag) \".\")\n          (read-ctor rdr tag opts pending-forms)\n          (if-let [f *default-data-reader-fn*]\n            (f tag (read* rdr true nil opts pending-forms))\n            (reader-error rdr \"No reader function for tag \" (name tag))))))))",
          :repo "tools.reader",
          :tag "tools.reader-0.9.2",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [800 813]},
 :syntax-form "#",
 :edn-doc "https://github.com/edn-format/edn#tagged-elements",
 :full-name "syntax/tagged-literal",
 :clj-doc "http://clojure.org/reader#toc4"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_tagged-literal.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_tagged-literal.cljsdoc)
</pre>

