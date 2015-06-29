## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/delay

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/delay</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/delay)
</td>
</tr>
</table>

 <samp>
(__delay__ & body)<br>
</samp>

---





Source code:

```clj
(defmacro delay [& body]
  "Takes a body of expressions and yields a Delay object that will
  invoke the body only the first time it is forced (with force or deref/@), and
  will cache the result and return it on all subsequent force
  calls."
  `(new cljs.core/Delay (fn [] ~@body) nil))
```

 <pre>
clojurescript @ r2814
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1097-1102](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/core.clj#L1097-L1102)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/delay"]))
```

```clj
{:ns "cljs.core",
 :name "delay",
 :signature ["[& body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_delay",
 :source {:code "(defmacro delay [& body]\n  \"Takes a body of expressions and yields a Delay object that will\n  invoke the body only the first time it is forced (with force or deref/@), and\n  will cache the result and return it on all subsequent force\n  calls.\"\n  `(new cljs.core/Delay (fn [] ~@body) nil))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/clj/cljs/core.clj",
          :lines [1097 1102]},
 :full-name "cljs.core/delay",
 :clj-symbol "clojure.core/delay"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_delay.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_delay.cljsdoc)
</pre>

