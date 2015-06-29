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
  (js* "(~{o} instanceof ~{t})"))
```

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:313-314](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L313-L314)</ins>
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
 :source {:code "(defn ^boolean instance? [t o]\n  (js* \"(~{o} instanceof ~{t})\"))",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/core.cljs",
          :lines [313 314]},
 :full-name "cljs.core/instance?",
 :clj-symbol "clojure.core/instance?"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_instanceQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_instanceQMARK.cljsdoc)
</pre>

