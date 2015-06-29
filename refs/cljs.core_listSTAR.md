## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/list\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/list\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/list*)
</td>
</tr>
</table>

 <samp>
(__list\*__ args)<br>
</samp>
 <samp>
(__list\*__ a args)<br>
</samp>
 <samp>
(__list\*__ a b args)<br>
</samp>
 <samp>
(__list\*__ a b c args)<br>
</samp>
 <samp>
(__list\*__ a b c d & more)<br>
</samp>

---

Creates a new list containing the items prepended to the rest, the last of which
will be treated as a sequence.

---


See Also:

[`cljs.core/list`](cljs.core_list.md)<br>

---

Source docstring:

```
Creates a new list containing the items prepended to the rest, the
last of which will be treated as a sequence.
```

Source code:

```clj
(defn list*
  ([args] (seq args))
  ([a args] (cons a args))
  ([a b args] (cons a (cons b args)))
  ([a b c args] (cons a (cons b (cons c args))))
  ([a b c d & more]
     (cons a (cons b (cons c (cons d (spread more)))))))
```

 <pre>
clojurescript @ r2080
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2453-2461](https://github.com/clojure/clojurescript/blob/r2080/src/cljs/cljs/core.cljs#L2453-L2461)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/list*"]))
```

```clj
{:description "Creates a new list containing the items prepended to the rest, the last of which\nwill be treated as a sequence.",
 :ns "cljs.core",
 :name "list*",
 :signature ["[args]"
             "[a args]"
             "[a b args]"
             "[a b c args]"
             "[a b c d & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/list"],
 :full-name-encode "cljs.core_listSTAR",
 :source {:code "(defn list*\n  ([args] (seq args))\n  ([a args] (cons a args))\n  ([a b args] (cons a (cons b args)))\n  ([a b c args] (cons a (cons b (cons c args))))\n  ([a b c d & more]\n     (cons a (cons b (cons c (cons d (spread more)))))))",
          :repo "clojurescript",
          :tag "r2080",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2453 2461]},
 :full-name "cljs.core/list*",
 :clj-symbol "clojure.core/list*",
 :docstring "Creates a new list containing the items prepended to the rest, the\nlast of which will be treated as a sequence."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_listSTAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_listSTAR.cljsdoc)
</pre>

