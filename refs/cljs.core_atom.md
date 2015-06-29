## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/atom

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/atom</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/atom)
</td>
</tr>
</table>

 <samp>
(__atom__ x)<br>
</samp>
 <samp>
(__atom__ x opts)<br>
</samp>

---

Creates and returns an atom with an initial value of `x`.

`opts` is an optional map with optional keys `:meta` and `:validator`.

`:meta` should be a [metadata-map](http://clojure.org/metadata) for the atom.

`:validator` should be a validator function for the atom. See `set-validator!`
for more information.

---

Example:

```clj
(def a (atom 1))

@a
;;=> 1

(reset! a 2)
@a
;;=> 2

(swap! a inc)
@a
;;=> 3
```

---

See Also:

[`cljs.core/atom`](cljs.core_atom.md)<br>
[`cljs.core/swap!`](cljs.core_swapBANG.md)<br>
[`cljs.core/reset!`](cljs.core_resetBANG.md)<br>
[`cljs.core/set-validator!`](cljs.core_set-validatorBANG.md)<br>
[`cljs.core/get-validator`](cljs.core_get-validator.md)<br>

---

Source docstring:

```
Creates and returns an Atom with an initial value of x and zero or
more options (in any order):

:meta metadata-map

:validator validate-fn

If metadata-map is supplied, it will be come the metadata on the
atom. validate-fn must be nil or a side-effect-free fn of one
argument, which will be passed the intended new state on any state
change. If the new state is unacceptable, the validate-fn should
return false or throw an Error.  If either of these error conditions
occur, then the value of the atom will not change.
```

Source code:

```clj
(defn atom
  ([x] (Atom. x nil nil nil))
  ([x & {:keys [meta validator]}] (Atom. x meta validator nil)))
```

 <pre>
clojurescript @ r2727
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3516-3531](https://github.com/clojure/clojurescript/blob/r2727/src/cljs/cljs/core.cljs#L3516-L3531)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/atom"]))
```

```clj
{:description "Creates and returns an atom with an initial value of `x`.\n\n`opts` is an optional map with optional keys `:meta` and `:validator`.\n\n`:meta` should be a [metadata-map](http://clojure.org/metadata) for the atom.\n\n`:validator` should be a validator function for the atom. See `set-validator!`\nfor more information.",
 :ns "cljs.core",
 :name "atom",
 :signature ["[x]" "[x opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/atom"
           "cljs.core/swap!"
           "cljs.core/reset!"
           "cljs.core/set-validator!"
           "cljs.core/get-validator"],
 :full-name-encode "cljs.core_atom",
 :source {:code "(defn atom\n  ([x] (Atom. x nil nil nil))\n  ([x & {:keys [meta validator]}] (Atom. x meta validator nil)))",
          :repo "clojurescript",
          :tag "r2727",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3516 3531]},
 :examples [{:id "e6a38a",
             :content "```clj\n(def a (atom 1))\n\n@a\n;;=> 1\n\n(reset! a 2)\n@a\n;;=> 2\n\n(swap! a inc)\n@a\n;;=> 3\n```"}],
 :full-name "cljs.core/atom",
 :clj-symbol "clojure.core/atom",
 :docstring "Creates and returns an Atom with an initial value of x and zero or\nmore options (in any order):\n\n:meta metadata-map\n\n:validator validate-fn\n\nIf metadata-map is supplied, it will be come the metadata on the\natom. validate-fn must be nil or a side-effect-free fn of one\nargument, which will be passed the intended new state on any state\nchange. If the new state is unacceptable, the validate-fn should\nreturn false or throw an Error.  If either of these error conditions\noccur, then the value of the atom will not change."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_atom.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_atom.cljsdoc)
</pre>

