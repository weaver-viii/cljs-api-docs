## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/.

 <table border="1">
<tr>

<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/.</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/.)
</td>
</tr>
</table>

 <samp>
(__.__ o -p)<br>
</samp>
 <samp>
(__.__ o m)<br>
</samp>
 <samp>
(__.__ o m 1 2)<br>
</samp>
 <samp>
(__.__ o (m 1 2))<br>
</samp>

---

For interop, the `.` special form allows access to member properties of the
given JavaScript object `o`.

If the second operand is a symbol preceded with a hyphen as in `-p`, the
expression will result in the value of the property named `p`.

If the second operand is a symbol that is not preceded with a hyphen as in `m`,
the expression will evaluate to a call of the method named `m`.  Any additional
operands will be passed as arguments to the method.

The __preferred, idiomatic__ way to access members of a JavaScript object is to
use the following sugar:

<table class="code-tbl-9bef6">
  <thead>
    <tr>
      <th>Sugar</th>
      <th>Expands To</th></tr>
  </thead>
  <tbody>
    <tr>
      <td><pre>(.-p o)</pre></td>
      <td><pre>(. o -p)</pre></td>
    </tr>
    <tr>
      <td><pre>(.m o)</pre></td>
      <td><pre>(. o m)</pre></td>
    </tr>
    <tr>
      <td><pre>(.m o 1 2)</pre></td>
      <td><pre>(. o m 1 2)</pre></td>
    </tr>
  </tbody>
</table>

---

Example:

We can access the JavaScript properties of a string:

```js
// JavaScript
var m = "Hello World";
m.length;
//=> 11
```

```clj
;; ClojureScript
(def m "Hello World")
(.-length m)
;;=> 11
```

We can also call member functions on the string:

```js
// JavaScript
m.toUpperCase();
//=> "HELLO WORLD"

m.replace("H", "");
//=> "ello World";
```

```clj
;; ClojureScript
(.toUpperCase m)
;;=> "HELLO WORLD"

(.replace m "H" "")
;;=> "ello World"
```

---
Example:

Create a JavaScript object `o`:

```clj
(def o #js {:foo "bar"})
```

You can get the value at property `"foo"` with any of the following:

```clj
(. o -foo)
;;=> "bar"

(.-foo o)
;;=> "bar"

(aget o "foo")
;;=> "bar"
```

---

See Also:

[`cljs.core/..`](cljs.core_DOTDOT.md)<br>
[`cljs.core/aget`](cljs.core_aget.md)<br>

---

Source docstring:

```
The instance member form works for methods and fields.
They all expand into calls to the dot operator at macroexpansion time.
```

Source code:

```clj
(defmethod parse '.
  [_ env [_ target & [field & member+] :as form] _ _]
  (disallowing-recur
   (let [{:keys [dot-action target method field args]} (build-dot-form [target field member+])
         enve        (assoc env :context :expr)
         targetexpr  (analyze enve target)]
     (case dot-action
           ::access {:env env :op :dot :form form
                     :target targetexpr
                     :field field
                     :children [targetexpr]
                     :tag (-> form meta :tag)}
           ::call   (let [argexprs (map #(analyze enve %) args)]
                      {:env env :op :dot :form form
                       :target targetexpr
                       :method method
                       :args argexprs
                       :children (into [targetexpr] argexprs)
                       :tag (-> form meta :tag)})))))
```

 <pre>
clojurescript @ r3117
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:1641-1659](https://github.com/clojure/clojurescript/blob/r3117/src/clj/cljs/analyzer.clj#L1641-L1659)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/."]))
```

```clj
{:description "For interop, the `.` special form allows access to member properties of the\ngiven JavaScript object `o`.\n\nIf the second operand is a symbol preceded with a hyphen as in `-p`, the\nexpression will result in the value of the property named `p`.\n\nIf the second operand is a symbol that is not preceded with a hyphen as in `m`,\nthe expression will evaluate to a call of the method named `m`.  Any additional\noperands will be passed as arguments to the method.\n\nThe __preferred, idiomatic__ way to access members of a JavaScript object is to\nuse the following sugar:\n\n<table class=\"code-tbl-9bef6\">\n  <thead>\n    <tr>\n      <th>Sugar</th>\n      <th>Expands To</th></tr>\n  </thead>\n  <tbody>\n    <tr>\n      <td><pre>(.-p o)</pre></td>\n      <td><pre>(. o -p)</pre></td>\n    </tr>\n    <tr>\n      <td><pre>(.m o)</pre></td>\n      <td><pre>(. o m)</pre></td>\n    </tr>\n    <tr>\n      <td><pre>(.m o 1 2)</pre></td>\n      <td><pre>(. o m 1 2)</pre></td>\n    </tr>\n  </tbody>\n</table>",
 :ns "special",
 :name ".",
 :signature ["[o -p]" "[o m]" "[o m 1 2]" "[o (m 1 2)]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["cljs.core/.." "cljs.core/aget"],
 :full-name-encode "special_DOT",
 :source {:code "(defmethod parse '.\n  [_ env [_ target & [field & member+] :as form] _ _]\n  (disallowing-recur\n   (let [{:keys [dot-action target method field args]} (build-dot-form [target field member+])\n         enve        (assoc env :context :expr)\n         targetexpr  (analyze enve target)]\n     (case dot-action\n           ::access {:env env :op :dot :form form\n                     :target targetexpr\n                     :field field\n                     :children [targetexpr]\n                     :tag (-> form meta :tag)}\n           ::call   (let [argexprs (map #(analyze enve %) args)]\n                      {:env env :op :dot :form form\n                       :target targetexpr\n                       :method method\n                       :args argexprs\n                       :children (into [targetexpr] argexprs)\n                       :tag (-> form meta :tag)})))))",
          :repo "clojurescript",
          :tag "r3117",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [1641 1659]},
 :examples [{:id "22ccbb",
             :content "We can access the JavaScript properties of a string:\n\n```js\n// JavaScript\nvar m = \"Hello World\";\nm.length;\n//=> 11\n```\n\n```clj\n;; ClojureScript\n(def m \"Hello World\")\n(.-length m)\n;;=> 11\n```\n\nWe can also call member functions on the string:\n\n```js\n// JavaScript\nm.toUpperCase();\n//=> \"HELLO WORLD\"\n\nm.replace(\"H\", \"\");\n//=> \"ello World\";\n```\n\n```clj\n;; ClojureScript\n(.toUpperCase m)\n;;=> \"HELLO WORLD\"\n\n(.replace m \"H\" \"\")\n;;=> \"ello World\"\n```"}
            {:id "7c5e58",
             :content "Create a JavaScript object `o`:\n\n```clj\n(def o #js {:foo \"bar\"})\n```\n\nYou can get the value at property `\"foo\"` with any of the following:\n\n```clj\n(. o -foo)\n;;=> \"bar\"\n\n(.-foo o)\n;;=> \"bar\"\n\n(aget o \"foo\")\n;;=> \"bar\"\n```"}],
 :full-name "special/.",
 :clj-symbol "clojure.core/.",
 :docstring "The instance member form works for methods and fields.\nThey all expand into calls to the dot operator at macroexpansion time."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/special_DOT.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special_DOT.cljsdoc)
</pre>

