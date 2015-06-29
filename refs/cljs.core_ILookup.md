## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ILookup

 <table border="1">
<tr>

<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ILookup</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ILookup.java)
</td>
</tr>
</table>





Source docstring:

```
Protocol for looking up a value in a data structure.
```

Source code:

```clj
(defprotocol ILookup
  "Protocol for looking up a value in a data structure."
  (-lookup [o k] [o k not-found]
    "Use k to look up a value in o. If not-found is supplied and k is not
     a valid value that can be used for look up, not-found is returned."))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:391-395](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L391-L395)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ILookup"]))
```

```clj
{:ns "cljs.core",
 :name "ILookup",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core_ILookup",
 :source {:code "(defprotocol ILookup\n  \"Protocol for looking up a value in a data structure.\"\n  (-lookup [o k] [o k not-found]\n    \"Use k to look up a value in o. If not-found is supplied and k is not\n     a valid value that can be used for look up, not-found is returned.\"))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [391 395]},
 :methods [{:name "-lookup",
            :signature ["[o k]" "[o k not-found]"],
            :docstring "Use k to look up a value in o. If not-found is supplied and k is not\n     a valid value that can be used for look up, not-found is returned."}],
 :full-name "cljs.core/ILookup",
 :clj-symbol "clojure.lang/ILookup",
 :docstring "Protocol for looking up a value in a data structure."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_ILookup.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_ILookup.cljsdoc)
</pre>

