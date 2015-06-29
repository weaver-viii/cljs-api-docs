## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-delete

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-delete__ obj key)<br>
</samp>

---

Deletes property `key` in JavaScript object `obj`.

Equivalent to `delete obj[key]` in JavaScript.

---

Example:

```clj
(def a #js {:foo 1 :bar 2})
(js-delete a "foo")

a
;;=> #js {:bar 2}
```

---

See Also:

[`cljs.core/dissoc`](cljs.core_dissoc.md)<br>

---


Source code:

```clj
(defn js-delete [obj key]
  (js* "delete ~{obj}[~{key}]"))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:796-797](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L796-L797)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-delete"]))
```

```clj
{:description "Deletes property `key` in JavaScript object `obj`.\n\nEquivalent to `delete obj[key]` in JavaScript.",
 :ns "cljs.core",
 :name "js-delete",
 :signature ["[obj key]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/dissoc"],
 :full-name-encode "cljs.core_js-delete",
 :source {:code "(defn js-delete [obj key]\n  (js* \"delete ~{obj}[~{key}]\"))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [796 797]},
 :examples [{:id "5b24ea",
             :content "```clj\n(def a #js {:foo 1 :bar 2})\n(js-delete a \"foo\")\n\na\n;;=> #js {:bar 2}\n```"}],
 :full-name "cljs.core/js-delete"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-delete.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-delete.cljsdoc)
</pre>
