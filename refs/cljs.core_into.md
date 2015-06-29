## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/into

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/into</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/into)
</td>
</tr>
</table>

 <samp>
(__into__ to from)<br>
</samp>
 <samp>
(__into__ to xform from)<br>
</samp>

---

Returns a new collection consisting of `to` with all of the items of `from`
"added" using `conj`.

A transducer may be supplied as `xform`.

---


See Also:

[`cljs.core/conj`](cljs.core_conj.md)<br>

---

Source docstring:

```
Returns a new coll consisting of to-coll with all of the items of
from-coll conjoined. A transducer may be supplied.
```

Source code:

```clj
(defn into
  ([to from]
     (if-not (nil? to)
       (if (implements? IEditableCollection to)
         (with-meta (persistent! (reduce -conj! (transient to) from)) (meta to))
         (reduce -conj to from))
       (reduce conj () from)))
  ([to xform from]
     (if (implements? IEditableCollection to)
       (with-meta (persistent! (transduce xform conj! (transient to) from)) (meta to))
       (transduce xform conj to from))))
```

 <pre>
clojurescript @ r3148
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4305-4317](https://github.com/clojure/clojurescript/blob/r3148/src/cljs/cljs/core.cljs#L4305-L4317)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/into"]))
```

```clj
{:description "Returns a new collection consisting of `to` with all of the items of `from`\n\"added\" using `conj`.\n\nA transducer may be supplied as `xform`.",
 :ns "cljs.core",
 :name "into",
 :signature ["[to from]" "[to xform from]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/conj"],
 :full-name-encode "cljs.core_into",
 :source {:code "(defn into\n  ([to from]\n     (if-not (nil? to)\n       (if (implements? IEditableCollection to)\n         (with-meta (persistent! (reduce -conj! (transient to) from)) (meta to))\n         (reduce -conj to from))\n       (reduce conj () from)))\n  ([to xform from]\n     (if (implements? IEditableCollection to)\n       (with-meta (persistent! (transduce xform conj! (transient to) from)) (meta to))\n       (transduce xform conj to from))))",
          :repo "clojurescript",
          :tag "r3148",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4305 4317]},
 :full-name "cljs.core/into",
 :clj-symbol "clojure.core/into",
 :docstring "Returns a new coll consisting of to-coll with all of the items of\nfrom-coll conjoined. A transducer may be supplied."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_into.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_into.cljsdoc)
</pre>

