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
 <samp>
(__repl-read__ request-prompt request-exit opts)<br>
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
  ([request-prompt request-exit]
   (repl-read request-prompt request-exit *repl-opts*))
  ([request-prompt request-exit opts]
   (binding [*in* (if (true? (:source-map-inline opts))
                    ((:reader opts))
                    *in*)]
     (or ({:line-start request-prompt :stream-end request-exit}
          (skip-whitespace *in*))
        (let [input (reader/read {:read-cond :allow :features #{:cljs}} *in*)]
          (skip-if-eol *in*)
          input)))))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:77-98](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/repl.cljc#L77-L98)</ins>
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
 :signature ["[request-prompt request-exit]"
             "[request-prompt request-exit opts]"],
 :history [["+" "0.0-2719"]],
 :type "function",
 :full-name-encode "cljs.repl_repl-read",
 :source {:code "(defn repl-read\n  ([request-prompt request-exit]\n   (repl-read request-prompt request-exit *repl-opts*))\n  ([request-prompt request-exit opts]\n   (binding [*in* (if (true? (:source-map-inline opts))\n                    ((:reader opts))\n                    *in*)]\n     (or ({:line-start request-prompt :stream-end request-exit}\n          (skip-whitespace *in*))\n        (let [input (reader/read {:read-cond :allow :features #{:cljs}} *in*)]\n          (skip-if-eol *in*)\n          input)))))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [77 98]},
 :full-name "cljs.repl/repl-read",
 :docstring "Default :read hook for repl. Reads from *in* which must either be an\ninstance of LineNumberingPushbackReader or duplicate its behavior of both\nsupporting .unread and collapsing all of CR, LF, and CRLF into a single\n\\newline. repl-read:\n  - skips whitespace, then\n    - returns request-prompt on start of line, or\n    - returns request-exit on end of stream, or\n    - reads an object from the input stream, then\n      - skips the next input character if it's end of line, then\n      - returns the object."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_repl-read.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_repl-read.cljsdoc)
</pre>

