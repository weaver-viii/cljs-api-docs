## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.nodejs/enable-util-print!

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2156"><img valign="middle" alt="[+] 0.0-2156" src="https://img.shields.io/badge/+-0.0--2156-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__enable-util-print!__)<br>
</samp>

---





Source code:

```clj
(defn enable-util-print! []
  (set! *print-newline* false)
  (set! *print-fn*
    (fn [& args]
      (.apply (.-log js/console) js/console (into-array args)))))
```

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[nodejs.cljs:18-22](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/nodejs.cljs#L18-L22)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.nodejs/enable-util-print!"]))
```

```clj
{:ns "cljs.nodejs",
 :name "enable-util-print!",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn enable-util-print! []\n  (set! *print-newline* false)\n  (set! *print-fn*\n    (fn [& args]\n      (.apply (.-log js/console) js/console (into-array args)))))",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/nodejs.cljs",
          :lines [18 22]},
 :full-name "cljs.nodejs/enable-util-print!",
 :full-name-encode "cljs.nodejs_enable-util-printBANG",
 :history [["+" "0.0-2156"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.nodejs_enable-util-printBANG.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.nodejs_enable-util-printBANG.cljsdoc)
</pre>

