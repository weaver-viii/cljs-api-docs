## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pr-with-opts

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__pr-with-opts__ objs opts)<br>
</samp>

---




Source docstring:

```
Prints a sequence of objects using string-print, observing all
the options given in opts
```

Source code:

```clj
(defn pr-with-opts
  [objs opts]
  (let [first-obj (first objs)]
    (doseq [obj objs]
      (when-not (identical? obj first-obj)
        (string-print " "))
      (doseq [string (pr-seq obj opts)]
        (string-print string)))))
```

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3074-3083](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L3074-L3083)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/pr-with-opts"]))
```

```clj
{:ns "cljs.core",
 :name "pr-with-opts",
 :signature ["[objs opts]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_pr-with-opts",
 :source {:code "(defn pr-with-opts\n  [objs opts]\n  (let [first-obj (first objs)]\n    (doseq [obj objs]\n      (when-not (identical? obj first-obj)\n        (string-print \" \"))\n      (doseq [string (pr-seq obj opts)]\n        (string-print string)))))",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3074 3083]},
 :full-name "cljs.core/pr-with-opts",
 :docstring "Prints a sequence of objects using string-print, observing all\nthe options given in opts"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_pr-with-opts.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_pr-with-opts.cljsdoc)
</pre>

