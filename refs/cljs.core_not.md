## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/not

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/not)
</td>
</tr>
</table>

 <samp>
(__not__ x)<br>
</samp>

---

Returns true if `x` is logical false, false otherwise.

---


See Also:

[`cljs.core/complement`](cljs.core_complement.md)<br>
[`cljs.core/false?`](cljs.core_falseQMARK.md)<br>

---

Source docstring:

```
Returns true if x is logical false, false otherwise.
```

Source code:

```clj
(defn ^boolean not
  [x] (if x false true))
```

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:77-79](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L77-L79)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/not"]))
```

```clj
{:description "Returns true if `x` is logical false, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "not",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/complement" "cljs.core/false?"],
 :full-name-encode "cljs.core_not",
 :source {:code "(defn ^boolean not\n  [x] (if x false true))",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/cljs/core.cljs",
          :lines [77 79]},
 :full-name "cljs.core/not",
 :clj-symbol "clojure.core/not",
 :docstring "Returns true if x is logical false, false otherwise."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_not.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_not.cljsdoc)
</pre>

