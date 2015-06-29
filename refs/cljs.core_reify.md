## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reify

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reify</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reify)
</td>
</tr>
</table>

 <samp>
(__reify__ & impls)<br>
</samp>

---





Source code:

```clj
(defmacro reify [& impls]
  (let [t      (gensym "t")
        meta-sym (gensym "meta")
        this-sym (gensym "_")
        locals (keys (:locals &env))
        ns     (-> &env :ns :name)
        munge  cljs.compiler/munge]
    `(do
       (when-not (exists? ~(symbol (core/str ns) (core/str t)))
         (deftype ~t [~@locals ~meta-sym]
           IWithMeta
           (~'-with-meta [~this-sym ~meta-sym]
             (new ~t ~@locals ~meta-sym))
           IMeta
           (~'-meta [~this-sym] ~meta-sym)
           ~@impls))
       (new ~t ~@locals nil))))
```

 <pre>
clojurescript @ r2067
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:585-601](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/core.clj#L585-L601)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/reify"]))
```

```clj
{:ns "cljs.core",
 :name "reify",
 :signature ["[& impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_reify",
 :source {:code "(defmacro reify [& impls]\n  (let [t      (gensym \"t\")\n        meta-sym (gensym \"meta\")\n        this-sym (gensym \"_\")\n        locals (keys (:locals &env))\n        ns     (-> &env :ns :name)\n        munge  cljs.compiler/munge]\n    `(do\n       (when-not (exists? ~(symbol (core/str ns) (core/str t)))\n         (deftype ~t [~@locals ~meta-sym]\n           IWithMeta\n           (~'-with-meta [~this-sym ~meta-sym]\n             (new ~t ~@locals ~meta-sym))\n           IMeta\n           (~'-meta [~this-sym] ~meta-sym)\n           ~@impls))\n       (new ~t ~@locals nil))))",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/clj/cljs/core.clj",
          :lines [585 601]},
 :full-name "cljs.core/reify",
 :clj-symbol "clojure.core/reify"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_reify.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_reify.cljsdoc)
</pre>

