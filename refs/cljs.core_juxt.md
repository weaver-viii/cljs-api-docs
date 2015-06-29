## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/juxt

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/juxt</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/juxt)
</td>
</tr>
</table>

 <samp>
(__juxt__ f)<br>
</samp>
 <samp>
(__juxt__ f g)<br>
</samp>
 <samp>
(__juxt__ f g h)<br>
</samp>
 <samp>
(__juxt__ f g h & fs)<br>
</samp>

---

Takes a set of functions and returns a function that is the juxtaposition of
those functions.

The returned function takes a variable number of arguments, and returns a vector
containing the result of applying each function to the arguments (left-to-
right).

`((juxt a b c) x)` => `[(a x) (b x) (c x)]`

---


See Also:

[`cljs.core/partial`](cljs.core_partial.md)<br>
[`cljs.core/comp`](cljs.core_comp.md)<br>

---

Source docstring:

```
Takes a set of functions and returns a fn that is the juxtaposition
of those fns.  The returned fn takes a variable number of args, and
returns a vector containing the result of applying each fn to the
args (left-to-right).
((juxt a b c) x) => [(a x) (b x) (c x)]
```

Source code:

```clj
(defn juxt
  ([f]
     (fn
       ([] (vector (f)))
       ([x] (vector (f x)))
       ([x y] (vector (f x y)))
       ([x y z] (vector (f x y z)))
       ([x y z & args] (vector (apply f x y z args)))))
  ([f g]
     (fn
       ([] (vector (f) (g)))
       ([x] (vector (f x) (g x)))
       ([x y] (vector (f x y) (g x y)))
       ([x y z] (vector (f x y z) (g x y z)))
       ([x y z & args] (vector (apply f x y z args) (apply g x y z args)))))
  ([f g h]
     (fn
       ([] (vector (f) (g) (h)))
       ([x] (vector (f x) (g x) (h x)))
       ([x y] (vector (f x y) (g x y) (h x y)))
       ([x y z] (vector (f x y z) (g x y z) (h x y z)))
       ([x y z & args] (vector (apply f x y z args) (apply g x y z args) (apply h x y z args)))))
  ([f g h & fs]
     (let [fs (list* f g h fs)]
       (fn
         ([] (reduce #(conj %1 (%2)) [] fs))
         ([x] (reduce #(conj %1 (%2 x)) [] fs))
         ([x y] (reduce #(conj %1 (%2 x y)) [] fs))
         ([x y z] (reduce #(conj %1 (%2 x y z)) [] fs))
         ([x y z & args] (reduce #(conj %1 (apply %2 x y z args)) [] fs))))))
```

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7993-8027](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L7993-L8027)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/juxt"]))
```

```clj
{:description "Takes a set of functions and returns a function that is the juxtaposition of\nthose functions.\n\nThe returned function takes a variable number of arguments, and returns a vector\ncontaining the result of applying each function to the arguments (left-to-\nright).\n\n`((juxt a b c) x)` => `[(a x) (b x) (c x)]`",
 :ns "cljs.core",
 :name "juxt",
 :signature ["[f]" "[f g]" "[f g h]" "[f g h & fs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partial" "cljs.core/comp"],
 :full-name-encode "cljs.core_juxt",
 :source {:code "(defn juxt\n  ([f]\n     (fn\n       ([] (vector (f)))\n       ([x] (vector (f x)))\n       ([x y] (vector (f x y)))\n       ([x y z] (vector (f x y z)))\n       ([x y z & args] (vector (apply f x y z args)))))\n  ([f g]\n     (fn\n       ([] (vector (f) (g)))\n       ([x] (vector (f x) (g x)))\n       ([x y] (vector (f x y) (g x y)))\n       ([x y z] (vector (f x y z) (g x y z)))\n       ([x y z & args] (vector (apply f x y z args) (apply g x y z args)))))\n  ([f g h]\n     (fn\n       ([] (vector (f) (g) (h)))\n       ([x] (vector (f x) (g x) (h x)))\n       ([x y] (vector (f x y) (g x y) (h x y)))\n       ([x y z] (vector (f x y z) (g x y z) (h x y z)))\n       ([x y z & args] (vector (apply f x y z args) (apply g x y z args) (apply h x y z args)))))\n  ([f g h & fs]\n     (let [fs (list* f g h fs)]\n       (fn\n         ([] (reduce #(conj %1 (%2)) [] fs))\n         ([x] (reduce #(conj %1 (%2 x)) [] fs))\n         ([x y] (reduce #(conj %1 (%2 x y)) [] fs))\n         ([x y z] (reduce #(conj %1 (%2 x y z)) [] fs))\n         ([x y z & args] (reduce #(conj %1 (apply %2 x y z args)) [] fs))))))",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7993 8027]},
 :full-name "cljs.core/juxt",
 :clj-symbol "clojure.core/juxt",
 :docstring "Takes a set of functions and returns a fn that is the juxtaposition\nof those fns.  The returned fn takes a variable number of args, and\nreturns a vector containing the result of applying each fn to the\nargs (left-to-right).\n((juxt a b c) x) => [(a x) (b x) (c x)]"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_juxt.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_juxt.cljsdoc)
</pre>

