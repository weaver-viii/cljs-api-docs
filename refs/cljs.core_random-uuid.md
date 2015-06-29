## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/random-uuid

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3308"><img valign="middle" alt="[+] 0.0-3308" src="https://img.shields.io/badge/+-0.0--3308-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__random-uuid__)<br>
</samp>

---





Source code:

```clj
(defn random-uuid []
  (letfn [(hex [] (.toString (rand-int 15) 16))]
    (let [rhex (.toString (bit-or 0x8 (bit-and 0x3 (rand-int 14))) 16)]
      (uuid
        (str (hex) (hex) (hex) (hex)
             (hex) (hex) (hex) (hex) "-"
             (hex) (hex) (hex) (hex) "-"
             "4"   (hex) (hex) (hex) "-"
             rhex  (hex) (hex) (hex) "-"
             (hex) (hex) (hex) (hex)
             (hex) (hex) (hex) (hex)
             (hex) (hex) (hex) (hex))))))
```

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9556-9567](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L9556-L9567)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/random-uuid"]))
```

```clj
{:ns "cljs.core",
 :name "random-uuid",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn random-uuid []\n  (letfn [(hex [] (.toString (rand-int 15) 16))]\n    (let [rhex (.toString (bit-or 0x8 (bit-and 0x3 (rand-int 14))) 16)]\n      (uuid\n        (str (hex) (hex) (hex) (hex)\n             (hex) (hex) (hex) (hex) \"-\"\n             (hex) (hex) (hex) (hex) \"-\"\n             \"4\"   (hex) (hex) (hex) \"-\"\n             rhex  (hex) (hex) (hex) \"-\"\n             (hex) (hex) (hex) (hex)\n             (hex) (hex) (hex) (hex)\n             (hex) (hex) (hex) (hex))))))",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9556 9567]},
 :full-name "cljs.core/random-uuid",
 :full-name-encode "cljs.core_random-uuid",
 :history [["+" "0.0-3308"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_random-uuid.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_random-uuid.cljsdoc)
</pre>

