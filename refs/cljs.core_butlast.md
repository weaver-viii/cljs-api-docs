## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/butlast

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/butlast</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/butlast)
</td>
</tr>
</table>

 <samp>
(__butlast__ s)<br>
</samp>

---

Returns a sequence of all but the last item in `s`.

`butlast` runs in linear time.

---

Example:

```clj
(butlast [1 2 3])
;;=> (1 2)

(butlast [1 2])
;;=> (1)

(butlast [1])
;;=> nil

(butlast [])
;;=> nil
```

---

See Also:

[`cljs.core/first`](cljs.core_first.md)<br>
[`cljs.core/rest`](cljs.core_rest.md)<br>
[`cljs.core/last`](cljs.core_last.md)<br>
[`cljs.core/next`](cljs.core_next.md)<br>
[`cljs.core/drop-last`](cljs.core_drop-last.md)<br>
[`cljs.core/take-last`](cljs.core_take-last.md)<br>

---


Source code:

```clj
(defn butlast [s]
  (loop [ret [] s s]
    (if (next s)
      (recur (conj ret (first s)) (next s))
      (seq ret))))
```

 <pre>
clojurescript @ r2644
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7536-7540](https://github.com/clojure/clojurescript/blob/r2644/src/cljs/cljs/core.cljs#L7536-L7540)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/butlast"]))
```

```clj
{:description "Returns a sequence of all but the last item in `s`.\n\n`butlast` runs in linear time.",
 :ns "cljs.core",
 :name "butlast",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/first"
           "cljs.core/rest"
           "cljs.core/last"
           "cljs.core/next"
           "cljs.core/drop-last"
           "cljs.core/take-last"],
 :full-name-encode "cljs.core_butlast",
 :source {:code "(defn butlast [s]\n  (loop [ret [] s s]\n    (if (next s)\n      (recur (conj ret (first s)) (next s))\n      (seq ret))))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7536 7540]},
 :examples [{:id "7a4676",
             :content "```clj\n(butlast [1 2 3])\n;;=> (1 2)\n\n(butlast [1 2])\n;;=> (1)\n\n(butlast [1])\n;;=> nil\n\n(butlast [])\n;;=> nil\n```"}],
 :full-name "cljs.core/butlast",
 :clj-symbol "clojure.core/butlast"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_butlast.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_butlast.cljsdoc)
</pre>

