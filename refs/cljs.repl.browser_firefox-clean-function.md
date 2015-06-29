## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/firefox-clean-function

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3053"><img valign="middle" alt="[+] 0.0-3053" src="https://img.shields.io/badge/+-0.0--3053-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__firefox-clean-function__ f)<br>
</samp>

---





Source code:

```clj
(defn firefox-clean-function [f]
  (as-> f f
    (cond
      (string/blank? f) nil
      (not= (.indexOf f "</") -1)
      (let [idx (.indexOf f "</")]
        (.substring f (+ idx 2)))
      :else f)
    (-> f
      (string/replace #"<" "")
      (string/replace #"\/" ""))))
```

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:378-388](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/repl/browser.clj#L378-L388)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/firefox-clean-function"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "firefox-clean-function",
 :type "function",
 :signature ["[f]"],
 :source {:code "(defn firefox-clean-function [f]\n  (as-> f f\n    (cond\n      (string/blank? f) nil\n      (not= (.indexOf f \"</\") -1)\n      (let [idx (.indexOf f \"</\")]\n        (.substring f (+ idx 2)))\n      :else f)\n    (-> f\n      (string/replace #\"<\" \"\")\n      (string/replace #\"\\/\" \"\"))))",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [378 388]},
 :full-name "cljs.repl.browser/firefox-clean-function",
 :full-name-encode "cljs.repl.browser_firefox-clean-function",
 :history [["+" "0.0-3053"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_firefox-clean-function.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_firefox-clean-function.cljsdoc)
</pre>

