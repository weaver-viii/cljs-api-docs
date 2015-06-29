## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/src-file->goog-require

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__src-file->goog-require__ src)<br>
</samp>
 <samp>
(__src-file->goog-require__ src options)<br>
</samp>

---




Source docstring:

```
Given a ClojureScript or Google Closure style JavaScript source file return
the goog.require statement for it.
```

Source code:

```clj
(defn ^String src-file->goog-require
  ([src] (closure/src-file->goog-require src))
  ([src options]
    (closure/src-file->goog-require src options)))
```

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:86-91](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/build/api.clj#L86-L91)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/src-file->goog-require"]))
```

```clj
{:return-type String,
 :ns "cljs.build.api",
 :name "src-file->goog-require",
 :signature ["[src]" "[src options]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.build.api_src-file-GTgoog-require",
 :source {:code "(defn ^String src-file->goog-require\n  ([src] (closure/src-file->goog-require src))\n  ([src options]\n    (closure/src-file->goog-require src options)))",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/clj/cljs/build/api.clj",
          :lines [86 91]},
 :full-name "cljs.build.api/src-file->goog-require",
 :docstring "Given a ClojureScript or Google Closure style JavaScript source file return\nthe goog.require statement for it."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_src-file-GTgoog-require.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_src-file-GTgoog-require.cljsdoc)
</pre>

