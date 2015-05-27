## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.dom/element

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__element__ tag-or-text)<br>
(__element__ tag & children)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[dom.cljs:81-90](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/browser/dom.cljs#L81-L90)</ins>
</pre>

```clj
(defn element
  ([tag-or-text]
     (log "(element " tag-or-text ")")
     (-element tag-or-text))
  ([tag & children]
     (log "(element " tag " " children ")")
     (let [attrs (first children)]
       (if (map? attrs)
         (-element tag attrs (rest children))
         (-element tag nil children)))))
```


---

```clj
{:full-name "clojure.browser.dom/element",
 :ns "clojure.browser.dom",
 :name "element",
 :type "function",
 :signature ["[tag-or-text]" "[tag & children]"],
 :source {:code "(defn element\n  ([tag-or-text]\n     (log \"(element \" tag-or-text \")\")\n     (-element tag-or-text))\n  ([tag & children]\n     (log \"(element \" tag \" \" children \")\")\n     (let [attrs (first children)]\n       (if (map? attrs)\n         (-element tag attrs (rest children))\n         (-element tag nil children)))))",
          :filename "clojurescript/src/cljs/clojure/browser/dom.cljs",
          :lines [81 90],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/browser/dom.cljs#L81-L90"},
 :full-name-encode "clojure.browser.dom_element",
 :history [["+" "0.0-927"]]}

```