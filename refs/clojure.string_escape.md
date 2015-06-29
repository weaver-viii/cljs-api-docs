## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/escape

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/escape</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/escape)
</td>
</tr>
</table>

 <samp>
(__escape__ s cmap)<br>
</samp>

---

Return a new string, using `cmap` to escape each character `ch` from `s` as follows:

If `(cmap ch)` is nil, append ch to the new string.

If `(cmap ch)` is non-nil, append `(str (cmap ch))` instead.

---



Source docstring:

```
Return a new string, using cmap to escape each character ch
from s as follows:

If (cmap ch) is nil, append ch to the new string.
If (cmap ch) is non-nil, append (str (cmap ch)) instead.
```

Source code:

```clj
(defn escape
  [s cmap]
  (let [buffer (StringBuffer.)
        length (.-length s)]
    (loop [index 0]
      (if (= length index)
        (. buffer (toString))
        (let [ch (.charAt s index)]
          (if-let [replacement (get cmap ch)]
            (.append buffer (str replacement))
            (.append buffer ch))
          (recur (inc index)))))))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:179-195](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/clojure/string.cljs#L179-L195)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/escape"]))
```

```clj
{:description "Return a new string, using `cmap` to escape each character `ch` from `s` as follows:\n\nIf `(cmap ch)` is nil, append ch to the new string.\n\nIf `(cmap ch)` is non-nil, append `(str (cmap ch))` instead.",
 :ns "clojure.string",
 :name "escape",
 :signature ["[s cmap]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_escape",
 :source {:code "(defn escape\n  [s cmap]\n  (let [buffer (StringBuffer.)\n        length (.-length s)]\n    (loop [index 0]\n      (if (= length index)\n        (. buffer (toString))\n        (let [ch (.charAt s index)]\n          (if-let [replacement (get cmap ch)]\n            (.append buffer (str replacement))\n            (.append buffer ch))\n          (recur (inc index)))))))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/clojure/string.cljs",
          :lines [179 195]},
 :full-name "clojure.string/escape",
 :clj-symbol "clojure.string/escape",
 :docstring "Return a new string, using cmap to escape each character ch\nfrom s as follows:\n\nIf (cmap ch) is nil, append ch to the new string.\nIf (cmap ch) is non-nil, append (str (cmap ch)) instead."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_escape.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_escape.cljsdoc)
</pre>

