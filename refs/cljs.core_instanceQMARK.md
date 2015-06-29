## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/instance?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/instance?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/instance?)
</td>
</tr>
</table>

 <samp>
(__instance?__ t o)<br>
</samp>

---

Returns true if `o` is an instance of type `t`, false otherwise.

---


See Also:

[`cljs.core/type`](cljs.core_type.md)<br>

---


Source code:

```clj
(defn ^boolean instance? [t o]
  (cljs.core/instance? t o))
```

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:402-403](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L402-L403)</ins>
</pre>


---

```clj
(defmacro instance? [t o]
  ;; Google Closure warns about some references to RegExp, so
  ;; (instance? RegExp ...) needs to be inlined, but the expansion
  ;; should preserve the order of argument evaluation.
  (bool-expr (if (clojure.core/symbol? t)
               (core/list 'js* "(~{} instanceof ~{})" o t)
               `(let [t# ~t o# ~o]
                  (~'js* "(~{} instanceof ~{})" o# t#)))))
```

 <pre>
clojurescript @ r2227
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:332-339](https://github.com/clojure/clojurescript/blob/r2227/src/clj/cljs/core.clj#L332-L339)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/instance?"]))
```

```clj
{:description "Returns true if `o` is an instance of type `t`, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "instance?",
 :signature ["[t o]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/type"],
 :full-name-encode "cljs.core_instanceQMARK",
 :source {:code "(defn ^boolean instance? [t o]\n  (cljs.core/instance? t o))",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [402 403]},
 :extra-sources ({:code "(defmacro instance? [t o]\n  ;; Google Closure warns about some references to RegExp, so\n  ;; (instance? RegExp ...) needs to be inlined, but the expansion\n  ;; should preserve the order of argument evaluation.\n  (bool-expr (if (clojure.core/symbol? t)\n               (core/list 'js* \"(~{} instanceof ~{})\" o t)\n               `(let [t# ~t o# ~o]\n                  (~'js* \"(~{} instanceof ~{})\" o# t#)))))",
                  :repo "clojurescript",
                  :tag "r2227",
                  :filename "src/clj/cljs/core.clj",
                  :lines [332 339]}),
 :full-name "cljs.core/instance?",
 :clj-symbol "clojure.core/instance?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_instanceQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_instanceQMARK.cljsdoc)
</pre>

