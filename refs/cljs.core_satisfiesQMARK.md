## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/satisfies?

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/satisfies?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/satisfies?)
</td>
</tr>
</table>

 <samp>
(__satisfies?__ psym x)<br>
</samp>

---




Source docstring:

```
Returns true if x satisfies the protocol
```

Source code:

```clj
(defmacro satisfies?
  [psym x]
  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))
        prefix (protocol-prefix p)]
    `(let [x# ~x]
       (if (and x#
                (. x# ~(symbol (str "-" prefix)))        ;; Need prop lookup here
                (not (. x# (~'hasOwnProperty ~prefix))))
	 true
	 (cljs.core/type_satisfies_ ~psym x#)))))
```

 <pre>
clojurescript @ r1011
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:422-432](https://github.com/clojure/clojurescript/blob/r1011/src/clj/cljs/core.clj#L422-L432)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/satisfies?"]))
```

```clj
{:ns "cljs.core",
 :name "satisfies?",
 :signature ["[psym x]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_satisfiesQMARK",
 :source {:code "(defmacro satisfies?\n  [psym x]\n  (let [p (:name (cljs.compiler/resolve-var (dissoc &env :locals) psym))\n        prefix (protocol-prefix p)]\n    `(let [x# ~x]\n       (if (and x#\n                (. x# ~(symbol (str \"-\" prefix)))        ;; Need prop lookup here\n                (not (. x# (~'hasOwnProperty ~prefix))))\n\t true\n\t (cljs.core/type_satisfies_ ~psym x#)))))",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/clj/cljs/core.clj",
          :lines [422 432]},
 :full-name "cljs.core/satisfies?",
 :clj-symbol "clojure.core/satisfies?",
 :docstring "Returns true if x satisfies the protocol"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_satisfiesQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_satisfiesQMARK.cljsdoc)
</pre>

