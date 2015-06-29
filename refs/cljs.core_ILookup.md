## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ILookup

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ILookup</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ILookup.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol ILookup
  (-lookup [o k] [o k not-found]))
```

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:282-283](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L282-L283)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ILookup"]))
```

```clj
{:ns "cljs.core",
 :name "ILookup",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ILookup",
 :source {:code "(defprotocol ILookup\n  (-lookup [o k] [o k not-found]))",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [282 283]},
 :methods [{:name "-lookup",
            :signature ["[o k]" "[o k not-found]"],
            :docstring nil}],
 :full-name "cljs.core/ILookup",
 :clj-symbol "clojure.lang/ILookup"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ILookup.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ILookup.cljsdoc)
</pre>

