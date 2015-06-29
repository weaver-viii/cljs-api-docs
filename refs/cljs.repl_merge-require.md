## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> ~~cljs.repl/merge-require~~

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2655"><img valign="middle" alt="[×] 0.0-2655" src="https://img.shields.io/badge/×-0.0--2655-red.svg"></a> </td>
</tr>
</table>

 <samp>
(__merge-require__ requires \[lib :as spec\])<br>
</samp>

---





Source code:

```clj
(defn merge-require [requires [lib :as spec]]
  (let [[before [match & after]]
        (split-with
          (fn [[lib' & _]]
            (not= lib lib'))
          requires)]
    (if (nil? match)
      ;; no match, append to end
      (concat requires [spec])
      (if (= match spec)
        ;; dupe
        requires
        ;; merge
        (concat before [(merge-spec match spec)] after)))))
```

 <pre>
clojurescript @ r2644
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:211-224](https://github.com/clojure/clojurescript/blob/r2644/src/clj/cljs/repl.clj#L211-L224)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/merge-require"]))
```

```clj
{:ns "cljs.repl",
 :name "merge-require",
 :signature ["[requires [lib :as spec]]"],
 :history [["+" "0.0-2629"] ["-" "0.0-2655"]],
 :type "function",
 :full-name-encode "cljs.repl_merge-require",
 :source {:code "(defn merge-require [requires [lib :as spec]]\n  (let [[before [match & after]]\n        (split-with\n          (fn [[lib' & _]]\n            (not= lib lib'))\n          requires)]\n    (if (nil? match)\n      ;; no match, append to end\n      (concat requires [spec])\n      (if (= match spec)\n        ;; dupe\n        requires\n        ;; merge\n        (concat before [(merge-spec match spec)] after)))))",
          :repo "clojurescript",
          :tag "r2644",
          :filename "src/clj/cljs/repl.clj",
          :lines [211 224]},
 :full-name "cljs.repl/merge-require",
 :removed {:in "0.0-2655", :last-seen "0.0-2644"}}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_merge-require.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_merge-require.cljsdoc)
</pre>

