## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/\*

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*)
</td>
</tr>
</table>

 <samp>
(__\*__)<br>
</samp>
 <samp>
(__\*__ x)<br>
</samp>
 <samp>
(__\*__ x y)<br>
</samp>
 <samp>
(__\*__ x y & more)<br>
</samp>

---

Returns the product of nums.

`(*)` returns 1.

---

Example:

```clj
;; there is an implicit 1
(*)
;;=> 1

;; the implicit 1 comes into play
(* 6)
;;=> 6

(* 2 3)
;;=> 6

(* 2 3 4)
;;=> 24
```

---

See Also:

[`cljs.core/+`](cljs.core_PLUS.md)<br>
[`cljs.core//`](cljs.core_SLASH.md)<br>

---

Source docstring:

```
Returns the product of nums. (*) returns 1.
```

Source code:

```clj
(defn *
  ([] 1)
  ([x] x)
  ([x y] (cljs.core/* x y))
  ([x y & more] (reduce * (cljs.core/* x y) more)))
```

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1443-1448](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/core.cljs#L1443-L1448)</ins>
</pre>


---

```clj
(defmacro ^::ana/numeric *
  ([] 1)
  ([x] x)
  ([x y] (core/list 'js* "(~{} * ~{})" x y))
  ([x y & more] `(* (* ~x ~y) ~@more)))
```

 <pre>
clojurescript @ r2067
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:394-398](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/core.clj#L394-L398)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*"]))
```

```clj
{:description "Returns the product of nums.\n\n`(*)` returns 1.",
 :ns "cljs.core",
 :name "*",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/+" "cljs.core//"],
 :full-name-encode "cljs.core_STAR",
 :source {:code "(defn *\n  ([] 1)\n  ([x] x)\n  ([x y] (cljs.core/* x y))\n  ([x y & more] (reduce * (cljs.core/* x y) more)))",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1443 1448]},
 :extra-sources ({:code "(defmacro ^::ana/numeric *\n  ([] 1)\n  ([x] x)\n  ([x y] (core/list 'js* \"(~{} * ~{})\" x y))\n  ([x y & more] `(* (* ~x ~y) ~@more)))",
                  :repo "clojurescript",
                  :tag "r2067",
                  :filename "src/clj/cljs/core.clj",
                  :lines [394 398]}),
 :examples [{:id "bc4a1f",
             :content "```clj\n;; there is an implicit 1\n(*)\n;;=> 1\n\n;; the implicit 1 comes into play\n(* 6)\n;;=> 6\n\n(* 2 3)\n;;=> 6\n\n(* 2 3 4)\n;;=> 24\n```"}],
 :full-name "cljs.core/*",
 :clj-symbol "clojure.core/*",
 :docstring "Returns the product of nums. (*) returns 1."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_STAR.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_STAR.cljsdoc)
</pre>

