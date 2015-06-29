## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/make-hierarchy

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/make-hierarchy</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/make-hierarchy)
</td>
</tr>
</table>

 <samp>
(__make-hierarchy__)<br>
</samp>

---




Source docstring:

```
Creates a hierarchy object for use with derive, isa? etc.
```

Source code:

```clj
(defn make-hierarchy
  [] {:parents {} :descendants {} :ancestors {}})
```

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7189-7191](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L7189-L7191)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/make-hierarchy"]))
```

```clj
{:ns "cljs.core",
 :name "make-hierarchy",
 :signature ["[]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_make-hierarchy",
 :source {:code "(defn make-hierarchy\n  [] {:parents {} :descendants {} :ancestors {}})",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7189 7191]},
 :full-name "cljs.core/make-hierarchy",
 :clj-symbol "clojure.core/make-hierarchy",
 :docstring "Creates a hierarchy object for use with derive, isa? etc."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_make-hierarchy.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_make-hierarchy.cljsdoc)
</pre>

