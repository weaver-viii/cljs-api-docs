## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/or

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/or</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/or)
</td>
</tr>
</table>

 <samp>
(__or__)<br>
</samp>
 <samp>
(__or__ x)<br>
</samp>
 <samp>
(__or__ x & next)<br>
</samp>

---

Evaluates arguments one at a time from left to right. If an argument returns
logical true, `or` returns that value and doesn't evaluate any of the other
arguments, otherwise it returns the value of the last argument.

`(or)` returns nil.

---

Example:

```clj
(or)
;;=> nil

(or false)
;;=> false

(or true)
;;=> true

(or true true)
;;=> true

(or true false)
;;=> true

(or false false)
;;=> false
```

---
Example:

`nil` and `false` are the only falsy values and everything else is truthy:

```clj
(or "foo" "bar")
;;=> "bar"

(or "foo" nil)
;;=> "foo"

(or "foo" false)
;;=> "foo"

(or nil "foo")
;;=> "foo"

(or false "foo")
;;=> "foo"
```

---

See Also:

[`cljs.core/and`](cljs.core_and.md)<br>
[`special/if`](special_if.md)<br>

---

Source docstring:

```
Evaluates exprs one at a time, from left to right. If a form
returns a logical true value, or returns that value and doesn't
evaluate any of the other expressions, otherwise it returns the
value of the last expression. (or) returns nil.
```

Source code:

```clj
(defmacro or
  ([] nil)
  ([x] x)
  ([x & next]
    (let [forms (concat [x] next)]
      (if (every? #(simple-test-expr? &env %)
            (map #(cljs.analyzer/analyze &env %) forms))
        (let [or-str (->> (repeat (count forms) "(~{})")
                        (interpose " || ")
                        (apply core/str))]
          (bool-expr `(~'js* ~or-str ~@forms)))
        `(let [or# ~x]
           (if or# or# (or ~@next)))))))
```

 <pre>
clojurescript @ r2411
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:239-255](https://github.com/clojure/clojurescript/blob/r2411/src/clj/cljs/core.clj#L239-L255)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/or"]))
```

```clj
{:description "Evaluates arguments one at a time from left to right. If an argument returns\nlogical true, `or` returns that value and doesn't evaluate any of the other\narguments, otherwise it returns the value of the last argument.\n\n`(or)` returns nil.",
 :ns "cljs.core",
 :name "or",
 :signature ["[]" "[x]" "[x & next]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/and" "special/if"],
 :full-name-encode "cljs.core_or",
 :source {:code "(defmacro or\n  ([] nil)\n  ([x] x)\n  ([x & next]\n    (let [forms (concat [x] next)]\n      (if (every? #(simple-test-expr? &env %)\n            (map #(cljs.analyzer/analyze &env %) forms))\n        (let [or-str (->> (repeat (count forms) \"(~{})\")\n                        (interpose \" || \")\n                        (apply core/str))]\n          (bool-expr `(~'js* ~or-str ~@forms)))\n        `(let [or# ~x]\n           (if or# or# (or ~@next)))))))",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/clj/cljs/core.clj",
          :lines [239 255]},
 :examples [{:id "d50433",
             :content "```clj\n(or)\n;;=> nil\n\n(or false)\n;;=> false\n\n(or true)\n;;=> true\n\n(or true true)\n;;=> true\n\n(or true false)\n;;=> true\n\n(or false false)\n;;=> false\n```"}
            {:id "62f291",
             :content "`nil` and `false` are the only falsy values and everything else is truthy:\n\n```clj\n(or \"foo\" \"bar\")\n;;=> \"bar\"\n\n(or \"foo\" nil)\n;;=> \"foo\"\n\n(or \"foo\" false)\n;;=> \"foo\"\n\n(or nil \"foo\")\n;;=> \"foo\"\n\n(or false \"foo\")\n;;=> \"foo\"\n```"}],
 :full-name "cljs.core/or",
 :clj-symbol "clojure.core/or",
 :docstring "Evaluates exprs one at a time, from left to right. If a form\nreturns a logical true value, or returns that value and doesn't\nevaluate any of the other expressions, otherwise it returns the\nvalue of the last expression. (or) returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_or.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_or.cljsdoc)
</pre>

