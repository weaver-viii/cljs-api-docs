## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/html->dom

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__html->dom__ s)<br>
</samp>

---





Source code:

```clj
(defn html->dom [s]
  (gdom/htmlToDocumentFragment s))
```

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:101-102](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/clojure/browser/dom.cljs#L101-L102)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/html->dom"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "html->dom",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn html->dom [s]\n  (gdom/htmlToDocumentFragment s))",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [101 102]},
 :full-name "clojure.browser.dom/html->dom",
 :full-name-encode "clojure.browser.dom_html-GTdom",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_html-GTdom.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_html-GTdom.cljsdoc)
</pre>

