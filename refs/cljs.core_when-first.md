## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/when-first

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when-first</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when-first)
</td>
</tr>
</table>

 <samp>
(__when-first__ bindings & body)<br>
</samp>

---

With `bindings` as `x`, `xs`, roughly the same as `(when (seq xs) (let [x (first
xs)] body))` but `xs` is evaluated only once.

---



Source docstring:

```
bindings => x xs

Roughly the same as (when (seq xs) (let [x (first xs)] body)) but xs is evaluated only once
```

Source code:

```clj
(defmacro when-first
  [bindings & body]
  (assert-args
     (vector? bindings) "a vector for its binding"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
  (let [[x xs] bindings]
    `(when-let [xs# (seq ~xs)]
       (let [~x (first xs#)]
           ~@body))))
```

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4154-4166](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L4154-L4166)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/when-first"]))
```

```clj
{:description "With `bindings` as `x`, `xs`, roughly the same as `(when (seq xs) (let [x (first\nxs)] body))` but `xs` is evaluated only once.",
 :ns "cljs.core",
 :name "when-first",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_when-first",
 :source {:code "(defmacro when-first\n  [bindings & body]\n  (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n  (let [[x xs] bindings]\n    `(when-let [xs# (seq ~xs)]\n       (let [~x (first xs#)]\n           ~@body))))",
          :repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/clj/clojure/core.clj",
          :lines [4154 4166]},
 :full-name "cljs.core/when-first",
 :clj-symbol "clojure.core/when-first",
 :docstring "bindings => x xs\n\nRoughly the same as (when (seq xs) (let [x (first xs)] body)) but xs is evaluated only once"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_when-first.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_when-first.cljsdoc)
</pre>

