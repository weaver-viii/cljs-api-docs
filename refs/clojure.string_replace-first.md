## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/replace-first

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/replace-first</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/replace-first)
</td>
</tr>
</table>

 <samp>
(__replace-first__ s match replacement)<br>
</samp>

---

Replaces the first instance of `match` with `replacement` in `s`.

The options for match / replacement are:

| match  | replacement |
|--------|-------------|
| string | string      |
| regex  | string      |
| regex  | function    |

---



Source docstring:

```
Replaces the first instance of match with replacement in s.
match/replacement can be:

string / string
pattern / (string or function of match).
```

Source code:

```clj
(defn replace-first
  [s match replacement]
  (.replace s match replacement))
```

 <pre>
clojurescript @ r2199
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:36-43](https://github.com/clojure/clojurescript/blob/r2199/src/cljs/clojure/string.cljs#L36-L43)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/replace-first"]))
```

```clj
{:description "Replaces the first instance of `match` with `replacement` in `s`.\n\nThe options for match / replacement are:\n\n| match  | replacement |\n|--------|-------------|\n| string | string      |\n| regex  | string      |\n| regex  | function    |",
 :ns "clojure.string",
 :name "replace-first",
 :signature ["[s match replacement]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_replace-first",
 :source {:code "(defn replace-first\n  [s match replacement]\n  (.replace s match replacement))",
          :repo "clojurescript",
          :tag "r2199",
          :filename "src/cljs/clojure/string.cljs",
          :lines [36 43]},
 :full-name "clojure.string/replace-first",
 :clj-symbol "clojure.string/replace-first",
 :docstring "Replaces the first instance of match with replacement in s.\nmatch/replacement can be:\n\nstring / string\npattern / (string or function of match)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_replace-first.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_replace-first.cljsdoc)
</pre>

