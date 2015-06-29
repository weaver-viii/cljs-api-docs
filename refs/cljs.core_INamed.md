## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/INamed

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Named</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Named.java)
</td>
</tr>
</table>






Source code:

```clj
(defprotocol INamed
  (-name [x])
  (-namespace [x]))
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:351-353](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L351-L353)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/INamed"]))
```

```clj
{:ns "cljs.core",
 :name "INamed",
 :history [["+" "0.0-1798"]],
 :type "protocol",
 :full-name-encode "cljs.core_INamed",
 :source {:code "(defprotocol INamed\n  (-name [x])\n  (-namespace [x]))",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [351 353]},
 :methods [{:name "-name", :signature ["[x]"], :docstring nil}
           {:name "-namespace", :signature ["[x]"], :docstring nil}],
 :full-name "cljs.core/INamed",
 :clj-symbol "clojure.lang/Named"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_INamed.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_INamed.cljsdoc)
</pre>
