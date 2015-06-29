## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/replace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/replace)
</td>
</tr>
</table>

 <samp>
(__replace__ s match replacement)<br>
</samp>

---

Replaces all instance of `match` with `replacement` in `s`.

The options for match / replacement are:

| match  | replacement |
|--------|-------------|
| string | string      |
| regex  | string      |
| regex  | function    |

---


See Also:

[`cljs.core/subs`](cljs.core_subs.md)<br>
[`clojure.string/split`](clojure.string_split.md)<br>
[`clojure.string/replace-first`](clojure.string_replace-first.md)<br>

---

Source docstring:

```
Replaces all instance of match with replacement in s.
match/replacement can be:

string / string
pattern / (string or function of match).
```

Source code:

```clj
(defn replace
  [s match replacement]
  (cond (string? match)
        (.replace s (js/RegExp. (gstring/regExpEscape match) "g") replacement)
        (instance? js/RegExp match)
        (.replace s (js/RegExp. (.-source match) "g") replacement)
        :else (throw (str "Invalid match arg: " match))))
```

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:27-38](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/clojure/string.cljs#L27-L38)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/replace"]))
```

```clj
{:description "Replaces all instance of `match` with `replacement` in `s`.\n\nThe options for match / replacement are:\n\n| match  | replacement |\n|--------|-------------|\n| string | string      |\n| regex  | string      |\n| regex  | function    |",
 :ns "clojure.string",
 :name "replace",
 :signature ["[s match replacement]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/subs"
           "clojure.string/split"
           "clojure.string/replace-first"],
 :full-name-encode "clojure.string_replace",
 :source {:code "(defn replace\n  [s match replacement]\n  (cond (string? match)\n        (.replace s (js/RegExp. (gstring/regExpEscape match) \"g\") replacement)\n        (instance? js/RegExp match)\n        (.replace s (js/RegExp. (.-source match) \"g\") replacement)\n        :else (throw (str \"Invalid match arg: \" match))))",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/clojure/string.cljs",
          :lines [27 38]},
 :full-name "clojure.string/replace",
 :clj-symbol "clojure.string/replace",
 :docstring "Replaces all instance of match with replacement in s.\nmatch/replacement can be:\n\nstring / string\npattern / (string or function of match)."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_replace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_replace.cljsdoc)
</pre>

