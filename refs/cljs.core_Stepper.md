## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Stepper

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Stepper.__ xform iter)<br>
</samp>

---





Source code:

```clj
(deftype Stepper [xform iter]
  Object
  (step [this lt]
    (loop []
      (if (and (not (nil? (.-stepper lt)))
               (.hasNext iter))
        (if (reduced? (xform lt (.next iter)))
          (when-not (nil? (.-rest lt))
            (set! (.. lt -rest -stepper) nil))
          (recur))))
    (when-not (nil? (.-stepper lt))
      (xform lt))))
```

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3127-3138](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L3127-L3138)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Stepper"]))
```

```clj
{:ns "cljs.core",
 :name "Stepper",
 :type "type",
 :signature ["[xform iter]"],
 :source {:code "(deftype Stepper [xform iter]\n  Object\n  (step [this lt]\n    (loop []\n      (if (and (not (nil? (.-stepper lt)))\n               (.hasNext iter))\n        (if (reduced? (xform lt (.next iter)))\n          (when-not (nil? (.-rest lt))\n            (set! (.. lt -rest -stepper) nil))\n          (recur))))\n    (when-not (nil? (.-stepper lt))\n      (xform lt))))",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3127 3138]},
 :full-name "cljs.core/Stepper",
 :full-name-encode "cljs.core_Stepper",
 :history [["+" "0.0-2301"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Stepper.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Stepper.cljsdoc)
</pre>

