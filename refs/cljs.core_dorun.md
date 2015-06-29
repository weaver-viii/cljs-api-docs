## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dorun

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dorun</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dorun)
</td>
</tr>
</table>

 <samp>
(__dorun__ coll)<br>
</samp>
 <samp>
(__dorun__ n coll)<br>
</samp>

---

Forces evaluation of a lazy sequence. Often used to see the effects of a
sequence produced via functions that have side effects.

`dorun` walks through the successive `next`s of the sequence and returns nil.

---


See Also:

[`cljs.core/doall`](cljs.core_doall.md)<br>

---

Source docstring:

```
When lazy sequences are produced via functions that have side
effects, any effects other than those needed to produce the first
element in the seq do not occur until the seq is consumed. dorun can
be used to force any effects. Walks through the successive nexts of
the seq, does not retain the head and returns nil.
```

Source code:

```clj
(defn dorun
  ([coll]
   (when (seq coll)
     (recur (next coll))))
  ([n coll]
   (when (and (seq coll) (pos? n))
     (recur (dec n) (next coll)))))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:8359-8370](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L8359-L8370)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dorun"]))
```

```clj
{:description "Forces evaluation of a lazy sequence. Often used to see the effects of a\nsequence produced via functions that have side effects.\n\n`dorun` walks through the successive `next`s of the sequence and returns nil.",
 :ns "cljs.core",
 :name "dorun",
 :signature ["[coll]" "[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/doall"],
 :full-name-encode "cljs.core_dorun",
 :source {:code "(defn dorun\n  ([coll]\n   (when (seq coll)\n     (recur (next coll))))\n  ([n coll]\n   (when (and (seq coll) (pos? n))\n     (recur (dec n) (next coll)))))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8359 8370]},
 :full-name "cljs.core/dorun",
 :clj-symbol "clojure.core/dorun",
 :docstring "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. dorun can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, does not retain the head and returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_dorun.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_dorun.cljsdoc)
</pre>

