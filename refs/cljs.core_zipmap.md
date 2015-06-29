## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/zipmap

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/zipmap</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/zipmap)
</td>
</tr>
</table>

 <samp>
(__zipmap__ keys vals)<br>
</samp>

---

Returns a map with `keys` mapped to corresponding `vals`.

<pre>user=> (zipmap [:a :b :c :d] [1 2 3 4])
{:a 1, :b 2, :c 3, :d 4}</pre>

---


See Also:

[`cljs.core/interleave`](cljs.core_interleave.md)<br>

---

Source docstring:

```
Returns a map with the keys mapped to the corresponding vals.
```

Source code:

```clj
(defn zipmap
  [keys vals]
    (loop [map {}
           ks (seq keys)
           vs (seq vals)]
      (if (and ks vs)
        (recur (assoc map (first ks) (first vs))
               (next ks)
               (next vs))
        map)))
```

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5760-5770](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L5760-L5770)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/zipmap"]))
```

```clj
{:description "Returns a map with `keys` mapped to corresponding `vals`.\n\n<pre>user=> (zipmap [:a :b :c :d] [1 2 3 4])\n{:a 1, :b 2, :c 3, :d 4}</pre>",
 :ns "cljs.core",
 :name "zipmap",
 :signature ["[keys vals]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/interleave"],
 :full-name-encode "cljs.core_zipmap",
 :source {:code "(defn zipmap\n  [keys vals]\n    (loop [map {}\n           ks (seq keys)\n           vs (seq vals)]\n      (if (and ks vs)\n        (recur (assoc map (first ks) (first vs))\n               (next ks)\n               (next vs))\n        map)))",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5760 5770]},
 :full-name "cljs.core/zipmap",
 :clj-symbol "clojure.core/zipmap",
 :docstring "Returns a map with the keys mapped to the corresponding vals."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_zipmap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_zipmap.cljsdoc)
</pre>

