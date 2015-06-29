## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/assert

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/assert</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/assert)
</td>
</tr>
</table>

 <samp>
(__assert__ expr)<br>
</samp>
 <samp>
(__assert__ expr message)<br>
</samp>

---

Evaluates expression `expr` and throws an exception if it does not evaluate to
logical true.  Exception will include `message` if given.

Returns `nil`.

---

Example:

```clj
(assert true)
;;=> nil

(assert false)
;;=> Uncaught Error: Assert failed: false

(assert (= 1 2) "1 is not 2")
;;=> Uncaught Error: Assert failed: 1 is not 2
;;   (= 1 2)
```

---


Source docstring:

```
Evaluates expr and throws an exception if it does not evaluate to
logical true.
```

Source code:

```clj
(defmacro assert
  ([x]
     (when *assert*
       `(when-not ~x
          (throw (js/Error.
                  (cljs.core/str "Assert failed: " (cljs.core/pr-str '~x)))))))
  ([x message]
     (when *assert*
       `(when-not ~x
          (throw (js/Error.
                  (cljs.core/str "Assert failed: " ~message "\n" (cljs.core/pr-str '~x))))))))
```

 <pre>
clojurescript @ r1535
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:886-898](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L886-L898)</ins>
</pre>


---

```clj
(defmacro assert
  ([x]
     (when *assert*
       `(when-not ~x
          (throw (new AssertionError (str "Assert failed: " (pr-str '~x)))))))
  ([x message]
     (when *assert*
       `(when-not ~x
          (throw (new AssertionError (str "Assert failed: " ~message "\n" (pr-str '~x))))))))
```

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4246-4257](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L4246-L4257)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/assert"]))
```

```clj
{:description "Evaluates expression `expr` and throws an exception if it does not evaluate to\nlogical true.  Exception will include `message` if given.\n\nReturns `nil`.",
 :ns "cljs.core",
 :name "assert",
 :signature ["[expr]" "[expr message]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_assert",
 :source {:code "(defmacro assert\n  ([x]\n     (when *assert*\n       `(when-not ~x\n          (throw (js/Error.\n                  (cljs.core/str \"Assert failed: \" (cljs.core/pr-str '~x)))))))\n  ([x message]\n     (when *assert*\n       `(when-not ~x\n          (throw (js/Error.\n                  (cljs.core/str \"Assert failed: \" ~message \"\\n\" (cljs.core/pr-str '~x))))))))",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/clj/cljs/core.clj",
          :lines [886 898]},
 :extra-sources ({:code "(defmacro assert\n  ([x]\n     (when *assert*\n       `(when-not ~x\n          (throw (new AssertionError (str \"Assert failed: \" (pr-str '~x)))))))\n  ([x message]\n     (when *assert*\n       `(when-not ~x\n          (throw (new AssertionError (str \"Assert failed: \" ~message \"\\n\" (pr-str '~x))))))))",
                  :repo "clojure",
                  :tag "clojure-1.4.0",
                  :filename "src/clj/clojure/core.clj",
                  :lines [4246 4257]}),
 :examples [{:id "1dc16f",
             :content "```clj\n(assert true)\n;;=> nil\n\n(assert false)\n;;=> Uncaught Error: Assert failed: false\n\n(assert (= 1 2) \"1 is not 2\")\n;;=> Uncaught Error: Assert failed: 1 is not 2\n;;   (= 1 2)\n```"}],
 :full-name "cljs.core/assert",
 :clj-symbol "clojure.core/assert",
 :docstring "Evaluates expr and throws an exception if it does not evaluate to\nlogical true."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_assert.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_assert.cljsdoc)
</pre>

