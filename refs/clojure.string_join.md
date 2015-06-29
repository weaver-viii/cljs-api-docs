## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/join

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/join</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/join)
</td>
</tr>
</table>

 <samp>
(__join__ coll)<br>
</samp>
 <samp>
(__join__ separator coll)<br>
</samp>

---

Returns a string of all elements in `coll`, as returned by `(seq coll)`,
separated by an optional separator.

---



Source docstring:

```
Returns a string of all elements in coll, as returned by (seq coll),
separated by an optional separator.
```

Source code:

```clj
(defn join
  ([coll]
   (loop [sb (StringBuffer.) coll (seq coll)]
     (if coll
       (recur (. sb (append (str (first coll)))) (next coll))
       (.toString sb))))
  ([separator coll]
   (loop [sb (StringBuffer.) coll (seq coll)]
     (if coll
       (do
         (. sb (append (str (first coll))))
         (let [coll (next coll)]
           (when-not (nil? coll)
             (. sb (append separator)))
           (recur sb coll)))
       (.toString sb)))))
```

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:49-66](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/clojure/string.cljs#L49-L66)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/join"]))
```

```clj
{:description "Returns a string of all elements in `coll`, as returned by `(seq coll)`,\nseparated by an optional separator.",
 :ns "clojure.string",
 :name "join",
 :signature ["[coll]" "[separator coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_join",
 :source {:code "(defn join\n  ([coll]\n   (loop [sb (StringBuffer.) coll (seq coll)]\n     (if coll\n       (recur (. sb (append (str (first coll)))) (next coll))\n       (.toString sb))))\n  ([separator coll]\n   (loop [sb (StringBuffer.) coll (seq coll)]\n     (if coll\n       (do\n         (. sb (append (str (first coll))))\n         (let [coll (next coll)]\n           (when-not (nil? coll)\n             (. sb (append separator)))\n           (recur sb coll)))\n       (.toString sb)))))",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/clojure/string.cljs",
          :lines [49 66]},
 :full-name "clojure.string/join",
 :clj-symbol "clojure.string/join",
 :docstring "Returns a string of all elements in coll, as returned by (seq coll),\nseparated by an optional separator."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_join.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_join.cljsdoc)
</pre>

