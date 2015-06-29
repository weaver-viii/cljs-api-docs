## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/odd?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/odd?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/odd?)
</td>
</tr>
</table>

 <samp>
(__odd?__ n)<br>
</samp>

---

Returns true if `n` is an odd number.

Throws an exception if `n` is not an integer.

---


See Also:

[`cljs.core/even?`](cljs.core_evenQMARK.md)<br>

---

Source docstring:

```
Returns true if n is odd, throws an exception if n is not an integer
```

Source code:

```clj
(defn ^boolean odd?
  [n] (not (even? n)))
```

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3325-3327](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L3325-L3327)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/odd?"]))
```

```clj
{:description "Returns true if `n` is an odd number.\n\nThrows an exception if `n` is not an integer.",
 :return-type boolean,
 :ns "cljs.core",
 :name "odd?",
 :signature ["[n]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/even?"],
 :full-name-encode "cljs.core_oddQMARK",
 :source {:code "(defn ^boolean odd?\n  [n] (not (even? n)))",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3325 3327]},
 :full-name "cljs.core/odd?",
 :clj-symbol "clojure.core/odd?",
 :docstring "Returns true if n is odd, throws an exception if n is not an integer"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_oddQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_oddQMARK.cljsdoc)
</pre>

