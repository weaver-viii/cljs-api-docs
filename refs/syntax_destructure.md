## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/destructure

 <table border="1">
<tr>
<td><samp>:keys</samp></td><td><samp>:syms</samp></td><td><samp>:strs</samp></td><td><samp>:or</samp></td><td><samp>:as</samp></td><td><samp>&</samp></td>
<td>binding</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/special_forms#toc18)
</td>
</tr>
</table>






Source code:

```clj
(defn destructure [bindings]
  (let [bents (partition 2 bindings)
        pb (fn pb [bvec b v]
               (let [pvec
                     (fn [bvec b val]
                       (let [gvec (gensym "vec__")]
                         (loop [ret (-> bvec (conj gvec) (conj val))
                                n 0
                                bs b
                                seen-rest? false]
                           (if (seq bs)
                             (let [firstb (first bs)]
                               (cond
                                (= firstb '&) (recur (pb ret (second bs) (list `nthnext gvec n))
                                                     n
                                                     (nnext bs)
                                                     true)
                                (= firstb :as) (pb ret (second bs) gvec)
                                :else (if seen-rest?
                                        (throw (new Exception "Unsupported binding form, only :as can follow & parameter"))
                                        (recur (pb ret firstb  (list `nth gvec n nil))
                                               (inc n)
                                               (next bs)
                                               seen-rest?))))
                             ret))))
                     pmap
                     (fn [bvec b v]
                       (let [gmap (or (:as b) (gensym "map__"))
                             defaults (:or b)]
                         (loop [ret (-> bvec (conj gmap) (conj v)
                                        (conj gmap) (conj `(if (seq? ~gmap) (apply hash-map ~gmap) ~gmap)))
                                bes (reduce1
                                     (fn [bes entry]
                                       (reduce1 #(assoc %1 %2 ((val entry) %2))
                                               (dissoc bes (key entry))
                                               ((key entry) bes)))
                                     (dissoc b :as :or)
                                     {:keys #(keyword (str %)), :strs str, :syms #(list `quote %)})]
                           (if (seq bes)
                             (let [bb (key (first bes))
                                   bk (val (first bes))
                                   has-default (contains? defaults bb)]
                               (recur (pb ret bb (if has-default
                                                   (list `get gmap bk (defaults bb))
                                                   (list `get gmap bk)))
                                      (next bes)))
                             ret))))]
                 (cond
                  (symbol? b) (-> bvec (conj b) (conj v))
                  (vector? b) (pvec bvec b v)
                  (map? b) (pmap bvec b v)
                  :else (throw (new Exception (str "Unsupported binding form: " b))))))
        process-entry (fn [bvec b] (pb bvec (first b) (second b)))]
    (if (every? symbol? (map first bents))
      bindings
      (reduce1 process-entry [] bents))))
```

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:3896-3951](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L3896-L3951)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/destructure"]))
```

```clj
{:ns "syntax",
 :name "destructure",
 :history [["+" "0.0-927"]],
 :type "binding",
 :full-name-encode "syntax_destructure",
 :source {:code "(defn destructure [bindings]\n  (let [bents (partition 2 bindings)\n        pb (fn pb [bvec b v]\n               (let [pvec\n                     (fn [bvec b val]\n                       (let [gvec (gensym \"vec__\")]\n                         (loop [ret (-> bvec (conj gvec) (conj val))\n                                n 0\n                                bs b\n                                seen-rest? false]\n                           (if (seq bs)\n                             (let [firstb (first bs)]\n                               (cond\n                                (= firstb '&) (recur (pb ret (second bs) (list `nthnext gvec n))\n                                                     n\n                                                     (nnext bs)\n                                                     true)\n                                (= firstb :as) (pb ret (second bs) gvec)\n                                :else (if seen-rest?\n                                        (throw (new Exception \"Unsupported binding form, only :as can follow & parameter\"))\n                                        (recur (pb ret firstb  (list `nth gvec n nil))\n                                               (inc n)\n                                               (next bs)\n                                               seen-rest?))))\n                             ret))))\n                     pmap\n                     (fn [bvec b v]\n                       (let [gmap (or (:as b) (gensym \"map__\"))\n                             defaults (:or b)]\n                         (loop [ret (-> bvec (conj gmap) (conj v)\n                                        (conj gmap) (conj `(if (seq? ~gmap) (apply hash-map ~gmap) ~gmap)))\n                                bes (reduce1\n                                     (fn [bes entry]\n                                       (reduce1 #(assoc %1 %2 ((val entry) %2))\n                                               (dissoc bes (key entry))\n                                               ((key entry) bes)))\n                                     (dissoc b :as :or)\n                                     {:keys #(keyword (str %)), :strs str, :syms #(list `quote %)})]\n                           (if (seq bes)\n                             (let [bb (key (first bes))\n                                   bk (val (first bes))\n                                   has-default (contains? defaults bb)]\n                               (recur (pb ret bb (if has-default\n                                                   (list `get gmap bk (defaults bb))\n                                                   (list `get gmap bk)))\n                                      (next bes)))\n                             ret))))]\n                 (cond\n                  (symbol? b) (-> bvec (conj b) (conj v))\n                  (vector? b) (pvec bvec b v)\n                  (map? b) (pmap bvec b v)\n                  :else (throw (new Exception (str \"Unsupported binding form: \" b))))))\n        process-entry (fn [bvec b] (pb bvec (first b) (second b)))]\n    (if (every? symbol? (map first bents))\n      bindings\n      (reduce1 process-entry [] bents))))",
          :repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/clj/clojure/core.clj",
          :lines [3896 3951]},
 :syntax-form [":keys" ":syms" ":strs" ":or" ":as" "&"],
 :full-name "syntax/destructure",
 :clj-doc "http://clojure.org/special_forms#toc18"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_destructure.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_destructure.cljsdoc)
</pre>

