## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/capitalize

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/capitalize</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/capitalize)
</td>
</tr>
</table>

 <samp>
(__capitalize__ s)<br>
</samp>

---

Converts first character of the string to upper-case, all other characters to
lower-case.

---



Source docstring:

```
Converts first character of the string to upper-case, all other
characters to lower-case.
```

Source code:

```clj
(defn capitalize
  [s]
  (if (< (count s) 2)
    (upper-case s)
    (str (upper-case (subs s 0 1))
         (lower-case (subs s 1)))))
```

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:63-70](https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/string.cljs#L63-L70)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/capitalize"]))
```

```clj
{:description "Converts first character of the string to upper-case, all other characters to\nlower-case.",
 :ns "clojure.string",
 :name "capitalize",
 :signature ["[s]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.string_capitalize",
 :source {:code "(defn capitalize\n  [s]\n  (if (< (count s) 2)\n    (upper-case s)\n    (str (upper-case (subs s 0 1))\n         (lower-case (subs s 1)))))",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/cljs/clojure/string.cljs",
          :lines [63 70]},
 :full-name "clojure.string/capitalize",
 :clj-symbol "clojure.string/capitalize",
 :docstring "Converts first character of the string to upper-case, all other\ncharacters to lower-case."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_capitalize.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_capitalize.cljsdoc)
</pre>

