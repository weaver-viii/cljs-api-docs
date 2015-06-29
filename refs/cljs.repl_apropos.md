## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/apropos

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/apropos</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/apropos)
</td>
</tr>
</table>

 <samp>
(__apropos__ str-or-pattern)<br>
</samp>

---

Given a regular expression or stringable thing, return a seq of all
public definitions in all currently-loaded namespaces that match the
`str-or-pattern`.

---

Example:

```clj
(apropos "some")
;;=> (cljs.core/if-some
;;    cljs.core/some
;;    cljs.core/some->
;;    cljs.core/some->>
;;    cljs.core/some-fn
;;    cljs.core/some?
;;    cljs.core/when-some)
```

---

See Also:

[`cljs.repl/find-doc`](cljs.repl_find-doc.md)<br>

---

Source docstring:

```
Given a regular expression or stringable thing, return a seq of all
public definitions in all currently-loaded namespaces that match the
str-or-pattern.
```

Source code:

```clj
(defmacro apropos
  [str-or-pattern]
  (let [matches? (if (instance? Pattern str-or-pattern)
                   #(re-find str-or-pattern (str %))
                   #(.contains (str %) (str str-or-pattern)))]
    `(quote
       ~(sort
          (mapcat
            (fn [ns]
              (let [ns-name (str ns)]
                (map #(symbol ns-name (str %))
                  (filter matches? (keys (ana-api/ns-publics ns))))))
            (ana-api/all-ns))))))
```

 <pre>
clojurescript @ r3191
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:1149-1164](https://github.com/clojure/clojurescript/blob/r3191/src/clj/cljs/repl.clj#L1149-L1164)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/apropos"]))
```

```clj
{:description "Given a regular expression or stringable thing, return a seq of all\npublic definitions in all currently-loaded namespaces that match the\n`str-or-pattern`.",
 :ns "cljs.repl",
 :name "apropos",
 :signature ["[str-or-pattern]"],
 :history [["+" "0.0-2985"]],
 :type "macro",
 :related ["cljs.repl/find-doc"],
 :full-name-encode "cljs.repl_apropos",
 :source {:code "(defmacro apropos\n  [str-or-pattern]\n  (let [matches? (if (instance? Pattern str-or-pattern)\n                   #(re-find str-or-pattern (str %))\n                   #(.contains (str %) (str str-or-pattern)))]\n    `(quote\n       ~(sort\n          (mapcat\n            (fn [ns]\n              (let [ns-name (str ns)]\n                (map #(symbol ns-name (str %))\n                  (filter matches? (keys (ana-api/ns-publics ns))))))\n            (ana-api/all-ns))))))",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/clj/cljs/repl.clj",
          :lines [1149 1164]},
 :examples [{:id "aceda4",
             :content "```clj\n(apropos \"some\")\n;;=> (cljs.core/if-some\n;;    cljs.core/some\n;;    cljs.core/some->\n;;    cljs.core/some->>\n;;    cljs.core/some-fn\n;;    cljs.core/some?\n;;    cljs.core/when-some)\n```"}],
 :full-name "cljs.repl/apropos",
 :clj-symbol "clojure.repl/apropos",
 :docstring "Given a regular expression or stringable thing, return a seq of all\npublic definitions in all currently-loaded namespaces that match the\nstr-or-pattern."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_apropos.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_apropos.cljsdoc)
</pre>

