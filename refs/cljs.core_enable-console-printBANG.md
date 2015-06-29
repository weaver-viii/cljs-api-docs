## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/enable-console-print!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2060"><img valign="middle" alt="[+] 0.0-2060" src="https://img.shields.io/badge/+-0.0--2060-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__enable-console-print!__)<br>
</samp>

---




Source docstring:

```
Set *print-fn* to console.log
```

Source code:

```clj
(defn enable-console-print!
  []
  (set! *print-newline* false)
  (set! *print-fn*
    (fn [& args]
      (.apply js/console.log js/console (into-array args)))))
```

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:49-55](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L49-L55)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/enable-console-print!"]))
```

```clj
{:ns "cljs.core",
 :name "enable-console-print!",
 :signature ["[]"],
 :history [["+" "0.0-2060"]],
 :type "function",
 :full-name-encode "cljs.core_enable-console-printBANG",
 :source {:code "(defn enable-console-print!\n  []\n  (set! *print-newline* false)\n  (set! *print-fn*\n    (fn [& args]\n      (.apply js/console.log js/console (into-array args)))))",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [49 55]},
 :full-name "cljs.core/enable-console-print!",
 :docstring "Set *print-fn* to console.log"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_enable-console-printBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_enable-console-printBANG.cljsdoc)
</pre>

