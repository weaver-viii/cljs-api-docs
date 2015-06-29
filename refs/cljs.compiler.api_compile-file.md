## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.compiler.api/compile-file

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__compile-file__ src)<br>
</samp>
 <samp>
(__compile-file__ src dest)<br>
</samp>
 <samp>
(__compile-file__ src dest opts)<br>
</samp>

---




Source docstring:

```
Compiles src to a file of the same name, but with a .js extension,
in the src file's directory.

With dest argument, write file to provided location. If the dest
argument is a file outside the source tree, missing parent
directories will be created. The src file will only be compiled if
the dest file has an older modification time.

Both src and dest may be either a String or a File.

Returns a map containing {:ns .. :provides .. :requires .. :file ..}.
If the file was not compiled returns only {:file ...}
```

Source code:

```clj
(defn compile-file
  ([src]
   (comp/compile-file src))
  ([src dest]
   (comp/compile-file src dest))
  ([src dest opts]
   (comp/compile-file src dest opts)))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── clojure
            └── cljs
                └── compiler
                    └── <ins>[api.clj:42-60](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/compiler/api.clj#L42-L60)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.compiler.api/compile-file"]))
```

```clj
{:ns "cljs.compiler.api",
 :name "compile-file",
 :signature ["[src]" "[src dest]" "[src dest opts]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.compiler.api_compile-file",
 :source {:code "(defn compile-file\n  ([src]\n   (comp/compile-file src))\n  ([src dest]\n   (comp/compile-file src dest))\n  ([src dest opts]\n   (comp/compile-file src dest opts)))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/clojure/cljs/compiler/api.clj",
          :lines [42 60]},
 :full-name "cljs.compiler.api/compile-file",
 :docstring "Compiles src to a file of the same name, but with a .js extension,\nin the src file's directory.\n\nWith dest argument, write file to provided location. If the dest\nargument is a file outside the source tree, missing parent\ndirectories will be created. The src file will only be compiled if\nthe dest file has an older modification time.\n\nBoth src and dest may be either a String or a File.\n\nReturns a map containing {:ns .. :provides .. :requires .. :file ..}.\nIf the file was not compiled returns only {:file ...}"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.compiler.api_compile-file.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.compiler.api_compile-file.cljsdoc)
</pre>

