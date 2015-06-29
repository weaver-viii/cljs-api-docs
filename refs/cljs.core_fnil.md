## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/fnil

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fnil</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fnil)
</td>
</tr>
</table>

 <samp>
(__fnil__ f x)<br>
</samp>
 <samp>
(__fnil__ f x y)<br>
</samp>
 <samp>
(__fnil__ f x y z)<br>
</samp>

---

Takes a function `f`, and returns a function that calls `f`, replacing a nil
first argument to `f` with the supplied value `x`. Higher arity versions can
replace arguments in the second and third positions (`y`, `z`).

Note that the function `f` can take any number of arguments, not just the one(s)
being nil-patched.

---



Source docstring:

```
Takes a function f, and returns a function that calls f, replacing
a nil first argument to f with the supplied value x. Higher arity
versions can replace arguments in the second and third
positions (y, z). Note that the function f can take any number of
arguments, not just the one(s) being nil-patched.
```

Source code:

```clj
(defn fnil
  ([f x]
   (fn
     ([a] (f (if (nil? a) x a)))
     ([a b] (f (if (nil? a) x a) b))
     ([a b c] (f (if (nil? a) x a) b c))
     ([a b c & ds] (apply f (if (nil? a) x a) b c ds))))
  ([f x y]
   (fn
     ([a b] (f (if (nil? a) x a) (if (nil? b) y b)))
     ([a b c] (f (if (nil? a) x a) (if (nil? b) y b) c))
     ([a b c & ds] (apply f (if (nil? a) x a) (if (nil? b) y b) c ds))))
  ([f x y z]
   (fn
     ([a b] (f (if (nil? a) x a) (if (nil? b) y b)))
     ([a b c] (f (if (nil? a) x a) (if (nil? b) y b) (if (nil? c) z c)))
     ([a b c & ds] (apply f (if (nil? a) x a) (if (nil? b) y b) (if (nil? c) z c) ds)))))
```

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3689-3710](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L3689-L3710)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/fnil"]))
```

```clj
{:description "Takes a function `f`, and returns a function that calls `f`, replacing a nil\nfirst argument to `f` with the supplied value `x`. Higher arity versions can\nreplace arguments in the second and third positions (`y`, `z`).\n\nNote that the function `f` can take any number of arguments, not just the one(s)\nbeing nil-patched.",
 :ns "cljs.core",
 :name "fnil",
 :signature ["[f x]" "[f x y]" "[f x y z]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_fnil",
 :source {:code "(defn fnil\n  ([f x]\n   (fn\n     ([a] (f (if (nil? a) x a)))\n     ([a b] (f (if (nil? a) x a) b))\n     ([a b c] (f (if (nil? a) x a) b c))\n     ([a b c & ds] (apply f (if (nil? a) x a) b c ds))))\n  ([f x y]\n   (fn\n     ([a b] (f (if (nil? a) x a) (if (nil? b) y b)))\n     ([a b c] (f (if (nil? a) x a) (if (nil? b) y b) c))\n     ([a b c & ds] (apply f (if (nil? a) x a) (if (nil? b) y b) c ds))))\n  ([f x y z]\n   (fn\n     ([a b] (f (if (nil? a) x a) (if (nil? b) y b)))\n     ([a b c] (f (if (nil? a) x a) (if (nil? b) y b) (if (nil? c) z c)))\n     ([a b c & ds] (apply f (if (nil? a) x a) (if (nil? b) y b) (if (nil? c) z c) ds)))))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3689 3710]},
 :full-name "cljs.core/fnil",
 :clj-symbol "clojure.core/fnil",
 :docstring "Takes a function f, and returns a function that calls f, replacing\na nil first argument to f with the supplied value x. Higher arity\nversions can replace arguments in the second and third\npositions (y, z). Note that the function f can take any number of\narguments, not just the one(s) being nil-patched."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_fnil.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_fnil.cljsdoc)
</pre>

