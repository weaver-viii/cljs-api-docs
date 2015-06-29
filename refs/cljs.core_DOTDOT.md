## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/..

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/..</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/..)
</td>
</tr>
</table>

 <samp>
(__..__ o form)<br>
</samp>
 <samp>
(__..__ o form & more)<br>
</samp>

---

For interop, the `..` macro allows method/property chaining on the given JavaScript object `o`.

It essentially combines the thread-first `->` macro with the `.` operator.

---

Example:

```js
// JavaScript
"a b c d".toUpperCase().replace("A", "X")
//=> "X B C D"
```

```clj
;; ClojureScript
(.. "a b c d"
    toUpperCase
    (replace "A" "X"))
;;=> "X B C D"
```

This is expanded to:

```clj
(. (. "a b c d" toUpperCase) (replace "A" "X"))
```


which is equivalent to:

```clj
(.replace (.toUpperCase "a b c d") "A" "X")
;;=> "X B C D"
```

Compare to the equivalent form using the thread-first `->` macro:

```clj
(-> "a b c d"
    .toUpperCase
    (.replace "A" "X"))
;;=> "X B C D"
```

---

See Also:

[`special/.`](special_DOT.md)<br>
[`cljs.core/->`](cljs.core_-GT.md)<br>
[`cljs.core/doto`](cljs.core_doto.md)<br>

---

Source docstring:

```
form => fieldName-symbol or (instanceMethodName-symbol args*)

Expands into a member access (.) of the first member on the first
argument, followed by the next member on the result, etc. For
instance:

(.. System (getProperties) (get "os.name"))

expands to:

(. (. System (getProperties)) (get "os.name"))

but is easier to write, read, and understand.
```

Source code:

```clj
(defmacro ..
  ([x form] `(. ~x ~form))
  ([x form & more] `(.. (. ~x ~form) ~@more)))
```

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1511-1527](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L1511-L1527)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/.."]))
```

```clj
{:description "For interop, the `..` macro allows method/property chaining on the given JavaScript object `o`.\n\nIt essentially combines the thread-first `->` macro with the `.` operator.",
 :ns "cljs.core",
 :name "..",
 :signature ["[o form]" "[o form & more]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["special/." "cljs.core/->" "cljs.core/doto"],
 :full-name-encode "cljs.core_DOTDOT",
 :source {:code "(defmacro ..\n  ([x form] `(. ~x ~form))\n  ([x form & more] `(.. (. ~x ~form) ~@more)))",
          :repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/clj/clojure/core.clj",
          :lines [1511 1527]},
 :examples [{:id "500658",
             :content "```js\n// JavaScript\n\"a b c d\".toUpperCase().replace(\"A\", \"X\")\n//=> \"X B C D\"\n```\n\n```clj\n;; ClojureScript\n(.. \"a b c d\"\n    toUpperCase\n    (replace \"A\" \"X\"))\n;;=> \"X B C D\"\n```\n\nThis is expanded to:\n\n```clj\n(. (. \"a b c d\" toUpperCase) (replace \"A\" \"X\"))\n```\n\n\nwhich is equivalent to:\n\n```clj\n(.replace (.toUpperCase \"a b c d\") \"A\" \"X\")\n;;=> \"X B C D\"\n```\n\nCompare to the equivalent form using the thread-first `->` macro:\n\n```clj\n(-> \"a b c d\"\n    .toUpperCase\n    (.replace \"A\" \"X\"))\n;;=> \"X B C D\"\n```"}],
 :full-name "cljs.core/..",
 :clj-symbol "clojure.core/..",
 :docstring "form => fieldName-symbol or (instanceMethodName-symbol args*)\n\nExpands into a member access (.) of the first member on the first\nargument, followed by the next member on the result, etc. For\ninstance:\n\n(.. System (getProperties) (get \"os.name\"))\n\nexpands to:\n\n(. (. System (getProperties)) (get \"os.name\"))\n\nbut is easier to write, read, and understand."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_DOTDOT.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_DOTDOT.cljsdoc)
</pre>

