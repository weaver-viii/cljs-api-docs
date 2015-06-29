## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/deftype

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/deftype</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/deftype)
</td>
</tr>
</table>

 <samp>
(__deftype__ t fields & impls)<br>
</samp>

---




Source docstring:

```
(deftype name [fields*]  options* specs*)

Currently there are no options.

Each spec consists of a protocol or interface name followed by zero
or more method bodies:

protocol-or-Object
(methodName [args*] body)*

The type will have the (by default, immutable) fields named by
fields, which can have type hints. Protocols and methods
are optional. The only methods that can be supplied are those
declared in the protocols/interfaces.  Note that method bodies are
not closures, the local environment includes only the named fields,
and those fields can be accessed directly. Fields can be qualified
with the metadata :mutable true at which point (set! afield aval) will be
supported in method bodies. Note well that mutable fields are extremely
difficult to use correctly, and are present only to facilitate the building
of higherlevel constructs, such as ClojureScript's reference types, in
ClojureScript itself. They are for experts only - if the semantics and
implications of :mutable are not immediately apparent to you, you should not
be using them.

Method definitions take the form:

(methodname [args*] body)

The argument and return types can be hinted on the arg and
methodname symbols. If not supplied, they will be inferred, so type
hints should be reserved for disambiguation.

Methods should be supplied for all methods of the desired
protocol(s). You can also define overrides for methods of Object. Note that
a parameter must be supplied to correspond to the target object
('this' in JavaScript parlance). Note also that recur calls to the method
head should *not* pass the target object, it will be supplied
automatically and can not be substituted.

In the method bodies, the (unqualified) name can be used to name the
class (for calls to new, instance? etc).

One constructor will be defined, taking the designated fields.  Note
that the field names __meta and __extmap are currently reserved and
should not be used when defining your own types.

Given (deftype TypeName ...), a factory function called ->TypeName
will be defined, taking positional parameters for the fields
```

Source code:

```clj
(defmacro deftype
  [t fields & impls]
  (validate-fields "deftype" t fields)
  (let [env &env
        r (:name (cljs.analyzer/resolve-var (dissoc env :locals) t))
        [fpps pmasks] (prepare-protocol-masks env impls)
        protocols (collect-protocols impls env)
        t (vary-meta t assoc
            :protocols protocols
            :skip-protocol-flag fpps) ]
    `(do
       (deftype* ~t ~fields ~pmasks
         ~(if (seq impls)
            `(extend-type ~t ~@(dt->et t impls fields))))
       (set! (.-cljs$lang$type ~t) true)
       (set! (.-cljs$lang$ctorStr ~t) ~(core/str r))
       (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opt#] (-write writer# ~(core/str r))))

       ~(build-positional-factory t r fields)
       ~t)))
```

 <pre>
clojurescript @ r3169
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:975-1042](https://github.com/clojure/clojurescript/blob/r3169/src/clj/cljs/core.clj#L975-L1042)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/deftype"]))
```

```clj
{:ns "cljs.core",
 :name "deftype",
 :signature ["[t fields & impls]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_deftype",
 :source {:code "(defmacro deftype\n  [t fields & impls]\n  (validate-fields \"deftype\" t fields)\n  (let [env &env\n        r (:name (cljs.analyzer/resolve-var (dissoc env :locals) t))\n        [fpps pmasks] (prepare-protocol-masks env impls)\n        protocols (collect-protocols impls env)\n        t (vary-meta t assoc\n            :protocols protocols\n            :skip-protocol-flag fpps) ]\n    `(do\n       (deftype* ~t ~fields ~pmasks\n         ~(if (seq impls)\n            `(extend-type ~t ~@(dt->et t impls fields))))\n       (set! (.-cljs$lang$type ~t) true)\n       (set! (.-cljs$lang$ctorStr ~t) ~(core/str r))\n       (set! (.-cljs$lang$ctorPrWriter ~t) (fn [this# writer# opt#] (-write writer# ~(core/str r))))\n\n       ~(build-positional-factory t r fields)\n       ~t)))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/clj/cljs/core.clj",
          :lines [975 1042]},
 :full-name "cljs.core/deftype",
 :clj-symbol "clojure.core/deftype",
 :docstring "(deftype name [fields*]  options* specs*)\n\nCurrently there are no options.\n\nEach spec consists of a protocol or interface name followed by zero\nor more method bodies:\n\nprotocol-or-Object\n(methodName [args*] body)*\n\nThe type will have the (by default, immutable) fields named by\nfields, which can have type hints. Protocols and methods\nare optional. The only methods that can be supplied are those\ndeclared in the protocols/interfaces.  Note that method bodies are\nnot closures, the local environment includes only the named fields,\nand those fields can be accessed directly. Fields can be qualified\nwith the metadata :mutable true at which point (set! afield aval) will be\nsupported in method bodies. Note well that mutable fields are extremely\ndifficult to use correctly, and are present only to facilitate the building\nof higherlevel constructs, such as ClojureScript's reference types, in\nClojureScript itself. They are for experts only - if the semantics and\nimplications of :mutable are not immediately apparent to you, you should not\nbe using them.\n\nMethod definitions take the form:\n\n(methodname [args*] body)\n\nThe argument and return types can be hinted on the arg and\nmethodname symbols. If not supplied, they will be inferred, so type\nhints should be reserved for disambiguation.\n\nMethods should be supplied for all methods of the desired\nprotocol(s). You can also define overrides for methods of Object. Note that\na parameter must be supplied to correspond to the target object\n('this' in JavaScript parlance). Note also that recur calls to the method\nhead should *not* pass the target object, it will be supplied\nautomatically and can not be substituted.\n\nIn the method bodies, the (unqualified) name can be used to name the\nclass (for calls to new, instance? etc).\n\nOne constructor will be defined, taking the designated fields.  Note\nthat the field names __meta and __extmap are currently reserved and\nshould not be used when defining your own types.\n\nGiven (deftype TypeName ...), a factory function called ->TypeName\nwill be defined, taking positional parameters for the fields"}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_deftype.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_deftype.cljsdoc)
</pre>

