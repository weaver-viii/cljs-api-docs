## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/skip-whitespace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__skip-whitespace__ s)<br>
</samp>

---




Source docstring:

```
Skips whitespace characters on stream s. Returns :line-start, :stream-end,
or :body to indicate the relative location of the next character on s.
Interprets comma as whitespace and semicolon as comment to end of line.
Does not interpret #! as comment to end of line because only one
character of lookahead is available. The stream must either be an
instance of LineNumberingPushbackReader or duplicate its behavior of both
supporting .unread and collapsing all of CR, LF, and CRLF to a single
\newline.
```

Source code:

```clj
(defn skip-whitespace
  [s]
  (loop [c (.read s)]
    (cond
      (= c (int \newline)) :line-start
      (= c -1) :stream-end
      (= c (int \;)) (do (.readLine s) :line-start)
      (or (Character/isWhitespace (char c)) (= c (int \,))) (recur (.read s))
      :else (do (.unread s c) :body))))
```

 <pre>
clojurescript @ r2760
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:44-60](https://github.com/clojure/clojurescript/blob/r2760/src/clj/cljs/repl.clj#L44-L60)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/skip-whitespace"]))
```

```clj
{:ns "cljs.repl",
 :name "skip-whitespace",
 :signature ["[s]"],
 :history [["+" "0.0-2719"]],
 :type "function",
 :full-name-encode "cljs.repl_skip-whitespace",
 :source {:code "(defn skip-whitespace\n  [s]\n  (loop [c (.read s)]\n    (cond\n      (= c (int \\newline)) :line-start\n      (= c -1) :stream-end\n      (= c (int \\;)) (do (.readLine s) :line-start)\n      (or (Character/isWhitespace (char c)) (= c (int \\,))) (recur (.read s))\n      :else (do (.unread s c) :body))))",
          :repo "clojurescript",
          :tag "r2760",
          :filename "src/clj/cljs/repl.clj",
          :lines [44 60]},
 :full-name "cljs.repl/skip-whitespace",
 :docstring "Skips whitespace characters on stream s. Returns :line-start, :stream-end,\nor :body to indicate the relative location of the next character on s.\nInterprets comma as whitespace and semicolon as comment to end of line.\nDoes not interpret #! as comment to end of line because only one\ncharacter of lookahead is available. The stream must either be an\ninstance of LineNumberingPushbackReader or duplicate its behavior of both\nsupporting .unread and collapsing all of CR, LF, and CRLF to a single\n\\newline."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_skip-whitespace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_skip-whitespace.cljsdoc)
</pre>

