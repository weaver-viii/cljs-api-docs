## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/boolean

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/boolean</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/boolean)
</td>
</tr>
</table>

 <samp>
(__boolean__ x)<br>
</samp>

---

Return `false` if `x` is false or nil.  Otherwise return `true`.  This is the
truthiness condition used by `if` expressions.

---

Example:

```clj
(boolean 1)
;;=> true

(boolean 0)
;;=> true

(boolean nil)
;;=> false
```

---

See Also:

[`special/if`](special_if.md)<br>

---

Source docstring:

```
Coerce to boolean
```

Source code:

```clj
(defn ^boolean boolean
  [x]
  (if x true false))
```

 <pre>
clojurescript @ r3119
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1857-1860](https://github.com/clojure/clojurescript/blob/r3119/src/cljs/cljs/core.cljs#L1857-L1860)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/boolean"]))
```

```clj
{:description "Return `false` if `x` is false or nil.  Otherwise return `true`.  This is the\ntruthiness condition used by `if` expressions.",
 :return-type boolean,
 :ns "cljs.core",
 :name "boolean",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["special/if"],
 :full-name-encode "cljs.core_boolean",
 :source {:code "(defn ^boolean boolean\n  [x]\n  (if x true false))",
          :repo "clojurescript",
          :tag "r3119",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1857 1860]},
 :examples [{:id "9edf3a",
             :content "```clj\n(boolean 1)\n;;=> true\n\n(boolean 0)\n;;=> true\n\n(boolean nil)\n;;=> false\n```"}],
 :full-name "cljs.core/boolean",
 :clj-symbol "clojure.core/boolean",
 :docstring "Coerce to boolean"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_boolean.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_boolean.cljsdoc)
</pre>

