## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core//

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core//</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core//)
</td>
</tr>
</table>

 <samp>
(__/__ x)<br>
</samp>
 <samp>
(__/__ x y)<br>
</samp>
 <samp>
(__/__ x y & more)<br>
</samp>

---

If no denominators are supplied, returns 1/numerator, else returns numerator
divided by all of the denominators.

---

Example:

```clj
(/ 6 3)
;;=> 2

(/ 6 3 2)
;;=> 1

(/ 10)
;;=> 0.1

(/ 1 3)
;;=> 0.3333333333333333
```

---

See Also:

[`cljs.core/*`](cljs.core_STAR.md)<br>
[`cljs.core/quot`](cljs.core_quot.md)<br>

---

Source docstring:

```
If no denominators are supplied, returns 1/numerator,
else returns numerator divided by all of the denominators.
```

Source code:

```clj
(defn /
  ([x] (/ 1 x))
  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//
  ([x y & more] (reduce / (/ x y) more)))
```

 <pre>
clojurescript @ r2030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1423-1428](https://github.com/clojure/clojurescript/blob/r2030/src/cljs/cljs/core.cljs#L1423-L1428)</ins>
</pre>


---

```clj
(defmacro /
  ([x] `(/ 1 ~x))
  ([x y] (core/list 'js* "(~{} / ~{})" x y))
  ([x y & more] `(/ (/ ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r2030
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:398-401](https://github.com/clojure/clojurescript/blob/r2030/src/clj/cljs/core.clj#L398-L401)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core//"]))
```

```clj
{:description "If no denominators are supplied, returns 1/numerator, else returns numerator\ndivided by all of the denominators.",
 :ns "cljs.core",
 :name "/",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/*" "cljs.core/quot"],
 :full-name-encode "cljs.core_SLASH",
 :source {:code "(defn /\n  ([x] (/ 1 x))\n  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//\n  ([x y & more] (reduce / (/ x y) more)))",
          :repo "clojurescript",
          :tag "r2030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1423 1428]},
 :extra-sources ({:code "(defmacro /\n  ([x] `(/ 1 ~x))\n  ([x y] (core/list 'js* \"(~{} / ~{})\" x y))\n  ([x y & more] `(/ (/ ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r2030",
                  :filename "src/clj/cljs/core.clj",
                  :lines [398 401]}),
 :examples [{:id "824bb7",
             :content "```clj\n(/ 6 3)\n;;=> 2\n\n(/ 6 3 2)\n;;=> 1\n\n(/ 10)\n;;=> 0.1\n\n(/ 1 3)\n;;=> 0.3333333333333333\n```"}],
 :full-name "cljs.core//",
 :clj-symbol "clojure.core//",
 :docstring "If no denominators are supplied, returns 1/numerator,\nelse returns numerator divided by all of the denominators."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_SLASH.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_SLASH.cljsdoc)
</pre>

