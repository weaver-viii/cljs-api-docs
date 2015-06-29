## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/repl-read

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2719"><img valign="middle" alt="[+] 0.0-2719" src="https://img.shields.io/badge/+-0.0--2719-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__repl-read__ request-prompt request-exit)<br>
</samp>

---




Source docstring:

```
Default :read hook for repl. Reads from *in* which must either be an
instance of LineNumberingPushbackReader or duplicate its behavior of both
supporting .unread and collapsing all of CR, LF, and CRLF into a single
\newline. repl-read:
  - skips whitespace, then
    - returns request-prompt on start of line, or
    - returns request-exit on end of stream, or
    - reads an object from the input stream, then
      - skips the next input character if it's end of line, then
      - returns the object.
```

Source code:

```clj
(defn repl-read
  [request-prompt request-exit]
  (or ({:line-start request-prompt :stream-end request-exit}
        (skip-whitespace *in*))
    (let [input (read)]
      (skip-if-eol *in*)
      input)))
```

 <pre>
clojurescript @ r2755
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:62-78](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/repl.clj#L62-L78)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl-read"]))
```

```clj
{:ns "cljs.repl",
 :name "repl-read",
 :signature ["[request-prompt request-exit]"],
 :history [["+" "0.0-2719"]],
 :type "function",
 :full-name-encode "cljs.repl_repl-read",
 :source {:code "(defn repl-read\n  [request-prompt request-exit]\n  (or ({:line-start request-prompt :stream-end request-exit}\n        (skip-whitespace *in*))\n    (let [input (read)]\n      (skip-if-eol *in*)\n      input)))",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/clj/cljs/repl.clj",
          :lines [62 78]},
 :full-name "cljs.repl/repl-read",
 :docstring "Default :read hook for repl. Reads from *in* which must either be an\ninstance of LineNumberingPushbackReader or duplicate its behavior of both\nsupporting .unread and collapsing all of CR, LF, and CRLF into a single\n\\newline. repl-read:\n  - skips whitespace, then\n    - returns request-prompt on start of line, or\n    - returns request-exit on end of stream, or\n    - reads an object from the input stream, then\n      - skips the next input character if it's end of line, then\n      - returns the object."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_repl-read.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_repl-read.cljsdoc)
</pre>

