## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dec

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dec)
</td>
</tr>
</table>

 <samp>
(__dec__ x)<br>
</samp>

---

Returns a number one less than `x`.

---


See Also:

[`cljs.core/inc`](cljs.core_inc.md)<br>

---

Source docstring:

```
Returns a number one less than num.
```

Source code:

```clj
(defn dec
  [x] (- x 1))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1101-1103](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L1101-L1103)</ins>
</pre>


---

```clj
(defmacro dec [x]
  `(- ~x 1))
```

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:163-164](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/core.clj#L163-L164)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dec"]))
```

```clj
{:description "Returns a number one less than `x`.",
 :ns "cljs.core",
 :name "dec",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/inc"],
 :full-name-encode "cljs.core_dec",
 :source {:code "(defn dec\n  [x] (- x 1))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1101 1103]},
 :extra-sources ({:code "(defmacro dec [x]\n  `(- ~x 1))",
                  :repo "clojurescript",
                  :tag "r1236",
                  :filename "src/clj/cljs/core.clj",
                  :lines [163 164]}),
 :full-name "cljs.core/dec",
 :clj-symbol "clojure.core/dec",
 :docstring "Returns a number one less than num."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_dec.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_dec.cljsdoc)
</pre>
