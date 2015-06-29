## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/update-in

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/update-in</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/update-in)
</td>
</tr>
</table>

 <samp>
(__update-in__ m \[k & ks\] f)<br>
</samp>
 <samp>
(__update-in__ m \[k & ks\] f a)<br>
</samp>
 <samp>
(__update-in__ m \[k & ks\] f a b)<br>
</samp>
 <samp>
(__update-in__ m \[k & ks\] f a b c)<br>
</samp>
 <samp>
(__update-in__ m \[k & ks\] f a b c & args)<br>
</samp>

---

"Updates" a value in a nested associative structure, where `ks` is a sequence of
keys and `f` is a function that will take the old value and any supplied
arguments and return the new value. Returns a new nested structure.

If any levels do not exist, hash-maps will be created.

---


See Also:

[`cljs.core/assoc-in`](cljs.core_assoc-in.md)<br>
[`cljs.core/get-in`](cljs.core_get-in.md)<br>

---

Source docstring:

```
'Updates' a value in a nested associative structure, where ks is a
sequence of keys and f is a function that will take the old value
and any supplied args and return the new value, and returns a new
nested structure.  If any levels do not exist, hash-maps will be
created.
```

Source code:

```clj
(defn update-in
  ([m [k & ks] f & args]
   (if ks
     (assoc m k (apply update-in (get m k) ks f args))
     (assoc m k (apply f (get m k) args)))))
```

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2330-2339](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2330-L2339)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/update-in"]))
```

```clj
{:description "\"Updates\" a value in a nested associative structure, where `ks` is a sequence of\nkeys and `f` is a function that will take the old value and any supplied\narguments and return the new value. Returns a new nested structure.\n\nIf any levels do not exist, hash-maps will be created.",
 :ns "cljs.core",
 :name "update-in",
 :signature ["[m [k & ks] f]"
             "[m [k & ks] f a]"
             "[m [k & ks] f a b]"
             "[m [k & ks] f a b c]"
             "[m [k & ks] f a b c & args]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/assoc-in" "cljs.core/get-in"],
 :full-name-encode "cljs.core_update-in",
 :source {:code "(defn update-in\n  ([m [k & ks] f & args]\n   (if ks\n     (assoc m k (apply update-in (get m k) ks f args))\n     (assoc m k (apply f (get m k) args)))))",
          :repo "clojurescript",
          :tag "r1236",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2330 2339]},
 :full-name "cljs.core/update-in",
 :clj-symbol "clojure.core/update-in",
 :docstring "'Updates' a value in a nested associative structure, where ks is a\nsequence of keys and f is a function that will take the old value\nand any supplied args and return the new value, and returns a new\nnested structure.  If any levels do not exist, hash-maps will be\ncreated."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_update-in.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_update-in.cljsdoc)
</pre>
