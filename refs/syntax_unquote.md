## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/unquote

 <table border="1">
<tr>
<td><samp>~</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


(Only intended for use in Clojure macros, which can be used from but not
written in ClojureScript.)

Intended for use inside a syntax-quote.

Forces evaluation of the following form.

---

Example:

```clj
(def foo 1)
`~foo
;;=> 1

`(def foo ~foo)
;;=> (def cljs.user/foo 1)
```

---

See Also:

[`syntax/syntax-quote`](syntax_syntax-quote.md)<br>
[`syntax/unquote-splicing`](syntax_unquote-splicing.md)<br>

---


Source code:

```clj

```

 <pre>
clojure @ clojure-1.5.1
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/jvm/clojure/lang/LispReader.java#L)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/unquote"]))
```

```clj
{:description "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nIntended for use inside a syntax-quote.\n\nForces evaluation of the following form.",
 :ns "syntax",
 :name "unquote",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/syntax-quote" "syntax/unquote-splicing"],
 :full-name-encode "syntax_unquote",
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "~",
 :examples [{:id "1ff51e",
             :content "```clj\n(def foo 1)\n`~foo\n;;=> 1\n\n`(def foo ~foo)\n;;=> (def cljs.user/foo 1)\n```"}],
 :full-name "syntax/unquote",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_unquote.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_unquote.cljsdoc)
</pre>

