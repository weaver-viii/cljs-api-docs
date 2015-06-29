## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/clone

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2134"><img valign="middle" alt="[+] 0.0-2134" src="https://img.shields.io/badge/+-0.0--2134-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__clone__ value)<br>
</samp>

---




Source docstring:

```
Clone the supplied value which must implement ICloneable.
```

Source code:

```clj
(defn clone
  [value]
  (-clone value))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:925-928](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L925-L928)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/clone"]))
```

```clj
{:ns "cljs.core",
 :name "clone",
 :signature ["[value]"],
 :history [["+" "0.0-2134"]],
 :type "function",
 :full-name-encode "cljs.core_clone",
 :source {:code "(defn clone\n  [value]\n  (-clone value))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [925 928]},
 :full-name "cljs.core/clone",
 :docstring "Clone the supplied value which must implement ICloneable."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_clone.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_clone.cljsdoc)
</pre>

