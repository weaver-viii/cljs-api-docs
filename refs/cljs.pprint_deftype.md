## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.pprint/deftype

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__deftype__ type-name & fields)<br>
</samp>

---





Source code:

```clj
(defmacro deftype
  [type-name & fields]
  (let [name-str (name type-name)
        fields (map (comp symbol name) fields)]
    `(do
       (defrecord ~type-name [~'type-tag ~@fields])
       (defn- ~(symbol (str "make-" name-str))
         ~(vec fields)
         (~(symbol (str type-name ".")) ~(keyword name-str) ~@fields))
       (defn- ~(symbol (str name-str "?")) [x#] (= (:type-tag x#) ~(keyword name-str))))))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.clj:39-48](https://github.com/clojure/clojurescript/blob/r3297/src/main/cljs/cljs/pprint.clj#L39-L48)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/deftype"]))
```

```clj
{:ns "cljs.pprint",
 :name "deftype",
 :type "macro",
 :signature ["[type-name & fields]"],
 :source {:code "(defmacro deftype\n  [type-name & fields]\n  (let [name-str (name type-name)\n        fields (map (comp symbol name) fields)]\n    `(do\n       (defrecord ~type-name [~'type-tag ~@fields])\n       (defn- ~(symbol (str \"make-\" name-str))\n         ~(vec fields)\n         (~(symbol (str type-name \".\")) ~(keyword name-str) ~@fields))\n       (defn- ~(symbol (str name-str \"?\")) [x#] (= (:type-tag x#) ~(keyword name-str))))))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/cljs/cljs/pprint.clj",
          :lines [39 48]},
 :full-name "cljs.pprint/deftype",
 :full-name-encode "cljs.pprint_deftype",
 :history [["+" "0.0-3255"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.pprint_deftype.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint_deftype.cljsdoc)
</pre>

