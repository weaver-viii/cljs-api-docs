## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/name

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/name</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/name)
</td>
</tr>
</table>

 <samp>
(__name__ x)<br>
</samp>

---

Returns a string value of a keyword, string, or symbol.

`(name :foo)` => `"foo"`

`(name "foo")` => `"foo"`

`(name 'foo)` => `"foo"`

---



Source docstring:

```
Returns the name String of a string, symbol or keyword.
```

Source code:

```clj
(defn name
  [x]
  (cond
    (string? x) x
    (or (keyword? x) (symbol? x))
      (let [i (.lastIndexOf x "/")]
        (if (< i 0)
          (subs x 2)
          (subs x (inc i))))
    :else (throw (js/Error. (str "Doesn't support name: " x)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5310-5320](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L5310-L5320)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/name"]))
```

```clj
{:description "Returns a string value of a keyword, string, or symbol.\n\n`(name :foo)` => `\"foo\"`\n\n`(name \"foo\")` => `\"foo\"`\n\n`(name 'foo)` => `\"foo\"`",
 :ns "cljs.core",
 :name "name",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_name",
 :source {:code "(defn name\n  [x]\n  (cond\n    (string? x) x\n    (or (keyword? x) (symbol? x))\n      (let [i (.lastIndexOf x \"/\")]\n        (if (< i 0)\n          (subs x 2)\n          (subs x (inc i))))\n    :else (throw (js/Error. (str \"Doesn't support name: \" x)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5310 5320]},
 :full-name "cljs.core/name",
 :clj-symbol "clojure.core/name",
 :docstring "Returns the name String of a string, symbol or keyword."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_name.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_name.cljsdoc)
</pre>
