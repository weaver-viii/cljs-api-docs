## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/NeverEquiv

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__NeverEquiv.__)<br>
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
            └── <ins>[core.cljs:3554-3556](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L3554-L3556)</ins>
</pre>

```clj
(deftype NeverEquiv []
  IEquiv
  (-equiv [o other] false))
```


---

```clj
{:full-name "cljs.core/NeverEquiv",
 :ns "cljs.core",
 :name "NeverEquiv",
 :type "type",
 :signature ["[]"],
 :source {:code "(deftype NeverEquiv []\n  IEquiv\n  (-equiv [o other] false))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3554 3556],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L3554-L3556"},
 :full-name-encode "cljs.core_NeverEquiv",
 :history [["+" "0.0-927"]]}

```