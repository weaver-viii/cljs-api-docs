## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/complement

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/complement</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/complement)
</td>
</tr>
</table>

 <samp>
(__complement__ f)<br>
</samp>

---

Takes a function `f` and returns a function that takes the same arguments as
`f`, has the same effects, if any, and returns the opposite truth value.

---


See Also:

[`cljs.core/not`](cljs.core_not.md)<br>

---

Source docstring:

```
Takes a fn f and returns a fn that takes the same arguments as f,
has the same effects, if any, and returns the opposite truth value.
```

Source code:

```clj
(defn ^boolean complement
  [f]
  (fn
    ([] (not (f)))
    ([x] (not (f x)))
    ([x y] (not (f x y)))
    ([x y & zs] (not (apply f x y zs)))))
```

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2553-2561](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L2553-L2561)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/complement"]))
```

```clj
{:description "Takes a function `f` and returns a function that takes the same arguments as\n`f`, has the same effects, if any, and returns the opposite truth value.",
 :return-type boolean,
 :ns "cljs.core",
 :name "complement",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/not"],
 :full-name-encode "cljs.core_complement",
 :source {:code "(defn ^boolean complement\n  [f]\n  (fn\n    ([] (not (f)))\n    ([x] (not (f x)))\n    ([x y] (not (f x y)))\n    ([x y & zs] (not (apply f x y zs)))))",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2553 2561]},
 :full-name "cljs.core/complement",
 :clj-symbol "clojure.core/complement",
 :docstring "Takes a fn f and returns a fn that takes the same arguments as f,\nhas the same effects, if any, and returns the opposite truth value."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_complement.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_complement.cljsdoc)
</pre>

