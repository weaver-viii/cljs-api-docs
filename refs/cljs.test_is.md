## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.test/is

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/is</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/is)
</td>
</tr>
</table>

 <samp>
(__is__ form)<br>
</samp>
 <samp>
(__is__ form msg)<br>
</samp>

---




Source docstring:

```
Generic assertion macro.  'form' is any predicate test.
'msg' is an optional message to attach to the assertion.

Example: (is (= 4 (+ 2 2)) "Two plus two should be 4")

Special forms:

(is (thrown? c body)) checks that an instance of c is thrown from
body, fails if not; then returns the thing thrown.

(is (thrown-with-msg? c re body)) checks that an instance of c is
thrown AND that the message on the exception matches (with
re-find) the regular expression re.
```

Source code:

```clj
(defmacro is
  ([form] `(cljs.test/is ~form nil))
  ([form msg]
   `(cljs.test/try-expr ~msg ~form)))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:149-165](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/test.clj#L149-L165)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/is"]))
```

```clj
{:ns "cljs.test",
 :name "is",
 :signature ["[form]" "[form msg]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test_is",
 :source {:code "(defmacro is\n  ([form] `(cljs.test/is ~form nil))\n  ([form msg]\n   `(cljs.test/try-expr ~msg ~form)))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/test.clj",
          :lines [149 165]},
 :full-name "cljs.test/is",
 :clj-symbol "clojure.test/is",
 :docstring "Generic assertion macro.  'form' is any predicate test.\n'msg' is an optional message to attach to the assertion.\n\nExample: (is (= 4 (+ 2 2)) \"Two plus two should be 4\")\n\nSpecial forms:\n\n(is (thrown? c body)) checks that an instance of c is thrown from\nbody, fails if not; then returns the thing thrown.\n\n(is (thrown-with-msg? c re body)) checks that an instance of c is\nthrown AND that the message on the exception matches (with\nre-find) the regular expression re."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.test_is.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test_is.cljsdoc)
</pre>

