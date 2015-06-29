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
  ([f] f)
  ([f arg1]
   (fn
     ([] (f arg1))
     ([x] (f arg1 x))
     ([x y] (f arg1 x y))
     ([x y z] (f arg1 x y z))
     ([x y z & args] (apply f arg1 x y z args))))
  ([f arg1 arg2]
   (fn
     ([] (f arg1 arg2))
     ([x] (f arg1 arg2 x))
     ([x y] (f arg1 arg2 x y))
     ([x y z] (f arg1 arg2 x y z))
     ([x y z & args] (apply f arg1 arg2 x y z args))))
  ([f arg1 arg2 arg3]
   (fn
     ([] (f arg1 arg2 arg3))
     ([x] (f arg1 arg2 arg3 x))
     ([x y] (f arg1 arg2 arg3 x y))
     ([x y z] (f arg1 arg2 arg3 x y z))
     ([x y z & args] (apply f arg1 arg2 arg3 x y z args))))
  ([f arg1 arg2 arg3 & more]
   (fn [& args] (apply f arg1 arg2 arg3 (concat more args)))))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3671-3698](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L3671-L3698)</ins>
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
 :source {:code "(defn partial\n  ([f] f)\n  ([f arg1]\n   (fn\n     ([] (f arg1))\n     ([x] (f arg1 x))\n     ([x y] (f arg1 x y))\n     ([x y z] (f arg1 x y z))\n     ([x y z & args] (apply f arg1 x y z args))))\n  ([f arg1 arg2]\n   (fn\n     ([] (f arg1 arg2))\n     ([x] (f arg1 arg2 x))\n     ([x y] (f arg1 arg2 x y))\n     ([x y z] (f arg1 arg2 x y z))\n     ([x y z & args] (apply f arg1 arg2 x y z args))))\n  ([f arg1 arg2 arg3]\n   (fn\n     ([] (f arg1 arg2 arg3))\n     ([x] (f arg1 arg2 arg3 x))\n     ([x y] (f arg1 arg2 arg3 x y))\n     ([x y z] (f arg1 arg2 arg3 x y z))\n     ([x y z & args] (apply f arg1 arg2 arg3 x y z args))))\n  ([f arg1 arg2 arg3 & more]\n   (fn [& args] (apply f arg1 arg2 arg3 (concat more args)))))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3671 3698]},
 :full-name "cljs.core/partial",
 :clj-symbol "clojure.core/partial",
 :docstring "Takes a function f and fewer than the normal arguments to f, and\nreturns a fn that takes a variable number of additional args. When\ncalled, the returned function calls f with args + additional args."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_partial.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_partial.cljsdoc)
</pre>

