## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IPrintWithWriter

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
The old IPrintable protocol's implementation consisted of building a giant
   list of strings to concatenate.  This involved lots of concat calls,
   intermediate vectors, and lazy-seqs, and was very slow in some older JS
   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it
   be implemented efficiently in terms of e.g. a StringBuffer append.
```

Source code:

```clj
(defprotocol IPrintWithWriter
  "The old IPrintable protocol's implementation consisted of building a giant
   list of strings to concatenate.  This involved lots of concat calls,
   intermediate vectors, and lazy-seqs, and was very slow in some older JS
   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it
   be implemented efficiently in terms of e.g. a StringBuffer append."
  (-pr-writer [o writer opts]))
```

 <pre>
clojurescript @ r1835
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:294-300](https://github.com/clojure/clojurescript/blob/r1835/src/cljs/cljs/core.cljs#L294-L300)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IPrintWithWriter"]))
```

```clj
{:ns "cljs.core",
 :name "IPrintWithWriter",
 :history [["+" "0.0-1503"]],
 :type "protocol",
 :full-name-encode "cljs.core_IPrintWithWriter",
 :source {:code "(defprotocol IPrintWithWriter\n  \"The old IPrintable protocol's implementation consisted of building a giant\n   list of strings to concatenate.  This involved lots of concat calls,\n   intermediate vectors, and lazy-seqs, and was very slow in some older JS\n   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it\n   be implemented efficiently in terms of e.g. a StringBuffer append.\"\n  (-pr-writer [o writer opts]))",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/cljs/cljs/core.cljs",
          :lines [294 300]},
 :methods [{:name "-pr-writer",
            :signature ["[o writer opts]"],
            :docstring nil}],
 :full-name "cljs.core/IPrintWithWriter",
 :docstring "The old IPrintable protocol's implementation consisted of building a giant\n   list of strings to concatenate.  This involved lots of concat calls,\n   intermediate vectors, and lazy-seqs, and was very slow in some older JS\n   engines.  IPrintWithWriter implements printing via the IWriter protocol, so it\n   be implemented efficiently in terms of e.g. a StringBuffer append."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IPrintWithWriter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IPrintWithWriter.cljsdoc)
</pre>

