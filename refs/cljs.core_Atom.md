## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Atom

 <table border="1">
<tr>

<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Atom</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Atom.java)
</td>
</tr>
</table>

 <samp>
(__Atom.__ state meta validator watches)<br>
</samp>

---





Source code:

```clj
(deftype Atom [state meta validator watches]
  Object
  (equiv [this other]
    (-equiv this other))

  IAtom
  
  IEquiv
  (-equiv [o other] (identical? o other))

  IDeref
  (-deref [_] state)

  IMeta
  (-meta [_] meta)

  IWatchable
  (-notify-watches [this oldval newval]
    (doseq [[key f] watches]
      (f key this oldval newval)))
  (-add-watch [this key f]
    (set! (.-watches this) (assoc watches key f))
    this)
  (-remove-watch [this key]
    (set! (.-watches this) (dissoc watches key)))

  IHash
  (-hash [this] (goog/getUid this)))
```

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3491-3518](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L3491-L3518)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Atom"]))
```

```clj
{:ns "cljs.core",
 :name "Atom",
 :signature ["[state meta validator watches]"],
 :history [["+" "0.0-927"]],
 :type "type",
 :full-name-encode "cljs.core_Atom",
 :source {:code "(deftype Atom [state meta validator watches]\n  Object\n  (equiv [this other]\n    (-equiv this other))\n\n  IAtom\n  \n  IEquiv\n  (-equiv [o other] (identical? o other))\n\n  IDeref\n  (-deref [_] state)\n\n  IMeta\n  (-meta [_] meta)\n\n  IWatchable\n  (-notify-watches [this oldval newval]\n    (doseq [[key f] watches]\n      (f key this oldval newval)))\n  (-add-watch [this key f]\n    (set! (.-watches this) (assoc watches key f))\n    this)\n  (-remove-watch [this key]\n    (set! (.-watches this) (dissoc watches key)))\n\n  IHash\n  (-hash [this] (goog/getUid this)))",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3491 3518]},
 :full-name "cljs.core/Atom",
 :clj-symbol "clojure.lang/Atom"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_Atom.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_Atom.cljsdoc)
</pre>

