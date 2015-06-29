## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/keyword

 <table border="1">
<tr>
<td><samp>:</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#keywords)
</td>
</tr>
</table>


Signifies a keyword, a string-like datatype often used as keys for maps.
Keywords should not start with a number.

Keywords can have an optional namespace. For example, `:foo/bar`. This is useful
for functions in a namespace to prevent key collisions on a globally accessible
map.

Preceding a keyword with `::` will prepend the given keyword with the current
namespace.  For example, in the user namespace, `::foo` is read as `:user/foo`.

If a keyword is prefixed by `::` and is namespace-qualified, the namespace part is properly resolved.
For example, if `foo` is an alias of `cljs.core`, then `::foo/bar` evaluates to `:cljs.core/bar`.
A reader exception is thrown if `foo` is not a namespace.

---

Example:

```clj
:foo
;;=> :foo

::foo
;;=> :user/foo

:a/foo
;;=> :a/foo
```

---
Example:

A keyword is also callable for retrieving values from a map:

```clj
(def m {:foo 1})
(:foo m)
;;=> 1

(def things [{:foo 1 :bar 2}
             {:foo 3 :bar 4}
             {:foo 5 :bar 6}])
(map :foo things)
;;=> (1 3 5)
```

---

See Also:

[`cljs.core/keyword`](cljs.core_keyword.md)<br>
[`cljs.core/keyword?`](cljs.core_keywordQMARK.md)<br>

---


Source code:

```clj
(defn- macros [ch]
  (case ch
    \" read-string*
    \: read-keyword
    \; read-comment
    \' (wrapping-reader 'quote)
    \@ (wrapping-reader 'clojure.core/deref)
    \^ read-meta
    \` read-syntax-quote ;;(wrapping-reader 'syntax-quote)
    \~ read-unquote
    \( read-list
    \) read-unmatched-delimiter
    \[ read-vector
    \] read-unmatched-delimiter
    \{ read-map
    \} read-unmatched-delimiter
    \\ read-char*
    \% read-arg
    \# read-dispatch
    nil))
```

 <pre>
tools.reader @ tools.reader-0.8.4
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:589-608](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.4/src/main/clojure/clojure/tools/reader.clj#L589-L608)</ins>
</pre>


---

```clj
(defn- read-keyword
  [reader initch]
  (let [ch (read-char reader)]
    (if-not (whitespace? ch)
      (let [token (read-token reader ch)
            s (parse-symbol token)]
        (if s
          (let [^String ns (s 0)
                ^String name (s 1)]
            (if (identical? \: (nth token 0))
              (if ns
                (let [ns (resolve-ns (symbol (subs ns 1)))]
                  (if ns
                    (keyword (str ns) name)
                    (reader-error reader "Invalid token: :" token)))
                (keyword (str *ns*) (subs name 1)))
              (keyword ns name)))
          (reader-error reader "Invalid token: :" token)))
      (reader-error reader "Invalid token: :"))))
```

 <pre>
tools.reader @ tools.reader-0.8.4
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:312-330](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.4/src/main/clojure/clojure/tools/reader.clj#L312-L330)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/keyword"]))
```

```clj
{:description "Signifies a keyword, a string-like datatype often used as keys for maps.\nKeywords should not start with a number.\n\nKeywords can have an optional namespace. For example, `:foo/bar`. This is useful\nfor functions in a namespace to prevent key collisions on a globally accessible\nmap.\n\nPreceding a keyword with `::` will prepend the given keyword with the current\nnamespace.  For example, in the user namespace, `::foo` is read as `:user/foo`.\n\nIf a keyword is prefixed by `::` and is namespace-qualified, the namespace part is properly resolved.\nFor example, if `foo` is an alias of `cljs.core`, then `::foo/bar` evaluates to `:cljs.core/bar`.\nA reader exception is thrown if `foo` is not a namespace.",
 :ns "syntax",
 :name "keyword",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/keyword" "cljs.core/keyword?"],
 :full-name-encode "syntax_keyword",
 :source {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
          :repo "tools.reader",
          :tag "tools.reader-0.8.4",
          :filename "src/main/clojure/clojure/tools/reader.clj",
          :lines [589 608]},
 :extra-sources [{:code "(defn- read-keyword\n  [reader initch]\n  (let [ch (read-char reader)]\n    (if-not (whitespace? ch)\n      (let [token (read-token reader ch)\n            s (parse-symbol token)]\n        (if s\n          (let [^String ns (s 0)\n                ^String name (s 1)]\n            (if (identical? \\: (nth token 0))\n              (if ns\n                (let [ns (resolve-ns (symbol (subs ns 1)))]\n                  (if ns\n                    (keyword (str ns) name)\n                    (reader-error reader \"Invalid token: :\" token)))\n                (keyword (str *ns*) (subs name 1)))\n              (keyword ns name)))\n          (reader-error reader \"Invalid token: :\" token)))\n      (reader-error reader \"Invalid token: :\"))))",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.4",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [312 330]}],
 :syntax-form ":",
 :examples [{:id "e5fdbe",
             :content "```clj\n:foo\n;;=> :foo\n\n::foo\n;;=> :user/foo\n\n:a/foo\n;;=> :a/foo\n```"}
            {:id "9765fe",
             :content "A keyword is also callable for retrieving values from a map:\n\n```clj\n(def m {:foo 1})\n(:foo m)\n;;=> 1\n\n(def things [{:foo 1 :bar 2}\n             {:foo 3 :bar 4}\n             {:foo 5 :bar 6}])\n(map :foo things)\n;;=> (1 3 5)\n```"}],
 :edn-doc "https://github.com/edn-format/edn#keywords",
 :full-name "syntax/keyword",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_keyword.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_keyword.cljsdoc)
</pre>

