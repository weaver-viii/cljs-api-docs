## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/and

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/and</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/and)
</td>
</tr>
</table>

 <samp>
(__and__)<br>
</samp>
 <samp>
(__and__ x)<br>
</samp>
 <samp>
(__and__ x & next)<br>
</samp>

---

Evaluates arguments one at a time from left to right. If an argument returns
logical false (nil or false), `and` returns that value and doesn't evaluate any
of the other arguments, otherwise it returns the value of the last argument.

`(and)` returns true.

---

Example:

```clj
(and)
;;=> true

(and false)
;;=> false

(and true)
;;=> true

(and true true)
;;=> true

(and true false)
;;=> false

(and false false)
;;=> false
```

---
Example:

`nil` and `false` are the only falsy values and everything else is truthy:

```clj
(and "foo" "bar")
;;=> "bar"

(and "foo" nil)
;;=> nil

(and "foo" false)
;;=> false

(and nil "foo")
;;=> nil

(and false "foo")
;;=> false
```

---

See Also:

[`cljs.core/or`](cljs.core_or.md)<br>
[`special/if`](special_if.md)<br>

---

Source docstring:

```
Evaluates exprs one at a time, from left to right. If a form
returns logical false (nil or false), and returns that value and
doesn't evaluate any of the other expressions, otherwise it returns
the value of the last expr. (and) returns true.
```

Source code:

```clj
(defmacro and
  ([] true)
  ([x] x)
  ([x & next]
   `(let [and# ~x]
      (if and# (and ~@next) and#))))
```

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:778-788](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L778-L788)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/and"]))
```

```clj
{:description "Evaluates arguments one at a time from left to right. If an argument returns\nlogical false (nil or false), `and` returns that value and doesn't evaluate any\nof the other arguments, otherwise it returns the value of the last argument.\n\n`(and)` returns true.",
 :ns "cljs.core",
 :name "and",
 :signature ["[]" "[x]" "[x & next]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/or" "special/if"],
 :full-name-encode "cljs.core_and",
 :source {:code "(defmacro and\n  ([] true)\n  ([x] x)\n  ([x & next]\n   `(let [and# ~x]\n      (if and# (and ~@next) and#))))",
          :repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/clj/clojure/core.clj",
          :lines [778 788]},
 :examples [{:id "a39a73",
             :content "```clj\n(and)\n;;=> true\n\n(and false)\n;;=> false\n\n(and true)\n;;=> true\n\n(and true true)\n;;=> true\n\n(and true false)\n;;=> false\n\n(and false false)\n;;=> false\n```"}
            {:id "766638",
             :content "`nil` and `false` are the only falsy values and everything else is truthy:\n\n```clj\n(and \"foo\" \"bar\")\n;;=> \"bar\"\n\n(and \"foo\" nil)\n;;=> nil\n\n(and \"foo\" false)\n;;=> false\n\n(and nil \"foo\")\n;;=> nil\n\n(and false \"foo\")\n;;=> false\n```"}],
 :full-name "cljs.core/and",
 :clj-symbol "clojure.core/and",
 :docstring "Evaluates exprs one at a time, from left to right. If a form\nreturns logical false (nil or false), and returns that value and\ndoesn't evaluate any of the other expressions, otherwise it returns\nthe value of the last expr. (and) returns true."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_and.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_and.cljsdoc)
</pre>

