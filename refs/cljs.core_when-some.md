## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/when-some

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when-some</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when-some)
</td>
</tr>
</table>

 <samp>
(__when-some__ \[x test\] & body)<br>
</samp>

---

When `test` is not nil, evaluates `body` with `x` bound to the value of `test`.

---


See Also:

[`cljs.core/if-some`](cljs.core_if-some.md)<br>

---

Source docstring:

```
bindings => binding-form test

When test is not nil, evaluates body with binding-form bound to the
value of test
```

Source code:

```clj
(defmacro when-some
  [bindings & body]
  (assert-args
     (vector? bindings) "a vector for its binding"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
   (let [form (bindings 0) tst (bindings 1)]
    `(let [temp# ~tst]
       (if (nil? temp#)
         nil
         (let [~form temp#]
           ~@body)))))
```

 <pre>
clojure @ clojure-1.7.0-alpha6
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1780-1795](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L1780-L1795)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/when-some"]))
```

```clj
{:description "When `test` is not nil, evaluates `body` with `x` bound to the value of `test`.",
 :ns "cljs.core",
 :name "when-some",
 :signature ["[[x test] & body]"],
 :history [["+" "0.0-2261"]],
 :type "macro",
 :related ["cljs.core/if-some"],
 :full-name-encode "cljs.core_when-some",
 :source {:code "(defmacro when-some\n  [bindings & body]\n  (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n   (let [form (bindings 0) tst (bindings 1)]\n    `(let [temp# ~tst]\n       (if (nil? temp#)\n         nil\n         (let [~form temp#]\n           ~@body)))))",
          :repo "clojure",
          :tag "clojure-1.7.0-alpha6",
          :filename "src/clj/clojure/core.clj",
          :lines [1780 1795]},
 :full-name "cljs.core/when-some",
 :clj-symbol "clojure.core/when-some",
 :docstring "bindings => binding-form test\n\nWhen test is not nil, evaluates body with binding-form bound to the\nvalue of test"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_when-some.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_when-some.cljsdoc)
</pre>

