## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/divide

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__divide__ x)<br>
</samp>
 <samp>
(__divide__ x y)<br>
</samp>
 <samp>
(__divide__ x y & more)<br>
</samp>

---





Source code:

```clj
(defmacro divide
  ([x] `(/ 1 ~x))
  ([x y] (list 'js* "(~{} / ~{})" x y))
  ([x y & more] `(/ (/ ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r1859
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:351-354](https://github.com/clojure/clojurescript/blob/r1859/src/clj/cljs/core.clj#L351-L354)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/divide"]))
```

```clj
{:ns "cljs.core",
 :name "divide",
 :type "macro",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :source {:code "(defmacro divide\n  ([x] `(/ 1 ~x))\n  ([x y] (list 'js* \"(~{} / ~{})\" x y))\n  ([x y & more] `(/ (/ ~x ~y) ~@more)))",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/clj/cljs/core.clj",
          :lines [351 354]},
 :full-name "cljs.core/divide",
 :full-name-encode "cljs.core_divide",
 :history [["+" "0.0-1798"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_divide.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_divide.cljsdoc)
</pre>

