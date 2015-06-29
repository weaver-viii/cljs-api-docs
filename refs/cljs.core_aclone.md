## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/aclone

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/aclone</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aclone)
</td>
</tr>
</table>

 <samp>
(__aclone__ arr)<br>
</samp>

---

Creates a clone of the given JavaScript array `arr`.  The result is a new
JavaScript array, which is a shallow copy, not a deep copy.

---

Example:

```clj
(def a #js [1 2 3])
(def b (aclone a))
(aset b 0 4)

a
;;=> #js [1 2 3]

b
;;=> #js [4 2 3]
```

---

See Also:

[`cljs.core/array`](cljs.core_array.md)<br>
[`cljs.core/make-array`](cljs.core_make-array.md)<br>

---

Source docstring:

```
Returns a javascript array, cloned from the passed in array
```

Source code:

```clj
(defn aclone
  [array-like]
  (.slice array-like))
```

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:120-123](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/core.cljs#L120-L123)</ins>
</pre>


---

```clj
(defmacro aclone [a]
  (list 'js* "~{}.slice()" a))
```

 <pre>
clojurescript @ r1843
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1201-1202](https://github.com/clojure/clojurescript/blob/r1843/src/clj/cljs/core.clj#L1201-L1202)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/aclone"]))
```

```clj
{:description "Creates a clone of the given JavaScript array `arr`.  The result is a new\nJavaScript array, which is a shallow copy, not a deep copy.",
 :ns "cljs.core",
 :name "aclone",
 :signature ["[arr]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/array" "cljs.core/make-array"],
 :full-name-encode "cljs.core_aclone",
 :source {:code "(defn aclone\n  [array-like]\n  (.slice array-like))",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/core.cljs",
          :lines [120 123]},
 :extra-sources ({:code "(defmacro aclone [a]\n  (list 'js* \"~{}.slice()\" a))",
                  :repo "clojurescript",
                  :tag "r1843",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1201 1202]}),
 :examples [{:id "422c4e",
             :content "```clj\n(def a #js [1 2 3])\n(def b (aclone a))\n(aset b 0 4)\n\na\n;;=> #js [1 2 3]\n\nb\n;;=> #js [4 2 3]\n```"}],
 :full-name "cljs.core/aclone",
 :clj-symbol "clojure.core/aclone",
 :docstring "Returns a javascript array, cloned from the passed in array"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_aclone.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_aclone.cljsdoc)
</pre>

