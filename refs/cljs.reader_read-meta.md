## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read-meta

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__read-meta__ rdr _)<br>
</samp>

---





Source code:

```clj
(defn read-meta
  [rdr _]
  (let [m (desugar-meta (read rdr true nil true))]
    (when-not (map? m)
      (reader-error rdr "Metadata must be Symbol,Keyword,String or Map"))
    (let [o (read rdr true nil true)]
      (if (satisfies? IWithMeta o)
        (with-meta o (merge (meta o) m))
        (reader-error rdr "Metadata can only be applied to IWithMetas")))))
```

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:361-369](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/reader.cljs#L361-L369)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-meta"]))
```

```clj
{:ns "cljs.reader",
 :name "read-meta",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-meta\n  [rdr _]\n  (let [m (desugar-meta (read rdr true nil true))]\n    (when-not (map? m)\n      (reader-error rdr \"Metadata must be Symbol,Keyword,String or Map\"))\n    (let [o (read rdr true nil true)]\n      (if (satisfies? IWithMeta o)\n        (with-meta o (merge (meta o) m))\n        (reader-error rdr \"Metadata can only be applied to IWithMetas\")))))",
          :repo "clojurescript",
          :tag "r1586",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [361 369]},
 :full-name "cljs.reader/read-meta",
 :full-name-encode "cljs.reader_read-meta",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read-meta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read-meta.cljsdoc)
</pre>

