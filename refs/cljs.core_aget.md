## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/aget

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/aget</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/aget)
</td>
</tr>
</table>

 <samp>
(__aget__ array i)<br>
</samp>
 <samp>
(__aget__ array i & idxs)<br>
</samp>

---

Returns the value at index `i` from JavaScript arrays and objects.

Can be used to retrieve nested properties with the additional `idxs` arguments.

---

Example:

```js
// JavaScript
var a = {"foo": [5, 6]};

a["foo"];
//=> [5, 6]

a["foo"][0];
//=> 5
```

```clj
;; ClojureScript
(def a #js {:foo #js [5 6]})

(aget a "foo")
;;=> #js [5 6]

(aget a "foo" 0)
;;=> 5
```

---
Example:

```js
// JavaScript
document.location.href;
//=> "http://example.com"
```

The following are equivalent:

```clj
;; ClojureScript
(aget js/document "location" "href")
;;=> "http://example.com"

(.. js/document -location -href)
;;=> "http://example.com"
```

---

See Also:

[`cljs.core/..`](cljs.core_DOTDOT.md)<br>
[`cljs.core/aset`](cljs.core_aset.md)<br>
[`cljs.core/get`](cljs.core_get.md)<br>
[`cljs.core/nth`](cljs.core_nth.md)<br>

---

Source docstring:

```
Returns the value at the index.
```

Source code:

```clj
(defn aget
  ([array i]
     (cljs.core/aget array i))
  ([array i & idxs]
     (apply aget (aget array i) idxs)))
```

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:144-149](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L144-L149)</ins>
</pre>


---

```clj
(defmacro aget
  ([a i]
     (list 'js* "(~{}[~{}])" a i))
  ([a i & idxs]
     (let [astr (apply core/str (repeat (count idxs) "[~{}]"))]
      `(~'js* ~(core/str "(~{}[~{}]" astr ")") ~a ~i ~@idxs))))
```

 <pre>
clojurescript @ r1933
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:267-272](https://github.com/clojure/clojurescript/blob/r1933/src/clj/cljs/core.clj#L267-L272)</ins>
</pre>

---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/aget"]))
```

```clj
{:description "Returns the value at index `i` from JavaScript arrays and objects.\n\nCan be used to retrieve nested properties with the additional `idxs` arguments.",
 :ns "cljs.core",
 :name "aget",
 :signature ["[array i]" "[array i & idxs]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/.."
           "cljs.core/aset"
           "cljs.core/get"
           "cljs.core/nth"],
 :full-name-encode "cljs.core_aget",
 :source {:code "(defn aget\n  ([array i]\n     (cljs.core/aget array i))\n  ([array i & idxs]\n     (apply aget (aget array i) idxs)))",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/cljs/core.cljs",
          :lines [144 149]},
 :extra-sources ({:code "(defmacro aget\n  ([a i]\n     (list 'js* \"(~{}[~{}])\" a i))\n  ([a i & idxs]\n     (let [astr (apply core/str (repeat (count idxs) \"[~{}]\"))]\n      `(~'js* ~(core/str \"(~{}[~{}]\" astr \")\") ~a ~i ~@idxs))))",
                  :repo "clojurescript",
                  :tag "r1933",
                  :filename "src/clj/cljs/core.clj",
                  :lines [267 272]}),
 :examples [{:id "e36007",
             :content "```js\n// JavaScript\nvar a = {\"foo\": [5, 6]};\n\na[\"foo\"];\n//=> [5, 6]\n\na[\"foo\"][0];\n//=> 5\n```\n\n```clj\n;; ClojureScript\n(def a #js {:foo #js [5 6]})\n\n(aget a \"foo\")\n;;=> #js [5 6]\n\n(aget a \"foo\" 0)\n;;=> 5\n```"}
            {:id "c9029e",
             :content "```js\n// JavaScript\ndocument.location.href;\n//=> \"http://example.com\"\n```\n\nThe following are equivalent:\n\n```clj\n;; ClojureScript\n(aget js/document \"location\" \"href\")\n;;=> \"http://example.com\"\n\n(.. js/document -location -href)\n;;=> \"http://example.com\"\n```"}],
 :full-name "cljs.core/aget",
 :clj-symbol "clojure.core/aget",
 :docstring "Returns the value at the index."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.core_aget.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core_aget.cljsdoc)
</pre>

