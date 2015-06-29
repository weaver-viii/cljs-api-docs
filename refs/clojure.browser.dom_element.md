## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/element

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__element__ tag-or-text)<br>
</samp>
 <samp>
(__element__ tag & children)<br>
</samp>

---





Source code:

```clj
(defn element
  ([tag-or-text]
     (log "(element " tag-or-text ")")
     (-element tag-or-text))
  ([tag & children]
     (log "(element " tag " " children ")")
     (let [attrs (first children)]
       (if (map? attrs)
         (-element tag attrs (rest children))
         (-element tag nil children)))))
```

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:81-90](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/browser/dom.cljs#L81-L90)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/element"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "element",
 :type "function",
 :signature ["[tag-or-text]" "[tag & children]"],
 :source {:code "(defn element\n  ([tag-or-text]\n     (log \"(element \" tag-or-text \")\")\n     (-element tag-or-text))\n  ([tag & children]\n     (log \"(element \" tag \" \" children \")\")\n     (let [attrs (first children)]\n       (if (map? attrs)\n         (-element tag attrs (rest children))\n         (-element tag nil children)))))",
          :repo "clojurescript",
          :tag "r1576",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [81 90]},
 :full-name "clojure.browser.dom/element",
 :full-name-encode "clojure.browser.dom_element",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_element.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_element.cljsdoc)
</pre>

