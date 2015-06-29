## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-in

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-in__ key obj)<br>
</samp>

---

Determines if property `key` is in JavaScript object `obj`.

Equivalent to `key in obj` in JavaScript.

---

Example:

```clj
(def a #js {:foo 1 :bar 2})

(js-in "foo" a)
;;=> true

(js-in "hello" a)
;;=> false
```

Properties inherited from prototype chain are also detected:

```clj
(js-in "toString" a)
;;=> true
```

---

See Also:

[`cljs.core/contains?`](cljs.core_containsQMARK.md)<br>

---


Source code:

```clj
(defmacro js-in [key obj]
  (core/list 'js* "~{} in ~{}" key obj))
```

 <pre>
clojurescript @ r3149
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:306-307](https://github.com/clojure/clojurescript/blob/r3149/src/clj/cljs/core.clj#L306-L307)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-in"]))
```

```clj
{:description "Determines if property `key` is in JavaScript object `obj`.\n\nEquivalent to `key in obj` in JavaScript.",
 :ns "cljs.core",
 :name "js-in",
 :signature ["[key obj]"],
 :history [["+" "0.0-2411"]],
 :type "macro",
 :related ["cljs.core/contains?"],
 :full-name-encode "cljs.core_js-in",
 :source {:code "(defmacro js-in [key obj]\n  (core/list 'js* \"~{} in ~{}\" key obj))",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/clj/cljs/core.clj",
          :lines [306 307]},
 :examples [{:id "a45b18",
             :content "```clj\n(def a #js {:foo 1 :bar 2})\n\n(js-in \"foo\" a)\n;;=> true\n\n(js-in \"hello\" a)\n;;=> false\n```\n\nProperties inherited from prototype chain are also detected:\n\n```clj\n(js-in \"toString\" a)\n;;=> true\n```"}],
 :full-name "cljs.core/js-in"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-in.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-in.cljsdoc)
</pre>

