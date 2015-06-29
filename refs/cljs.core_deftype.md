## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/deftype

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/deftype</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/deftype)
</td>
</tr>
</table>

 <samp>
(__deftype__ t fields & impls)<br>
</samp>

---





Source code:

```clj
(defmacro deftype [t fields & impls]
  (let [env &env
        r (:name (cljs.analyzer/resolve-var (dissoc env :locals) t))
        [fpps pmasks] (prepare-protocol-masks env impls)
        protocols (collect-protocols impls env)
        t (vary-meta t assoc
            :protocols protocols
            :skip-protocol-flag fpps) ]
    `(do
       (deftype* ~t ~fields ~pmasks
         ~(if (seq impls)
            `(extend-type ~t ~@(dt->et t impls fields))))
       (set! (.-cljs$lang$type ~t) true)
       (set! (.-cljs$lang$ctorStr ~t) ~(core/str r))
       (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opt#] (-write writer# ~(core/str r))))

       ~(build-positional-factory t r fields)
       ~t)))
```

 <pre>
clojurescript @ r2723
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:889-906](https://github.com/clojure/clojurescript/blob/r2723/src/clj/cljs/core.clj#L889-L906)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/deftype"]))
```

```clj
{:ns "cljs.core",
 :name "deftype",
 :signature ["[t fields & impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_deftype",
 :source {:code "(defmacro deftype [t fields & impls]\n  (let [env &env\n        r (:name (cljs.analyzer/resolve-var (dissoc env :locals) t))\n        [fpps pmasks] (prepare-protocol-masks env impls)\n        protocols (collect-protocols impls env)\n        t (vary-meta t assoc\n            :protocols protocols\n            :skip-protocol-flag fpps) ]\n    `(do\n       (deftype* ~t ~fields ~pmasks\n         ~(if (seq impls)\n            `(extend-type ~t ~@(dt->et t impls fields))))\n       (set! (.-cljs$lang$type ~t) true)\n       (set! (.-cljs$lang$ctorStr ~t) ~(core/str r))\n       (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opt#] (-write writer# ~(core/str r))))\n\n       ~(build-positional-factory t r fields)\n       ~t)))",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/clj/cljs/core.clj",
          :lines [889 906]},
 :full-name "cljs.core/deftype",
 :clj-symbol "clojure.core/deftype"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_deftype.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_deftype.cljsdoc)
</pre>

