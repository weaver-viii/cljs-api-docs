## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/IAsyncTest

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Marker protocol denoting CPS function to begin asynchronous
  testing.
```

Source code:

```clj
(defprotocol IAsyncTest
  "Marker protocol denoting CPS function to begin asynchronous
  testing.")
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:398-400](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/test.cljs#L398-L400)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/IAsyncTest"]))
```

```clj
{:ns "cljs.test",
 :name "IAsyncTest",
 :type "protocol",
 :full-name-encode "cljs.test_IAsyncTest",
 :source {:code "(defprotocol IAsyncTest\n  \"Marker protocol denoting CPS function to begin asynchronous\n  testing.\")",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [398 400]},
 :full-name "cljs.test/IAsyncTest",
 :docstring "Marker protocol denoting CPS function to begin asynchronous\n  testing.",
 :history [["+" "0.0-2814"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_IAsyncTest.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_IAsyncTest.cljsdoc)
</pre>

