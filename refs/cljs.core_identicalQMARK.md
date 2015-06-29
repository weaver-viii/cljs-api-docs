## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/identical?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/identical?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/identical?)
</td>
</tr>
</table>

 <samp>
(__identical?__ x y)<br>
</samp>

---

Returns true if `x` and `y` are the same object, false otherwise.

---


See Also:

[`cljs.core/=`](cljs.core_EQ.md)<br>
[`cljs.core/==`](cljs.core_EQEQ.md)<br>

---


Source code:

```clj
(defn identical? [x y]
  "Tests if 2 arguments are the same object"
  (js* "(~{x} === ~{y})"))
```

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:176-178](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L176-L178)</ins>
</pre>


---

```clj
(defmacro identical? [a b]
  (list 'js* "(~{} === ~{})" a b))
```

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:45-46](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L45-L46)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/identical?"]))
```

```clj
{:description "Returns true if `x` and `y` are the same object, false otherwise.",
 :ns "cljs.core",
 :name "identical?",
 :signature ["[x y]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/=" "cljs.core/=="],
 :full-name-encode "cljs.core_identicalQMARK",
 :source {:code "(defn identical? [x y]\n  \"Tests if 2 arguments are the same object\"\n  (js* \"(~{x} === ~{y})\"))",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/core.cljs",
          :lines [176 178]},
 :extra-sources ({:code "(defmacro identical? [a b]\n  (list 'js* \"(~{} === ~{})\" a b))",
                  :repo "clojurescript",
                  :tag "r927",
                  :filename "src/clj/cljs/core.clj",
                  :lines [45 46]}),
 :full-name "cljs.core/identical?",
 :clj-symbol "clojure.core/identical?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_identicalQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_identicalQMARK.cljsdoc)
</pre>

