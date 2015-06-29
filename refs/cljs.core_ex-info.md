## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ex-info

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ex-info</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ex-info)
</td>
</tr>
</table>

 <samp>
(__ex-info__ msg data)<br>
</samp>
 <samp>
(__ex-info__ msg data cause)<br>
</samp>

---




Source docstring:

```
Alpha - subject to change.
Create an instance of ExceptionInfo, an Error type that carries a
map of additional data.
```

Source code:

```clj
(defn ex-info
  ([msg data] (ex-info msg data nil))
  ([msg data cause]
    ;; this way each new ExceptionInfo instance will inherit
    ;; stack property from newly created Error
    (set! (.-prototype ExceptionInfo) (js/Error msg))
    (set! (.. ExceptionInfo -prototype -name) "ExceptionInfo")
    (set! (.. ExceptionInfo -prototype -constructor) ExceptionInfo)

    ;; since we've changed the prototype, we need to
    ;; re-establish protocol implementations here
    (set! (.. ExceptionInfo -prototype -toString) pr-str*)
    (extend-type ExceptionInfo
      IPrintWithWriter
      (-pr-writer [obj writer opts]
        (pr-writer-ex-info obj writer opts)))
    (ExceptionInfo. msg data cause)))
```

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9187-9206](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L9187-L9206)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ex-info"]))
```

```clj
{:ns "cljs.core",
 :name "ex-info",
 :signature ["[msg data]" "[msg data cause]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core_ex-info",
 :source {:code "(defn ex-info\n  ([msg data] (ex-info msg data nil))\n  ([msg data cause]\n    ;; this way each new ExceptionInfo instance will inherit\n    ;; stack property from newly created Error\n    (set! (.-prototype ExceptionInfo) (js/Error msg))\n    (set! (.. ExceptionInfo -prototype -name) \"ExceptionInfo\")\n    (set! (.. ExceptionInfo -prototype -constructor) ExceptionInfo)\n\n    ;; since we've changed the prototype, we need to\n    ;; re-establish protocol implementations here\n    (set! (.. ExceptionInfo -prototype -toString) pr-str*)\n    (extend-type ExceptionInfo\n      IPrintWithWriter\n      (-pr-writer [obj writer opts]\n        (pr-writer-ex-info obj writer opts)))\n    (ExceptionInfo. msg data cause)))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9187 9206]},
 :full-name "cljs.core/ex-info",
 :clj-symbol "clojure.core/ex-info",
 :docstring "Alpha - subject to change.\nCreate an instance of ExceptionInfo, an Error type that carries a\nmap of additional data."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ex-info.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ex-info.cljsdoc)
</pre>

