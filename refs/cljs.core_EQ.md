## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/=

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/=</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/=)
</td>
</tr>
</table>

 <samp>
(__=__ x)<br>
</samp>
 <samp>
(__=__ x y)<br>
</samp>
 <samp>
(__=__ x y & more)<br>
</samp>

---

Returns true if the value of `x` equals the value of `y`, false otherwise.

`=` is a value comparison, not an identity comparison.

All collections can be tested for value, regardless of "depth".

---

Example:

```clj
(= 1)
;;=> true

(= 1 1)
;;=> true

(= 1 2)
;;=> false

(= 1 1 1)
;;=> true

(= 1 1 2)
;;=> false
```

---
Example:

Sequences are considered equal in value if they have the same elements:

```clj
(= '(1 2) [1 2])
;;=> true
```

But you cannot compare JavaScript arrays until you convert them to sequences:

```clj
(def a #js [1 2])
(def b #js [1 2])
(= a b)
;;=> false

(= (seq a) (seq b))
;;=> true
```

---
Example:

It is natural to compare deeply nested collections since value equality checks
are cheap in ClojureScript:

```clj
(def a {:foo {:bar "baz"}})
(def b {:foo {:bar "baz"}})
(= a b)
;;=> true

(= [a b] [a b])
;=> true
```

JavaScript objects cannot be compared in this way until they are converted to
ClojureScript collections:

```clj
(def a #js {:foo #js {:bar "baz"}})
(def b #js {:foo #js {:bar "baz"}})
(= a b)
;;=> false

(= (js->clj a)
   (js->clj b))
;;=> true
```

---

See Also:

[`cljs.core/==`](cljs.core_EQEQ.md)<br>
[`cljs.core/not=`](cljs.core_notEQ.md)<br>
[`cljs.core/identical?`](cljs.core_identicalQMARK.md)<br>

---

Source docstring:

```
Equality. Returns true if x equals y, false if not. Compares
numbers and collections in a type-independent manner.  Clojure's immutable data
structures define -equiv (and thus =) as a value, not an identity,
comparison.
```

Source code:

```clj
(defn ^boolean =
  ([x] true)
  ([x y] (or (identical? x y) (-equiv x y)))
  ([x y & more]
     (if (= x y)
       (if (next more)
         (recur y (first more) (next more))
         (= y (first more)))
       false)))
```

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:290-302](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L290-L302)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/="]))
```

```clj
{:description "Returns true if the value of `x` equals the value of `y`, false otherwise.\n\n`=` is a value comparison, not an identity comparison.\n\nAll collections can be tested for value, regardless of \"depth\".",
 :return-type boolean,
 :ns "cljs.core",
 :name "=",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/==" "cljs.core/not=" "cljs.core/identical?"],
 :full-name-encode "cljs.core_EQ",
 :source {:code "(defn ^boolean =\n  ([x] true)\n  ([x y] (or (identical? x y) (-equiv x y)))\n  ([x y & more]\n     (if (= x y)\n       (if (next more)\n         (recur y (first more) (next more))\n         (= y (first more)))\n       false)))",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/cljs/cljs/core.cljs",
          :lines [290 302]},
 :examples [{:id "edffb6",
             :content "```clj\n(= 1)\n;;=> true\n\n(= 1 1)\n;;=> true\n\n(= 1 2)\n;;=> false\n\n(= 1 1 1)\n;;=> true\n\n(= 1 1 2)\n;;=> false\n```"}
            {:id "a2d064",
             :content "Sequences are considered equal in value if they have the same elements:\n\n```clj\n(= '(1 2) [1 2])\n;;=> true\n```\n\nBut you cannot compare JavaScript arrays until you convert them to sequences:\n\n```clj\n(def a #js [1 2])\n(def b #js [1 2])\n(= a b)\n;;=> false\n\n(= (seq a) (seq b))\n;;=> true\n```"}
            {:id "6c8424",
             :content "It is natural to compare deeply nested collections since value equality checks\nare cheap in ClojureScript:\n\n```clj\n(def a {:foo {:bar \"baz\"}})\n(def b {:foo {:bar \"baz\"}})\n(= a b)\n;;=> true\n\n(= [a b] [a b])\n;=> true\n```\n\nJavaScript objects cannot be compared in this way until they are converted to\nClojureScript collections:\n\n```clj\n(def a #js {:foo #js {:bar \"baz\"}})\n(def b #js {:foo #js {:bar \"baz\"}})\n(= a b)\n;;=> false\n\n(= (js->clj a)\n   (js->clj b))\n;;=> true\n```"}],
 :full-name "cljs.core/=",
 :clj-symbol "clojure.core/=",
 :docstring "Equality. Returns true if x equals y, false if not. Compares\nnumbers and collections in a type-independent manner.  Clojure's immutable data\nstructures define -equiv (and thus =) as a value, not an identity,\ncomparison."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_EQ.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_EQ.cljsdoc)
</pre>

