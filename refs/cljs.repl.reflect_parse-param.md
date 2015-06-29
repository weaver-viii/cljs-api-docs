## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.reflect/parse-param

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__parse-param__ path)<br>
</samp>

---




Source docstring:

```
Parses the query parameter of a path of the form "/reflect?var=foo"
into the vector ["var" "foo"].
```

Source code:

```clj
(defn parse-param
  [path]
  (-> (str/split path #"\?")
      (last)
      (str/split #"=")))
```

 <pre>
clojurescript @ r1859
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[reflect.clj:44-50](https://github.com/clojure/clojurescript/blob/r1859/src/clj/cljs/repl/reflect.clj#L44-L50)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.reflect/parse-param"]))
```

```clj
{:ns "cljs.repl.reflect",
 :name "parse-param",
 :signature ["[path]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.reflect_parse-param",
 :source {:code "(defn parse-param\n  [path]\n  (-> (str/split path #\"\\?\")\n      (last)\n      (str/split #\"=\")))",
          :repo "clojurescript",
          :tag "r1859",
          :filename "src/clj/cljs/repl/reflect.clj",
          :lines [44 50]},
 :full-name "cljs.repl.reflect/parse-param",
 :docstring "Parses the query parameter of a path of the form \"/reflect?var=foo\"\ninto the vector [\"var\" \"foo\"]."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.reflect_parse-param.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.reflect_parse-param.cljsdoc)
</pre>

