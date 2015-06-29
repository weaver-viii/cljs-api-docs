## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/vector-seq

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__vector-seq__ v offset)<br>
</samp>

---





Source code:

```clj
(defn vector-seq [v offset]
  (let [c (-count v)]
    (when (pos? c)
      (reify
        IPrintable
        (-pr-seq [vseq opts] (pr-sequential pr-seq "(" " " ")" opts vseq))
        ISequential
        IEquiv
        (-equiv [vseq other] (equiv-sequential vseq other))
        ASeq
        ISeq
        (-first [_] (-nth v offset))
        (-rest [_]
          (let [offset (inc offset)]
            (if (< offset c)
              (vector-seq v offset)
              ())))
        ISeqable
        (-seq [vseq] vseq)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2522-2540](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2522-L2540)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vector-seq"]))
```

```clj
{:ns "cljs.core",
 :name "vector-seq",
 :type "function",
 :signature ["[v offset]"],
 :source {:code "(defn vector-seq [v offset]\n  (let [c (-count v)]\n    (when (pos? c)\n      (reify\n        IPrintable\n        (-pr-seq [vseq opts] (pr-sequential pr-seq \"(\" \" \" \")\" opts vseq))\n        ISequential\n        IEquiv\n        (-equiv [vseq other] (equiv-sequential vseq other))\n        ASeq\n        ISeq\n        (-first [_] (-nth v offset))\n        (-rest [_]\n          (let [offset (inc offset)]\n            (if (< offset c)\n              (vector-seq v offset)\n              ())))\n        ISeqable\n        (-seq [vseq] vseq)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2522 2540]},
 :full-name "cljs.core/vector-seq",
 :full-name-encode "cljs.core_vector-seq",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_vector-seq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_vector-seq.cljsdoc)
</pre>

