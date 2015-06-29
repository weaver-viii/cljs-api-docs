## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.string/split

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.string/split</samp>](http://clojure.github.io/clojure/branch-master/clojure.string-api.html#clojure.string/split)
</td>
</tr>
</table>

 <samp>
(__split__ s re)<br>
</samp>
 <samp>
(__split__ s re limit)<br>
</samp>

---

Splits string on a regular expression. Optional argument limit is the maximum
number of splits. Not lazy. Returns vector of the splits.

---


See Also:

[`cljs.core/subs`](cljs.core_subs.md)<br>
[`clojure.string/replace`](clojure.string_replace.md)<br>
[`clojure.string/split-lines`](clojure.string_split-lines.md)<br>

---

Source docstring:

```
Splits string on a regular expression. Optional argument limit is
the maximum number of splits. Not lazy. Returns vector of the splits.
```

Source code:

```clj
(defn split
  ([s re]
     (split s re 0))
    ([s re limit]
     (discard-trailing-if-needed limit
       (if (= (str re) "/(?:)/")
         (split-with-empty-regex s limit)
         (if (< limit 1)
           (vec (.split (str s) re))
           (loop [s s
                  limit limit
                  parts []]
             (if (= limit 1)
               (conj parts s)
               (if-let [m (re-find re s)]
                 (let [index (.indexOf s m)]
                   (recur (.substring s (+ index (count m)))
                          (dec limit)
                          (conj parts (.substring s 0 index))))
                 (conj parts s)))))))))
```

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── clojure
            └── <ins>[string.cljs:119-140](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/clojure/string.cljs#L119-L140)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.string/split"]))
```

```clj
{:description "Splits string on a regular expression. Optional argument limit is the maximum\nnumber of splits. Not lazy. Returns vector of the splits.",
 :ns "clojure.string",
 :name "split",
 :signature ["[s re]" "[s re limit]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/subs"
           "clojure.string/replace"
           "clojure.string/split-lines"],
 :full-name-encode "clojure.string_split",
 :source {:code "(defn split\n  ([s re]\n     (split s re 0))\n    ([s re limit]\n     (discard-trailing-if-needed limit\n       (if (= (str re) \"/(?:)/\")\n         (split-with-empty-regex s limit)\n         (if (< limit 1)\n           (vec (.split (str s) re))\n           (loop [s s\n                  limit limit\n                  parts []]\n             (if (= limit 1)\n               (conj parts s)\n               (if-let [m (re-find re s)]\n                 (let [index (.indexOf s m)]\n                   (recur (.substring s (+ index (count m)))\n                          (dec limit)\n                          (conj parts (.substring s 0 index))))\n                 (conj parts s)))))))))",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/clojure/string.cljs",
          :lines [119 140]},
 :full-name "clojure.string/split",
 :clj-symbol "clojure.string/split",
 :docstring "Splits string on a regular expression. Optional argument limit is\nthe maximum number of splits. Not lazy. Returns vector of the splits."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.string_split.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.string_split.cljsdoc)
</pre>

