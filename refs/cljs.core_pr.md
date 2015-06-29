## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pr</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pr)
</td>
</tr>
</table>

 <samp>
(__pr__ & objs)<br>
</samp>

---




Source docstring:

```
Prints the object(s) using string-print.  Prints the
object(s), separated by spaces if there is more than one.
By default, pr and prn print in a way that objects can be
read by the reader
```

Source code:

```clj
(defn pr
  [& objs]
  (pr-with-opts objs (pr-opts)))
```

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2925-2931](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L2925-L2931)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr"]))
```

```clj
{:ns "cljs.core",
 :name "pr",
 :signature ["[& objs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_pr",
 :source {:code "(defn pr\n  [& objs]\n  (pr-with-opts objs (pr-opts)))",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2925 2931]},
 :full-name "cljs.core/pr",
 :clj-symbol "clojure.core/pr",
 :docstring "Prints the object(s) using string-print.  Prints the\nobject(s), separated by spaces if there is more than one.\nBy default, pr and prn print in a way that objects can be\nread by the reader"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_pr.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_pr.cljsdoc)
</pre>

