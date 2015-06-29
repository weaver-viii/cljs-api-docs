## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/join

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/join</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/join)
</td>
</tr>
</table>

 <samp>
(__join__ xrel yrel)<br>
</samp>
 <samp>
(__join__ xrel yrel km)<br>
</samp>

---




Source docstring:

```
When passed 2 rels, returns the rel corresponding to the natural
join. When passed an additional keymap, joins on the corresponding
keys.
```

Source code:

```clj
(defn join
  ([xrel yrel] ;natural join
   (if (and (seq xrel) (seq yrel))
     (let [ks (intersection (set (keys (first xrel))) (set (keys (first yrel))))
           [r s] (if (<= (count xrel) (count yrel))
                   [xrel yrel]
                   [yrel xrel])
           idx (index r ks)]
       (reduce (fn [ret x]
                 (let [found (idx (select-keys x ks))]
                   (if found
                     (reduce #(conj %1 (merge %2 x)) ret found)
                     ret)))
               #{} s))
     #{}))
  ([xrel yrel km] ;arbitrary key mapping
   (let [[r s k] (if (<= (count xrel) (count yrel))
                   [xrel yrel (map-invert km)]
                   [yrel xrel km])
         idx (index r (vals k))]
     (reduce (fn [ret x]
               (let [found (idx (rename-keys (select-keys x (keys k)) k))]
                 (if found
                   (reduce #(conj %1 (merge %2 x)) ret found)
                   ret)))
             #{} s))))
```

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:101-129](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/clojure/set.cljs#L101-L129)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/join"]))
```

```clj
{:ns "clojure.set",
 :name "join",
 :signature ["[xrel yrel]" "[xrel yrel km]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_join",
 :source {:code "(defn join\n  ([xrel yrel] ;natural join\n   (if (and (seq xrel) (seq yrel))\n     (let [ks (intersection (set (keys (first xrel))) (set (keys (first yrel))))\n           [r s] (if (<= (count xrel) (count yrel))\n                   [xrel yrel]\n                   [yrel xrel])\n           idx (index r ks)]\n       (reduce (fn [ret x]\n                 (let [found (idx (select-keys x ks))]\n                   (if found\n                     (reduce #(conj %1 (merge %2 x)) ret found)\n                     ret)))\n               #{} s))\n     #{}))\n  ([xrel yrel km] ;arbitrary key mapping\n   (let [[r s k] (if (<= (count xrel) (count yrel))\n                   [xrel yrel (map-invert km)]\n                   [yrel xrel km])\n         idx (index r (vals k))]\n     (reduce (fn [ret x]\n               (let [found (idx (rename-keys (select-keys x (keys k)) k))]\n                 (if found\n                   (reduce #(conj %1 (merge %2 x)) ret found)\n                   ret)))\n             #{} s))))",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/clojure/set.cljs",
          :lines [101 129]},
 :full-name "clojure.set/join",
 :clj-symbol "clojure.set/join",
 :docstring "When passed 2 rels, returns the rel corresponding to the natural\njoin. When passed an additional keymap, joins on the corresponding\nkeys."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.set_join.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set_join.cljsdoc)
</pre>

