## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/parse-headers

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
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
clojurescript @ r2134
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:60-68](https://github.com/clojure/clojurescript/blob/r2134/src/clj/cljs/repl/server.clj#L60-L68)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/parse-headers"]))
```

```clj
{:ns "cljs.repl.server",
 :name "parse-headers",
 :signature ["[header-lines]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.server_parse-headers",
 :source {:code "(defn parse-headers\n  [header-lines]\n  (apply hash-map\n   (mapcat\n    (fn [line]\n      (let [[k v] (str/split line #\":\" 2)]\n        [(keyword (str/lower-case k)) (str/triml v)]))\n    header-lines)))",
          :repo "clojurescript",
          :tag "r2134",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [60 68]},
 :full-name "cljs.repl.server/parse-headers",
 :docstring "Parse the headers of an HTTP POST request."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_parse-headers.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_parse-headers.cljsdoc)
</pre>

