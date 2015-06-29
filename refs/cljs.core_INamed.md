## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/INamed

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Named</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Named.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for adding a name.
```

Source code:

```clj
(defprotocol INamed
  "Protocol for adding a name."
  (^string -name [x]
    "Returns the name String of x.")
  (^string -namespace [x]
    "Returns the namespace String of x."))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:607-612](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/core.cljs#L607-L612)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/INamed"]))
```

```clj
{:ns "cljs.core",
 :name "INamed",
 :history [["+" "0.0-1798"]],
 :type "protocol",
 :full-name-encode "cljs.core_INamed",
 :source {:code "(defprotocol INamed\n  \"Protocol for adding a name.\"\n  (^string -name [x]\n    \"Returns the name String of x.\")\n  (^string -namespace [x]\n    \"Returns the namespace String of x.\"))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [607 612]},
 :methods [{:name "-name",
            :signature ["[x]"],
            :docstring "Returns the name String of x."}
           {:name "-namespace",
            :signature ["[x]"],
            :docstring "Returns the namespace String of x."}],
 :full-name "cljs.core/INamed",
 :clj-symbol "clojure.lang/Named",
 :docstring "Protocol for adding a name."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_INamed.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_INamed.cljsdoc)
</pre>

