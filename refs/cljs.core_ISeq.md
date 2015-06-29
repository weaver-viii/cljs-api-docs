## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ISeq

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ISeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ISeq.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol ISeq
  (-first [coll])
  (^clj -rest [coll]))
```

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:251-253](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/core.cljs#L251-L253)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ISeq"]))
```

```clj
{:ns "cljs.core",
 :name "ISeq",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ISeq",
 :source {:code "(defprotocol ISeq\n  (-first [coll])\n  (^clj -rest [coll]))",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/cljs/core.cljs",
          :lines [251 253]},
 :methods [{:name "-first", :signature ["[coll]"], :docstring nil}
           {:name "-rest", :signature ["[coll]"], :docstring nil}],
 :full-name "cljs.core/ISeq",
 :clj-symbol "clojure.lang/ISeq"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ISeq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ISeq.cljsdoc)
</pre>

