## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/if-not

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if-not)
</td>
</tr>
</table>

 <samp>
(__if-not__ test then)<br>
</samp>
 <samp>
(__if-not__ test then else)<br>
</samp>

---

If `test` is false or nil, evaluates and returns `then`. Otherwise, evaluates
and returns `else`. `else` defaults to nil if not provided.

---


See Also:

[`special/if`](special_if.md)<br>
[`cljs.core/when-not`](cljs.core_when-not.md)<br>

---

Source docstring:

```
Evaluates test. If logical false, evaluates and returns then expr, 
otherwise else expr, if supplied, else nil.
```

Source code:

```clj
(defmacro if-not
  ([test then] `(if-not ~test ~then nil))
  ([test then else]
   `(if (not ~test) ~then ~else)))
```

 <pre>
clojure @ clojure-1.7.0-RC1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:730-736](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/clj/clojure/core.clj#L730-L736)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/if-not"]))
```

```clj
{:description "If `test` is false or nil, evaluates and returns `then`. Otherwise, evaluates\nand returns `else`. `else` defaults to nil if not provided.",
 :ns "cljs.core",
 :name "if-not",
 :signature ["[test then]" "[test then else]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["special/if" "cljs.core/when-not"],
 :full-name-encode "cljs.core_if-not",
 :source {:code "(defmacro if-not\n  ([test then] `(if-not ~test ~then nil))\n  ([test then else]\n   `(if (not ~test) ~then ~else)))",
          :repo "clojure",
          :tag "clojure-1.7.0-RC1",
          :filename "src/clj/clojure/core.clj",
          :lines [730 736]},
 :full-name "cljs.core/if-not",
 :clj-symbol "clojure.core/if-not",
 :docstring "Evaluates test. If logical false, evaluates and returns then expr, \notherwise else expr, if supplied, else nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_if-not.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_if-not.cljsdoc)
</pre>

