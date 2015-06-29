## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/keyword

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/keyword</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/keyword)
</td>
</tr>
</table>

 <samp>
(__keyword__ name)<br>
</samp>
 <samp>
(__keyword__ ns name)<br>
</samp>

---




Source docstring:

```
Returns a Keyword with the given namespace and name.  Do not use :
in the keyword strings, it will be added automatically.
```

Source code:

```clj
(defn keyword
  ([name] (cond
            (keyword? name) name
            (symbol? name) (Keyword. nil (cljs.core/name name) (cljs.core/name name) nil)
            :else (Keyword. nil name name nil)))
  ([ns name] (Keyword. ns name (str (when ns (str ns "/")) name) nil)))
```

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2056-2063](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L2056-L2063)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/keyword"]))
```

```clj
{:ns "cljs.core",
 :name "keyword",
 :signature ["[name]" "[ns name]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_keyword",
 :source {:code "(defn keyword\n  ([name] (cond\n            (keyword? name) name\n            (symbol? name) (Keyword. nil (cljs.core/name name) (cljs.core/name name) nil)\n            :else (Keyword. nil name name nil)))\n  ([ns name] (Keyword. ns name (str (when ns (str ns \"/\")) name) nil)))",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2056 2063]},
 :full-name "cljs.core/keyword",
 :clj-symbol "clojure.core/keyword",
 :docstring "Returns a Keyword with the given namespace and name.  Do not use :\nin the keyword strings, it will be added automatically."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_keyword.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_keyword.cljsdoc)
</pre>

