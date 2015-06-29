## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl/mapped-stacktrace

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2843"><img valign="middle" alt="[+] 0.0-2843" src="https://img.shields.io/badge/+-0.0--2843-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__mapped-stacktrace__ stacktrace)<br>
</samp>
 <samp>
(__mapped-stacktrace__ stacktrace opts)<br>
</samp>

---




Source docstring:

```
Given a vector representing the canonicalized JavaScript stacktrace
return the ClojureScript stacktrace. The canonical stacktrace must be
in the form:

 [{:file <string>
   :function <string>
   :line <integer>
   :column <integer>}*]

:file must be a URL path (without protocol) relative to :output-dir or a
identifier delimited by angle brackets. The returned mapped stacktrace will
also contain :url entries to the original sources if it can be determined
from the classpath.
```

Source code:

```clj
(defn mapped-stacktrace
  ([stacktrace] (mapped-stacktrace stacktrace nil))
  ([stacktrace opts]
   (vec
     (let [mapped-frames (map (memoize #(mapped-frame % opts)) stacktrace)]
       ;; take each non-nil :call and optionally merge it into :function one-level up
       ;; to avoid replacing with local symbols, we only replace munged name if we can munge call symbol back to it
       (map #(merge-with (fn [munged-fn-name unmunged-call-name]
                           (if (= munged-fn-name (string/replace (cljs.compiler/munge unmunged-call-name) "." "$"))
                             unmunged-call-name
                             munged-fn-name)) %1 %2)
         (map #(dissoc % :call) mapped-frames)
         (concat (rest (map #(if (:call %)
                              (hash-map :function (:call %))
                              {})
                         mapped-frames)) [{}]))))))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:309-337](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/repl.cljc#L309-L337)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/mapped-stacktrace"]))
```

```clj
{:ns "cljs.repl",
 :name "mapped-stacktrace",
 :signature ["[stacktrace]" "[stacktrace opts]"],
 :history [["+" "0.0-2843"]],
 :type "function",
 :full-name-encode "cljs.repl_mapped-stacktrace",
 :source {:code "(defn mapped-stacktrace\n  ([stacktrace] (mapped-stacktrace stacktrace nil))\n  ([stacktrace opts]\n   (vec\n     (let [mapped-frames (map (memoize #(mapped-frame % opts)) stacktrace)]\n       ;; take each non-nil :call and optionally merge it into :function one-level up\n       ;; to avoid replacing with local symbols, we only replace munged name if we can munge call symbol back to it\n       (map #(merge-with (fn [munged-fn-name unmunged-call-name]\n                           (if (= munged-fn-name (string/replace (cljs.compiler/munge unmunged-call-name) \".\" \"$\"))\n                             unmunged-call-name\n                             munged-fn-name)) %1 %2)\n         (map #(dissoc % :call) mapped-frames)\n         (concat (rest (map #(if (:call %)\n                              (hash-map :function (:call %))\n                              {})\n                         mapped-frames)) [{}]))))))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [309 337]},
 :full-name "cljs.repl/mapped-stacktrace",
 :docstring "Given a vector representing the canonicalized JavaScript stacktrace\nreturn the ClojureScript stacktrace. The canonical stacktrace must be\nin the form:\n\n [{:file <string>\n   :function <string>\n   :line <integer>\n   :column <integer>}*]\n\n:file must be a URL path (without protocol) relative to :output-dir or a\nidentifier delimited by angle brackets. The returned mapped stacktrace will\nalso contain :url entries to the original sources if it can be determined\nfrom the classpath."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl_mapped-stacktrace.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl_mapped-stacktrace.cljsdoc)
</pre>

