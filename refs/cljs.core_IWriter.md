## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IWriter

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>





Source docstring:

```
Protocol for writing. Currently only implemented by StringBufferWriter.
```

Source code:

```clj
(defprotocol IWriter
  "Protocol for writing. Currently only implemented by StringBufferWriter."
  (-write [writer s]
    "Writes s with writer and returns the result.")
  (-flush [writer]
    "Flush writer."))
```

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:518-523](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L518-L523)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IWriter"]))
```

```clj
{:ns "cljs.core",
 :name "IWriter",
 :history [["+" "0.0-1503"]],
 :type "protocol",
 :full-name-encode "cljs.core_IWriter",
 :source {:code "(defprotocol IWriter\n  \"Protocol for writing. Currently only implemented by StringBufferWriter.\"\n  (-write [writer s]\n    \"Writes s with writer and returns the result.\")\n  (-flush [writer]\n    \"Flush writer.\"))",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [518 523]},
 :methods [{:name "-write",
            :signature ["[writer s]"],
            :docstring "Writes s with writer and returns the result."}
           {:name "-flush",
            :signature ["[writer]"],
            :docstring "Flush writer."}],
 :full-name "cljs.core/IWriter",
 :docstring "Protocol for writing. Currently only implemented by StringBufferWriter."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_IWriter.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_IWriter.cljsdoc)
</pre>

