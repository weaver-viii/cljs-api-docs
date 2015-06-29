## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/doall

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/doall</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/doall)
</td>
</tr>
</table>

 <samp>
(__doall__ coll)<br>
</samp>
 <samp>
(__doall__ n coll)<br>
</samp>

---

Forces evaluation of a lazy sequence. Often used to see the effects of a
sequence produced via functions that have side effects.

`doall` walks through the successive `next`s of the sequence, returning the head
and causing the entire sequence to reside in memory at one time.

---


See Also:

[`cljs.core/dorun`](cljs.core_dorun.md)<br>
[`cljs.core/doseq`](cljs.core_doseq.md)<br>

---

Source docstring:

```
When lazy sequences are produced via functions that have side
effects, any effects other than those needed to produce the first
element in the seq do not occur until the seq is consumed. doall can
be used to force any effects. Walks through the successive nexts of
the seq, retains the head and returns it, thus causing the entire
seq to reside in memory at one time.
```

Source code:

```clj
(defn doall
  ([coll]
   (dorun coll)
   coll)
  ([n coll]
   (dorun n coll)
   coll))
```

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8046-8058](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L8046-L8058)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/doall"]))
```

```clj
{:description "Forces evaluation of a lazy sequence. Often used to see the effects of a\nsequence produced via functions that have side effects.\n\n`doall` walks through the successive `next`s of the sequence, returning the head\nand causing the entire sequence to reside in memory at one time.",
 :ns "cljs.core",
 :name "doall",
 :signature ["[coll]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/dorun" "cljs.core/doseq"],
 :full-name-encode "cljs.core_doall",
 :source {:code "(defn doall\n  ([coll]\n   (dorun coll)\n   coll)\n  ([n coll]\n   (dorun n coll)\n   coll))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8046 8058]},
 :full-name "cljs.core/doall",
 :clj-symbol "clojure.core/doall",
 :docstring "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. doall can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, retains the head and returns it, thus causing the entire\nseq to reside in memory at one time."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_doall.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_doall.cljsdoc)
</pre>

