## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/first

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/first</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/first)
</td>
</tr>
</table>

 <samp>
(__first__ coll)<br>
</samp>

---

Returns the first item in `coll` and calls `seq` on its argument.

Returns nil when `coll` is nil.

---

Example:

```clj
(first [1 2 3])
;;=> 1

(first [])
;;=> nil
```

---

See Also:

[`cljs.core/rest`](cljs.core_rest.md)<br>
[`cljs.core/next`](cljs.core_next.md)<br>
[`cljs.core/nth`](cljs.core_nth.md)<br>
[`cljs.core/second`](cljs.core_second.md)<br>
[`cljs.core/take`](cljs.core_take.md)<br>
[`cljs.core/ffirst`](cljs.core_ffirst.md)<br>

---

Source docstring:

```
Returns the first item in the collection. Calls seq on its
argument. If coll is nil, returns nil.
```

Source code:

```clj
(defn first
  [coll]
  (when-not (nil? coll)
    (if (implements? ISeq coll)
      (-first ^not-native coll)
      (let [s (seq coll)]
        (when-not (nil? s)
          (-first s))))))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:493-502](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L493-L502)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/first"]))
```

```clj
{:description "Returns the first item in `coll` and calls `seq` on its argument.\n\nReturns nil when `coll` is nil.",
 :ns "cljs.core",
 :name "first",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/rest"
           "cljs.core/next"
           "cljs.core/nth"
           "cljs.core/second"
           "cljs.core/take"
           "cljs.core/ffirst"],
 :full-name-encode "cljs.core_first",
 :source {:code "(defn first\n  [coll]\n  (when-not (nil? coll)\n    (if (implements? ISeq coll)\n      (-first ^not-native coll)\n      (let [s (seq coll)]\n        (when-not (nil? s)\n          (-first s))))))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [493 502]},
 :examples [{:id "40e413",
             :content "```clj\n(first [1 2 3])\n;;=> 1\n\n(first [])\n;;=> nil\n```"}],
 :full-name "cljs.core/first",
 :clj-symbol "clojure.core/first",
 :docstring "Returns the first item in the collection. Calls seq on its\nargument. If coll is nil, returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_first.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_first.cljsdoc)
</pre>

