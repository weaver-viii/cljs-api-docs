## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/subs

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/subs</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/subs)
</td>
</tr>
</table>

 <samp>
(__subs__ s start)<br>
</samp>
 <samp>
(__subs__ s start end)<br>
</samp>

---

Returns the substring of `s` beginning at `start` inclusive, and ending at `end`
exclusive.

`end` defaults to the length of the string.

---



Source docstring:

```
Returns the substring of s beginning at start inclusive, and ending
at end (defaults to length of string), exclusive.
```

Source code:

```clj
(defn subs
  ([s start] (.substring s start))
  ([s start end] (.substring s start end)))
```

 <pre>
clojurescript @ r1835
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1747-1751](https://github.com/clojure/clojurescript/blob/r1835/src/cljs/cljs/core.cljs#L1747-L1751)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/subs"]))
```

```clj
{:description "Returns the substring of `s` beginning at `start` inclusive, and ending at `end`\nexclusive.\n\n`end` defaults to the length of the string.",
 :ns "cljs.core",
 :name "subs",
 :signature ["[s start]" "[s start end]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_subs",
 :source {:code "(defn subs\n  ([s start] (.substring s start))\n  ([s start end] (.substring s start end)))",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1747 1751]},
 :full-name "cljs.core/subs",
 :clj-symbol "clojure.core/subs",
 :docstring "Returns the substring of s beginning at start inclusive, and ending\nat end (defaults to length of string), exclusive."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_subs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_subs.cljsdoc)
</pre>

