## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-dec

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-dec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-dec)
</td>
</tr>
</table>

 <samp>
(__unchecked-dec__ x)<br>
</samp>

---




Source docstring:

```
Returns a number one less than x, an int.
```

Source code:

```clj
(defn unchecked-dec
  [x]
  (cljs.core/unchecked-dec x))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2242-2245](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L2242-L2245)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric unchecked-dec
  ([x] `(dec ~x)))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:445-446](https://github.com/clojure/clojurescript/blob/r3264/src/main/clojure/cljs/core.clj#L445-L446)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/unchecked-dec"]))
```

```clj
{:ns "cljs.core",
 :name "unchecked-dec",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-dec",
 :source {:code "(defn unchecked-dec\n  [x]\n  (cljs.core/unchecked-dec x))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2242 2245]},
 :extra-sources ({:code "(defmacro ^::ana/numeric unchecked-dec\n  ([x] `(dec ~x)))",
                  :repo "clojurescript",
                  :tag "r3264",
                  :filename "src/main/clojure/cljs/core.clj",
                  :lines [445 446]}),
 :full-name "cljs.core/unchecked-dec",
 :clj-symbol "clojure.core/unchecked-dec",
 :docstring "Returns a number one less than x, an int."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_unchecked-dec.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_unchecked-dec.cljsdoc)
</pre>

