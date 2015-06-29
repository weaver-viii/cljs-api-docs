## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-debugger

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-debugger__)<br>
</samp>

---

Creates breakpoint that will stop the debugger if the browser's devtools are
open.  Equivalent to `debugger;` in JavaScript.

---

Example:

```clj
(defn foo []
  (println "HI")
  (js-debugger)
  (println "WORLD"))

(foo)
;; will print "HI" then pause JS inside this function
;; if browser devtools are open.
```

---


Source docstring:

```
Emit JavaScript "debugger;" statement.
```

Source code:

```clj
(defmacro js-debugger
  []
  (core/list 'js* "debugger;"))
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:309-312](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/core.clj#L309-L312)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-debugger"]))
```

```clj
{:description "Creates breakpoint that will stop the debugger if the browser's devtools are\nopen.  Equivalent to `debugger;` in JavaScript.",
 :ns "cljs.core",
 :name "js-debugger",
 :signature ["[]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.core_js-debugger",
 :source {:code "(defmacro js-debugger\n  []\n  (core/list 'js* \"debugger;\"))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/clj/cljs/core.clj",
          :lines [309 312]},
 :examples [{:id "87f2fa",
             :content "```clj\n(defn foo []\n  (println \"HI\")\n  (js-debugger)\n  (println \"WORLD\"))\n\n(foo)\n;; will print \"HI\" then pause JS inside this function\n;; if browser devtools are open.\n```"}],
 :full-name "cljs.core/js-debugger",
 :docstring "Emit JavaScript \"debugger;\" statement."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-debugger.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-debugger.cljsdoc)
</pre>

