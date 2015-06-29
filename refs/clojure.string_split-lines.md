## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/split-lines

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/split-lines</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/split-lines)
</td>
</tr>
</table>

 <samp>
(__split-lines__ s)<br>
</samp>

---

Splits `s` on `\n` or `\r\n`.

---


See Also:

[`clojure.string/split`](clojure.string_split.md)<br>

---

Source docstring:

```
Splits s on 
 or 
.
```

Source code:

```clj
(defn split-lines
  [s]
  (split s #"\n|\r\n"))
```

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:101-104](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/clojure/string.cljs#L101-L104)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/split-lines"]))
```

```clj
{:description "Splits `s` on `\\n` or `\\r\\n`.",
 :ns "clojure.string",
 :name "split-lines",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["clojure.string/split"],
 :full-name-encode "clojure.string_split-lines",
 :source {:code "(defn split-lines\n  [s]\n  (split s #\"\\n|\\r\\n\"))",
          :repo "clojurescript",
          :tag "r1449",
          :filename "src/cljs/clojure/string.cljs",
          :lines [101 104]},
 :full-name "clojure.string/split-lines",
 :clj-symbol "clojure.string/split-lines",
 :docstring "Splits s on \n or \r\n."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_split-lines.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_split-lines.cljsdoc)
</pre>

