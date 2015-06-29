## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/StringBufferWriter

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__StringBufferWriter.__ sb)<br>
</samp>

---





Source code:

```clj
(deftype StringBufferWriter [sb]
  IWriter
  (-write [_ s] (.append sb s))
  (-flush [_] nil))
```

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:426-429](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/core.cljs#L426-L429)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/StringBufferWriter"]))
```

```clj
{:ns "cljs.core",
 :name "StringBufferWriter",
 :type "type",
 :signature ["[sb]"],
 :source {:code "(deftype StringBufferWriter [sb]\n  IWriter\n  (-write [_ s] (.append sb s))\n  (-flush [_] nil))",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/core.cljs",
          :lines [426 429]},
 :full-name "cljs.core/StringBufferWriter",
 :full-name-encode "cljs.core_StringBufferWriter",
 :history [["+" "0.0-1503"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_StringBufferWriter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_StringBufferWriter.cljsdoc)
</pre>

