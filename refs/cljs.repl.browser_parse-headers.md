## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/parse-headers

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__parse-headers__ header-lines)<br>
</samp>

---




Source docstring:

```
Parse the headers of an HTTP POST request.
```

Source code:

```clj
(defn parse-headers
  [header-lines]
  (apply hash-map
   (mapcat
    (fn [line]
      (let [[k v] (str/split line #":" 2)]
        [(keyword (str/lower-case k)) (str/triml v)]))
    header-lines)))
```

 <pre>
clojurescript @ r1443
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:116-124](https://github.com/clojure/clojurescript/blob/r1443/src/clj/cljs/repl/browser.clj#L116-L124)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/parse-headers"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "parse-headers",
 :signature ["[header-lines]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser_parse-headers",
 :source {:code "(defn parse-headers\n  [header-lines]\n  (apply hash-map\n   (mapcat\n    (fn [line]\n      (let [[k v] (str/split line #\":\" 2)]\n        [(keyword (str/lower-case k)) (str/triml v)]))\n    header-lines)))",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [116 124]},
 :full-name "cljs.repl.browser/parse-headers",
 :docstring "Parse the headers of an HTTP POST request."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_parse-headers.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_parse-headers.cljsdoc)
</pre>

