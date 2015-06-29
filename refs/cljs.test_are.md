## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/are

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/are</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/are)
</td>
</tr>
</table>

 <samp>
(__are__ argv expr & args)<br>
</samp>

---




Source docstring:

```
Checks multiple assertions with a template expression.
See clojure.template/do-template for an explanation of
templates.

Example: (are [x y] (= x y)  
              2 (+ 1 1)
              4 (* 2 2))
Expands to: 
         (do (is (= 2 (+ 1 1)))
             (is (= 4 (* 2 2))))

Note: This breaks some reporting features, such as line numbers.
```

Source code:

```clj
(defmacro are
  [argv expr & args]
  (if (or
        ;; (are [] true) is meaningless but ok
        (and (empty? argv) (empty? args))
        ;; Catch wrong number of args
        (and (pos? (count argv))
          (pos? (count args))
          (zero? (mod (count args) (count argv)))))
    `(clojure.template/do-template ~argv (is ~expr) ~@args)
    (throw (IllegalArgumentException. "The number of args doesn't match are's argv."))))
```

 <pre>
clojurescript @ r2758
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:167-189](https://github.com/clojure/clojurescript/blob/r2758/src/clj/cljs/test.clj#L167-L189)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/are"]))
```

```clj
{:ns "cljs.test",
 :name "are",
 :signature ["[argv expr & args]"],
 :history [["+" "0.0-2629"]],
 :type "macro",
 :full-name-encode "cljs.test_are",
 :source {:code "(defmacro are\n  [argv expr & args]\n  (if (or\n        ;; (are [] true) is meaningless but ok\n        (and (empty? argv) (empty? args))\n        ;; Catch wrong number of args\n        (and (pos? (count argv))\n          (pos? (count args))\n          (zero? (mod (count args) (count argv)))))\n    `(clojure.template/do-template ~argv (is ~expr) ~@args)\n    (throw (IllegalArgumentException. \"The number of args doesn't match are's argv.\"))))",
          :repo "clojurescript",
          :tag "r2758",
          :filename "src/clj/cljs/test.clj",
          :lines [167 189]},
 :full-name "cljs.test/are",
 :clj-symbol "clojure.test/are",
 :docstring "Checks multiple assertions with a template expression.\nSee clojure.template/do-template for an explanation of\ntemplates.\n\nExample: (are [x y] (= x y)  \n              2 (+ 1 1)\n              4 (* 2 2))\nExpands to: \n         (do (is (= 2 (+ 1 1)))\n             (is (= 4 (* 2 2))))\n\nNote: This breaks some reporting features, such as line numbers."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_are.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_are.cljsdoc)
</pre>

