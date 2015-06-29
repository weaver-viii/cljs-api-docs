## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISeqable

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Seqable</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Seqable.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol ISeqable
  (^clj-or-nil -seq [o]))
```

 <pre>
clojurescript @ r2629
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:319-320](https://github.com/clojure/clojurescript/blob/r2629/src/cljs/cljs/core.cljs#L319-L320)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISeqable"]))
```

```clj
{:ns "cljs.core",
 :name "ISeqable",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ISeqable",
 :source {:code "(defprotocol ISeqable\n  (^clj-or-nil -seq [o]))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/cljs/cljs/core.cljs",
          :lines [319 320]},
 :methods [{:name "-seq", :signature ["[o]"], :docstring nil}],
 :full-name "cljs.core/ISeqable",
 :clj-symbol "clojure.lang/Seqable"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ISeqable.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ISeqable.cljsdoc)
</pre>

