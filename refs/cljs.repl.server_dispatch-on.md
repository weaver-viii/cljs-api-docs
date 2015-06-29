## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/dispatch-on

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__dispatch-on__ method pred handler)<br>
</samp>
 <samp>
(__dispatch-on__ method {:as m})<br>
</samp>

---




Source docstring:

```
Registers a handler to be dispatched based on a request method and a
predicate.

pred should be a function that accepts an options map, a connection,
and a request map and returns a boolean value based on whether or not
that request should be dispatched to the related handler.
```

Source code:

```clj
(defn dispatch-on
  ([method pred handler]
     (dispatch-on method {:pred pred :handler handler}))
  ([method {:as m}]
     (swap! handlers (fn [old]
                       (update-in old [method] #(conj (vec %) m))))))
```

 <pre>
clojurescript @ r2342
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:46-57](https://github.com/clojure/clojurescript/blob/r2342/src/clj/cljs/repl/server.clj#L46-L57)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/dispatch-on"]))
```

```clj
{:ns "cljs.repl.server",
 :name "dispatch-on",
 :signature ["[method pred handler]" "[method {:as m}]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.server_dispatch-on",
 :source {:code "(defn dispatch-on\n  ([method pred handler]\n     (dispatch-on method {:pred pred :handler handler}))\n  ([method {:as m}]\n     (swap! handlers (fn [old]\n                       (update-in old [method] #(conj (vec %) m))))))",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [46 57]},
 :full-name "cljs.repl.server/dispatch-on",
 :docstring "Registers a handler to be dispatched based on a request method and a\npredicate.\n\npred should be a function that accepts an options map, a connection,\nand a request map and returns a boolean value based on whether or not\nthat request should be dispatched to the related handler."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_dispatch-on.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_dispatch-on.cljsdoc)
</pre>

