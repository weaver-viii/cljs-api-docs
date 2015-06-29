## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> specialrepl/require-macros

 <table border="1">
<tr>

<td>special form (repl)</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2657"><img valign="middle" alt="[+] 0.0-2657" src="https://img.shields.io/badge/+-0.0--2657-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__require-macros__ & args)<br>
</samp>

---

Only usable from a REPL.

This is a way for ClojureScript to load macros from Clojure files.
The usage is similar to the `require` form.

There is a nicer alternative if the Clojure macros file has the same name as a
ClojureScript file in the same directory, which is a common pattern.  In this
case, you can just use the `:include-macros` or `:refer-macros` flag of the
`require` form.

---

Example:

```clj
(require-macros '[cljs.core.async.macros :refer [go]])
```

---

See Also:

[`specialrepl/require`](specialrepl_require.md)<br>

---

Source docstring:

```
Similar to the require REPL special function but
 only for macros.
```

Source code:

```clj
(def default-special-fns
  (let [load-file-fn
        (fn self
          ([repl-env env form]
            (self repl-env env form nil))
          ([repl-env env [_ file :as form] opts]
            (load-file repl-env file opts)))
        in-ns-fn
        (fn self
          ([repl-env env form]
           (self repl-env env form nil))
          ([repl-env env [_ [quote ns-name] :as form] _]
            ;; guard against craziness like '5 which wreaks havoc
           (when-not (and (= quote 'quote) (symbol? ns-name))
             (throw (IllegalArgumentException. "Argument to in-ns must be a symbol.")))
           (when-not (ana/get-namespace ns-name)
             (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})
             (-evaluate repl-env "<cljs repl>" 1
               (str "goog.provide('" (comp/munge ns-name) "');")))
           (set! ana/*cljs-ns* ns-name)))]
    {'in-ns in-ns-fn
     'clojure.core/in-ns in-ns-fn
     'require
     (fn self
       ([repl-env env form]
        (self repl-env env form nil))
       ([repl-env env [_ & specs :as form] opts]
        (let [is-self-require? (self-require? specs)
              [target-ns restore-ns]
              (if-not is-self-require?
                [ana/*cljs-ns* nil]
                ['cljs.user ana/*cljs-ns*])]
          (evaluate-form repl-env env "<cljs repl>"
            (with-meta
              `(~'ns ~target-ns
                 (:require ~@(-> specs canonicalize-specs decorate-specs)))
              {:merge true :line 1 :column 1})
            identity opts)
          (when is-self-require?
            (set! ana/*cljs-ns* restore-ns)))))
     'require-macros
     (fn self
       ([repl-env env form]
        (self repl-env env form nil))
       ([repl-env env [_ & specs :as form] opts]
        (evaluate-form repl-env env "<cljs repl>"
          (with-meta
            `(~'ns ~ana/*cljs-ns*
               (:require-macros ~@(-> specs canonicalize-specs decorate-specs)))
            {:merge true :line 1 :column 1})
          identity opts)))
     'import
     (fn self
       ([repl-env env form]
        (self repl-env env form nil))
       ([repl-env env [_ & specs :as form] opts]
        (evaluate-form repl-env env "<cljs repl>"
          (with-meta
            `(~'ns ~ana/*cljs-ns*
               (:import
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
clojurescript @ r3208
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:602-677](https://github.com/clojure/clojurescript/blob/r3208/src/clj/cljs/repl.clj#L602-L677)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "specialrepl/require-macros"]))
```

```clj
{:description "Only usable from a REPL.\n\nThis is a way for ClojureScript to load macros from Clojure files.\nThe usage is similar to the `require` form.\n\nThere is a nicer alternative if the Clojure macros file has the same name as a\nClojureScript file in the same directory, which is a common pattern.  In this\ncase, you can just use the `:include-macros` or `:refer-macros` flag of the\n`require` form.",
 :ns "specialrepl",
 :name "require-macros",
 :signature ["[& args]"],
 :history [["+" "0.0-2657"]],
 :type "special form (repl)",
 :related ["specialrepl/require"],
 :full-name-encode "specialrepl_require-macros",
 :source {:code "(def default-special-fns\n  (let [load-file-fn\n        (fn self\n          ([repl-env env form]\n            (self repl-env env form nil))\n          ([repl-env env [_ file :as form] opts]\n            (load-file repl-env file opts)))\n        in-ns-fn\n        (fn self\n          ([repl-env env form]\n           (self repl-env env form nil))\n          ([repl-env env [_ [quote ns-name] :as form] _]\n            ;; guard against craziness like '5 which wreaks havoc\n           (when-not (and (= quote 'quote) (symbol? ns-name))\n             (throw (IllegalArgumentException. \"Argument to in-ns must be a symbol.\")))\n           (when-not (ana/get-namespace ns-name)\n             (swap! env/*compiler* assoc-in [::ana/namespaces ns-name] {:name ns-name})\n             (-evaluate repl-env \"<cljs repl>\" 1\n               (str \"goog.provide('\" (comp/munge ns-name) \"');\")))\n           (set! ana/*cljs-ns* ns-name)))]\n    {'in-ns in-ns-fn\n     'clojure.core/in-ns in-ns-fn\n     'require\n     (fn self\n       ([repl-env env form]\n        (self repl-env env form nil))\n       ([repl-env env [_ & specs :as form] opts]\n        (let [is-self-require? (self-require? specs)\n              [target-ns restore-ns]\n              (if-not is-self-require?\n                [ana/*cljs-ns* nil]\n                ['cljs.user ana/*cljs-ns*])]\n          (evaluate-form repl-env env \"<cljs repl>\"\n            (with-meta\n              `(~'ns ~target-ns\n                 (:require ~@(-> specs canonicalize-specs decorate-specs)))\n              {:merge true :line 1 :column 1})\n            identity opts)\n          (when is-self-require?\n            (set! ana/*cljs-ns* restore-ns)))))\n     'require-macros\n     (fn self\n       ([repl-env env form]\n        (self repl-env env form nil))\n       ([repl-env env [_ & specs :as form] opts]\n        (evaluate-form repl-env env \"<cljs repl>\"\n          (with-meta\n            `(~'ns ~ana/*cljs-ns*\n               (:require-macros ~@(-> specs canonicalize-specs decorate-specs)))\n            {:merge true :line 1 :column 1})\n          identity opts)))\n     'import\n     (fn self\n       ([repl-env env form]\n        (self repl-env env form nil))\n       ([repl-env env [_ & specs :as form] opts]\n        (evaluate-form repl-env env \"<cljs repl>\"\n          (with-meta\n            `(~'ns ~ana/*cljs-ns*\n               (:import\n                 ~@(map\n                     (fn [quoted-spec-or-kw]\n                       (if (keyword? quoted-spec-or-kw)\n                         quoted-spec-or-kw\n                         (second quoted-spec-or-kw)))\n                     specs)))\n            {:merge true :line 1 :column 1})\n          identity opts)))\n     'load-file load-file-fn\n     'clojure.core/load-file load-file-fn\n     'load-namespace\n     (fn self\n       ([repl-env env form]\n        (self env repl-env form nil))\n       ([repl-env env [_ ns :as form] opts]\n        (load-namespace repl-env ns opts)))}))",
          :repo "clojurescript",
          :tag "r3208",
          :filename "src/clj/cljs/repl.clj",
          :lines [602 677]},
 :examples [{:id "e34cf4",
             :content "```clj\n(require-macros '[cljs.core.async.macros :refer [go]])\n```"}],
 :full-name "specialrepl/require-macros",
 :docstring "Similar to the require REPL special function but\n only for macros."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/specialrepl_require-macros.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/specialrepl_require-macros.cljsdoc)
</pre>

