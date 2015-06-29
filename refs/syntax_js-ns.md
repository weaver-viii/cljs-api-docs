## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> syntax/js-ns

 <table border="1">
<tr>
<td><samp>js/</samp></td>
<td>special namespace</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>






Source code:



---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/js-ns"]))
```

```clj
{:ns "syntax",
 :name "js-ns",
 :syntax-form "js/",
 :type "special namespace",
 :full-name "syntax/js-ns",
 :full-name-encode "syntax_js-ns",
 :history [["+" "0.0-927"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/syntax_js-ns.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax_js-ns.cljsdoc)
</pre>

