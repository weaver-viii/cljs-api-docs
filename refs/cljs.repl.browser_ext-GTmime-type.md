## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/ext->mime-type

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ext->mime-type
  {".html" "text/html"
   ".css" "text/css"

   ".jpg" "image/jpeg"
   ".png" "image/png"
   ".gif" "image/gif"

   ".js" "text/javascript"
   ".cljs" "text/x-clojure"
   ".cljc" "text/x-clojure"
   ".map" "application/json"})
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:27-38](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl/browser.clj#L27-L38)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/ext->mime-type"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "ext->mime-type",
 :type "var",
 :source {:code "(def ext->mime-type\n  {\".html\" \"text/html\"\n   \".css\" \"text/css\"\n\n   \".jpg\" \"image/jpeg\"\n   \".png\" \"image/png\"\n   \".gif\" \"image/gif\"\n\n   \".js\" \"text/javascript\"\n   \".cljs\" \"text/x-clojure\"\n   \".cljc\" \"text/x-clojure\"\n   \".map\" \"application/json\"})",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [27 38]},
 :full-name "cljs.repl.browser/ext->mime-type",
 :full-name-encode "cljs.repl.browser_ext-GTmime-type",
 :history [["+" "0.0-3291"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_ext-GTmime-type.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_ext-GTmime-type.cljsdoc)
</pre>

