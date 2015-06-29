## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.build.api/ns->location

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ns->location__ ns)<br>
</samp>
 <samp>
(__ns->location__ ns compiler-env)<br>
</samp>

---




Source docstring:

```
Given a namespace and compilation environment return the relative path and
uri of the corresponding source regardless of the source language extension:
.cljs, .cljc, .js. Returns a map containing :relative-path a string, and
:uri a URL.
```

Source code:

```clj
(defn ns->location
  ([ns] (ns->location ns env/*compiler*))
  ([ns compiler-env]
   (closure/source-for-namespace ns compiler-env)))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:117-124](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/build/api.clj#L117-L124)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/ns->location"]))
```

```clj
{:ns "cljs.build.api",
 :name "ns->location",
 :signature ["[ns]" "[ns compiler-env]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api_ns-GTlocation",
 :source {:code "(defn ns->location\n  ([ns] (ns->location ns env/*compiler*))\n  ([ns compiler-env]\n   (closure/source-for-namespace ns compiler-env)))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [117 124]},
 :full-name "cljs.build.api/ns->location",
 :docstring "Given a namespace and compilation environment return the relative path and\nuri of the corresponding source regardless of the source language extension:\n.cljs, .cljc, .js. Returns a map containing :relative-path a string, and\n:uri a URL."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.build.api_ns-GTlocation.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api_ns-GTlocation.cljsdoc)
</pre>

