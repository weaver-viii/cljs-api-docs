## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/if-let

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if-let</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if-let)
</td>
</tr>
</table>

 <samp>
(__if-let__ \[x test\] then)<br>
</samp>
 <samp>
(__if-let__ \[x test\] then else)<br>
</samp>

---

When `test` is logical true, evaluates `then` with the value of `test` bound to
`x`. Otherwise, evaluates `else` with no bindings.

`else` defaults to nil.

---


See Also:

[`cljs.core/when-let`](cljs.core_when-let.md)<br>
[`special/if`](special_if.md)<br>

---

Source docstring:

```
bindings => binding-form test

If test is true, evaluates then with binding-form bound to the value of 
test, if not, yields else
```

Source code:

```clj
(defmacro if-let
  ([bindings then]
   `(if-let ~bindings ~then nil))
  ([bindings then else & oldform]
   (assert-args if-let
     (and (vector? bindings) (nil? oldform)) "a vector for its binding"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
   (let [form (bindings 0) tst (bindings 1)]
     `(let [temp# ~tst]
        (if temp#
          (let [~form temp#]
            ~then)
          ~else)))))
```

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1666-1683](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L1666-L1683)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/if-let"]))
```

```clj
{:description "When `test` is logical true, evaluates `then` with the value of `test` bound to\n`x`. Otherwise, evaluates `else` with no bindings.\n\n`else` defaults to nil.",
 :ns "cljs.core",
 :name "if-let",
 :signature ["[[x test] then]" "[[x test] then else]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/when-let" "special/if"],
 :full-name-encode "cljs.core_if-let",
 :source {:code "(defmacro if-let\n  ([bindings then]\n   `(if-let ~bindings ~then nil))\n  ([bindings then else & oldform]\n   (assert-args if-let\n     (and (vector? bindings) (nil? oldform)) \"a vector for its binding\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n   (let [form (bindings 0) tst (bindings 1)]\n     `(let [temp# ~tst]\n        (if temp#\n          (let [~form temp#]\n            ~then)\n          ~else)))))",
          :repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/clj/clojure/core.clj",
          :lines [1666 1683]},
 :full-name "cljs.core/if-let",
 :clj-symbol "clojure.core/if-let",
 :docstring "bindings => binding-form test\n\nIf test is true, evaluates then with binding-form bound to the value of \ntest, if not, yields else"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_if-let.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_if-let.cljsdoc)
</pre>

