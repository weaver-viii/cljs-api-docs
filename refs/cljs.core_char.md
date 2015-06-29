## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/char

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/char</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/char)
</td>
</tr>
</table>

 <samp>
(__char__ x)<br>
</samp>

---

Converts a number `x` to a character using `String.fromCharCode(x)` from
JavaScript.

---

Example:

```clj
(char 81)
;;=> "Q"

(char "Q")
;;=> "Q"

(char "foo")
;; Error: Argument to char must be a character or number
```

---


Source docstring:

```
Coerce to char
```

Source code:

```clj
(defn char
  [x]
  (cond
    (number? x) (.fromCharCode js/String x)
    (and (string? x) (== (.-length x) 1)) x
    :else (throw (js/Error. "Argument to char must be a character or number"))))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:2210-2216](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L2210-L2216)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/char"]))
```

```clj
{:description "Converts a number `x` to a character using `String.fromCharCode(x)` from\nJavaScript.",
 :ns "cljs.core",
 :name "char",
 :signature ["[x]"],
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_char",
 :source {:code "(defn char\n  [x]\n  (cond\n    (number? x) (.fromCharCode js/String x)\n    (and (string? x) (== (.-length x) 1)) x\n    :else (throw (js/Error. \"Argument to char must be a character or number\"))))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [2210 2216]},
 :examples [{:id "4e1a56",
             :content "```clj\n(char 81)\n;;=> \"Q\"\n\n(char \"Q\")\n;;=> \"Q\"\n\n(char \"foo\")\n;; Error: Argument to char must be a character or number\n```"}],
 :full-name "cljs.core/char",
 :clj-symbol "clojure.core/char",
 :docstring "Coerce to char"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_char.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_char.cljsdoc)
</pre>

