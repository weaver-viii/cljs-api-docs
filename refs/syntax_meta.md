## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/meta

 <table border="1">
<tr>
<td><samp>^</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>


Attaches metadata to the following form.

Metadata is a map.  It can be attached to a collection or symbol.

If the provided metadata is a keyword, the resulting metadata will be a map
containing that keyword with an associated value `true`.

If the provided metadata is a string or symbol, the resulting metadata will be
a map associating `:tag` with the value of the string or evaluated symbol.

---

Example:

Attach metadata to a collection:

```clj
^:foo [1 2 3]
;;=> [1 2 3]
```

View the resulting metadata:

```clj
(meta ^:foo [1 2 3])
;;=> {:foo true}

(meta ^{:foo "bar"} [1 2 3])
;;=> {:foo "bar"}

(meta ^"foo" [1 2 3])
;;=> {:tag "foo"}

(def foo 1)
(meta ^foo [1 2 3])
;;=> {:tag 1}
```

Chain metadata:

```clj
(meta ^:foo ^"foo" [1 2 3])
;;=> {:foo true, :tag "foo"}
```

---

See Also:

[`cljs.core/meta`](cljs.core_meta.md)<br>
[`cljs.core/with-meta`](cljs.core_with-meta.md)<br>
[`cljs.core/vary-meta`](cljs.core_vary-meta.md)<br>
[`cljs.core/alter-meta!`](cljs.core_alter-metaBANG.md)<br>

---


Source code:

```clj

```

 <pre>
clojure @ clojure-1.4.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/meta"]))
```

```clj
{:description "Attaches metadata to the following form.\n\nMetadata is a map.  It can be attached to a collection or symbol.\n\nIf the provided metadata is a keyword, the resulting metadata will be a map\ncontaining that keyword with an associated value `true`.\n\nIf the provided metadata is a string or symbol, the resulting metadata will be\na map associating `:tag` with the value of the string or evaluated symbol.",
 :ns "syntax",
 :name "meta",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/meta"
           "cljs.core/with-meta"
           "cljs.core/vary-meta"
           "cljs.core/alter-meta!"],
 :full-name-encode "syntax_meta",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "^",
 :examples [{:id "5b8fec",
             :content "Attach metadata to a collection:\n\n```clj\n^:foo [1 2 3]\n;;=> [1 2 3]\n```\n\nView the resulting metadata:\n\n```clj\n(meta ^:foo [1 2 3])\n;;=> {:foo true}\n\n(meta ^{:foo \"bar\"} [1 2 3])\n;;=> {:foo \"bar\"}\n\n(meta ^\"foo\" [1 2 3])\n;;=> {:tag \"foo\"}\n\n(def foo 1)\n(meta ^foo [1 2 3])\n;;=> {:tag 1}\n```\n\nChain metadata:\n\n```clj\n(meta ^:foo ^\"foo\" [1 2 3])\n;;=> {:foo true, :tag \"foo\"}\n```"}],
 :full-name "syntax/meta",
 :clj-doc "http://clojure.org/reader#toc2"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_meta.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_meta.cljsdoc)
</pre>

