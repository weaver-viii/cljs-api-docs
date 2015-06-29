## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/cl-format

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/cl-format</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/cl-format)
</td>
</tr>
</table>

 <samp>
(__cl-format__ writer format-in & args)<br>
</samp>

---




Source docstring:

```
An implementation of a Common Lisp compatible format function. cl-format formats its
arguments to an output stream or string based on the format control string given. It
supports sophisticated formatting of structured data.

Writer satisfies IWriter, true to output via *print-fn* or nil to output
to a string, format-in is the format control string and the remaining arguments
are the data to be formatted.

The format control string is a string to be output with embedded 'format directives'
describing how to format the various arguments passed in.

If writer is nil, cl-format returns the formatted result string. Otherwise, cl-format
returns nil.

For example:
 (let [results [46 38 22]]
        (cl-format true "There ~[are~;is~:;are~]~:* ~d result~:p: ~{~d~^, ~}~%"
                   (count results) results))

Prints via *print-fn*:
 There are 3 results: 46, 38, 22

Detailed documentation on format control strings is available in the "Common Lisp the
Language, 2nd edition", Chapter 22 (available online at:
http://www.cs.cmu.edu/afs/cs.cmu.edu/project/ai-repository/ai/html/cltl/clm/node200.html#SECTION002633000000000000000)
and in the Common Lisp HyperSpec at
http://www.lispworks.com/documentation/HyperSpec/Body/22_c.htm
```

Source code:

```clj
(defn cl-format
  [writer format-in & args]
  (let [compiled-format (if (string? format-in) (compile-format format-in) format-in)
        navigator (init-navigator args)]
    (execute-format writer compiled-format navigator)))
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:894-929](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/pprint.cljs#L894-L929)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/cl-format"]))
```

```clj
{:ns "cljs.pprint",
 :name "cl-format",
 :signature ["[writer format-in & args]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_cl-format",
 :source {:code "(defn cl-format\n  [writer format-in & args]\n  (let [compiled-format (if (string? format-in) (compile-format format-in) format-in)\n        navigator (init-navigator args)]\n    (execute-format writer compiled-format navigator)))",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [894 929]},
 :full-name "cljs.pprint/cl-format",
 :clj-symbol "clojure.pprint/cl-format",
 :docstring "An implementation of a Common Lisp compatible format function. cl-format formats its\narguments to an output stream or string based on the format control string given. It\nsupports sophisticated formatting of structured data.\n\nWriter satisfies IWriter, true to output via *print-fn* or nil to output\nto a string, format-in is the format control string and the remaining arguments\nare the data to be formatted.\n\nThe format control string is a string to be output with embedded 'format directives'\ndescribing how to format the various arguments passed in.\n\nIf writer is nil, cl-format returns the formatted result string. Otherwise, cl-format\nreturns nil.\n\nFor example:\n (let [results [46 38 22]]\n        (cl-format true \"There ~[are~;is~:;are~]~:* ~d result~:p: ~{~d~^, ~}~%\"\n                   (count results) results))\n\nPrints via *print-fn*:\n There are 3 results: 46, 38, 22\n\nDetailed documentation on format control strings is available in the \"Common Lisp the\nLanguage, 2nd edition\", Chapter 22 (available online at:\nhttp://www.cs.cmu.edu/afs/cs.cmu.edu/project/ai-repository/ai/html/cltl/clm/node200.html#SECTION002633000000000000000)\nand in the Common Lisp HyperSpec at\nhttp://www.lispworks.com/documentation/HyperSpec/Body/22_c.htm"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_cl-format.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_cl-format.cljsdoc)
</pre>

