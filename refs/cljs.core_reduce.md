## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduce

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reduce</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reduce)
</td>
</tr>
</table>

 <samp>
(__reduce__ f coll)<br>
</samp>
 <samp>
(__reduce__ f val coll)<br>
</samp>

---

`f` should be a function of 2 arguments. If `val` is not supplied, returns the
result of applying `f` to the first 2 items in `coll`, then applying `f` to that
result and the 3rd item, etc.

If `coll` contains no items, `f` must accept no arguments as well, and `reduce`
returns the result of calling `f` with no arguments.

If `coll` has only 1 item, it is returned and `f` is not called.

If `val` is supplied, returns the result of applying `f` to `val` and the first
item in `coll`, then applying `f` to that result and the 2nd item, etc.

If `coll` contains no items, returns `val` and `f` is not called.

---


See Also:

[`cljs.core/reductions`](cljs.core_reductions.md)<br>
[`cljs.core/apply`](cljs.core_apply.md)<br>
[`cljs.core/frequencies`](cljs.core_frequencies.md)<br>

---

Source docstring:

```
f should be a function of 2 arguments. If val is not supplied,
returns the result of applying f to the first 2 items in coll, then
applying f to that result and the 3rd item, etc. If coll contains no
items, f must accept no arguments as well, and reduce returns the
result of calling f with no arguments.  If coll has only 1 item, it
is returned and f is not called.  If val is supplied, returns the
result of applying f to val and the first item in coll, then
applying f to that result and the 2nd item, etc. If coll contains no
items, returns val and f is not called.
```

Source code:

```clj
(defn reduce
  ([f coll]
     (cond
       (implements? IReduce coll)
       (-reduce ^not-native coll f)

       (array? coll)
       (array-reduce coll f)

       (string? coll)
       (array-reduce coll f)
       
       (native-satisfies? IReduce coll)
       (-reduce coll f)

       :else
       (seq-reduce f coll)))
  ([f val coll]
     (cond
       (implements? IReduce coll)
       (-reduce ^not-native coll f val)

       (array? coll)
       (array-reduce coll f val)
      
       (string? coll)
       (array-reduce coll f val)
       
       (native-satisfies? IReduce coll)
       (-reduce coll f val)

       :else
       (seq-reduce f val coll))))
```

 <pre>
clojurescript @ r3123
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2012-2053](https://github.com/clojure/clojurescript/blob/r3123/src/cljs/cljs/core.cljs#L2012-L2053)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reduce"]))
```

```clj
{:description "`f` should be a function of 2 arguments. If `val` is not supplied, returns the\nresult of applying `f` to the first 2 items in `coll`, then applying `f` to that\nresult and the 3rd item, etc.\n\nIf `coll` contains no items, `f` must accept no arguments as well, and `reduce`\nreturns the result of calling `f` with no arguments.\n\nIf `coll` has only 1 item, it is returned and `f` is not called.\n\nIf `val` is supplied, returns the result of applying `f` to `val` and the first\nitem in `coll`, then applying `f` to that result and the 2nd item, etc.\n\nIf `coll` contains no items, returns `val` and `f` is not called.",
 :ns "cljs.core",
 :name "reduce",
 :signature ["[f coll]" "[f val coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/reductions"
           "cljs.core/apply"
           "cljs.core/frequencies"],
 :full-name-encode "cljs.core_reduce",
 :source {:code "(defn reduce\n  ([f coll]\n     (cond\n       (implements? IReduce coll)\n       (-reduce ^not-native coll f)\n\n       (array? coll)\n       (array-reduce coll f)\n\n       (string? coll)\n       (array-reduce coll f)\n       \n       (native-satisfies? IReduce coll)\n       (-reduce coll f)\n\n       :else\n       (seq-reduce f coll)))\n  ([f val coll]\n     (cond\n       (implements? IReduce coll)\n       (-reduce ^not-native coll f val)\n\n       (array? coll)\n       (array-reduce coll f val)\n      \n       (string? coll)\n       (array-reduce coll f val)\n       \n       (native-satisfies? IReduce coll)\n       (-reduce coll f val)\n\n       :else\n       (seq-reduce f val coll))))",
          :repo "clojurescript",
          :tag "r3123",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2012 2053]},
 :full-name "cljs.core/reduce",
 :clj-symbol "clojure.core/reduce",
 :docstring "f should be a function of 2 arguments. If val is not supplied,\nreturns the result of applying f to the first 2 items in coll, then\napplying f to that result and the 3rd item, etc. If coll contains no\nitems, f must accept no arguments as well, and reduce returns the\nresult of calling f with no arguments.  If coll has only 1 item, it\nis returned and f is not called.  If val is supplied, returns the\nresult of applying f to val and the first item in coll, then\napplying f to that result and the 2nd item, etc. If coll contains no\nitems, returns val and f is not called."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reduce.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reduce.cljsdoc)
</pre>

