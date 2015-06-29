## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*2

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*2</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*2)
</td>
</tr>
</table>


Only usable from a REPL.

Holds the result of the second to last expression.

---

Example:

```clj
(+ 1 2 3 4)
;;=> 10

(+ 4 8)
;;=> 12

*2
;;=> 10

(inc *2)
;;=> 11
```

Note that a standalone evaluation of `*1`, `*2`, `*3`, or `*e` is not a part of
remembered history:

```clj
:first
;;=> :first

:second
;;=> :second

:third
;;=> :third

*3
;;=> :first

*2
;;=> :second

*1
;;=> :third
```

---

See Also:

[`cljs.core/*1`](cljs.core_STAR1.md)<br>
[`cljs.core/*3`](cljs.core_STAR3.md)<br>
[`cljs.core/*e`](cljs.core_STARe.md)<br>

---

Source docstring:

```
bound in a repl thread to the second most recent value printed
```

Source code:

```clj
(def
  ^{:doc "bound in a repl thread to the second most recent value printed"}
  *2)
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:122-124](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L122-L124)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*2"]))
```

```clj
{:description "Only usable from a REPL.\n\nHolds the result of the second to last expression.",
 :ns "cljs.core",
 :name "*2",
 :history [["+" "0.0-927"]],
 :type "var",
 :related ["cljs.core/*1" "cljs.core/*3" "cljs.core/*e"],
 :full-name-encode "cljs.core_STAR2",
 :source {:code "(def\n  ^{:doc \"bound in a repl thread to the second most recent value printed\"}\n  *2)",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [122 124]},
 :examples [{:id "208d41",
             :content "```clj\n(+ 1 2 3 4)\n;;=> 10\n\n(+ 4 8)\n;;=> 12\n\n*2\n;;=> 10\n\n(inc *2)\n;;=> 11\n```\n\nNote that a standalone evaluation of `*1`, `*2`, `*3`, or `*e` is not a part of\nremembered history:\n\n```clj\n:first\n;;=> :first\n\n:second\n;;=> :second\n\n:third\n;;=> :third\n\n*3\n;;=> :first\n\n*2\n;;=> :second\n\n*1\n;;=> :third\n```"}],
 :full-name "cljs.core/*2",
 :clj-symbol "clojure.core/*2",
 :docstring "bound in a repl thread to the second most recent value printed"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STAR2.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STAR2.cljsdoc)
</pre>

