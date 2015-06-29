## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/print-table

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/print-table</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/print-table)
</td>
</tr>
</table>

 <samp>
(__print-table__ ks rows)<br>
</samp>
 <samp>
(__print-table__ rows)<br>
</samp>

---




Source docstring:

```
Prints a collection of maps in a textual table. Prints table headings
ks, and then a line of output for each row, corresponding to the keys
in ks. If ks are not specified, use the keys of the first item in rows.
```

Source code:

```clj
(defn print-table
  ([ks rows]
   (binding [*print-newline*]
     (when (seq rows)
       (let [widths (map
                      (fn [k]
                        (apply max (count (str k)) (map #(count (str (get % k))) rows)))
                      ks)
             spacers (map #(apply str (repeat % "-")) widths)
             fmt-row (fn [leader divider trailer row]
                       (str leader
                            (apply str (interpose divider
                                                  (for [[col width] (map vector (map #(get row %) ks) widths)]
                                                    (add-padding width (str col)))))
                            trailer))]
         (cljs.core/println)
         (cljs.core/println (fmt-row "| " " | " " |" (zipmap ks ks)))
         (cljs.core/println (fmt-row "|-" "-+-" "-|" (zipmap ks spacers)))
         (doseq [row rows]
           (cljs.core/println (fmt-row "| " " | " " |" row)))))))
  ([rows] (print-table (keys (first rows)) rows)))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:3308-3332](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/pprint.cljs#L3308-L3332)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/print-table"]))
```

```clj
{:ns "cljs.pprint",
 :name "print-table",
 :signature ["[ks rows]" "[rows]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_print-table",
 :source {:code "(defn print-table\n  ([ks rows]\n   (binding [*print-newline*]\n     (when (seq rows)\n       (let [widths (map\n                      (fn [k]\n                        (apply max (count (str k)) (map #(count (str (get % k))) rows)))\n                      ks)\n             spacers (map #(apply str (repeat % \"-\")) widths)\n             fmt-row (fn [leader divider trailer row]\n                       (str leader\n                            (apply str (interpose divider\n                                                  (for [[col width] (map vector (map #(get row %) ks) widths)]\n                                                    (add-padding width (str col)))))\n                            trailer))]\n         (cljs.core/println)\n         (cljs.core/println (fmt-row \"| \" \" | \" \" |\" (zipmap ks ks)))\n         (cljs.core/println (fmt-row \"|-\" \"-+-\" \"-|\" (zipmap ks spacers)))\n         (doseq [row rows]\n           (cljs.core/println (fmt-row \"| \" \" | \" \" |\" row)))))))\n  ([rows] (print-table (keys (first rows)) rows)))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [3308 3332]},
 :full-name "cljs.pprint/print-table",
 :clj-symbol "clojure.pprint/print-table",
 :docstring "Prints a collection of maps in a textual table. Prints table headings\nks, and then a line of output for each row, corresponding to the keys\nin ks. If ks are not specified, use the keys of the first item in rows."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_print-table.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_print-table.cljsdoc)
</pre>

