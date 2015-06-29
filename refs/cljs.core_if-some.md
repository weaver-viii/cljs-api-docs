## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/if-some

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if-some</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if-some)
</td>
</tr>
</table>

 <samp>
(__if-some__ \[x test\] then)<br>
</samp>
 <samp>
(__if-some__ \[x test\] then else)<br>
</samp>

---

If `test` is not nil, evaluates `then` with `x` bound to the value of `test`. If
not, yields `else`.

---


See Also:

[`cljs.core/when-some`](cljs.core_when-some.md)<br>

---

Source docstring:

```
bindings => binding-form test

If test is not nil, evaluates then with binding-form bound to the
value of test, if not, yields else
```

Source code:

```clj
(defmacro if-some
  ([bindings then]
   `(if-some ~bindings ~then nil))
  ([bindings then else & oldform]
   (assert-args
     (vector? bindings) "a vector for its binding"
     (nil? oldform) "1 or 2 forms after binding vector"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
   (let [form (bindings 0) tst (bindings 1)]
     `(let [temp# ~tst]
        (if (nil? temp#)
          ~else
          (let [~form temp#]
            ~then))))))
```

 <pre>
clojure @ clojure-1.7.0-beta1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1760-1778](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta1/src/clj/clojure/core.clj#L1760-L1778)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/if-some"]))
```

```clj
{:description "If `test` is not nil, evaluates `then` with `x` bound to the value of `test`. If\nnot, yields `else`.",
 :ns "cljs.core",
 :name "if-some",
 :signature ["[[x test] then]" "[[x test] then else]"],
 :history [["+" "0.0-2261"]],
 :type "macro",
 :related ["cljs.core/when-some"],
 :full-name-encode "cljs.core_if-some",
 :source {:code "(defmacro if-some\n  ([bindings then]\n   `(if-some ~bindings ~then nil))\n  ([bindings then else & oldform]\n   (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (nil? oldform) \"1 or 2 forms after binding vector\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n   (let [form (bindings 0) tst (bindings 1)]\n     `(let [temp# ~tst]\n        (if (nil? temp#)\n          ~else\n          (let [~form temp#]\n            ~then))))))",
          :repo "clojure",
          :tag "clojure-1.7.0-beta1",
          :filename "src/clj/clojure/core.clj",
          :lines [1760 1778]},
 :full-name "cljs.core/if-some",
 :clj-symbol "clojure.core/if-some",
 :docstring "bindings => binding-form test\n\nIf test is not nil, evaluates then with binding-form bound to the\nvalue of test, if not, yields else"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_if-some.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_if-some.cljsdoc)
</pre>

