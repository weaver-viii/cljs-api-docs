## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.core/Iteration~~

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[×] 0.0-2371" src="https://img.shields.io/badge/×-0.0--2371-red.svg"></a> </td>
</tr>
</table>

 <samp>
(__Iteration.__ xform coll)<br>
</samp>

---





Source code:

```clj
(deftype Iteration [xform coll]
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
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8192-8203](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/core.cljs#L8192-L8203)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Iteration"]))
```

```clj
{:ns "cljs.core",
 :name "Iteration",
 :signature ["[xform coll]"],
 :history [["+" "0.0-2301"] ["-" "0.0-2371"]],
 :type "type",
 :full-name-encode "cljs.core_Iteration",
 :source {:code "(deftype Iteration [xform coll]\n   ISequential\n   \n   ISeqable\n   (-seq [_] (seq (sequence xform coll)))\n\n   IReduce\n   (-reduce [_ f init] (transduce xform f init coll))\n\n   IPrintWithWriter\n   (-pr-writer [coll writer opts]\n     (pr-sequential-writer writer pr-writer \"(\" \" \" \")\" opts coll)))",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8192 8203]},
 :full-name "cljs.core/Iteration",
 :removed {:in "0.0-2371", :last-seen "0.0-2356"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Iteration.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Iteration.cljsdoc)
</pre>
