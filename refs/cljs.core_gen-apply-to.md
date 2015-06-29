## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/gen-apply-to

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__gen-apply-to__)<br>
</samp>

---





Source code:

```clj
(defmacro gen-apply-to []
  `(do
     (set! ~'*unchecked-if* true)
     (defn ~'apply-to [~'f ~'argc ~'args]
       (let [~'args (seq ~'args)]
         (if (zero? ~'argc)
           (~'f)
           ~(gen-apply-to-helper))))
     (set! ~'*unchecked-if* false)))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:1967-1975](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/core.clj#L1967-L1975)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/gen-apply-to"]))
```

```clj
{:ns "cljs.core",
 :name "gen-apply-to",
 :type "macro",
 :signature ["[]"],
 :source {:code "(defmacro gen-apply-to []\n  `(do\n     (set! ~'*unchecked-if* true)\n     (defn ~'apply-to [~'f ~'argc ~'args]\n       (let [~'args (seq ~'args)]\n         (if (zero? ~'argc)\n           (~'f)\n           ~(gen-apply-to-helper))))\n     (set! ~'*unchecked-if* false)))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/clojure/cljs/core.clj",
          :lines [1967 1975]},
 :full-name "cljs.core/gen-apply-to",
 :full-name-encode "cljs.core_gen-apply-to",
 :history [["+" "0.0-1211"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_gen-apply-to.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_gen-apply-to.cljsdoc)
</pre>

