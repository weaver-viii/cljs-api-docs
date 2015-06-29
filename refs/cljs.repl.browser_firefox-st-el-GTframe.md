## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.browser/firefox-st-el->frame

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3053"><img valign="middle" alt="[+] 0.0-3053" src="https://img.shields.io/badge/+-0.0--3053-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__firefox-st-el->frame__ st-el opts)<br>
</samp>

---





Source code:

```clj
(defn firefox-st-el->frame
  [st-el opts]
  (let [[function flc] (if (re-find #"@" st-el)
                         (string/split st-el #"@")
                         [nil st-el])
        [file line column] (parse-file-line-column flc)]
    (if (and file function line column)
      {:file (parse-file file opts)
       :function (firefox-clean-function function)
       :line line
       :column column}
      (when-not (string/blank? function)
        {:file nil
         :function (firefox-clean-function function)
         :line nil
         :column nil}))))
```

 <pre>
clojurescript @ r3053
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:374-389](https://github.com/clojure/clojurescript/blob/r3053/src/clj/cljs/repl/browser.clj#L374-L389)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/firefox-st-el->frame"]))
```

```clj
{:ns "cljs.repl.browser",
 :name "firefox-st-el->frame",
 :type "function",
 :signature ["[st-el opts]"],
 :source {:code "(defn firefox-st-el->frame\n  [st-el opts]\n  (let [[function flc] (if (re-find #\"@\" st-el)\n                         (string/split st-el #\"@\")\n                         [nil st-el])\n        [file line column] (parse-file-line-column flc)]\n    (if (and file function line column)\n      {:file (parse-file file opts)\n       :function (firefox-clean-function function)\n       :line line\n       :column column}\n      (when-not (string/blank? function)\n        {:file nil\n         :function (firefox-clean-function function)\n         :line nil\n         :column nil}))))",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [374 389]},
 :full-name "cljs.repl.browser/firefox-st-el->frame",
 :full-name-encode "cljs.repl.browser_firefox-st-el-GTframe",
 :history [["+" "0.0-3053"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.browser_firefox-st-el-GTframe.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser_firefox-st-el-GTframe.cljsdoc)
</pre>

