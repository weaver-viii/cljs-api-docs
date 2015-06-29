## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/trimr

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/trimr</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/trimr)
</td>
</tr>
</table>

 <samp>
(__trimr__ s)<br>
</samp>

---

Removes whitespace from the right side of string.

---



Source docstring:

```
Removes whitespace from the right side of string.
```

Source code:

```clj
(defn trimr
    [s]
    (gstring/trimRight s))
```

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:116-119](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/clojure/string.cljs#L116-L119)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/trimr"]))
```

```clj
{:description "Removes whitespace from the right side of string.",
 :ns "clojure.string",
 :name "trimr",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_trimr",
 :source {:code "(defn trimr\n    [s]\n    (gstring/trimRight s))",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/clojure/string.cljs",
          :lines [116 119]},
 :full-name "clojure.string/trimr",
 :clj-symbol "clojure.string/trimr",
 :docstring "Removes whitespace from the right side of string."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_trimr.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_trimr.cljsdoc)
</pre>

