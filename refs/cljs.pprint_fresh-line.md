## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/fresh-line

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/fresh-line</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/fresh-line)
</td>
</tr>
</table>

 <samp>
(__fresh-line__)<br>
</samp>

---




Source docstring:

```
Make a newline if *out* is not already at the beginning of the line. If *out* is
not a pretty writer (which keeps track of columns), this function always outputs a newline.
```

Source code:

```clj
(defn fresh-line
  []
  (if (satisfies? IDeref *out*)
    (if (not (= 0 (get-column (:base @@*out*))))
      (prn))
    (prn)))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:2106-2113](https://github.com/clojure/clojurescript/blob/r3263/src/main/cljs/cljs/pprint.cljs#L2106-L2113)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/fresh-line"]))
```

```clj
{:ns "cljs.pprint",
 :name "fresh-line",
 :signature ["[]"],
 :history [["+" "0.0-3255"]],
 :type "function",
 :full-name-encode "cljs.pprint_fresh-line",
 :source {:code "(defn fresh-line\n  []\n  (if (satisfies? IDeref *out*)\n    (if (not (= 0 (get-column (:base @@*out*))))\n      (prn))\n    (prn)))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [2106 2113]},
 :full-name "cljs.pprint/fresh-line",
 :clj-symbol "clojure.pprint/fresh-line",
 :docstring "Make a newline if *out* is not already at the beginning of the line. If *out* is\nnot a pretty writer (which keeps track of columns), this function always outputs a newline."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_fresh-line.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_fresh-line.cljsdoc)
</pre>

