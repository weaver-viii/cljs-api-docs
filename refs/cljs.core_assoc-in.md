## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/assoc-in

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/assoc-in</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/assoc-in)
</td>
</tr>
</table>

 <samp>
(__assoc-in__ m \[k & ks\] v)<br>
</samp>

---

Associates a value in a nested associative structure, where `ks` is a sequence
of keys and `v` is the new value. Returns a new nested structure.

If any levels do not exist, hash-maps will be created.

---

Example:

```clj
(def users [{:name "James" :age 26}
            {:name "John" :age 43}])
```

Update the age of the second (index 1) user:

```clj
(assoc-in users [1 :age] 44)
;;=> [{:name "James", :age 26}
;;    {:name "John", :age 44}]
```

Insert the password of the second (index 1) user:

```clj
(assoc-in users [1 :password] "nhoJ")
;;=> [{:name "James", :age 26}
;;    {:password "nhoJ", :name "John", :age 43}]
```

---

See Also:

[`cljs.core/assoc`](cljs.core_assoc.md)<br>
[`cljs.core/update-in`](cljs.core_update-in.md)<br>
[`cljs.core/get-in`](cljs.core_get-in.md)<br>

---

Source docstring:

```
Associates a value in a nested associative structure, where ks is a
sequence of keys and v is the new value and returns a new nested structure.
If any levels do not exist, hash-maps will be created.
```

Source code:

```clj
(defn assoc-in
  [m [k & ks] v]
  (if ks
    (assoc m k (assoc-in (get m k) ks v))
    (assoc m k v)))
```

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1915-1922](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L1915-L1922)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/assoc-in"]))
```

```clj
{:description "Associates a value in a nested associative structure, where `ks` is a sequence\nof keys and `v` is the new value. Returns a new nested structure.\n\nIf any levels do not exist, hash-maps will be created.",
 :ns "cljs.core",
 :name "assoc-in",
 :signature ["[m [k & ks] v]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/assoc" "cljs.core/update-in" "cljs.core/get-in"],
 :full-name-encode "cljs.core_assoc-in",
 :source {:code "(defn assoc-in\n  [m [k & ks] v]\n  (if ks\n    (assoc m k (assoc-in (get m k) ks v))\n    (assoc m k v)))",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1915 1922]},
 :examples [{:id "e76f20",
             :content "```clj\n(def users [{:name \"James\" :age 26}\n            {:name \"John\" :age 43}])\n```\n\nUpdate the age of the second (index 1) user:\n\n```clj\n(assoc-in users [1 :age] 44)\n;;=> [{:name \"James\", :age 26}\n;;    {:name \"John\", :age 44}]\n```\n\nInsert the password of the second (index 1) user:\n\n```clj\n(assoc-in users [1 :password] \"nhoJ\")\n;;=> [{:name \"James\", :age 26}\n;;    {:password \"nhoJ\", :name \"John\", :age 43}]\n```"}],
 :full-name "cljs.core/assoc-in",
 :clj-symbol "clojure.core/assoc-in",
 :docstring "Associates a value in a nested associative structure, where ks is a\nsequence of keys and v is the new value and returns a new nested structure.\nIf any levels do not exist, hash-maps will be created."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_assoc-in.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_assoc-in.cljsdoc)
</pre>

