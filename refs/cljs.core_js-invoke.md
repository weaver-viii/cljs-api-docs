## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/js-invoke

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2411"><img valign="middle" alt="[+] 0.0-2411" src="https://img.shields.io/badge/+-0.0--2411-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__js-invoke__ obj s & args)<br>
</samp>

---

Invoke JavaScript object `obj` method via string `s`. Needed when the string is
not a valid unquoted property name.

---

Example:

If we have a JavaScript object with an unusual property name:

```js
// JavaScript
var obj = {
  "my sum": function(a,b) { return a+b; }
};
```

We can invoke it from ClojureScript:

```clj
(js-invoke js/obj "my sum" 1 2)
;=> 3
```

---


Source docstring:

```
Invoke JavaScript object method via string. Needed when the
string is not a valid unquoted property name.
```

Source code:

```clj
(defn js-invoke
  [obj s & args]
  (.apply (aget obj s) obj (into-array args)))
```

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:298-302](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L298-L302)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/js-invoke"]))
```

```clj
{:description "Invoke JavaScript object `obj` method via string `s`. Needed when the string is\nnot a valid unquoted property name.",
 :ns "cljs.core",
 :name "js-invoke",
 :signature ["[obj s & args]"],
 :history [["+" "0.0-2411"]],
 :type "function",
 :full-name-encode "cljs.core_js-invoke",
 :source {:code "(defn js-invoke\n  [obj s & args]\n  (.apply (aget obj s) obj (into-array args)))",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [298 302]},
 :examples [{:id "373cce",
             :content "If we have a JavaScript object with an unusual property name:\n\n```js\n// JavaScript\nvar obj = {\n  \"my sum\": function(a,b) { return a+b; }\n};\n```\n\nWe can invoke it from ClojureScript:\n\n```clj\n(js-invoke js/obj \"my sum\" 1 2)\n;=> 3\n```"}],
 :full-name "cljs.core/js-invoke",
 :docstring "Invoke JavaScript object method via string. Needed when the\nstring is not a valid unquoted property name."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_js-invoke.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_js-invoke.cljsdoc)
</pre>

