## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/get-ua-product

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3058"><img valign="middle" alt="[+] 0.0-3058" src="https://img.shields.io/badge/+-0.0--3058-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__get-ua-product__)<br>
</samp>

---





Source code:

```clj
(defn get-ua-product []
  (cond
    product/SAFARI :safari
    product/CHROME :chrome
    product/FIREFOX :firefox
    product/IE :ie))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── clojure
                └── browser
                    └── <ins>[repl.cljs:34-39](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/clojure/browser/repl.cljs#L34-L39)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/get-ua-product"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "get-ua-product",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn get-ua-product []\n  (cond\n    product/SAFARI :safari\n    product/CHROME :chrome\n    product/FIREFOX :firefox\n    product/IE :ie))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/clojure/browser/repl.cljs",
          :lines [34 39]},
 :full-name "clojure.browser.repl/get-ua-product",
 :full-name-encode "clojure.browser.repl_get-ua-product",
 :history [["+" "0.0-3058"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_get-ua-product.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_get-ua-product.cljsdoc)
</pre>

