## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/doseq

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/doseq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/doseq)
</td>
</tr>
</table>

 <samp>
(__doseq__ seq-exprs & body)<br>
</samp>

---

Repeatedly executes `body` (presumably for side-effects) with bindings and
filtering as provided by `for`. Does not retain the head of the sequence.

Returns nil.

---


See Also:

[`cljs.core/doall`](cljs.core_doall.md)<br>
[`cljs.core/dorun`](cljs.core_dorun.md)<br>
[`cljs.core/for`](cljs.core_for.md)<br>
[`cljs.core/dotimes`](cljs.core_dotimes.md)<br>

---

Source docstring:

```
Repeatedly executes body (presumably for side-effects) with
bindings and filtering as provided by "for".  Does not retain
the head of the sequence. Returns nil.
```

Source code:

```clj
(defmacro doseq
  [seq-exprs & body]
  (assert-args doseq
     (vector? seq-exprs) "a vector for its binding"
     (even? (count seq-exprs)) "an even number of forms in binding vector")
  (let [step (fn step [recform exprs]
               (if-not exprs
                 [true `(do ~@body)]
                 (let [k (first exprs)
                       v (second exprs)
                       
                       seqsym (when-not (keyword? k) (gensym))
                       recform (if (keyword? k) recform `(recur (first ~seqsym) ~seqsym))
                       steppair (step recform (nnext exprs))
                       needrec (steppair 0)
                       subform (steppair 1)]
                   (cond
                     (= k :let) [needrec `(let ~v ~subform)]
                     (= k :while) [false `(when ~v
                                            ~subform
                                            ~@(when needrec [recform]))]
                     (= k :when) [false `(if ~v
                                           (do
                                             ~subform
                                             ~@(when needrec [recform]))
                                           ~recform)]
                     :else [true `(let [~seqsym (seq ~v)]
                                    (when ~seqsym
                                      (loop [~k (first ~seqsym) ~seqsym ~seqsym]
                                       ~subform
                                       (when-let [~seqsym (next ~seqsym)]
                                        ~@(when needrec [recform])))))]))))]
    (nth (step nil (seq seq-exprs)) 1)))
```

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:749-784](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/core.clj#L749-L784)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/doseq"]))
```

```clj
{:description "Repeatedly executes `body` (presumably for side-effects) with bindings and\nfiltering as provided by `for`. Does not retain the head of the sequence.\n\nReturns nil.",
 :ns "cljs.core",
 :name "doseq",
 :signature ["[seq-exprs & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/doall"
           "cljs.core/dorun"
           "cljs.core/for"
           "cljs.core/dotimes"],
 :full-name-encode "cljs.core_doseq",
 :source {:code "(defmacro doseq\n  [seq-exprs & body]\n  (assert-args doseq\n     (vector? seq-exprs) \"a vector for its binding\"\n     (even? (count seq-exprs)) \"an even number of forms in binding vector\")\n  (let [step (fn step [recform exprs]\n               (if-not exprs\n                 [true `(do ~@body)]\n                 (let [k (first exprs)\n                       v (second exprs)\n                       \n                       seqsym (when-not (keyword? k) (gensym))\n                       recform (if (keyword? k) recform `(recur (first ~seqsym) ~seqsym))\n                       steppair (step recform (nnext exprs))\n                       needrec (steppair 0)\n                       subform (steppair 1)]\n                   (cond\n                     (= k :let) [needrec `(let ~v ~subform)]\n                     (= k :while) [false `(when ~v\n                                            ~subform\n                                            ~@(when needrec [recform]))]\n                     (= k :when) [false `(if ~v\n                                           (do\n                                             ~subform\n                                             ~@(when needrec [recform]))\n                                           ~recform)]\n                     :else [true `(let [~seqsym (seq ~v)]\n                                    (when ~seqsym\n                                      (loop [~k (first ~seqsym) ~seqsym ~seqsym]\n                                       ~subform\n                                       (when-let [~seqsym (next ~seqsym)]\n                                        ~@(when needrec [recform])))))]))))]\n    (nth (step nil (seq seq-exprs)) 1)))",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/clj/cljs/core.clj",
          :lines [749 784]},
 :full-name "cljs.core/doseq",
 :clj-symbol "clojure.core/doseq",
 :docstring "Repeatedly executes body (presumably for side-effects) with\nbindings and filtering as provided by \"for\".  Does not retain\nthe head of the sequence. Returns nil."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_doseq.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_doseq.cljsdoc)
</pre>

