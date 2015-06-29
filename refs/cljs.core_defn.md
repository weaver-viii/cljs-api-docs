## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defn

 <table border="1">
<tr>

<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defn)
</td>
</tr>
</table>

 <samp>
(__defn__ name doc-string? attr-map? \[params\*\] prepost-map? body)<br>
</samp>
 <samp>
(__defn__ name doc-string? attr-map? (\[params\*\] prepost-map? body) + attr-map?)<br>
</samp>

---

Defines a function.

`doc-string?` is an optional documentation string.

`attr-map?` is an optional map of [metadata](http://clojure.org/metadata) to
attach to the global variable name.

`prepost-map?` is an optional map with optional keys `:pre` and `:post` that
contain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)
for the function.

<table class="code-tbl-9bef6">
  <thead>
    <tr>
      <th>Code</th>
      <th>Expands To</th></tr></thead>
  <tbody>
    <tr>
      <td><pre>
(defn foo [a b c]
  (\* a b c))</pre></td>
      <td><pre>
(def foo
  (fn [a b c]
    (\* a b c)))</pre></td></tr></tbody></table>

---


See Also:

[`special/def`](special_def.md)<br>
[`cljs.core/defn-`](cljs.core_defn-.md)<br>
[`cljs.core/defmacro`](cljs.core_defmacro.md)<br>
[`cljs.core/fn`](cljs.core_fn.md)<br>

---

Source docstring:

```
Same as (def name (fn [params* ] exprs*)) or (def
 name (fn ([params* ] exprs*)+)) with any doc-string or attrs added
 to the var metadata. prepost-map defines a map with optional keys
 :pre and :post that contain collections of pre or post conditions.
```

Source code:

```clj
(def 

 ^{:doc "Same as (def name (fn [params* ] exprs*)) or (def
    name (fn ([params* ] exprs*)+)) with any doc-string or attrs added
    to the var metadata. prepost-map defines a map with optional keys
    :pre and :post that contain collections of pre or post conditions."
   :arglists '([name doc-string? attr-map? [params*] prepost-map? body]
                [name doc-string? attr-map? ([params*] prepost-map? body)+ attr-map?])
   :added "1.0"}
 defn (fn defn [&form &env name & fdecl]
        (let [m (if (string? (first fdecl))
                  {:doc (first fdecl)}
                  {})
              fdecl (if (string? (first fdecl))
                      (next fdecl)
                      fdecl)
              m (if (map? (first fdecl))
                  (conj m (first fdecl))
                  m)
              fdecl (if (map? (first fdecl))
                      (next fdecl)
                      fdecl)
              fdecl (if (vector? (first fdecl))
                      (list fdecl)
                      fdecl)
              m (if (map? (last fdecl))
                  (conj m (last fdecl))
                  m)
              fdecl (if (map? (last fdecl))
                      (butlast fdecl)
                      fdecl)
              m (conj {:arglists (list 'quote (sigs fdecl))} m)
              m (let [inline (:inline m)
                      ifn (first inline)
                      iname (second inline)]
                  ;; same as: (if (and (= 'fn ifn) (not (symbol? iname))) ...)
                  (if (if (clojure.lang.Util/equiv 'fn ifn)
                        (if (instance? clojure.lang.Symbol iname) false true))
                    ;; inserts the same fn name to the inline fn if it does not have one
                    (assoc m :inline (cons ifn (cons (clojure.lang.Symbol/intern (.concat (.getName ^clojure.lang.Symbol name) "__inliner"))
                                                     (next inline))))
                    m))
              m (conj (if (meta name) (meta name) {}) m)]
          (list 'def (with-meta name m)
                ;;todo - restore propagation of fn name
                ;;must figure out how to convey primitive hints to self calls first
                (cons `fn fdecl) ))))
```

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:263-309](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L263-L309)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/defn"]))
```

```clj
{:description "Defines a function.\n\n`doc-string?` is an optional documentation string.\n\n`attr-map?` is an optional map of [metadata](http://clojure.org/metadata) to\nattach to the global variable name.\n\n`prepost-map?` is an optional map with optional keys `:pre` and `:post` that\ncontain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)\nfor the function.\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Code</th>\n      <th>Expands To</th></tr></thead>\n  <tbody>\n    <tr>\n      <td><pre>\n(defn foo [a b c]\n  (\\* a b c))</pre></td>\n      <td><pre>\n(def foo\n  (fn [a b c]\n    (\\* a b c)))</pre></td></tr></tbody></table>",
 :ns "cljs.core",
 :name "defn",
 :signature ["[name doc-string? attr-map? [params*] prepost-map? body]"
             "[name doc-string? attr-map? ([params*] prepost-map? body) + attr-map?]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["special/def"
           "cljs.core/defn-"
           "cljs.core/defmacro"
           "cljs.core/fn"],
 :full-name-encode "cljs.core_defn",
 :source {:code "(def \n\n ^{:doc \"Same as (def name (fn [params* ] exprs*)) or (def\n    name (fn ([params* ] exprs*)+)) with any doc-string or attrs added\n    to the var metadata. prepost-map defines a map with optional keys\n    :pre and :post that contain collections of pre or post conditions.\"\n   :arglists '([name doc-string? attr-map? [params*] prepost-map? body]\n                [name doc-string? attr-map? ([params*] prepost-map? body)+ attr-map?])\n   :added \"1.0\"}\n defn (fn defn [&form &env name & fdecl]\n        (let [m (if (string? (first fdecl))\n                  {:doc (first fdecl)}\n                  {})\n              fdecl (if (string? (first fdecl))\n                      (next fdecl)\n                      fdecl)\n              m (if (map? (first fdecl))\n                  (conj m (first fdecl))\n                  m)\n              fdecl (if (map? (first fdecl))\n                      (next fdecl)\n                      fdecl)\n              fdecl (if (vector? (first fdecl))\n                      (list fdecl)\n                      fdecl)\n              m (if (map? (last fdecl))\n                  (conj m (last fdecl))\n                  m)\n              fdecl (if (map? (last fdecl))\n                      (butlast fdecl)\n                      fdecl)\n              m (conj {:arglists (list 'quote (sigs fdecl))} m)\n              m (let [inline (:inline m)\n                      ifn (first inline)\n                      iname (second inline)]\n                  ;; same as: (if (and (= 'fn ifn) (not (symbol? iname))) ...)\n                  (if (if (clojure.lang.Util/equiv 'fn ifn)\n                        (if (instance? clojure.lang.Symbol iname) false true))\n                    ;; inserts the same fn name to the inline fn if it does not have one\n                    (assoc m :inline (cons ifn (cons (clojure.lang.Symbol/intern (.concat (.getName ^clojure.lang.Symbol name) \"__inliner\"))\n                                                     (next inline))))\n                    m))\n              m (conj (if (meta name) (meta name) {}) m)]\n          (list 'def (with-meta name m)\n                ;;todo - restore propagation of fn name\n                ;;must figure out how to convey primitive hints to self calls first\n                (cons `fn fdecl) ))))",
          :repo "clojure",
          :tag "clojure-1.4.0",
          :filename "src/clj/clojure/core.clj",
          :lines [263 309]},
 :full-name "cljs.core/defn",
 :clj-symbol "clojure.core/defn",
 :docstring "Same as (def name (fn [params* ] exprs*)) or (def\n name (fn ([params* ] exprs*)+)) with any doc-string or attrs added\n to the var metadata. prepost-map defines a map with optional keys\n :pre and :post that contain collections of pre or post conditions."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_defn.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_defn.cljsdoc)
</pre>
