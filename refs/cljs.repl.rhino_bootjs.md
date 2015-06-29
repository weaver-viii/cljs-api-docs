## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.rhino/bootjs

 <table border="1">
<tr>

<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:

```clj
(def ^String bootjs
  (str "var global = this;\n"
       "var CLOSURE_IMPORT_SCRIPT = function(src) {\n"
       "    var ns = \"cljs.repl.rhino\","
       "        name = \"load-file\","
       "        loadFile = Packages.clojure.lang.RT[\"var\"](ns,name);\n"
       "    if(src) loadFile.invoke(___repl_env, __repl_opts, src);\n"
       "};\n"))
```

 <pre>
clojurescript @ r3148
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:22-29](https://github.com/clojure/clojurescript/blob/r3148/src/clj/cljs/repl/rhino.clj#L22-L29)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/bootjs"]))
```

```clj
{:ns "cljs.repl.rhino",
 :name "bootjs",
 :type "var",
 :return-type String,
 :source {:code "(def ^String bootjs\n  (str \"var global = this;\\n\"\n       \"var CLOSURE_IMPORT_SCRIPT = function(src) {\\n\"\n       \"    var ns = \\\"cljs.repl.rhino\\\",\"\n       \"        name = \\\"load-file\\\",\"\n       \"        loadFile = Packages.clojure.lang.RT[\\\"var\\\"](ns,name);\\n\"\n       \"    if(src) loadFile.invoke(___repl_env, __repl_opts, src);\\n\"\n       \"};\\n\"))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [22 29]},
 :full-name "cljs.repl.rhino/bootjs",
 :full-name-encode "cljs.repl.rhino_bootjs",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.rhino_bootjs.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino_bootjs.cljsdoc)
</pre>

