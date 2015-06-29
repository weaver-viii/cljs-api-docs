## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/canonicalize-specs

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3148"><img valign="middle" alt="[+] 0.0-3148" src="https://img.shields.io/badge/+-0.0--3148-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__canonicalize-specs__ specs)<br>
</samp>

---





Source code:

```clj
(defn canonicalize-specs [specs]
  (letfn [(canonicalize [quoted-spec-or-kw]
            (if (keyword? quoted-spec-or-kw)
              quoted-spec-or-kw
              (as-> (second quoted-spec-or-kw) spec
                (if (vector? spec) spec [spec]))))]
    (map canonicalize specs)))
```

 <pre>
clojurescript @ r3191
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:551-557](https://github.com/clojure/clojurescript/blob/r3191/src/clj/cljs/repl.clj#L551-L557)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/canonicalize-specs"]))
```

```clj
{:ns "cljs.repl",
 :name "canonicalize-specs",
 :type "function",
 :signature ["[specs]"],
 :source {:code "(defn canonicalize-specs [specs]\n  (letfn [(canonicalize [quoted-spec-or-kw]\n            (if (keyword? quoted-spec-or-kw)\n              quoted-spec-or-kw\n              (as-> (second quoted-spec-or-kw) spec\n                (if (vector? spec) spec [spec]))))]\n    (map canonicalize specs)))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/clj/cljs/repl.clj",
          :lines [551 557]},
 :full-name "cljs.repl/canonicalize-specs",
 :full-name-encode "cljs.repl_canonicalize-specs",
 :history [["+" "0.0-3148"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_canonicalize-specs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_canonicalize-specs.cljsdoc)
</pre>

