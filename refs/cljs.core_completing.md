## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/completing

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2341"><img valign="middle" alt="[+] 0.0-2341" src="https://img.shields.io/badge/+-0.0--2341-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__completing__ f)<br>
</samp>
 <samp>
(__completing__ f cf)<br>
</samp>

---




Source docstring:

```
Takes a reducing function f of 2 args and returns a fn suitable for
transduce by adding an arity-1 signature that calls cf (default -
identity) on the result argument.
```

Source code:

```clj
(defn completing
  ([f] (completing f identity))
  ([f cf]
    (fn
      ([] (f))
      ([x] (cf x))
      ([x y] (f x y)))))
```

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2071-2080](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/cljs/core.cljs#L2071-L2080)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/completing"]))
```

```clj
{:ns "cljs.core",
 :name "completing",
 :signature ["[f]" "[f cf]"],
 :history [["+" "0.0-2341"]],
 :type "function",
 :full-name-encode "cljs.core_completing",
 :source {:code "(defn completing\n  ([f] (completing f identity))\n  ([f cf]\n    (fn\n      ([] (f))\n      ([x] (cf x))\n      ([x y] (f x y)))))",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2071 2080]},
 :full-name "cljs.core/completing",
 :docstring "Takes a reducing function f of 2 args and returns a fn suitable for\ntransduce by adding an arity-1 signature that calls cf (default -\nidentity) on the result argument."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_completing.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_completing.cljsdoc)
</pre>

