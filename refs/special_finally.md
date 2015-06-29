## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/finally

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/finally</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/finally)
</td>
</tr>
</table>

 <samp>
(__finally__ expr\*)<br>
</samp>

---

`finally` should be the last form inside of a `try` expression. It is optional.

`finally` clauses are always evaluated for their side effects whether there was
an error or not, but they are never the return value of a `try` expression.

---


See Also:

[`special/try`](special_try.md)<br>
[`special/catch`](special_catch.md)<br>
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
clojurescript @ r1913
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1004-1032](https://github.com/clojure/clojurescript/blob/r1913/src/clj/cljs/core.clj#L1004-L1032)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/finally"]))
```

```clj
{:description "`finally` should be the last form inside of a `try` expression. It is optional.\n\n`finally` clauses are always evaluated for their side effects whether there was\nan error or not, but they are never the return value of a `try` expression.",
 :ns "special",
 :name "finally",
 :signature ["[expr*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["special/try" "special/catch" "special/throw"],
 :full-name-encode "special_finally",
 :source {:code "(defmacro try\n  [& forms]\n  (let [catch? #(and (seq? %) (= (first %) 'catch))\n        [body catches] (split-with (complement catch?) forms)\n        [catches fin] (split-with catch? catches)\n        e (gensym \"e\")]\n    (assert (every? #(clojure.core/> (count %) 2) catches) \"catch block must specify a prototype and a name\")\n    (if (seq catches)\n      `(~'try*\n        ~@body\n        (catch ~e\n            (cond\n             ~@(mapcat\n                (fn [[_ type name & cb]]\n                  `[(instance? ~type ~e) (let [~name ~e] ~@cb)])\n                catches)\n             :else (throw ~e)))\n        ~@fin)\n      `(~'try*\n        ~@body\n        ~@fin))))",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/clj/cljs/core.clj",
          :lines [1004 1032]},
 :full-name "special/finally",
 :clj-symbol "clojure.core/finally",
 :docstring "(try expr* catch-clause* finally-clause?)\n\n Special Form\n\n catch-clause => (catch protoname name expr*)\n finally-clause => (finally expr*)\n\nCatches and handles JavaScript exceptions."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_finally.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_finally.cljsdoc)
</pre>

