## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunked-seq?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunked-seq?__ x)<br>
</samp>

---





Source code:

```clj
(defn ^boolean chunked-seq?
  [x] (satisfies? IChunkedSeq x))
```

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:948-949](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L948-L949)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunked-seq?"]))
```

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "chunked-seq?",
 :signature ["[x]"],
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.core_chunked-seqQMARK",
 :source {:code "(defn ^boolean chunked-seq?\n  [x] (satisfies? IChunkedSeq x))",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/cljs/cljs/core.cljs",
          :lines [948 949]},
 :full-name "cljs.core/chunked-seq?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_chunked-seqQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_chunked-seqQMARK.cljsdoc)
</pre>
