## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-str

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2341"><img valign="middle" alt="[+] 0.0-2341" src="https://img.shields.io/badge/+-0.0--2341-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-str__ s)<br>
</samp>

---

Convert `s` to string using JavaScript's coercion behavior.

Equivalent to `''+s` in JavaScript.

---

Example:

```clj
(js-str 23)
;;=> "23"

(js-str #js {:foo 1})
;;=> "[Object object]"
```

---

See Also:

[`cljs.core/str`](cljs.core_str.md)<br>

---


Source code:

```clj
(defmacro js-str [s]
  (core/list 'js* "''+~{}" s))
```

 <pre>
clojurescript @ r2850
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1667-1668](https://github.com/clojure/clojurescript/blob/r2850/src/clj/cljs/core.clj#L1667-L1668)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-str"]))
```

```clj
{:description "Convert `s` to string using JavaScript's coercion behavior.\n\nEquivalent to `''+s` in JavaScript.",
 :ns "cljs.core",
 :name "js-str",
 :signature ["[s]"],
 :history [["+" "0.0-2341"]],
 :type "macro",
 :related ["cljs.core/str"],
 :full-name-encode "cljs.core_js-str",
 :source {:code "(defmacro js-str [s]\n  (core/list 'js* \"''+~{}\" s))",
          :repo "clojurescript",
          :tag "r2850",
          :filename "src/clj/cljs/core.clj",
          :lines [1667 1668]},
 :examples [{:id "e92009",
             :content "```clj\n(js-str 23)\n;;=> \"23\"\n\n(js-str #js {:foo 1})\n;;=> \"[Object object]\"\n```"}],
 :full-name "cljs.core/js-str"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-str.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-str.cljsdoc)
</pre>

