## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunked-seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunked-seq__ vec i off)<br>
</samp>
 <samp>
(__chunked-seq__ vec node i off)<br>
</samp>
 <samp>
(__chunked-seq__ vec node i off meta)<br>
</samp>

---





Source code:

```clj
(defn chunked-seq
  ([vec i off] (ChunkedSeq. vec (array-for vec i) i off nil nil))
  ([vec node i off] (ChunkedSeq. vec node i off nil nil))
  ([vec node i off meta]
     (ChunkedSeq. vec node i off meta nil)))
```

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4565-4569](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L4565-L4569)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunked-seq"]))
```

```clj
{:ns "cljs.core",
 :name "chunked-seq",
 :type "function",
 :signature ["[vec i off]" "[vec node i off]" "[vec node i off meta]"],
 :source {:code "(defn chunked-seq\n  ([vec i off] (ChunkedSeq. vec (array-for vec i) i off nil nil))\n  ([vec node i off] (ChunkedSeq. vec node i off nil nil))\n  ([vec node i off meta]\n     (ChunkedSeq. vec node i off meta nil)))",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4565 4569]},
 :full-name "cljs.core/chunked-seq",
 :full-name-encode "cljs.core_chunked-seq",
 :history [["+" "0.0-1424"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_chunked-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_chunked-seq.cljsdoc)
</pre>

