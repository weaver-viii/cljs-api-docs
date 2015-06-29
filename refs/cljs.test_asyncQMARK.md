## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/async?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__async?__ x)<br>
</samp>

---




Source docstring:

```
Returns whether x implements IAsyncTest.
```

Source code:

```clj
(defn async?
  [x]
  (satisfies? IAsyncTest x))
```

 <pre>
clojurescript @ r3117
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:402-405](https://github.com/clojure/clojurescript/blob/r3117/src/cljs/cljs/test.cljs#L402-L405)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/async?"]))
```

```clj
{:ns "cljs.test",
 :name "async?",
 :signature ["[x]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test_asyncQMARK",
 :source {:code "(defn async?\n  [x]\n  (satisfies? IAsyncTest x))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/cljs/cljs/test.cljs",
          :lines [402 405]},
 :full-name "cljs.test/async?",
 :docstring "Returns whether x implements IAsyncTest."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_asyncQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_asyncQMARK.cljsdoc)
</pre>

