## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/descendants

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/descendants</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/descendants)
</td>
</tr>
</table>

 <samp>
(__descendants__ tag)<br>
</samp>
 <samp>
(__descendants__ h tag)<br>
</samp>

---




Source docstring:

```
Returns the immediate and indirect children of tag, through a
relationship established via derive. h must be a hierarchy obtained
from make-hierarchy, if not supplied defaults to the global
hierarchy. Note: does not work on JavaScript type inheritance
relationships.
```

Source code:

```clj
(defn descendants
  ([tag] (descendants @(get-global-hierarchy) tag))
  ([h tag] (not-empty (get (:descendants h) tag))))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:9148-9155](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L9148-L9155)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/descendants"]))
```

```clj
{:ns "cljs.core",
 :name "descendants",
 :signature ["[tag]" "[h tag]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_descendants",
 :source {:code "(defn descendants\n  ([tag] (descendants @(get-global-hierarchy) tag))\n  ([h tag] (not-empty (get (:descendants h) tag))))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [9148 9155]},
 :full-name "cljs.core/descendants",
 :clj-symbol "clojure.core/descendants",
 :docstring "Returns the immediate and indirect children of tag, through a\nrelationship established via derive. h must be a hierarchy obtained\nfrom make-hierarchy, if not supplied defaults to the global\nhierarchy. Note: does not work on JavaScript type inheritance\nrelationships."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_descendants.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_descendants.cljsdoc)
</pre>

