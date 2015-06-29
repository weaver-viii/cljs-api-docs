## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Eduction

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Eduction.__ xform coll)<br>
</samp>

---





Source code:

```clj
(deftype Eduction [xform coll]
   ISequential
   
   ISeqable
   (-seq [_] (seq (sequence xform coll)))

   IReduce
   (-reduce [_ f init] (transduce xform f init coll))

   IPrintWithWriter
   (-pr-writer [coll writer opts]
     (pr-sequential-writer writer pr-writer "(" " " ")" opts coll)))
```

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8593-8604](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L8593-L8604)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Eduction"]))
```

```clj
{:ns "cljs.core",
 :name "Eduction",
 :type "type",
 :signature ["[xform coll]"],
 :source {:code "(deftype Eduction [xform coll]\n   ISequential\n   \n   ISeqable\n   (-seq [_] (seq (sequence xform coll)))\n\n   IReduce\n   (-reduce [_ f init] (transduce xform f init coll))\n\n   IPrintWithWriter\n   (-pr-writer [coll writer opts]\n     (pr-sequential-writer writer pr-writer \"(\" \" \" \")\" opts coll)))",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8593 8604]},
 :full-name "cljs.core/Eduction",
 :full-name-encode "cljs.core_Eduction",
 :history [["+" "0.0-2371"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Eduction.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Eduction.cljsdoc)
</pre>

