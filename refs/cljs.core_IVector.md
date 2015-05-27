## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IVector

 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:205-206](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L205-L206)</ins>
</pre>

```clj
(defprotocol IVector
  (-assoc-n [coll n val]))
```


---

```clj
{:ns "cljs.core",
 :name "IVector",
 :type "protocol",
 :full-name-encode "cljs.core_IVector",
 :source {:code "(defprotocol IVector\n  (-assoc-n [coll n val]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [205 206],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L205-L206"},
 :methods [{:name "-assoc-n",
            :signature ["[coll n val]"],
            :docstring nil}],
 :full-name "cljs.core/IVector",
 :history [["+" "0.0-927"]]}

```