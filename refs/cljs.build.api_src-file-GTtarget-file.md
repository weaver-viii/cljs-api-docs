## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/src-file->target-file

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__src-file->target-file__ src)<br>
</samp>
 <samp>
(__src-file->target-file__ src opts)<br>
</samp>

---




Source docstring:

```
Given a ClojureScript source file return the target file. May optionally
provide build options with :output-dir specified.
```

Source code:

```clj
(defn ^File src-file->target-file
  ([src] (closure/src-file->target-file src))
  ([src opts] (closure/src-file->target-file src opts)))
```

 <pre>
clojurescript @ r2629
└── src
    └── clj
        └── cljs
            └── build
                └── <ins>[api.clj:80-84](https://github.com/clojure/clojurescript/blob/r2629/src/clj/cljs/build/api.clj#L80-L84)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/src-file->target-file"]))
```

```clj
{:return-type File,
 :ns "cljs.build.api",
 :name "src-file->target-file",
 :signature ["[src]" "[src opts]"],
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.build.api_src-file-GTtarget-file",
 :source {:code "(defn ^File src-file->target-file\n  ([src] (closure/src-file->target-file src))\n  ([src opts] (closure/src-file->target-file src opts)))",
          :repo "clojurescript",
          :tag "r2629",
          :filename "src/clj/cljs/build/api.clj",
          :lines [80 84]},
 :full-name "cljs.build.api/src-file->target-file",
 :docstring "Given a ClojureScript source file return the target file. May optionally\nprovide build options with :output-dir specified."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_src-file-GTtarget-file.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_src-file-GTtarget-file.cljsdoc)
</pre>

