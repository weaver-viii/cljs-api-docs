## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/Math-ns

 <table border="1">
<tr>
<td><samp>Math/</samp></td>
<td>special namespace</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/java_interop#toc6)
</td>
</tr>
</table>






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
    (get-in [:symbols "syntax/Math-ns"]))
```

```clj
{:ns "syntax",
 :name "Math-ns",
 :history [["+" "0.0-927"]],
 :type "special namespace",
 :full-name-encode "syntax_Math-ns",
 :source {:repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :syntax-form "Math/",
 :full-name "syntax/Math-ns",
 :clj-doc "http://clojure.org/java_interop#toc6"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_Math-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_Math-ns.cljsdoc)
</pre>

