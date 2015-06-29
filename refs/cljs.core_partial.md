## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/partial

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/partial</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/partial)
</td>
</tr>
</table>

 <samp>
(__partial__ f)<br>
</samp>
 <samp>
(__partial__ f arg1)<br>
</samp>
 <samp>
(__partial__ f arg1 arg2)<br>
</samp>
 <samp>
(__partial__ f arg1 arg2 arg3)<br>
</samp>
 <samp>
(__partial__ f arg1 arg2 arg3 & more)<br>
</samp>

---

Takes a function `f` and fewer than the normal arguments to `f`. Returns a
function that takes a variable number of additional arguments. When called, the
returned function calls `f` with the original arguments plus the additional
arguments.

`((partial f a b) c d)` => `(f a b c d)`

---


See Also:

[`cljs.core/comp`](cljs.core_comp.md)<br>
[`cljs.core/juxt`](cljs.core_juxt.md)<br>

---

Source docstring:

```
Takes a function f and fewer than the normal arguments to f, and
returns a fn that takes a variable number of additional args. When
called, the returned function calls f with args + additional args.
```

Source code:

```clj
(defn partial
  ([f arg1]
   (fn [& args] (apply f arg1 args)))
  ([f arg1 arg2]
   (fn [& args] (apply f arg1 arg2 args)))
  ([f arg1 arg2 arg3]
   (fn [& args] (apply f arg1 arg2 arg3 args)))
  ([f arg1 arg2 arg3 & more]
   (fn [& args] (apply f arg1 arg2 arg3 (concat more args)))))
```

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2556-2567](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L2556-L2567)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/partial"]))
```

```clj
{:description "Takes a function `f` and fewer than the normal arguments to `f`. Returns a\nfunction that takes a variable number of additional arguments. When called, the\nreturned function calls `f` with the original arguments plus the additional\narguments.\n\n`((partial f a b) c d)` => `(f a b c d)`",
 :ns "cljs.core",
 :name "partial",
 :signature ["[f]"
             "[f arg1]"
             "[f arg1 arg2]"
             "[f arg1 arg2 arg3]"
             "[f arg1 arg2 arg3 & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/comp" "cljs.core/juxt"],
 :full-name-encode "cljs.core_partial",
 :source {:code "(defn partial\n  ([f arg1]\n   (fn [& args] (apply f arg1 args)))\n  ([f arg1 arg2]\n   (fn [& args] (apply f arg1 arg2 args)))\n  ([f arg1 arg2 arg3]\n   (fn [& args] (apply f arg1 arg2 arg3 args)))\n  ([f arg1 arg2 arg3 & more]\n   (fn [& args] (apply f arg1 arg2 arg3 (concat more args)))))",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2556 2567]},
 :full-name "cljs.core/partial",
 :clj-symbol "clojure.core/partial",
 :docstring "Takes a function f and fewer than the normal arguments to f, and\nreturns a fn that takes a variable number of additional args. When\ncalled, the returned function calls f with args + additional args."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_partial.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_partial.cljsdoc)
</pre>

