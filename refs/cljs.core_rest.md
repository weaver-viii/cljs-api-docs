## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/rest

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/rest</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/rest)
</td>
</tr>
</table>

 <samp>
(__rest__ coll)<br>
</samp>

---

Returns a possibly empty sequence of the items after the first item.

Calls `seq` on its argument.

---

Example:

```clj
(rest [1 2 3])
;;=> (2 3)

(rest [1 2])
;;=> (2)

(rest [1])
;;=> ()

(rest [])
;;=> ()
```

---

See Also:

[`cljs.core/next`](cljs.core_next.md)<br>
[`cljs.core/first`](cljs.core_first.md)<br>
[`cljs.core/drop`](cljs.core_drop.md)<br>
[`cljs.core/pop`](cljs.core_pop.md)<br>

---

Source docstring:

```
Returns a possibly empty seq of the items after the first. Calls seq on its
argument.
```

Source code:

```clj
(defn ^seq rest
  [coll]
  (if-not (nil? coll)
    (if (implements? ISeq coll)
      (-rest ^not-native coll)
      (let [s (seq coll)]
        (if s
          (-rest ^not-native s)
          ())))
    ()))
```

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:964-975](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L964-L975)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/rest"]))
```

```clj
{:description "Returns a possibly empty sequence of the items after the first item.\n\nCalls `seq` on its argument.",
 :return-type seq,
 :ns "cljs.core",
 :name "rest",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/next"
           "cljs.core/first"
           "cljs.core/drop"
           "cljs.core/pop"],
 :full-name-encode "cljs.core_rest",
 :source {:code "(defn ^seq rest\n  [coll]\n  (if-not (nil? coll)\n    (if (implements? ISeq coll)\n      (-rest ^not-native coll)\n      (let [s (seq coll)]\n        (if s\n          (-rest ^not-native s)\n          ())))\n    ()))",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [964 975]},
 :examples [{:id "0869af",
             :content "```clj\n(rest [1 2 3])\n;;=> (2 3)\n\n(rest [1 2])\n;;=> (2)\n\n(rest [1])\n;;=> ()\n\n(rest [])\n;;=> ()\n```"}],
 :full-name "cljs.core/rest",
 :clj-symbol "clojure.core/rest",
 :docstring "Returns a possibly empty seq of the items after the first. Calls seq on its\nargument."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_rest.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_rest.cljsdoc)
</pre>

