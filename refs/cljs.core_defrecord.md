## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defrecord

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defrecord</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defrecord)
</td>
</tr>
</table>

 <samp>
(__defrecord__ rsym fields & impls)<br>
</samp>

---





Source code:

```clj
(defmacro defrecord [rsym fields & impls]
  (let [r (:name (cljs.analyzer/resolve-var (dissoc &env :locals) rsym))]
    `(let []
       ~(emit-defrecord &env rsym r fields impls)
       (set! (.-cljs$lang$type ~r) true)
       (set! (.-cljs$lang$ctorPrSeq ~r) (fn [this#] (list ~(core/str r))))
       (set! (.-cljs$lang$ctorPrWriter ~r) (fn [this# writer#] (-write writer# ~(core/str r))))
       ~(build-positional-factory rsym r fields)
       ~(build-map-factory rsym r fields)
       ~r)))
```

 <pre>
clojurescript @ r1877
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:814-823](https://github.com/clojure/clojurescript/blob/r1877/src/clj/cljs/core.clj#L814-L823)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defrecord"]))
```

```clj
{:ns "cljs.core",
 :name "defrecord",
 :signature ["[rsym fields & impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_defrecord",
 :source {:code "(defmacro defrecord [rsym fields & impls]\n  (let [r (:name (cljs.analyzer/resolve-var (dissoc &env :locals) rsym))]\n    `(let []\n       ~(emit-defrecord &env rsym r fields impls)\n       (set! (.-cljs$lang$type ~r) true)\n       (set! (.-cljs$lang$ctorPrSeq ~r) (fn [this#] (list ~(core/str r))))\n       (set! (.-cljs$lang$ctorPrWriter ~r) (fn [this# writer#] (-write writer# ~(core/str r))))\n       ~(build-positional-factory rsym r fields)\n       ~(build-map-factory rsym r fields)\n       ~r)))",
          :repo "clojurescript",
          :tag "r1877",
          :filename "src/clj/cljs/core.clj",
          :lines [814 823]},
 :full-name "cljs.core/defrecord",
 :clj-symbol "clojure.core/defrecord"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_defrecord.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_defrecord.cljsdoc)
</pre>

