## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js->clj

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js->clj__ x)<br>
</samp>
 <samp>
(__js->clj__ x & opts)<br>
</samp>

---

Recursively transforms JavaScript arrays into ClojureScript vectors, and
JavaScript objects into ClojureScript maps.

With option `{:keywordize-keys true}` will convert object fields from strings to
keywords.

Note that `js->clj` is not optimized for speed and the [transit.cljs] library is
recommended for parsing large amounts of JSON data.

[transit.cljs]:http://swannodette.github.io/2014/07/26/transit--clojurescript/

---

Example:

Parse a JSON string:

```clj
(def json "{\"foo\": 1, \"bar\": 2, \"baz\": [1,2,3]}")
(def a (.parse js/JSON json))
;;=> #js {:foo 1, :bar 2, :baz #js [1 2 3]}
```

Convert JSON data `a` to ClojureScript data:

```clj
(js->clj a)
;;=> {"foo" 1, "bar" 2, "baz" [1 2 3]}

(js->clj a :keywordize-keys true)
;;=> {:foo 1, :bar 2, :baz [1 2 3]}
```

---

See Also:

[`cljs.core/clj->js`](cljs.core_clj-GTjs.md)<br>

---

Source docstring:

```
Recursively transforms JavaScript arrays into ClojureScript
vectors, and JavaScript objects into ClojureScript maps.  With
option ':keywordize-keys true' will convert object fields from
strings to keywords.
```

Source code:

```clj
(defn js->clj
  ([x] (js->clj x {:keywordize-keys false}))
  ([x & opts]
    (let [{:keys [keywordize-keys]} opts
          keyfn (if keywordize-keys keyword str)
          f (fn thisfn [x]
              (cond
                (satisfies? IEncodeClojure x)
                (-js->clj x (apply array-map opts))

                (seq? x)
                (doall (map thisfn x))

                (coll? x)
                (into (empty x) (map thisfn x))

                (array? x)
                (vec (map thisfn x))
                 
                (identical? (type x) js/Object)
                (into {} (for [k (js-keys x)]
                           [(keyfn k) (thisfn (aget x k))]))

                :else x))]
      (f x))))
```

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8662-8690](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L8662-L8690)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js->clj"]))
```

```clj
{:description "Recursively transforms JavaScript arrays into ClojureScript vectors, and\nJavaScript objects into ClojureScript maps.\n\nWith option `{:keywordize-keys true}` will convert object fields from strings to\nkeywords.\n\nNote that `js->clj` is not optimized for speed and the [transit.cljs] library is\nrecommended for parsing large amounts of JSON data.\n\n[transit.cljs]:http://swannodette.github.io/2014/07/26/transit--clojurescript/",
 :ns "cljs.core",
 :name "js->clj",
 :signature ["[x]" "[x & opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/clj->js"],
 :full-name-encode "cljs.core_js-GTclj",
 :source {:code "(defn js->clj\n  ([x] (js->clj x {:keywordize-keys false}))\n  ([x & opts]\n    (let [{:keys [keywordize-keys]} opts\n          keyfn (if keywordize-keys keyword str)\n          f (fn thisfn [x]\n              (cond\n                (satisfies? IEncodeClojure x)\n                (-js->clj x (apply array-map opts))\n\n                (seq? x)\n                (doall (map thisfn x))\n\n                (coll? x)\n                (into (empty x) (map thisfn x))\n\n                (array? x)\n                (vec (map thisfn x))\n                 \n                (identical? (type x) js/Object)\n                (into {} (for [k (js-keys x)]\n                           [(keyfn k) (thisfn (aget x k))]))\n\n                :else x))]\n      (f x))))",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8662 8690]},
 :examples [{:id "61d263",
             :content "Parse a JSON string:\n\n```clj\n(def json \"{\\\"foo\\\": 1, \\\"bar\\\": 2, \\\"baz\\\": [1,2,3]}\")\n(def a (.parse js/JSON json))\n;;=> #js {:foo 1, :bar 2, :baz #js [1 2 3]}\n```\n\nConvert JSON data `a` to ClojureScript data:\n\n```clj\n(js->clj a)\n;;=> {\"foo\" 1, \"bar\" 2, \"baz\" [1 2 3]}\n\n(js->clj a :keywordize-keys true)\n;;=> {:foo 1, :bar 2, :baz [1 2 3]}\n```"}],
 :full-name "cljs.core/js->clj",
 :docstring "Recursively transforms JavaScript arrays into ClojureScript\nvectors, and JavaScript objects into ClojureScript maps.  With\noption ':keywordize-keys true' will convert object fields from\nstrings to keywords."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-GTclj.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-GTclj.cljsdoc)
</pre>

