## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/async

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__async__ done & body)<br>
</samp>

---




Source docstring:

```
Wraps body as a CPS function that can be returned from a test to
continue asynchronously.  Binds done to a function that must be
invoked once and from an async context after any assertions.

(deftest example-with-timeout
  (async done
    (js/setTimeout (fn []
                     ;; make assertions in async context...
                     (done) ;; ...then call done
                     )
                   0)))
```

Source code:

```clj
(defmacro async
  [done & body]
  `(reify
     cljs.test/IAsyncTest
     cljs.core/IFn
     (~'-invoke [_# ~done]
       ~@body)))
```

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:222-239](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/test.clj#L222-L239)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/async"]))
```

```clj
{:ns "cljs.test",
 :name "async",
 :signature ["[done & body]"],
 :history [["+" "0.0-2814"]],
 :type "macro",
 :full-name-encode "cljs.test_async",
 :source {:code "(defmacro async\n  [done & body]\n  `(reify\n     cljs.test/IAsyncTest\n     cljs.core/IFn\n     (~'-invoke [_# ~done]\n       ~@body)))",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/clj/cljs/test.clj",
          :lines [222 239]},
 :full-name "cljs.test/async",
 :docstring "Wraps body as a CPS function that can be returned from a test to\ncontinue asynchronously.  Binds done to a function that must be\ninvoked once and from an async context after any assertions.\n\n(deftest example-with-timeout\n  (async done\n    (js/setTimeout (fn []\n                     ;; make assertions in async context...\n                     (done) ;; ...then call done\n                     )\n                   0)))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_async.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_async.cljsdoc)
</pre>

