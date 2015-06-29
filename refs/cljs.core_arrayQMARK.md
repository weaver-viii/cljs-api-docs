## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/array?

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__array?__ x)<br>
</samp>

---

Returns true if `x` is a JavaScript array, false otherwise.

---

Example:

```clj
(array? #js [1 2 3])
;;=> true

(array? [1 2 3])
;;=> false

(array? "hi")
;;=> false
```

---

See Also:

[`cljs.core/object?`](cljs.core_objectQMARK.md)<br>

---

Source docstring:

```
Returns true if x is a JavaScript array.
```

Source code:

```clj
(defn ^boolean array?
  [x]
  (if (identical? *target* "nodejs")
    (.isArray js/Array x)
    (instance? js/Array x)))
```

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:153-158](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L153-L158)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/array?"]))
```

```clj
{:description "Returns true if `x` is a JavaScript array, false otherwise.",
 :return-type boolean,
 :ns "cljs.core",
 :name "array?",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :related ["cljs.core/object?"],
 :full-name-encode "cljs.core_arrayQMARK",
 :source {:code "(defn ^boolean array?\n  [x]\n  (if (identical? *target* \"nodejs\")\n    (.isArray js/Array x)\n    (instance? js/Array x)))",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [153 158]},
 :examples [{:id "39913c",
             :content "```clj\n(array? #js [1 2 3])\n;;=> true\n\n(array? [1 2 3])\n;;=> false\n\n(array? \"hi\")\n;;=> false\n```"}],
 :full-name "cljs.core/array?",
 :docstring "Returns true if x is a JavaScript array."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_arrayQMARK.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_arrayQMARK.cljsdoc)
</pre>

