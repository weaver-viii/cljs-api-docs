## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/doto

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/doto</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/doto)
</td>
</tr>
</table>

 <samp>
(__doto__ x & forms)<br>
</samp>

---




Source docstring:

```
Evaluates x then calls all of the methods and functions with the
value of x supplied at the front of the given arguments.  The forms
are evaluated in order.  Returns x.

(doto (new java.util.HashMap) (.put "a" 1) (.put "b" 2))
```

Source code:

```clj
(defmacro doto
  [x & forms]
    (let [gx (gensym)]
      `(let [~gx ~x]
         ~@(map (fn [f]
                  (if (seq? f)
                    `(~(first f) ~gx ~@(next f))
                    `(~f ~gx)))
                forms)
         ~gx)))
```

 <pre>
clojure @ clojure-1.7.0-beta2
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:3698-3713](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta2/src/clj/clojure/core.clj#L3698-L3713)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/doto"]))
```

```clj
{:ns "cljs.core",
 :name "doto",
 :signature ["[x & forms]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_doto",
 :source {:code "(defmacro doto\n  [x & forms]\n    (let [gx (gensym)]\n      `(let [~gx ~x]\n         ~@(map (fn [f]\n                  (if (seq? f)\n                    `(~(first f) ~gx ~@(next f))\n                    `(~f ~gx)))\n                forms)\n         ~gx)))",
          :repo "clojure",
          :tag "clojure-1.7.0-beta2",
          :filename "src/clj/clojure/core.clj",
          :lines [3698 3713]},
 :full-name "cljs.core/doto",
 :clj-symbol "clojure.core/doto",
 :docstring "Evaluates x then calls all of the methods and functions with the\nvalue of x supplied at the front of the given arguments.  The forms\nare evaluated in order.  Returns x.\n\n(doto (new java.util.HashMap) (.put \"a\" 1) (.put \"b\" 2))"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_doto.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_doto.cljsdoc)
</pre>

