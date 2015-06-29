## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/aset

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/aset</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aset)
</td>
</tr>
</table>

 <samp>
(__aset__ array i val)<br>
</samp>
 <samp>
(__aset__ array idx idx2 & idxv)<br>
</samp>

---

Sets `val` at index `i` in JavaScript arrays and objects.

Can be used to set nested properties with the additional `idxs` arguments.

---

Example:

```js
// JavaScript
var a = {"foo": 3, "bar": [4, 5]};

a["foo"] = 4;
a;
//=> {"foo": 4, "bar": [4, 5]}

a["bar"][0] = 6;
a;
//=> {"foo": 4, "bar": [6, 5]}
```

```clj
;; ClojureScript
(def a #js {:foo 3, :bar #js [4 5]})

(aset a "foo" 4)
a
;;=> #js {:foo 4, :bar #js [4 5]}

(aset a "bar" 0 6)
a
;;=> #js {:foo 4, :bar #js [6 5]}
```

---
Example:

```js
// JavaScript
document.location.href = "http://example.com";
```

```clj
;; ClojureScript
(aset js/document "location" "href" "http://example.com")
```

---

See Also:

[`cljs.core/aget`](cljs.core_aget.md)<br>
[`special/set!`](special_setBANG.md)<br>
[`cljs.core/assoc-in`](cljs.core_assoc-in.md)<br>

---

Source docstring:

```
Sets the value at the index.
```

Source code:

```clj
(defn aset
  ([array i val]
    (cljs.core/aset array i val))
  ([array idx idx2 & idxv]
    (apply aset (aget array idx) idx2 idxv)))
```

 <pre>
clojurescript @ r2723
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:199-204](https://github.com/clojure/clojurescript/blob/r2723/src/cljs/cljs/core.cljs#L199-L204)</ins>
</pre>


---

```clj
(defmacro aset
  ([a i v]
    (core/list 'js* "(~{}[~{}] = ~{})" a i v))
  ([a idx idx2 & idxv]
    (let [n    (core/dec (count idxv))
          astr (apply core/str (repeat n "[~{}]"))]
      `(~'js* ~(core/str "(~{}[~{}][~{}]" astr " = ~{})") ~a ~idx ~idx2 ~@idxv))))
```

 <pre>
clojurescript @ r2723
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:347-353](https://github.com/clojure/clojurescript/blob/r2723/src/clj/cljs/core.clj#L347-L353)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/aset"]))
```

```clj
{:description "Sets `val` at index `i` in JavaScript arrays and objects.\n\nCan be used to set nested properties with the additional `idxs` arguments.",
 :ns "cljs.core",
 :name "aset",
 :signature ["[array i val]" "[array idx idx2 & idxv]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/aget" "special/set!" "cljs.core/assoc-in"],
 :full-name-encode "cljs.core_aset",
 :source {:code "(defn aset\n  ([array i val]\n    (cljs.core/aset array i val))\n  ([array idx idx2 & idxv]\n    (apply aset (aget array idx) idx2 idxv)))",
          :repo "clojurescript",
          :tag "r2723",
          :filename "src/cljs/cljs/core.cljs",
          :lines [199 204]},
 :extra-sources ({:code "(defmacro aset\n  ([a i v]\n    (core/list 'js* \"(~{}[~{}] = ~{})\" a i v))\n  ([a idx idx2 & idxv]\n    (let [n    (core/dec (count idxv))\n          astr (apply core/str (repeat n \"[~{}]\"))]\n      `(~'js* ~(core/str \"(~{}[~{}][~{}]\" astr \" = ~{})\") ~a ~idx ~idx2 ~@idxv))))",
                  :repo "clojurescript",
                  :tag "r2723",
                  :filename "src/clj/cljs/core.clj",
                  :lines [347 353]}),
 :examples [{:id "d1aa58",
             :content "```js\n// JavaScript\nvar a = {\"foo\": 3, \"bar\": [4, 5]};\n\na[\"foo\"] = 4;\na;\n//=> {\"foo\": 4, \"bar\": [4, 5]}\n\na[\"bar\"][0] = 6;\na;\n//=> {\"foo\": 4, \"bar\": [6, 5]}\n```\n\n```clj\n;; ClojureScript\n(def a #js {:foo 3, :bar #js [4 5]})\n\n(aset a \"foo\" 4)\na\n;;=> #js {:foo 4, :bar #js [4 5]}\n\n(aset a \"bar\" 0 6)\na\n;;=> #js {:foo 4, :bar #js [6 5]}\n```"}
            {:id "34bbf3",
             :content "```js\n// JavaScript\ndocument.location.href = \"http://example.com\";\n```\n\n```clj\n;; ClojureScript\n(aset js/document \"location\" \"href\" \"http://example.com\")\n```"}],
 :full-name "cljs.core/aset",
 :clj-symbol "clojure.core/aset",
 :docstring "Sets the value at the index."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_aset.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_aset.cljsdoc)
</pre>

