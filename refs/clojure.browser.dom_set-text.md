## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/set-text

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__set-text__ e s)<br>
</samp>

---




Source docstring:

```
Set the text content for the passed element returning the
element. If a keyword is passed in the place of e, the element with
that id will be used and returned.
```

Source code:

```clj
(defn set-text
  [e s]
  (gdom/setTextContent (ensure-element e) s))
```

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:124-129](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/clojure/browser/dom.cljs#L124-L129)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/set-text"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "set-text",
 :signature ["[e s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom_set-text",
 :source {:code "(defn set-text\n  [e s]\n  (gdom/setTextContent (ensure-element e) s))",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [124 129]},
 :full-name "clojure.browser.dom/set-text",
 :docstring "Set the text content for the passed element returning the\nelement. If a keyword is passed in the place of e, the element with\nthat id will be used and returned."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_set-text.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_set-text.cljsdoc)
</pre>

