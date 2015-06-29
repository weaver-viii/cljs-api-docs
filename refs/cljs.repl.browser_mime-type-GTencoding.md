## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/mime-type->encoding

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3297"><img valign="middle" alt="[+] 0.0-3297" src="https://img.shields.io/badge/+-0.0--3297-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def mime-type->encoding
  {"text/html" "UTF-8"
   "text/css" "UTF-8"
   "image/jpeg" "ISO-8859-1"
   "image/png" "ISO-8859-1"
   "image/gif" "ISO-8859-1"
   "text/javascript" "UTF-8"
   "text/x-clojure" "UTF-8"
   "application/json" "UTF-8"})
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:40-48](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl/browser.clj#L40-L48)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/mime-type->encoding"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "mime-type->encoding",
 :type "var",
 :source {:code "(def mime-type->encoding\n  {\"text/html\" \"UTF-8\"\n   \"text/css\" \"UTF-8\"\n   \"image/jpeg\" \"ISO-8859-1\"\n   \"image/png\" \"ISO-8859-1\"\n   \"image/gif\" \"ISO-8859-1\"\n   \"text/javascript\" \"UTF-8\"\n   \"text/x-clojure\" \"UTF-8\"\n   \"application/json\" \"UTF-8\"})",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [40 48]},
 :full-name "cljs.repl.browser/mime-type->encoding",
 :full-name-encode "cljs.repl.browser_mime-type-GTencoding",
 :history [["+" "0.0-3297"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_mime-type-GTencoding.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_mime-type-GTencoding.cljsdoc)
</pre>

