## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/skip-if-eol

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__skip-if-eol__ s)<br>
</samp>

---




Source docstring:

```
If the next character on stream s is a newline, skips it, otherwise
leaves the stream untouched. Returns :line-start, :stream-end, or :body
to indicate the relative location of the next character on s. The stream
must either be an instance of LineNumberingPushbackReader or duplicate
its behavior of both supporting .unread and collapsing all of CR, LF, and
CRLF to a single \newline.
```

Source code:

```clj
(defn skip-if-eol
  [s]
  (let [c (.read s)]
    (cond
      (= c (int \newline)) :line-start
      (= c -1) :stream-end
      :else (do (.unread s c) :body))))
```

 <pre>
clojurescript @ r2814
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:33-45](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/repl.clj#L33-L45)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/skip-if-eol"]))
```

```clj
{:ns "cljs.repl",
 :name "skip-if-eol",
 :signature ["[s]"],
 :history [["+" "0.0-2719"]],
 :type "function",
 :full-name-encode "cljs.repl_skip-if-eol",
 :source {:code "(defn skip-if-eol\n  [s]\n  (let [c (.read s)]\n    (cond\n      (= c (int \\newline)) :line-start\n      (= c -1) :stream-end\n      :else (do (.unread s c) :body))))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/clj/cljs/repl.clj",
          :lines [33 45]},
 :full-name "cljs.repl/skip-if-eol",
 :docstring "If the next character on stream s is a newline, skips it, otherwise\nleaves the stream untouched. Returns :line-start, :stream-end, or :body\nto indicate the relative location of the next character on s. The stream\nmust either be an instance of LineNumberingPushbackReader or duplicate\nits behavior of both supporting .unread and collapsing all of CR, LF, and\nCRLF to a single \\newline."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_skip-if-eol.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_skip-if-eol.cljsdoc)
</pre>
