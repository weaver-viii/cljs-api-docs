## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/repeatedly

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/repeatedly</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/repeatedly)
</td>
</tr>
</table>

 <samp>
(__repeatedly__ f)<br>
</samp>
 <samp>
(__repeatedly__ n f)<br>
</samp>

---

Takes a function `f` of no args, presumably with side effects, and returns an
infinite (or length `n` if supplied) lazy sequence of calls to it.

---


See Also:

[`cljs.core/repeat`](cljs.core_repeat.md)<br>
[`cljs.core/iterate`](cljs.core_iterate.md)<br>
[`cljs.core/lazy-seq`](cljs.core_lazy-seq.md)<br>
[`cljs.core/dotimes`](cljs.core_dotimes.md)<br>
[`cljs.core/constantly`](cljs.core_constantly.md)<br>

---

Source docstring:

```
Takes a function of no args, presumably with side effects, and
returns an infinite (or length n if supplied) lazy sequence of calls
to it
```

Source code:

```clj
(defn repeatedly
  ([f] (lazy-seq (cons (f) (repeatedly f))))
  ([n f] (take n (repeatedly f))))
```

 <pre>
clojurescript @ r1859
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2864-2869](https://github.com/clojure/clojurescript/blob/r1859/src/cljs/cljs/core.cljs#L2864-L2869)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/repeatedly"]))
```

```clj
{:description "Takes a function `f` of no args, presumably with side effects, and returns an\ninfinite (or length `n` if supplied) lazy sequence of calls to it.",
 :ns "cljs.core",
 :name "repeatedly",
 :signature ["[f]" "[n f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/repeat"
           "cljs.core/iterate"
           "cljs.core/lazy-seq"
           "cljs.core/dotimes"
           "cljs.core/constantly"],
 :full-name-encode "cljs.core_repeatedly",
 :source {:code "(defn repeatedly\n  ([f] (lazy-seq (cons (f) (repeatedly f))))\n  ([n f] (take n (repeatedly f))))",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2864 2869]},
 :full-name "cljs.core/repeatedly",
 :clj-symbol "clojure.core/repeatedly",
 :docstring "Takes a function of no args, presumably with side effects, and\nreturns an infinite (or length n if supplied) lazy sequence of calls\nto it"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_repeatedly.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_repeatedly.cljsdoc)
</pre>

