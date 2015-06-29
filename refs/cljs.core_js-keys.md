## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-keys

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-keys__ obj)<br>
</samp>

---

Returns the keys for the JavaScript object `obj`.

---

Example:

```clj
(js-keys #js {:foo 1 :bar 2})
;;=> #js ["foo" "bar"]
```

---

See Also:

[`cljs.core/keys`](cljs.core_keys.md)<br>

---


Source code:

```clj
(defn js-keys [obj]
  (let [keys (array)]
    (goog.object/forEach obj (fn [val key obj] (.push keys key)))
    keys))
```

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1490-1493](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L1490-L1493)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-keys"]))
```

```clj
{:description "Returns the keys for the JavaScript object `obj`.",
 :ns "cljs.core",
 :name "js-keys",
 :signature ["[obj]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/keys"],
 :full-name-encode "cljs.core_js-keys",
 :source {:code "(defn js-keys [obj]\n  (let [keys (array)]\n    (goog.object/forEach obj (fn [val key obj] (.push keys key)))\n    keys))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1490 1493]},
 :examples [{:id "5dd933",
             :content "```clj\n(js-keys #js {:foo 1 :bar 2})\n;;=> #js [\"foo\" \"bar\"]\n```"}],
 :full-name "cljs.core/js-keys"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-keys.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-keys.cljsdoc)
</pre>

