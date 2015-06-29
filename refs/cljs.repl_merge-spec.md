## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.repl/merge-spec~~

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2655"><img valign="middle" alt="[×] 0.0-2655" src="https://img.shields.io/badge/×-0.0--2655-red.svg"></a> </td>
</tr>
</table>

 <samp>
(__merge-spec__ \[lib & {:as aindex}\] \[_ & {:as bindex}\])<br>
</samp>

---





Source code:

```clj
(defn merge-spec [[lib & {:as aindex}] [_ & {:as bindex}]]
  (let [merged-map
        (merge-with
          (fn [x y]
            (if (vector? x)
              (vec (distinct (into x y)))
              y))
          aindex bindex)]
    (apply vector lib
      (apply concat
        (sort
          (fn [[sa] [sb]]
            (compare (spec-sort sa) (spec-sort sb)))
          merged-map)))))
```

 <pre>
clojurescript @ r2644
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:196-209](https://github.com/clojure/clojurescript/blob/r2644/src/clj/cljs/repl.clj#L196-L209)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/merge-spec"]))
```

```clj
{:ns "cljs.repl",
 :name "merge-spec",
 :signature ["[[lib & {:as aindex}] [_ & {:as bindex}]]"],
 :history [["+" "0.0-2629"] ["-" "0.0-2655"]],
 :type "function",
 :full-name-encode "cljs.repl_merge-spec",
 :source {:code "(defn merge-spec [[lib & {:as aindex}] [_ & {:as bindex}]]\n  (let [merged-map\n        (merge-with\n          (fn [x y]\n            (if (vector? x)\n              (vec (distinct (into x y)))\n              y))\n          aindex bindex)]\n    (apply vector lib\n      (apply concat\n        (sort\n          (fn [[sa] [sb]]\n            (compare (spec-sort sa) (spec-sort sb)))\n          merged-map)))))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/clj/cljs/repl.clj",
          :lines [196 209]},
 :full-name "cljs.repl/merge-spec",
 :removed {:in "0.0-2655", :last-seen "0.0-2644"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_merge-spec.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_merge-spec.cljsdoc)
</pre>

