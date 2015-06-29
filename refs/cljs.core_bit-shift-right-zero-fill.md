## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/bit-shift-right-zero-fill

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__bit-shift-right-zero-fill__ x n)<br>
</samp>

---




Source docstring:

```
DEPRECATED: Bitwise shift right with zero fill
```

Source code:

```clj
(defn bit-shift-right-zero-fill
  [x n] (cljs.core/bit-shift-right-zero-fill x n))
```

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2405-2407](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L2405-L2407)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric bit-shift-right-zero-fill [x n]
  (core/list 'js* "(~{} >>> ~{})" x n))
```

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:550-551](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/core.clj#L550-L551)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-shift-right-zero-fill"]))
```

```clj
{:ns "cljs.core",
 :name "bit-shift-right-zero-fill",
 :signature ["[x n]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_bit-shift-right-zero-fill",
 :source {:code "(defn bit-shift-right-zero-fill\n  [x n] (cljs.core/bit-shift-right-zero-fill x n))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2405 2407]},
 :extra-sources ({:code "(defmacro ^::ana/numeric bit-shift-right-zero-fill [x n]\n  (core/list 'js* \"(~{} >>> ~{})\" x n))",
                  :repo "clojurescript",
                  :tag "r3149",
                  :filename "src/clj/cljs/core.clj",
                  :lines [550 551]}),
 :full-name "cljs.core/bit-shift-right-zero-fill",
 :docstring "DEPRECATED: Bitwise shift right with zero fill"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_bit-shift-right-zero-fill.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_bit-shift-right-zero-fill.cljsdoc)
</pre>

