## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/extend-type

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/extend-type</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extend-type)
</td>
</tr>
</table>

 <samp>
(__extend-type__ tsym & impls)<br>
</samp>

---





Source code:

```clj
(defmacro extend-type [tsym & impls]
  (let [resolve #(let [ret (:name (cljs.analyzer/resolve-var (dissoc &env :locals) %))]
                   (assert ret (core/str "Can't resolve: " %))
                   ret)
        impl-map (loop [ret {} s impls]
                   (if (seq s)
                     (recur (assoc ret (first s) (take-while seq? (next s)))
                            (drop-while seq? (next s)))
                     ret))
        skip-flag (set (-> tsym meta :skip-protocol-flag))]
    (if (base-type tsym)
      (let [t (base-type tsym)
            assign-impls (fn [[p sigs]]
                           (warn-and-update-protocol p tsym &env)
                           (let [psym (resolve p)
                                 pfn-prefix (subs (core/str psym) 0 (clojure.core/inc (.indexOf (core/str psym) "/")))]
                             (cons `(aset ~psym ~t true)
                                   (map (fn [[f & meths :as form]]
                                          `(aset ~(symbol (core/str pfn-prefix f)) ~t ~(with-meta `(fn ~@meths) (meta form))))
                                        sigs))))]
        `(do ~@(mapcat assign-impls impl-map)))
      (let [t (resolve tsym)
            prototype-prefix (fn [sym]
                               `(.. ~tsym -prototype ~(to-property sym)))
            assign-impls (fn [[p sigs]]
                           (warn-and-update-protocol p t &env)
                           (let [psym (resolve p)
                                 pprefix (protocol-prefix psym)]
                             (if (= p 'Object)
                               (let [adapt-params (fn [[sig & body]]
                                                    (let [[tname & args] sig]
                                                      (list (vec args) (list* 'this-as (vary-meta tname assoc :tag t) body))))]
                                 (map (fn [[f & meths :as form]]
                                        `(set! ~(prototype-prefix f)
                                               ~(with-meta `(fn ~@(map adapt-params meths)) (meta form))))
                                      sigs))
                               (concat (when-not (skip-flag psym)
                                         [`(set! ~(prototype-prefix pprefix) true)])
                                       (mapcat (fn [[f & meths :as form]]
                                                 (if (= psym 'cljs.core/IFn)
                                                   (let [adapt-params (fn [[[targ & args :as sig] & body]]
                                                                        (let [this-sym (with-meta 'self__ {:tag t})]
                                                                          `(~(vec (cons this-sym args))
                                                                            (this-as ~this-sym
                                                                                     (let [~targ ~this-sym]
                                                                                       ~@body)))))
                                                         meths (map adapt-params meths)
                                                         this-sym (with-meta 'self__ {:tag t})
                                                         argsym (gensym "args")]
                                                     [`(set! ~(prototype-prefix 'call) ~(with-meta `(fn ~@meths) (meta form)))
                                                      `(set! ~(prototype-prefix 'apply)
                                                             ~(with-meta
                                                                `(fn ~[this-sym argsym]
                                                                   (.apply (.-call ~this-sym) ~this-sym
                                                                           (.concat (array ~this-sym) (aclone ~argsym))))
                                                                (meta form)))])
                                                   (let [pf (core/str pprefix f)
                                                         adapt-params (fn [[[targ & args :as sig] & body]]
                                                                        (cons (vec (cons (vary-meta targ assoc :tag t) args))
                                                                              body))]
                                                     (if (vector? (first meths))
                                                       [`(set! ~(prototype-prefix (core/str pf "$arity$" (count (first meths)))) ~(with-meta `(fn ~@(adapt-params meths)) (meta form)))]
                                                       (map (fn [[sig & body :as meth]]
                                                              `(set! ~(prototype-prefix (core/str pf "$arity$" (count sig)))
                                                                     ~(with-meta `(fn ~(adapt-params meth)) (meta form))))
                                                            meths)))))
                                               sigs)))))]
        `(do ~@(mapcat assign-impls impl-map))))))
```

 <pre>
clojurescript @ r1889
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:580-647](https://github.com/clojure/clojurescript/blob/r1889/src/clj/cljs/core.clj#L580-L647)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/extend-type"]))
```

```clj
{:ns "cljs.core",
 :name "extend-type",
 :signature ["[tsym & impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_extend-type",
 :source {:code "(defmacro extend-type [tsym & impls]\n  (let [resolve #(let [ret (:name (cljs.analyzer/resolve-var (dissoc &env :locals) %))]\n                   (assert ret (core/str \"Can't resolve: \" %))\n                   ret)\n        impl-map (loop [ret {} s impls]\n                   (if (seq s)\n                     (recur (assoc ret (first s) (take-while seq? (next s)))\n                            (drop-while seq? (next s)))\n                     ret))\n        skip-flag (set (-> tsym meta :skip-protocol-flag))]\n    (if (base-type tsym)\n      (let [t (base-type tsym)\n            assign-impls (fn [[p sigs]]\n                           (warn-and-update-protocol p tsym &env)\n                           (let [psym (resolve p)\n                                 pfn-prefix (subs (core/str psym) 0 (clojure.core/inc (.indexOf (core/str psym) \"/\")))]\n                             (cons `(aset ~psym ~t true)\n                                   (map (fn [[f & meths :as form]]\n                                          `(aset ~(symbol (core/str pfn-prefix f)) ~t ~(with-meta `(fn ~@meths) (meta form))))\n                                        sigs))))]\n        `(do ~@(mapcat assign-impls impl-map)))\n      (let [t (resolve tsym)\n            prototype-prefix (fn [sym]\n                               `(.. ~tsym -prototype ~(to-property sym)))\n            assign-impls (fn [[p sigs]]\n                           (warn-and-update-protocol p t &env)\n                           (let [psym (resolve p)\n                                 pprefix (protocol-prefix psym)]\n                             (if (= p 'Object)\n                               (let [adapt-params (fn [[sig & body]]\n                                                    (let [[tname & args] sig]\n                                                      (list (vec args) (list* 'this-as (vary-meta tname assoc :tag t) body))))]\n                                 (map (fn [[f & meths :as form]]\n                                        `(set! ~(prototype-prefix f)\n                                               ~(with-meta `(fn ~@(map adapt-params meths)) (meta form))))\n                                      sigs))\n                               (concat (when-not (skip-flag psym)\n                                         [`(set! ~(prototype-prefix pprefix) true)])\n                                       (mapcat (fn [[f & meths :as form]]\n                                                 (if (= psym 'cljs.core/IFn)\n                                                   (let [adapt-params (fn [[[targ & args :as sig] & body]]\n                                                                        (let [this-sym (with-meta 'self__ {:tag t})]\n                                                                          `(~(vec (cons this-sym args))\n                                                                            (this-as ~this-sym\n                                                                                     (let [~targ ~this-sym]\n                                                                                       ~@body)))))\n                                                         meths (map adapt-params meths)\n                                                         this-sym (with-meta 'self__ {:tag t})\n                                                         argsym (gensym \"args\")]\n                                                     [`(set! ~(prototype-prefix 'call) ~(with-meta `(fn ~@meths) (meta form)))\n                                                      `(set! ~(prototype-prefix 'apply)\n                                                             ~(with-meta\n                                                                `(fn ~[this-sym argsym]\n                                                                   (.apply (.-call ~this-sym) ~this-sym\n                                                                           (.concat (array ~this-sym) (aclone ~argsym))))\n                                                                (meta form)))])\n                                                   (let [pf (core/str pprefix f)\n                                                         adapt-params (fn [[[targ & args :as sig] & body]]\n                                                                        (cons (vec (cons (vary-meta targ assoc :tag t) args))\n                                                                              body))]\n                                                     (if (vector? (first meths))\n                                                       [`(set! ~(prototype-prefix (core/str pf \"$arity$\" (count (first meths)))) ~(with-meta `(fn ~@(adapt-params meths)) (meta form)))]\n                                                       (map (fn [[sig & body :as meth]]\n                                                              `(set! ~(prototype-prefix (core/str pf \"$arity$\" (count sig)))\n                                                                     ~(with-meta `(fn ~(adapt-params meth)) (meta form))))\n                                                            meths)))))\n                                               sigs)))))]\n        `(do ~@(mapcat assign-impls impl-map))))))",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/clj/cljs/core.clj",
          :lines [580 647]},
 :full-name "cljs.core/extend-type",
 :clj-symbol "clojure.core/extend-type"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_extend-type.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_extend-type.cljsdoc)
</pre>

