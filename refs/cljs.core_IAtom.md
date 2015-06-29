## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IAtom

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2173"><img valign="middle" alt="[+] 0.0-2173" src="https://img.shields.io/badge/+-0.0--2173-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/IAtom</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/IAtom.java)
</td>
</tr>
</table>





Source docstring:

```
Marker protocol indicating an atom.
```

Source code:

```clj
(defprotocol IAtom
  "Marker protocol indicating an atom.")
```

 <pre>
clojurescript @ r3264
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:614-615](https://github.com/clojure/clojurescript/blob/r3264/src/main/cljs/cljs/core.cljs#L614-L615)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IAtom"]))
```

```clj
{:ns "cljs.core",
 :name "IAtom",
 :history [["+" "0.0-2173"]],
 :type "protocol",
 :full-name-encode "cljs.core_IAtom",
 :source {:code "(defprotocol IAtom\n  \"Marker protocol indicating an atom.\")",
          :repo "clojurescript",
          :tag "r3264",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [614 615]},
 :full-name "cljs.core/IAtom",
 :clj-symbol "clojure.lang/IAtom",
 :docstring "Marker protocol indicating an atom."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IAtom.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IAtom.cljsdoc)
</pre>

