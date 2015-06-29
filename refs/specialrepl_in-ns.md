## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> specialrepl/in-ns

 <table border="1">
<tr>

<td>special form (repl)</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/in-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/in-ns)
</td>
</tr>
</table>

 <samp>
(__in-ns__ name)<br>
</samp>

---

Only usable from a REPL.

Changes to the namespace `name`, creating it if needed.

Sets `*cljs-ns*` to the namespace `name`.

---

Example:

```clj
(in-ns 'foo.core)
```

---



Source code:

```clj
(def default-special-fns
  (let [load-file-fn
        (fn self
          ([repl-env env form]
            (self repl-env env form nil))
          ([repl-env env [_ file :as form] opts]
            (load-file repl-env file opts)))]
    {'in-ns
     (fn self
       ([repl-env env form]
         (self repl-env env form nil))
       ([repl-env env [_ [quote ns-name] :as form] _]
         (when-not (ana/get-namespace ns-name)
           (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})
           (-evaluate repl-env "<cljs repl>" 1
             (str "goog.provide('" (comp/munge ns-name) "');")))
         (set! ana/*cljs-ns* ns-name)))
     'require
     (fn self
       ([repl-env env form]
         (self repl-env env form nil))
       ([repl-env env [_ & specs :as form] opts]
         (evaluate-form repl-env env "<cljs repl>"
           (with-meta
             `(~'ns ~ana/*cljs-ns*
                (:require
                  ~@(map
                      (fn [quoted-spec-or-kw]
                        (if (keyword? quoted-spec-or-kw)
                          quoted-spec-or-kw
                          (second quoted-spec-or-kw)))
                      specs)))
             {:merge true :line 1 :column 1})
           identity opts)))
     'load-file load-file-fn
     'clojure.core/load-file load-file-fn
     'load-namespace
     (fn self
       ([repl-env env form]
         (self env repl-env form nil))
       ([repl-env env [_ ns :as form] opts]
         (load-namespace repl-env ns opts)))}))
```

 <pre>
clojurescript @ r2655
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:190-231](https://github.com/clojure/clojurescript/blob/r2655/src/clj/cljs/repl.clj#L190-L231)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "specialrepl/in-ns"]))
```

```clj
{:description "Only usable from a REPL.\n\nChanges to the namespace `name`, creating it if needed.\n\nSets `*cljs-ns*` to the namespace `name`.",
 :ns "specialrepl",
 :name "in-ns",
 :signature ["[name]"],
 :history [["+" "0.0-927"]],
 :type "special form (repl)",
 :full-name-encode "specialrepl_in-ns",
 :source {:code "(def default-special-fns\n  (let [load-file-fn\n        (fn self\n          ([repl-env env form]\n            (self repl-env env form nil))\n          ([repl-env env [_ file :as form] opts]\n            (load-file repl-env file opts)))]\n    {'in-ns\n     (fn self\n       ([repl-env env form]\n         (self repl-env env form nil))\n       ([repl-env env [_ [quote ns-name] :as form] _]\n         (when-not (ana/get-namespace ns-name)\n           (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})\n           (-evaluate repl-env \"<cljs repl>\" 1\n             (str \"goog.provide('\" (comp/munge ns-name) \"');\")))\n         (set! ana/*cljs-ns* ns-name)))\n     'require\n     (fn self\n       ([repl-env env form]\n         (self repl-env env form nil))\n       ([repl-env env [_ & specs :as form] opts]\n         (evaluate-form repl-env env \"<cljs repl>\"\n           (with-meta\n             `(~'ns ~ana/*cljs-ns*\n                (:require\n                  ~@(map\n                      (fn [quoted-spec-or-kw]\n                        (if (keyword? quoted-spec-or-kw)\n                          quoted-spec-or-kw\n                          (second quoted-spec-or-kw)))\n                      specs)))\n             {:merge true :line 1 :column 1})\n           identity opts)))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace\n     (fn self\n       ([repl-env env form]\n         (self env repl-env form nil))\n       ([repl-env env [_ ns :as form] opts]\n         (load-namespace repl-env ns opts)))}))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/clj/cljs/repl.clj",
          :lines [190 231]},
 :examples [{:id "e81eb3", :content "```clj\n(in-ns 'foo.core)\n```"}],
 :full-name "specialrepl/in-ns",
 :clj-symbol "clojure.core/in-ns"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/specialrepl_in-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/specialrepl_in-ns.cljsdoc)
</pre>

