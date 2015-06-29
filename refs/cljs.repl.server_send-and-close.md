## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.repl.server/send-and-close

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__send-and-close__ conn status form)<br>
</samp>
 <samp>
(__send-and-close__ conn status form content-type)<br>
</samp>
 <samp>
(__send-and-close__ conn status form content-type encoding)<br>
</samp>

---




Source docstring:

```
Use the passed connection to send a form to the browser. Send a
proper HTTP response.
```

Source code:

```clj
(defn send-and-close
  ([conn status form]
    (send-and-close conn status form "text/html"))
  ([conn status form content-type]
    (send-and-close conn status form content-type "UTF-8"))
  ([conn status form content-type encoding]
    (let [byte-form (.getBytes form encoding)
          content-length (count byte-form)
          headers (map #(.getBytes (str % "\r\n"))
                    [(status-line status)
                     "Server: ClojureScript REPL"
                     (str "Content-Type: "
                       content-type
                       "; charset=" encoding)
                     (str "Content-Length: " content-length)
                     ""])]
      (with-open [os (.getOutputStream conn)]
        (doseq [header headers]
          (.write os header 0 (count header)))
        (.write os byte-form 0 content-length)
        (.flush os)
        (.close conn)))))
```

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[server.clj:105-128](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl/server.clj#L105-L128)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/send-and-close"]))
```

```clj
{:ns "cljs.repl.server",
 :name "send-and-close",
 :signature ["[conn status form]"
             "[conn status form content-type]"
             "[conn status form content-type encoding]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.server_send-and-close",
 :source {:code "(defn send-and-close\n  ([conn status form]\n    (send-and-close conn status form \"text/html\"))\n  ([conn status form content-type]\n    (send-and-close conn status form content-type \"UTF-8\"))\n  ([conn status form content-type encoding]\n    (let [byte-form (.getBytes form encoding)\n          content-length (count byte-form)\n          headers (map #(.getBytes (str % \"\\r\\n\"))\n                    [(status-line status)\n                     \"Server: ClojureScript REPL\"\n                     (str \"Content-Type: \"\n                       content-type\n                       \"; charset=\" encoding)\n                     (str \"Content-Length: \" content-length)\n                     \"\"])]\n      (with-open [os (.getOutputStream conn)]\n        (doseq [header headers]\n          (.write os header 0 (count header)))\n        (.write os byte-form 0 content-length)\n        (.flush os)\n        (.close conn)))))",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/repl/server.clj",
          :lines [105 128]},
 :full-name "cljs.repl.server/send-and-close",
 :docstring "Use the passed connection to send a form to the browser. Send a\nproper HTTP response."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.repl.server_send-and-close.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server_send-and-close.cljsdoc)
</pre>

