## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/name

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/name</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/name)
</td>
</tr>
</table>

 <samp>
(__name__ x)<br>
</samp>

---

Returns a string value of a keyword, string, or symbol.

`(name :foo)` => `"foo"`

`(name "foo")` => `"foo"`

`(name 'foo)` => `"foo"`

---



Source docstring:

```
Returns the name String of a string, symbol or keyword.
```

Source code:

```clj
(defn name
  [x]
  (if (implements? INamed x)
    (-name ^not-native x)
    (if (string? x)
      x
      (throw (js/Error. (str "Doesn't support name: " x))))))
```

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:7993-8000](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L7993-L8000)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/name"]))
```

```clj
{:description "Returns a string value of a keyword, string, or symbol.\n\n`(name :foo)` => `\"foo\"`\n\n`(name \"foo\")` => `\"foo\"`\n\n`(name 'foo)` => `\"foo\"`",
 :ns "cljs.core",
 :name "name",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_name",
 :source {:code "(defn name\n  [x]\n  (if (implements? INamed x)\n    (-name ^not-native x)\n    (if (string? x)\n      x\n      (throw (js/Error. (str \"Doesn't support name: \" x))))))",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [7993 8000]},
 :full-name "cljs.core/name",
 :clj-symbol "clojure.core/name",
 :docstring "Returns the name String of a string, symbol or keyword."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_name.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_name.cljsdoc)
</pre>

