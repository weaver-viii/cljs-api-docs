## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/while

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/while</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/while)
</td>
</tr>
</table>

 <samp>
(__while__ test & body)<br>
</samp>

---

Repeatedly executes `body` while `test` expression is true. Presumes some
side-effect will cause `test` to become false or nil.

Returns nil.

---


See Also:

[`cljs.core/loop`](cljs.core_loop.md)<br>

---

Source docstring:

```
Repeatedly executes body while test expression is true. Presumes
some side-effect will cause test to become false/nil. Returns nil
```

Source code:

```clj
(defmacro while
  [test & body]
  `(loop []
     (when ~test
       ~@body
       (recur))))
```

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:5598-5606](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L5598-L5606)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/while"]))
```

```clj
{:description "Repeatedly executes `body` while `test` expression is true. Presumes some\nside-effect will cause `test` to become false or nil.\n\nReturns nil.",
 :ns "cljs.core",
 :name "while",
 :signature ["[test & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/loop"],
 :full-name-encode "cljs.core_while",
 :source {:code "(defmacro while\n  [test & body]\n  `(loop []\n     (when ~test\n       ~@body\n       (recur))))",
          :repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/clj/clojure/core.clj",
          :lines [5598 5606]},
 :full-name "cljs.core/while",
 :clj-symbol "clojure.core/while",
 :docstring "Repeatedly executes body while test expression is true. Presumes\nsome side-effect will cause test to become false/nil. Returns nil"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_while.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_while.cljsdoc)
</pre>

