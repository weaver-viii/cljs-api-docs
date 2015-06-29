## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/catch

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/catch</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/catch)
</td>
</tr>
</table>

 <samp>
(__catch__ exception-type name expr\*)<br>
</samp>

---

`catch` should be used inside of a `try` expression.

`exception-type` should be the type of exception thrown (usually `js/Error` or
`js/Object`). When there is a match, the thrown exception will be bound to
`name` inside of `expr*` and `expr*` will be evaluated and returned as the value
of the `try` expression.

---


See Also:

[`special/try`](special_try.md)<br>
[`special/finally`](special_finally.md)<br>
[`special/throw`](special_throw.md)<br>

---

Source docstring:

```
(try expr* catch-clause* finally-clause?)

 Special Form

 catch-clause => (catch protoname name expr*)
 finally-clause => (finally expr*)

Catches and handles JavaScript exceptions.
```

Source code:

```clj
(defmacro try
  [& forms]
  (let [catch? #(and (seq? %) (= (first %) 'catch))
        [body catches] (split-with (complement catch?) forms)
        [catches fin] (split-with catch? catches)
        e (gensym "e")]
    (assert (every? #(clojure.core/> (count %) 2) catches) "catch block must specify a prototype and a name")
    (if (seq catches)
      `(~'try*
        ~@body
        (catch ~e
            (cond
             ~@(mapcat
                (fn [[_ type name & cb]]
                  `[(instance? ~type ~e) (let [~name ~e] ~@cb)])
                catches)
             :else (throw ~e)))
        ~@fin)
      `(~'try*
        ~@body
        ~@fin))))
```

 <pre>
clojurescript @ r1885
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1004-1032](https://github.com/clojure/clojurescript/blob/r1885/src/clj/cljs/core.clj#L1004-L1032)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/catch"]))
```

```clj
{:description "`catch` should be used inside of a `try` expression.\n\n`exception-type` should be the type of exception thrown (usually `js/Error` or\n`js/Object`). When there is a match, the thrown exception will be bound to\n`name` inside of `expr*` and `expr*` will be evaluated and returned as the value\nof the `try` expression.",
 :ns "special",
 :name "catch",
 :signature ["[exception-type name expr*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["special/try" "special/finally" "special/throw"],
 :full-name-encode "special_catch",
 :source {:code "(defmacro try\n  [& forms]\n  (let [catch? #(and (seq? %) (= (first %) 'catch))\n        [body catches] (split-with (complement catch?) forms)\n        [catches fin] (split-with catch? catches)\n        e (gensym \"e\")]\n    (assert (every? #(clojure.core/> (count %) 2) catches) \"catch block must specify a prototype and a name\")\n    (if (seq catches)\n      `(~'try*\n        ~@body\n        (catch ~e\n            (cond\n             ~@(mapcat\n                (fn [[_ type name & cb]]\n                  `[(instance? ~type ~e) (let [~name ~e] ~@cb)])\n                catches)\n             :else (throw ~e)))\n        ~@fin)\n      `(~'try*\n        ~@body\n        ~@fin))))",
          :repo "clojurescript",
          :tag "r1885",
          :filename "src/clj/cljs/core.clj",
          :lines [1004 1032]},
 :full-name "special/catch",
 :clj-symbol "clojure.core/catch",
 :docstring "(try expr* catch-clause* finally-clause?)\n\n Special Form\n\n catch-clause => (catch protoname name expr*)\n finally-clause => (finally expr*)\n\nCatches and handles JavaScript exceptions."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_catch.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_catch.cljsdoc)
</pre>

