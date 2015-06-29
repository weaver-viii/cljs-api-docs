## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Delay

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Delay</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Delay.java)
</td>
</tr>
</table>

 <samp>
(__Delay.__ state f)<br>
</samp>

---





Source code:

```clj
(deftype Delay [state f]
  IDeref
  (-deref [_]
    (:value (swap! state (fn [{:keys [done] :as curr-state}]
                           (if done
                             curr-state,
                             {:done true :value (f)})))))

  IPending
  (-realized? [d]
    (:done @state)))
```

 <pre>
clojurescript @ r2027
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7039-7049](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/core.cljs#L7039-L7049)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Delay"]))
```

```clj
{:ns "cljs.core",
 :name "Delay",
 :signature ["[state f]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core_Delay",
 :source {:code "(deftype Delay [state f]\n  IDeref\n  (-deref [_]\n    (:value (swap! state (fn [{:keys [done] :as curr-state}]\n                           (if done\n                             curr-state,\n                             {:done true :value (f)})))))\n\n  IPending\n  (-realized? [d]\n    (:done @state)))",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7039 7049]},
 :full-name "cljs.core/Delay",
 :clj-symbol "clojure.lang/Delay"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Delay.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Delay.cljsdoc)
</pre>

