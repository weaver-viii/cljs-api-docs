## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/re-find

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/re-find</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/re-find)
</td>
</tr>
</table>

 <samp>
(__re-find__ re s)<br>
</samp>

---

Returns the first regex match, if any, of `s` to `re`, using `re.exec(s)`.

Returns a vector, containing first the matching substring, then any capturing
groups if the regular expression contains capturing groups.

---



Source docstring:

```
Returns the first regex match, if any, of s to re, using
re.exec(s). Returns a vector, containing first the matching
substring, then any capturing groups if the regular expression contains
capturing groups.
```

Source code:

```clj
(defn re-find
  [re s]
  (if (string? s)
    (let [matches (.exec re s)]
      (when-not (nil? matches)
        (if (== (count matches) 1)
          (first matches)
          (vec matches))))
    (throw (js/TypeError. "re-find must match against a string."))))
```

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7050-7062](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L7050-L7062)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/re-find"]))
```

```clj
{:description "Returns the first regex match, if any, of `s` to `re`, using `re.exec(s)`.\n\nReturns a vector, containing first the matching substring, then any capturing\ngroups if the regular expression contains capturing groups.",
 :ns "cljs.core",
 :name "re-find",
 :signature ["[re s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_re-find",
 :source {:code "(defn re-find\n  [re s]\n  (if (string? s)\n    (let [matches (.exec re s)]\n      (when-not (nil? matches)\n        (if (== (count matches) 1)\n          (first matches)\n          (vec matches))))\n    (throw (js/TypeError. \"re-find must match against a string.\"))))",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7050 7062]},
 :full-name "cljs.core/re-find",
 :clj-symbol "clojure.core/re-find",
 :docstring "Returns the first regex match, if any, of s to re, using\nre.exec(s). Returns a vector, containing first the matching\nsubstring, then any capturing groups if the regular expression contains\ncapturing groups."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_re-find.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_re-find.cljsdoc)
</pre>

