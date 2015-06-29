## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/comp

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/comp</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/comp)
</td>
</tr>
</table>

 <samp>
(__comp__ & fns)<br>
</samp>

---

Takes a set of functions and returns a function that is the composition
of those functions.

The returned function takes a variable number of arguments, applies the
rightmost of `fns` to the arguments, whose result is subsequently applied to
the next left function, and so on.

`((comp a b c) x y)` = `(a (b (c x y)))`

---

Example:

```clj
(def f (comp str inc +))
(f 1 2 3)
;;=> "7"
```

---

See Also:

[`cljs.core/partial`](cljs.core_partial.md)<br>
[`cljs.core/juxt`](cljs.core_juxt.md)<br>

---

Source docstring:

```
Takes a set of functions and returns a fn that is the composition
of those fns.  The returned fn takes a variable number of args,
applies the rightmost of fns to the args, the next
fn (right-to-left) to the result, etc.
```

Source code:

```clj
(defn comp
  ([] identity)
  ([f] f)
  ([f g]
     (fn
       ([] (f (g)))
       ([x] (f (g x)))
       ([x y] (f (g x y)))
       ([x y z] (f (g x y z)))
       ([x y z & args] (f (apply g x y z args)))))
  ([f g h]
     (fn
       ([] (f (g (h))))
       ([x] (f (g (h x))))
       ([x y] (f (g (h x y))))
       ([x y z] (f (g (h x y z))))
       ([x y z & args] (f (g (apply h x y z args))))))
  ([f1 f2 f3 & fs]
    (let [fs (reverse (list* f1 f2 f3 fs))]
      (fn [& args]
        (loop [ret (apply (first fs) args) fs (next fs)]
          (if fs
            (recur ((first fs) ret) (next fs))
            ret))))))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3632-3659](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L3632-L3659)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/comp"]))
```

```clj
{:description "Takes a set of functions and returns a function that is the composition\nof those functions.\n\nThe returned function takes a variable number of arguments, applies the\nrightmost of `fns` to the arguments, whose result is subsequently applied to\nthe next left function, and so on.\n\n`((comp a b c) x y)` = `(a (b (c x y)))`",
 :ns "cljs.core",
 :name "comp",
 :signature ["[& fns]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partial" "cljs.core/juxt"],
 :full-name-encode "cljs.core_comp",
 :source {:code "(defn comp\n  ([] identity)\n  ([f] f)\n  ([f g]\n     (fn\n       ([] (f (g)))\n       ([x] (f (g x)))\n       ([x y] (f (g x y)))\n       ([x y z] (f (g x y z)))\n       ([x y z & args] (f (apply g x y z args)))))\n  ([f g h]\n     (fn\n       ([] (f (g (h))))\n       ([x] (f (g (h x))))\n       ([x y] (f (g (h x y))))\n       ([x y z] (f (g (h x y z))))\n       ([x y z & args] (f (g (apply h x y z args))))))\n  ([f1 f2 f3 & fs]\n    (let [fs (reverse (list* f1 f2 f3 fs))]\n      (fn [& args]\n        (loop [ret (apply (first fs) args) fs (next fs)]\n          (if fs\n            (recur ((first fs) ret) (next fs))\n            ret))))))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3632 3659]},
 :examples [{:id "5d3250",
             :content "```clj\n(def f (comp str inc +))\n(f 1 2 3)\n;;=> \"7\"\n```"}],
 :full-name "cljs.core/comp",
 :clj-symbol "clojure.core/comp",
 :docstring "Takes a set of functions and returns a fn that is the composition\nof those fns.  The returned fn takes a variable number of args,\napplies the rightmost of fns to the args, the next\nfn (right-to-left) to the result, etc."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_comp.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_comp.cljsdoc)
</pre>

