## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/js-literal

 <table border="1">
<tr>
<td><samp>#js {}</samp></td><td><samp>#js \[\]</samp></td>
<td>tagged literal</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2120"><img valign="middle" alt="[+] 0.0-2120" src="https://img.shields.io/badge/+-0.0--2120-lightgrey.svg"></a> </td>
</tr>
</table>


Create a literal JavaScript object or array.  Data in the form of a map `{}` or
vector `[]` must follow the `#js` tag, which will be converted at compile-time
to a JavaScript object or array, respectively.

This will not implicitly convert nested data into JavaScript objects or arrays.

---

Example:

```clj
#js {:foo 1 bar 2}
;;=> #js {:foo 1, :bar 2}

#js [1 2 3]
;;=> #js [1 2 3]
```

For readability, it is sometimes preferable to use `clj->js` rather than nested
`#js` tags.

```clj
#js {:foo #js {:bar 1}}
;;=> #js {:foo #js {:bar 1}}

(clj->js {:foo {:bar 1}})
;;=> #js {:foo #js {:bar 1}}
```

---

See Also:

[`cljs.core/js-obj`](cljs.core_js-obj.md)<br>
[`cljs.core/array`](cljs.core_array.md)<br>
[`cljs.core/clj->js`](cljs.core_clj-GTjs.md)<br>

---


Source code:

```clj
(def ^:dynamic *cljs-data-readers*
  {'queue read-queue
   'uuid  read-uuid
   'inst  read-inst
   'js    read-js})
```

 <pre>
clojurescript @ r2134
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:44-48](https://github.com/clojure/clojurescript/blob/r2134/src/clj/cljs/tagged_literals.clj#L44-L48)</ins>
</pre>


---

```clj
(defn read-js
  [form]
  (when-not (or (vector? form) (map? form))
    (throw (RuntimeException. "JavaScript literal must use map or vector notation")))
  (when-not (or (not (map? form))
                (every? valid-js-literal-key? (keys form)))
    (throw (RuntimeException. "JavaScript literal keys must be strings or unqualified keywords")))
  (JSValue. form))
```

 <pre>
clojurescript @ r2134
└── src
    └── clj
        └── cljs
            └── <ins>[tagged_literals.clj:35-42](https://github.com/clojure/clojurescript/blob/r2134/src/clj/cljs/tagged_literals.clj#L35-L42)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/js-literal"]))
```

```clj
{:description "Create a literal JavaScript object or array.  Data in the form of a map `{}` or\nvector `[]` must follow the `#js` tag, which will be converted at compile-time\nto a JavaScript object or array, respectively.\n\nThis will not implicitly convert nested data into JavaScript objects or arrays.",
 :ns "syntax",
 :name "js-literal",
 :history [["+" "0.0-2120"]],
 :type "tagged literal",
 :related ["cljs.core/js-obj" "cljs.core/array" "cljs.core/clj->js"],
 :full-name-encode "syntax_js-literal",
 :source {:code "(def ^:dynamic *cljs-data-readers*\n  {'queue read-queue\n   'uuid  read-uuid\n   'inst  read-inst\n   'js    read-js})",
          :repo "clojurescript",
          :tag "r2134",
          :filename "src/clj/cljs/tagged_literals.clj",
          :lines [44 48]},
 :extra-sources [{:code "(defn read-js\n  [form]\n  (when-not (or (vector? form) (map? form))\n    (throw (RuntimeException. \"JavaScript literal must use map or vector notation\")))\n  (when-not (or (not (map? form))\n                (every? valid-js-literal-key? (keys form)))\n    (throw (RuntimeException. \"JavaScript literal keys must be strings or unqualified keywords\")))\n  (JSValue. form))",
                  :repo "clojurescript",
                  :tag "r2134",
                  :filename "src/clj/cljs/tagged_literals.clj",
                  :lines [35 42]}],
 :syntax-form ["#js {}" "#js []"],
 :examples [{:id "05e121",
             :content "```clj\n#js {:foo 1 bar 2}\n;;=> #js {:foo 1, :bar 2}\n\n#js [1 2 3]\n;;=> #js [1 2 3]\n```\n\nFor readability, it is sometimes preferable to use `clj->js` rather than nested\n`#js` tags.\n\n```clj\n#js {:foo #js {:bar 1}}\n;;=> #js {:foo #js {:bar 1}}\n\n(clj->js {:foo {:bar 1}})\n;;=> #js {:foo #js {:bar 1}}\n```"}],
 :full-name "syntax/js-literal"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_js-literal.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_js-literal.cljsdoc)
</pre>

