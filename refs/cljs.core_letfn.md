## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/letfn

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/letfn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/letfn)
</td>
</tr>
</table>

 <samp>
(__letfn__ fnspecs & body)<br>
</samp>

---

Takes a vector of function definitions `fnspecs` and binds the functions to
their names. All of the names are available in all of the definitions of the
functions as well as `body`.

`fnspecs` must be a vector with an even number of forms. See `let`.

`letfn` is a wrapper over one of ClojureScript's [special forms].

[special forms]:http://clojure.org/special_forms

---


See Also:

[`cljs.core/let`](cljs.core_let.md)<br>

---

Source docstring:

```
fnspec ==> (fname [params*] exprs) or (fname ([params*] exprs)+)

Takes a vector of function specs and a body, and generates a set of
bindings of functions to their names. All of the names are available
in all of the definitions of the functions, as well as the body.
```

Source code:

```clj
(defmacro letfn 
  [fnspecs & body] 
  `(letfn* ~(vec (interleave (map first fnspecs) 
                             (map #(cons `fn %) fnspecs)))
           ~@body))
```

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:5922-5933](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L5922-L5933)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/letfn"]))
```

```clj
{:description "Takes a vector of function definitions `fnspecs` and binds the functions to\ntheir names. All of the names are available in all of the definitions of the\nfunctions as well as `body`.\n\n`fnspecs` must be a vector with an even number of forms. See `let`.\n\n`letfn` is a wrapper over one of ClojureScript's [special forms].\n\n[special forms]:http://clojure.org/special_forms",
 :ns "cljs.core",
 :name "letfn",
 :signature ["[fnspecs & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/let"],
 :full-name-encode "cljs.core_letfn",
 :source {:code "(defmacro letfn \n  [fnspecs & body] \n  `(letfn* ~(vec (interleave (map first fnspecs) \n                             (map #(cons `fn %) fnspecs)))\n           ~@body))",
          :repo "clojure",
          :tag "clojure-1.5.1",
          :filename "src/clj/clojure/core.clj",
          :lines [5922 5933]},
 :full-name "cljs.core/letfn",
 :clj-symbol "clojure.core/letfn",
 :docstring "fnspec ==> (fname [params*] exprs) or (fname ([params*] exprs)+)\n\nTakes a vector of function specs and a body, and generates a set of\nbindings of functions to their names. All of the names are available\nin all of the definitions of the functions, as well as the body."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_letfn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_letfn.cljsdoc)
</pre>

