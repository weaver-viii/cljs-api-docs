## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/read

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/read</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/read)
</td>
</tr>
</table>

 <samp>
(__read__ reader eof-is-error sentinel is-recursive)<br>
</samp>

---




Source docstring:

```
Reads the first object from a PushbackReader. Returns the object read.
If EOF, throws if eof-is-error is true. Otherwise returns sentinel.
```

Source code:

```clj
(defn read
  [reader eof-is-error sentinel is-recursive]
  (let [ch (read-char reader)]
    (cond
     (nil? ch) (if eof-is-error (reader-error reader "EOF while reading") sentinel)
     (whitespace? ch) (recur reader eof-is-error sentinel is-recursive)
     (comment-prefix? ch) (recur (read-comment reader ch) eof-is-error sentinel is-recursive)
     :else (let [f (macros ch)
                 res
                 (cond
                  f (f reader ch)
                  (number-literal? reader ch) (read-number reader ch)
                  :else (read-symbol reader ch))]
     (if (identical? res reader)
       (recur reader eof-is-error sentinel is-recursive)
       res)))))
```

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:419-436](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/reader.cljs#L419-L436)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read"]))
```

```clj
{:ns "cljs.reader",
 :name "read",
 :signature ["[reader eof-is-error sentinel is-recursive]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader_read",
 :source {:code "(defn read\n  [reader eof-is-error sentinel is-recursive]\n  (let [ch (read-char reader)]\n    (cond\n     (nil? ch) (if eof-is-error (reader-error reader \"EOF while reading\") sentinel)\n     (whitespace? ch) (recur reader eof-is-error sentinel is-recursive)\n     (comment-prefix? ch) (recur (read-comment reader ch) eof-is-error sentinel is-recursive)\n     :else (let [f (macros ch)\n                 res\n                 (cond\n                  f (f reader ch)\n                  (number-literal? reader ch) (read-number reader ch)\n                  :else (read-symbol reader ch))]\n     (if (identical? res reader)\n       (recur reader eof-is-error sentinel is-recursive)\n       res)))))",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [419 436]},
 :full-name "cljs.reader/read",
 :clj-symbol "clojure.core/read",
 :docstring "Reads the first object from a PushbackReader. Returns the object read.\nIf EOF, throws if eof-is-error is true. Otherwise returns sentinel."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_read.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_read.cljsdoc)
</pre>

