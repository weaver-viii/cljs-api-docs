## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/replace-node

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__replace-node__ old-node new-node)<br>
</samp>

---




Source docstring:

```
Replace old-node with new-node. old-node can be an element or a
keyword which is the id of the node to replace.  new-node can be an
element or an html string.
```

Source code:

```clj
(defn replace-node
  [old-node new-node]
  (let [old-node (ensure-element old-node)
        new-node (ensure-element new-node)]
    (gdom/replaceNode new-node old-node)
    new-node))
```

 <pre>
clojurescript @ r2127
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:114-122](https://github.com/clojure/clojurescript/blob/r2127/src/cljs/clojure/browser/dom.cljs#L114-L122)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.dom/replace-node"]))
```

```clj
{:ns "clojure.browser.dom",
 :name "replace-node",
 :signature ["[old-node new-node]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.dom_replace-node",
 :source {:code "(defn replace-node\n  [old-node new-node]\n  (let [old-node (ensure-element old-node)\n        new-node (ensure-element new-node)]\n    (gdom/replaceNode new-node old-node)\n    new-node))",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/cljs/clojure/browser/dom.cljs",
          :lines [114 122]},
 :full-name "clojure.browser.dom/replace-node",
 :docstring "Replace old-node with new-node. old-node can be an element or a\nkeyword which is the id of the node to replace.  new-node can be an\nelement or an html string."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.dom_replace-node.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.dom_replace-node.cljsdoc)
</pre>

