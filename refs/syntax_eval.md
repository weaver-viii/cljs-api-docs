## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/eval

 <table border="1">
<tr>
<td><samp>#=</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L113)
</td>
</tr>
</table>






Source code:

```clj
(defn- dispatch-macros [ch]
  (case ch
    \^ read-meta                ;deprecated
    \' (wrapping-reader 'var)
    \( read-fn
    \= read-eval
    \{ read-set
    \< (throwing-reader "Unreadable form")
    \" read-regex
    \! read-comment
    \_ read-discard
    nil))
```

 <pre>
tools.reader @ tools.reader-0.7.6
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:564-575](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader.clj#L564-L575)</ins>
</pre>


---

```clj
(defn- read-eval
  [rdr _]
  (when-not *read-eval*
    (reader-error rdr "#= not allowed when *read-eval* is false"))
  (let [o (read rdr true nil true)]
    (if (symbol? o)
      (RT/classForName (str ^Symbol o))
      (if (list? o)
        (let [fs (first o)
              o (rest o)
              fs-name (name fs)]
          (cond
           (= fs 'var) (let [vs (first o)]
                         (RT/var (namespace vs) (name vs)))
           (.endsWith fs-name ".")
           (let [args (to-array o)]
             (-> fs-name (subs 0 (dec (count fs-name)))
                 RT/classForName (Reflector/invokeConstructor args)))

           (Compiler/namesStaticMember fs)
           (let [args (to-array o)]
             (Reflector/invokeStaticMethod (namespace fs) fs-name args))

           :else
           (let [v (Compiler/maybeResolveIn *ns* fs)]
             (if (var? v)
               (apply v o)
               (reader-error rdr "Can't resolve " fs)))))
        (throw (IllegalArgumentException. "Unsupported #= form"))))))
```

 <pre>
tools.reader @ tools.reader-0.7.6
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:377-405](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader.clj#L377-L405)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/eval"]))
```

```clj
{:ns "syntax",
 :name "eval",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :full-name-encode "syntax_eval",
 :source {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.7.6",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [564 575]},
 :extra-sources [{:code "(defn- read-eval\n  [rdr _]\n  (when-not *read-eval*\n    (reader-error rdr \"#= not allowed when *read-eval* is false\"))\n  (let [o (read rdr true nil true)]\n    (if (symbol? o)\n      (RT/classForName (str ^Symbol o))\n      (if (list? o)\n        (let [fs (first o)\n              o (rest o)\n              fs-name (name fs)]\n          (cond\n           (= fs 'var) (let [vs (first o)]\n                         (RT/var (namespace vs) (name vs)))\n           (.endsWith fs-name \".\")\n           (let [args (to-array o)]\n             (-> fs-name (subs 0 (dec (count fs-name)))\n                 RT/classForName (Reflector/invokeConstructor args)))\n\n           (Compiler/namesStaticMember fs)\n           (let [args (to-array o)]\n             (Reflector/invokeStaticMethod (namespace fs) fs-name args))\n\n           :else\n           (let [v (Compiler/maybeResolveIn *ns* fs)]\n             (if (var? v)\n               (apply v o)\n               (reader-error rdr \"Can't resolve \" fs)))))\n        (throw (IllegalArgumentException. \"Unsupported #= form\"))))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.6",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [377 405]}],
 :syntax-form "#=",
 :full-name "syntax/eval",
 :clj-doc "https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java#L113"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_eval.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_eval.cljsdoc)
</pre>

