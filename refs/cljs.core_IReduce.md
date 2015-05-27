## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IReduce

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
            └── <ins>[core.cljs:220-221](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L220-L221)</ins>
</pre>

```clj
(defprotocol IReduce
  (-reduce [coll f] [coll f start]))
```


---

```clj
{:ns "cljs.core",
 :name "IReduce",
 :type "protocol",
 :full-name-encode "cljs.core_IReduce",
 :source {:code "(defprotocol IReduce\n  (-reduce [coll f] [coll f start]))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [220 221],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L220-L221"},
 :methods [{:name "-reduce",
            :signature ["[coll f]" "[coll f start]"],
            :docstring nil}],
 :full-name "cljs.core/IReduce",
 :history [["+" "0.0-927"]]}

```