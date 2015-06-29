## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/memfn

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/memfn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/memfn)
</td>
</tr>
</table>

 <samp>
(__memfn__ name & args)<br>
</samp>

---




Source docstring:

```
Expands into code that creates a fn that expects to be passed an
object and any args and calls the named instance method on the
object passing the args. Use when you want to treat a Java method as
a first-class fn. name may be type-hinted with the method receiver's
type in order to avoid reflective calls.
```

Source code:

```clj
(defmacro memfn
  [name & args]
  (let [t (with-meta (gensym "target")
            (meta name))]
    `(fn [~t ~@args]
       (. ~t (~name ~@args)))))
```

 <pre>
clojure @ clojure-1.7.0-alpha6
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:3717-3728](https://github.com/clojure/clojure/blob/clojure-1.7.0-alpha6/src/clj/clojure/core.clj#L3717-L3728)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/memfn"]))
```

```clj
{:ns "cljs.core",
 :name "memfn",
 :signature ["[name & args]"],
 :history [["+" "0.0-1443"]],
 :type "macro",
 :full-name-encode "cljs.core_memfn",
 :source {:code "(defmacro memfn\n  [name & args]\n  (let [t (with-meta (gensym \"target\")\n            (meta name))]\n    `(fn [~t ~@args]\n       (. ~t (~name ~@args)))))",
          :repo "clojure",
          :tag "clojure-1.7.0-alpha6",
          :filename "src/clj/clojure/core.clj",
          :lines [3717 3728]},
 :full-name "cljs.core/memfn",
 :clj-symbol "clojure.core/memfn",
 :docstring "Expands into code that creates a fn that expects to be passed an\nobject and any args and calls the named instance method on the\nobject passing the args. Use when you want to treat a Java method as\na first-class fn. name may be type-hinted with the method receiver's\ntype in order to avoid reflective calls."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_memfn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_memfn.cljsdoc)
</pre>

