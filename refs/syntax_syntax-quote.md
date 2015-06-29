## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/syntax-quote

 <table border="1">
<tr>
<td><samp>`</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


(Only intended for use in Clojure macros, which can be used from but not
written in ClojureScript.)

Prevent evaluation of the following form.

Adds namespace-qualification to any symbols inside the following form by
resolving them in the current context.

Any non-namespaced symbols ending with `#` will resolve to a generated symbol
of the same name with `_` and a unique ID appended.  All references to that
symbol within a syntax-quoted expression will resolve to the same generated
symbol.

---

Example:

```clj
`foo
;;=> cljs.user/foo

`foo#
;;=> foo__20418__auto__

`(def foo 1)
;;=> (def cljs.user/foo 1)
```

---

See Also:

[`syntax/quote`](syntax_quote.md)<br>
[`syntax/unquote`](syntax_unquote.md)<br>
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
    (get-in [:symbols "syntax/syntax-quote"]))
```

```clj
{:description "(Only intended for use in Clojure macros, which can be used from but not\nwritten in ClojureScript.)\n\nPrevent evaluation of the following form.\n\nAdds namespace-qualification to any symbols inside the following form by\nresolving them in the current context.\n\nAny non-namespaced symbols ending with `#` will resolve to a generated symbol\nof the same name with `_` and a unique ID appended.  All references to that\nsymbol within a syntax-quoted expression will resolve to the same generated\nsymbol.",
 :ns "syntax",
 :name "syntax-quote",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/quote" "syntax/unquote" "syntax/unquote-splicing"],
 :full-name-encode "syntax_syntax-quote",
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "`",
 :examples [{:id "bffbdf",
             :content "```clj\n`foo\n;;=> cljs.user/foo\n\n`foo#\n;;=> foo__20418__auto__\n\n`(def foo 1)\n;;=> (def cljs.user/foo 1)\n```"}],
 :full-name "syntax/syntax-quote",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_syntax-quote.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_syntax-quote.cljsdoc)
</pre>

