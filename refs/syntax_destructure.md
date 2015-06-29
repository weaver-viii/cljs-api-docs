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
  (core/let [bents (partition 2 bindings)
         pb (fn pb [bvec b v]
              (core/let [pvec
                     (fn [bvec b val]
                       (core/let [gvec (gensym "vec__")]
                         (core/loop [ret (-> bvec (conj gvec) (conj val))
                                     n 0
                                     bs b
                                     seen-rest? false]
                           (if (seq bs)
                             (core/let [firstb (first bs)]
                               (cond
                                 (= firstb '&) (recur (pb ret (second bs) (list `nthnext gvec n))
                                                      n
                                                      (nnext bs)
                                                      true)
                                 (= firstb :as) (pb ret (second bs) gvec)
                                 :else (if seen-rest?
                                         (throw (new Exception "Unsupported binding form, only :as can follow & parameter"))
                                         (recur (pb ret firstb  (list `nth gvec n nil))
                                                (core/inc n)
                                                (next bs)
                                                seen-rest?))))
                             ret))))
                     pmap
                     (fn [bvec b v]
                       (core/let [gmap (gensym "map__")
                                  defaults (:or b)]
                         (core/loop [ret (-> bvec (conj gmap) (conj v)
                                             (conj gmap) (conj `(if (seq? ~gmap) (apply hash-map ~gmap) ~gmap))
                                             ((fn [ret]
                                                (if (:as b)
                                                  (conj ret (:as b) gmap)
                                                  ret))))
                                     bes (reduce
                                          (fn [bes entry]
                                            (reduce #(assoc %1 %2 ((val entry) %2))
                                                    (dissoc bes (key entry))
                                                    ((key entry) bes)))
                                          (dissoc b :as :or)
                                          {:keys #(keyword (core/str %)), :strs core/str, :syms #(list `quote %)})]
                           (if (seq bes)
                             (core/let [bb (key (first bes))
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
                      :else (throw (new Exception (core/str "Unsupported binding form: " b))))))
         process-entry (fn [bvec b] (pb bvec (first b) (second b)))]
        (if (every? symbol? (map first bents))
          bindings
          (reduce process-entry [] bents))))
```

 <pre>
clojurescript @ r1503
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:54-113](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/core.clj#L54-L113)</ins>
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
 :source {:code "(defn destructure [bindings]\n  (core/let [bents (partition 2 bindings)\n         pb (fn pb [bvec b v]\n              (core/let [pvec\n                     (fn [bvec b val]\n                       (core/let [gvec (gensym \"vec__\")]\n                         (core/loop [ret (-> bvec (conj gvec) (conj val))\n                                     n 0\n                                     bs b\n                                     seen-rest? false]\n                           (if (seq bs)\n                             (core/let [firstb (first bs)]\n                               (cond\n                                 (= firstb '&) (recur (pb ret (second bs) (list `nthnext gvec n))\n                                                      n\n                                                      (nnext bs)\n                                                      true)\n                                 (= firstb :as) (pb ret (second bs) gvec)\n                                 :else (if seen-rest?\n                                         (throw (new Exception \"Unsupported binding form, only :as can follow & parameter\"))\n                                         (recur (pb ret firstb  (list `nth gvec n nil))\n                                                (core/inc n)\n                                                (next bs)\n                                                seen-rest?))))\n                             ret))))\n                     pmap\n                     (fn [bvec b v]\n                       (core/let [gmap (gensym \"map__\")\n                                  defaults (:or b)]\n                         (core/loop [ret (-> bvec (conj gmap) (conj v)\n                                             (conj gmap) (conj `(if (seq? ~gmap) (apply hash-map ~gmap) ~gmap))\n                                             ((fn [ret]\n                                                (if (:as b)\n                                                  (conj ret (:as b) gmap)\n                                                  ret))))\n                                     bes (reduce\n                                          (fn [bes entry]\n                                            (reduce #(assoc %1 %2 ((val entry) %2))\n                                                    (dissoc bes (key entry))\n                                                    ((key entry) bes)))\n                                          (dissoc b :as :or)\n                                          {:keys #(keyword (core/str %)), :strs core/str, :syms #(list `quote %)})]\n                           (if (seq bes)\n                             (core/let [bb (key (first bes))\n                                        bk (val (first bes))\n                                        has-default (contains? defaults bb)]\n                               (recur (pb ret bb (if has-default\n                                                   (list `get gmap bk (defaults bb))\n                                                   (list `get gmap bk)))\n                                      (next bes)))\n                             ret))))]\n                    (cond\n                      (symbol? b) (-> bvec (conj b) (conj v))\n                      (vector? b) (pvec bvec b v)\n                      (map? b) (pmap bvec b v)\n                      :else (throw (new Exception (core/str \"Unsupported binding form: \" b))))))\n         process-entry (fn [bvec b] (pb bvec (first b) (second b)))]\n        (if (every? symbol? (map first bents))\n          bindings\n          (reduce process-entry [] bents))))",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/clj/cljs/core.clj",
          :lines [54 113]},
 :syntax-form [":keys" ":syms" ":strs" ":or" ":as" "&"],
 :full-name "syntax/destructure",
 :clj-doc "http://clojure.org/special_forms#toc18"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_destructure.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_destructure.cljsdoc)
</pre>

