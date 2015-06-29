## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/int-rotate-left

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__int-rotate-left__ x n)<br>
</samp>

---





Source code:

```clj
(defn ^number int-rotate-left [x n]
  (bit-or
    (bit-shift-left x n)
    (unsigned-bit-shift-right x (- n))))
```

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:433-436](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L433-L436)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/int-rotate-left"]))
```

```clj
{:return-type number,
 :ns "cljs.core",
 :name "int-rotate-left",
 :signature ["[x n]"],
 :history [["+" "0.0-2261"]],
 :type "function",
 :full-name-encode "cljs.core_int-rotate-left",
 :source {:code "(defn ^number int-rotate-left [x n]\n  (bit-or\n    (bit-shift-left x n)\n    (unsigned-bit-shift-right x (- n))))",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [433 436]},
 :full-name "cljs.core/int-rotate-left"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_int-rotate-left.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_int-rotate-left.cljsdoc)
</pre>

