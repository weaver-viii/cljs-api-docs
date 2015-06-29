## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/block

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__block__ fns)<br>
</samp>

---




Source docstring:

```
Tag a seq of fns to be picked up by run-block as injected
continuation.  See run-block.
```

Source code:

```clj
(defn block
  [fns]
  (some-> fns
          (vary-meta assoc ::block? true)))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:426-431](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/test.cljs#L426-L431)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/block"]))
```

```clj
{:ns "cljs.test",
 :name "block",
 :signature ["[fns]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.test_block",
 :source {:code "(defn block\n  [fns]\n  (some-> fns\n          (vary-meta assoc ::block? true)))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/test.cljs",
          :lines [426 431]},
 :full-name "cljs.test/block",
 :docstring "Tag a seq of fns to be picked up by run-block as injected\ncontinuation.  See run-block."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_block.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_block.cljsdoc)
</pre>

