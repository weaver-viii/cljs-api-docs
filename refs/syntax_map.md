## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/map

 <table border="1">
<tr>
<td><samp>{}</samp></td>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#maps)
</td>
</tr>
</table>


Signifies a map.  Must contain pairs of key-values.  Keys and values can be any type.

---

Example:

```clj
{:foo 1 :bar 2}
;;=> {:foo 1, :bar 2}
```

Use any value as a key:

```clj
(def m {[1 2] 3})
(get m [1 2])
;;=> 3
```

---

See Also:

[`cljs.core/hash-map`](cljs.core_hash-map.md)<br>
[`cljs.core/array-map`](cljs.core_array-map.md)<br>
[`cljs.core/sorted-map`](cljs.core_sorted-map.md)<br>
[`cljs.core/sorted-map-by`](cljs.core_sorted-map-by.md)<br>

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
    (get-in [:symbols "syntax/map"]))
```

```clj
{:description "Signifies a map.  Must contain pairs of key-values.  Keys and values can be any type.",
 :ns "syntax",
 :name "map",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/hash-map"
           "cljs.core/array-map"
           "cljs.core/sorted-map"
           "cljs.core/sorted-map-by"],
 :full-name-encode "syntax_map",
 :source {:repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "{}",
 :examples [{:id "4696ad",
             :content "```clj\n{:foo 1 :bar 2}\n;;=> {:foo 1, :bar 2}\n```\n\nUse any value as a key:\n\n```clj\n(def m {[1 2] 3})\n(get m [1 2])\n;;=> 3\n```"}],
 :edn-doc "https://github.com/edn-format/edn#maps",
 :full-name "syntax/map",
 :clj-doc "http://clojure.org/reader#toc1"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_map.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_map.cljsdoc)
</pre>

