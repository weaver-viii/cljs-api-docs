## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/dotimes

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/dotimes</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/dotimes)
</td>
</tr>
</table>

 <samp>
(__dotimes__ \[name n\] & body)<br>
</samp>

---

Repeatedly executes `body` (presumably for side-effects) with `name` bound to
integers from 0 through `n`-1.

---


See Also:

[`cljs.core/repeat`](cljs.core_repeat.md)<br>
[`cljs.core/for`](cljs.core_for.md)<br>
[`cljs.core/doseq`](cljs.core_doseq.md)<br>

---

Source docstring:

```
bindings => name n

Repeatedly executes body (presumably for side-effects) with name
bound to integers from 0 through n-1.
```

Source code:

```clj
(defmacro dotimes
  [bindings & body]
  (let [i (first bindings)
        n (second bindings)]
    `(let [n# ~n]
       (loop [~i 0]
         (when (< ~i n#)
           ~@body
           (recur (inc ~i)))))))
```

 <pre>
clojurescript @ r1886
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1241-1253](https://github.com/clojure/clojurescript/blob/r1886/src/clj/cljs/core.clj#L1241-L1253)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/dotimes"]))
```

```clj
{:description "Repeatedly executes `body` (presumably for side-effects) with `name` bound to\nintegers from 0 through `n`-1.",
 :ns "cljs.core",
 :name "dotimes",
 :signature ["[[name n] & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/repeat" "cljs.core/for" "cljs.core/doseq"],
 :full-name-encode "cljs.core_dotimes",
 :source {:code "(defmacro dotimes\n  [bindings & body]\n  (let [i (first bindings)\n        n (second bindings)]\n    `(let [n# ~n]\n       (loop [~i 0]\n         (when (< ~i n#)\n           ~@body\n           (recur (inc ~i)))))))",
          :repo "clojurescript",
          :tag "r1886",
          :filename "src/clj/cljs/core.clj",
          :lines [1241 1253]},
 :full-name "cljs.core/dotimes",
 :clj-symbol "clojure.core/dotimes",
 :docstring "bindings => name n\n\nRepeatedly executes body (presumably for side-effects) with name\nbound to integers from 0 through n-1."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_dotimes.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_dotimes.cljsdoc)
</pre>

