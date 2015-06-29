## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.compiler.api/compile-root

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__compile-root__ src-dir)<br>
</samp>
 <samp>
(__compile-root__ src-dir target-dir)<br>
</samp>
 <samp>
(__compile-root__ src-dir target-dir opts)<br>
</samp>

---




Source docstring:

```
Looks recursively in src-dir for .cljs files and compiles them to
.js files. If target-dir is provided, output will go into this
directory mirroring the source directory structure. Returns a list
of maps containing information about each file which was compiled
in dependency order.
```

Source code:

```clj
(defn compile-root
  ([src-dir]
   (comp/compile-root src-dir "out"))
  ([src-dir target-dir]
   (comp/compile-root src-dir target-dir nil))
  ([src-dir target-dir opts]
   (comp/compile-root src-dir target-dir opts)))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── clojure
            └── cljs
                └── compiler
                    └── <ins>[api.clj:67-78](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/compiler/api.clj#L67-L78)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/compile-root"]))
```

```clj
{:ns "cljs.compiler.api",
 :name "compile-root",
 :signature ["[src-dir]"
             "[src-dir target-dir]"
             "[src-dir target-dir opts]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api_compile-root",
 :source {:code "(defn compile-root\n  ([src-dir]\n   (comp/compile-root src-dir \"out\"))\n  ([src-dir target-dir]\n   (comp/compile-root src-dir target-dir nil))\n  ([src-dir target-dir opts]\n   (comp/compile-root src-dir target-dir opts)))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [67 78]},
 :full-name "cljs.compiler.api/compile-root",
 :docstring "Looks recursively in src-dir for .cljs files and compiles them to\n.js files. If target-dir is provided, output will go into this\ndirectory mirroring the source directory structure. Returns a list\nof maps containing information about each file which was compiled\nin dependency order."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.compiler.api_compile-root.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api_compile-root.cljsdoc)
</pre>

