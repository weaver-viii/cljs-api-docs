## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/string-print

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__string-print__ x)<br>
</samp>

---





Source code:

```clj
(defn string-print [x]
  (*print-fn* x)
  nil)
```

 <pre>
clojurescript @ r3058
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8236-8238](https://github.com/clojure/clojurescript/blob/r3058/src/cljs/cljs/core.cljs#L8236-L8238)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/string-print"]))
```

```clj
{:ns "cljs.core",
 :name "string-print",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn string-print [x]\n  (*print-fn* x)\n  nil)",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8236 8238]},
 :full-name "cljs.core/string-print",
 :full-name-encode "cljs.core_string-print",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_string-print.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_string-print.cljsdoc)
</pre>

