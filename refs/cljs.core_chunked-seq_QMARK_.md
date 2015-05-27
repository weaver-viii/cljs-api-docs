## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/chunked-seq?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__chunked-seq?__ x)<br>
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
            └── <ins>[core.cljs:969-970](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L969-L970)</ins>
</pre>

```clj
(defn ^boolean chunked-seq?
  [x] (satisfies? IChunkedSeq x))
```


---

```clj
{:full-name "cljs.core/chunked-seq?",
 :ns "cljs.core",
 :name "chunked-seq?",
 :type "function",
 :signature ["[x]"],
 :return-type boolean,
 :source {:code "(defn ^boolean chunked-seq?\n  [x] (satisfies? IChunkedSeq x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [969 970],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L969-L970"},
 :full-name-encode "cljs.core_chunked-seq_QMARK_",
 :history [["+" "0.0-1424"]]}

```