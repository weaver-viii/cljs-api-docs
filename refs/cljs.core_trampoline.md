## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/trampoline

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/trampoline</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/trampoline)
</td>
</tr>
</table>

 <samp>
(__trampoline__ f)<br>
</samp>
 <samp>
(__trampoline__ f & args)<br>
</samp>

---




Source docstring:

```
trampoline can be used to convert algorithms requiring mutual
recursion without stack consumption. Calls f with supplied args, if
any. If f returns a fn, calls that fn with no arguments, and
continues to repeat, until the return value is not a fn, then
returns that non-fn value. Note that if you want to return a fn as a
final value, you must wrap it in some data structure and unpack it
after trampoline returns.
```

Source code:

```clj
(defn trampoline
  ([f]
     (let [ret (f)]
       (if (fn? ret)
         (recur ret)
         ret)))
  ([f & args]
     (trampoline #(apply f args))))
```

 <pre>
clojurescript @ r2234
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7475-7489](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/cljs/core.cljs#L7475-L7489)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/trampoline"]))
```

```clj
{:ns "cljs.core",
 :name "trampoline",
 :signature ["[f]" "[f & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_trampoline",
 :source {:code "(defn trampoline\n  ([f]\n     (let [ret (f)]\n       (if (fn? ret)\n         (recur ret)\n         ret)))\n  ([f & args]\n     (trampoline #(apply f args))))",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7475 7489]},
 :full-name "cljs.core/trampoline",
 :clj-symbol "clojure.core/trampoline",
 :docstring "trampoline can be used to convert algorithms requiring mutual\nrecursion without stack consumption. Calls f with supplied args, if\nany. If f returns a fn, calls that fn with no arguments, and\ncontinues to repeat, until the return value is not a fn, then\nreturns that non-fn value. Note that if you want to return a fn as a\nfinal value, you must wrap it in some data structure and unpack it\nafter trampoline returns."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_trampoline.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_trampoline.cljsdoc)
</pre>

