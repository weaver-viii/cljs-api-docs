## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/when-not

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when-not</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when-not)
</td>
</tr>
</table>

 <samp>
(__when-not__ test & body)<br>
</samp>

---

Evaluates `test`. If logical false, evaluates `body` in an implicit `do`.

---


See Also:

[`cljs.core/when`](cljs.core_when.md)<br>
[`cljs.core/when-let`](cljs.core_when-let.md)<br>
[`special/if`](special_if.md)<br>

---

Source docstring:

```
Evaluates test. If logical false, evaluates body in an implicit do.
```

Source code:

```clj
(defmacro when-not
  [test & body]
    (list 'if test nil (cons 'do body)))
```

 <pre>
clojure @ clojure-1.7.0-alpha6
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:481-485](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L481-L485)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/when-not"]))
```

```clj
{:description "Evaluates `test`. If logical false, evaluates `body` in an implicit `do`.",
 :ns "cljs.core",
 :name "when-not",
 :signature ["[test & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/when" "cljs.core/when-let" "special/if"],
 :full-name-encode "cljs.core_when-not",
 :source {:code "(defmacro when-not\n  [test & body]\n    (list 'if test nil (cons 'do body)))",
          :repo "clojure",
          :tag "clojure-1.7.0-alpha6",
          :filename "src/clj/clojure/core.clj",
          :lines [481 485]},
 :full-name "cljs.core/when-not",
 :clj-symbol "clojure.core/when-not",
 :docstring "Evaluates test. If logical false, evaluates body in an implicit do."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_when-not.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_when-not.cljsdoc)
</pre>

