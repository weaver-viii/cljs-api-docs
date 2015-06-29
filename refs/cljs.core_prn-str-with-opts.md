## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/prn-str-with-opts

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1011"><img valign="middle" alt="[+] 0.0-1011" src="https://img.shields.io/badge/+-0.0--1011-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__prn-str-with-opts__ objs opts)<br>
</samp>

---




Source docstring:

```
Same as pr-str-with-opts followed by (newline)
```

Source code:

```clj
(defn prn-str-with-opts
  [objs opts]
  (if (empty? objs)
    "\n"
    (let [sb (pr-sb-with-opts objs opts)]
      (.append sb \newline)
      (str sb))))
```

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6699-6706](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L6699-L6706)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prn-str-with-opts"]))
```

```clj
{:ns "cljs.core",
 :name "prn-str-with-opts",
 :signature ["[objs opts]"],
 :history [["+" "0.0-1011"]],
 :type "function",
 :full-name-encode "cljs.core_prn-str-with-opts",
 :source {:code "(defn prn-str-with-opts\n  [objs opts]\n  (if (empty? objs)\n    \"\\n\"\n    (let [sb (pr-sb-with-opts objs opts)]\n      (.append sb \\newline)\n      (str sb))))",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6699 6706]},
 :full-name "cljs.core/prn-str-with-opts",
 :docstring "Same as pr-str-with-opts followed by (newline)"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_prn-str-with-opts.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_prn-str-with-opts.cljsdoc)
</pre>

