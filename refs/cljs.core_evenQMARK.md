## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/even?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/even?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/even?)
</td>
</tr>
</table>

 <samp>
(__even?__ n)<br>
</samp>

---

Returns true if `n` is an even number.

Throws an exception if `n` is not an integer.

---


See Also:

[`cljs.core/odd?`](cljs.core_oddQMARK.md)<br>

---

Source docstring:

```
Returns true if n is even, throws an exception if n is not an integer
```

Source code:

```clj
(defn ^boolean even?
   [n] (if (integer? n)
        (zero? (bit-and n 1))
        (throw (js/Error. (str "Argument must be an integer: " n)))))
```

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3263-3267](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L3263-L3267)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/even?"]))
```

```clj
{:description "Returns true if `n` is an even number.\n\nThrows an exception if `n` is not an integer.",
 :return-type boolean,
 :ns "cljs.core",
 :name "even?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/odd?"],
 :full-name-encode "cljs.core_evenQMARK",
 :source {:code "(defn ^boolean even?\n   [n] (if (integer? n)\n        (zero? (bit-and n 1))\n        (throw (js/Error. (str \"Argument must be an integer: \" n)))))",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3263 3267]},
 :full-name "cljs.core/even?",
 :clj-symbol "clojure.core/even?",
 :docstring "Returns true if n is even, throws an exception if n is not an integer"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_evenQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_evenQMARK.cljsdoc)
</pre>

