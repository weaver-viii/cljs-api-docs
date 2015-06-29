## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-str-with-opts

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-str-with-opts__ objs opts)<br>
</samp>

---




Source docstring:

```
Prints a sequence of objects to a string, observing all the
options given in opts
```

Source code:

```clj
(defn pr-str-with-opts
  [objs opts]
  (if (empty? objs)
    ""
    (str (pr-sb-with-opts objs opts))))
```

 <pre>
clojurescript @ r2913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8253-8259](https://github.com/clojure/clojurescript/blob/r2913/src/cljs/cljs/core.cljs#L8253-L8259)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-str-with-opts"]))
```

```clj
{:ns "cljs.core",
 :name "pr-str-with-opts",
 :signature ["[objs opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_pr-str-with-opts",
 :source {:code "(defn pr-str-with-opts\n  [objs opts]\n  (if (empty? objs)\n    \"\"\n    (str (pr-sb-with-opts objs opts))))",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8253 8259]},
 :full-name "cljs.core/pr-str-with-opts",
 :docstring "Prints a sequence of objects to a string, observing all the\noptions given in opts"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_pr-str-with-opts.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_pr-str-with-opts.cljsdoc)
</pre>

