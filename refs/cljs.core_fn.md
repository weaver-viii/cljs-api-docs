## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/fn

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fn)
</td>
</tr>
</table>

 <samp>
(__fn__ name? \[params\*\] prepost-map? body)<br>
</samp>
 <samp>
(__fn__ name? (\[params\*\] prepost-map? body)+)<br>
</samp>

---

Defines a function.

`name?` is an optional name of the function to be used inside `body`. This is
useful for recursive calls. Note that `name?` in `fn` is not the same as the
`name` argument to `defn`, which defines a global symbol for the function.

`params*` are the arguments to the function and a binding form for the symbols
that the arguments will take inside the body of the function. Functions can have
arity of 0-20 and there is no runtime enforcement of arity when calling a
function (just like in JavaScript).

`prepost-map?` is an optional map with optional keys `:pre` and `:post` that
contain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)
for the function.

`body` is a series of expressions that execute when the function is called. The
arguments to the function are mapped to symbols in `params*` and are available
in `body`. The value of the last expression in `body` is the return value of
calling the function.

---


See Also:

[`cljs.core/defn`](cljs.core_defn.md)<br>
[`cljs.core/defn-`](cljs.core_defn-.md)<br>

---

Source docstring:

```
params => positional-params* , or positional-params* & next-param
positional-param => binding-form
next-param => binding-form
name => symbol

Defines a function
```

Source code:

```clj
(defmacro fn
  [& sigs]
    (let [name (if (symbol? (first sigs)) (first sigs) nil)
          sigs (if name (next sigs) sigs)
          sigs (if (vector? (first sigs)) (list sigs) sigs)
          psig (fn* [sig]
                 (let [[params & body] sig
                       conds (when (and (next body) (map? (first body))) 
                                           (first body))
                       body (if conds (next body) body)
                       conds (or conds (meta params))
                       pre (:pre conds)
                       post (:post conds)                       
                       body (if post
                              `((let [~'% ~(if (< 1 (count body)) 
                                            `(do ~@body) 
                                            (first body))]
                                 ~@(map (fn* [c] `(assert ~c)) post)
                                 ~'%))
                              body)
                       body (if pre
                              (concat (map (fn* [c] `(assert ~c)) pre) 
                                      body)
                              body)]
                   (maybe-destructured params body)))
          new-sigs (map psig sigs)]
      (with-meta
        (if name
          (list* 'fn* name new-sigs)
          (cons 'fn* new-sigs))
        (meta &form))))
```

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:3985-4023](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L3985-L4023)</ins>
</pre>


---

```clj
(def
 ^{:macro true
   :added "1.0"}
 fn (fn* fn [&form &env & decl] 
         (.withMeta ^clojure.lang.IObj (cons 'fn* decl) 
                    (.meta ^clojure.lang.IMeta &form))))
```

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:42-47](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L42-L47)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/fn"]))
```

```clj
{:description "Defines a function.\n\n`name?` is an optional name of the function to be used inside `body`. This is\nuseful for recursive calls. Note that `name?` in `fn` is not the same as the\n`name` argument to `defn`, which defines a global symbol for the function.\n\n`params*` are the arguments to the function and a binding form for the symbols\nthat the arguments will take inside the body of the function. Functions can have\narity of 0-20 and there is no runtime enforcement of arity when calling a\nfunction (just like in JavaScript).\n\n`prepost-map?` is an optional map with optional keys `:pre` and `:post` that\ncontain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)\nfor the function.\n\n`body` is a series of expressions that execute when the function is called. The\narguments to the function are mapped to symbols in `params*` and are available\nin `body`. The value of the last expression in `body` is the return value of\ncalling the function.",
 :ns "cljs.core",
 :name "fn",
 :signature ["[name? [params*] prepost-map? body]"
             "[name? ([params*] prepost-map? body)+]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/defn" "cljs.core/defn-"],
 :full-name-encode "cljs.core_fn",
 :source {:code "(defmacro fn\n  [& sigs]\n    (let [name (if (symbol? (first sigs)) (first sigs) nil)\n          sigs (if name (next sigs) sigs)\n          sigs (if (vector? (first sigs)) (list sigs) sigs)\n          psig (fn* [sig]\n                 (let [[params & body] sig\n                       conds (when (and (next body) (map? (first body))) \n                                           (first body))\n                       body (if conds (next body) body)\n                       conds (or conds (meta params))\n                       pre (:pre conds)\n                       post (:post conds)                       \n                       body (if post\n                              `((let [~'% ~(if (< 1 (count body)) \n                                            `(do ~@body) \n                                            (first body))]\n                                 ~@(map (fn* [c] `(assert ~c)) post)\n                                 ~'%))\n                              body)\n                       body (if pre\n                              (concat (map (fn* [c] `(assert ~c)) pre) \n                                      body)\n                              body)]\n                   (maybe-destructured params body)))\n          new-sigs (map psig sigs)]\n      (with-meta\n        (if name\n          (list* 'fn* name new-sigs)\n          (cons 'fn* new-sigs))\n        (meta &form))))",
          :repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/clj/clojure/core.clj",
          :lines [3985 4023]},
 :extra-sources ({:code "(def\n ^{:macro true\n   :added \"1.0\"}\n fn (fn* fn [&form &env & decl] \n         (.withMeta ^clojure.lang.IObj (cons 'fn* decl) \n                    (.meta ^clojure.lang.IMeta &form))))",
                  :repo "clojure",
                  :tag "clojure-1.3.0",
                  :filename "src/clj/clojure/core.clj",
                  :lines [42 47]}),
 :full-name "cljs.core/fn",
 :clj-symbol "clojure.core/fn",
 :docstring "params => positional-params* , or positional-params* & next-param\npositional-param => binding-form\nnext-param => binding-form\nname => symbol\n\nDefines a function"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_fn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_fn.cljsdoc)
</pre>

