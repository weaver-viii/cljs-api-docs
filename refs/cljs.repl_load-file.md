## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/load-file

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__load-file__ repl-env f)<br>
</samp>

---





Source code:

```clj
(defn load-file
  [repl-env f]
  (binding [ana/*cljs-ns* 'cljs.user]
    (let [res (if (= \/ (first f)) f (io/resource f))]
      (assert res (str "Can't find " f " in classpath"))
      (load-stream repl-env f res))))
```

 <pre>
clojurescript @ r1909
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:107-112](https://github.com/clojure/clojurescript/blob/r1909/src/clj/cljs/repl.clj#L107-L112)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/load-file"]))
```

```clj
{:ns "cljs.repl",
 :name "load-file",
 :type "function",
 :signature ["[repl-env f]"],
 :source {:code "(defn load-file\n  [repl-env f]\n  (binding [ana/*cljs-ns* 'cljs.user]\n    (let [res (if (= \\/ (first f)) f (io/resource f))]\n      (assert res (str \"Can't find \" f \" in classpath\"))\n      (load-stream repl-env f res))))",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/clj/cljs/repl.clj",
          :lines [107 112]},
 :full-name "cljs.repl/load-file",
 :full-name-encode "cljs.repl_load-file",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_load-file.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_load-file.cljsdoc)
</pre>

