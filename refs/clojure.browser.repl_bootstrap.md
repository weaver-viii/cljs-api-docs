## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/bootstrap

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3115"><img valign="middle" alt="[+] 0.0-3115" src="https://img.shields.io/badge/+-0.0--3115-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__bootstrap__)<br>
</samp>

---




Source docstring:

```
Reusable browser REPL bootstrapping. Patches the essential functions
in goog.base to support re-loading of namespaces after page load.
```

Source code:

```clj
(defn bootstrap
  []
  ;; Monkey-patch goog.provide if running under optimizations :none - David
  (when-not js/COMPILED
    (set! (.-require__ js/goog) js/goog.require)
    ;; suppress useless Google Closure error about duplicate provides
    (set! (.-isProvided_ js/goog) (fn [name] false))
    (set! (.-writeScriptTag__ js/goog)
      (fn [src opt_sourceText]
        ;; the page is already loaded, we can no longer leverage document.write
        ;; instead construct script tag elements and append them to the body
        ;; of the page, to avoid parallel script loading enforce sequential
        ;; load with a simple load queue
        (let [loaded (atom false)
              onload (fn []
                       (when (and load-queue (false? @loaded))
                         (swap! loaded not)
                         (if (zero? (alength load-queue))
                           (set! load-queue nil)
                           (.apply js/goog.writeScriptTag__ nil (.shift load-queue)))))]
          (.appendChild js/document.body
            (as-> (.createElement js/document "script") script
              (doto script
                (aset "type" "text/javascript")
                (aset "onload" onload)
                (aset "onreadystatechange" onload)) ;; IE
              (if (nil? opt_sourceText)
                (doto script (aset "src" src))
                (doto script (gdom/setTextContext opt_sourceText))))))))
    ;; queue or load
    (set! (.-writeScriptTag_ js/goog)
      (fn [src opt_sourceText]
        (if load-queue
          (.push load-queue #js [src opt_sourceText])
          (do
            (set! load-queue #js [])
            (js/goog.writeScriptTag__ src opt_sourceText)))))
    ;; we must reuse Closure library dev time dependency management, under namespace
    ;; reload scenarios we simply delete entries from the correct private locations
    (set! (.-require js/goog)
      (fn [src reload]
        (when (= reload "reload-all")
          (set! (.-cljsReloadAll_ js/goog) true))
        (let [reload? (or reload (.-cljsReloadAll__ js/goog))]
          (when reload?
            (let [path (aget js/goog.dependencies_.nameToPath src)]
              (js-delete js/goog.dependencies_.visited path)
              (js-delete js/goog.dependencies_.written
                (str js/goog.basePath path))))
          (let [ret (.require__ js/goog src)]
            (when (= reload "reload-all")
              (set! (.-cljsReloadAll_ js/goog) false))
            ret))))))
```

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:114-168](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/clojure/browser/repl.cljs#L114-L168)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/bootstrap"]))
```

```clj
{:ns "clojure.browser.repl",
 :name "bootstrap",
 :signature ["[]"],
 :history [["+" "0.0-3115"]],
 :type "function",
 :full-name-encode "clojure.browser.repl_bootstrap",
 :source {:code "(defn bootstrap\n  []\n  ;; Monkey-patch goog.provide if running under optimizations :none - David\n  (when-not js/COMPILED\n    (set! (.-require__ js/goog) js/goog.require)\n    ;; suppress useless Google Closure error about duplicate provides\n    (set! (.-isProvided_ js/goog) (fn [name] false))\n    (set! (.-writeScriptTag__ js/goog)\n      (fn [src opt_sourceText]\n        ;; the page is already loaded, we can no longer leverage document.write\n        ;; instead construct script tag elements and append them to the body\n        ;; of the page, to avoid parallel script loading enforce sequential\n        ;; load with a simple load queue\n        (let [loaded (atom false)\n              onload (fn []\n                       (when (and load-queue (false? @loaded))\n                         (swap! loaded not)\n                         (if (zero? (alength load-queue))\n                           (set! load-queue nil)\n                           (.apply js/goog.writeScriptTag__ nil (.shift load-queue)))))]\n          (.appendChild js/document.body\n            (as-> (.createElement js/document \"script\") script\n              (doto script\n                (aset \"type\" \"text/javascript\")\n                (aset \"onload\" onload)\n                (aset \"onreadystatechange\" onload)) ;; IE\n              (if (nil? opt_sourceText)\n                (doto script (aset \"src\" src))\n                (doto script (gdom/setTextContext opt_sourceText))))))))\n    ;; queue or load\n    (set! (.-writeScriptTag_ js/goog)\n      (fn [src opt_sourceText]\n        (if load-queue\n          (.push load-queue #js [src opt_sourceText])\n          (do\n            (set! load-queue #js [])\n            (js/goog.writeScriptTag__ src opt_sourceText)))))\n    ;; we must reuse Closure library dev time dependency management, under namespace\n    ;; reload scenarios we simply delete entries from the correct private locations\n    (set! (.-require js/goog)\n      (fn [src reload]\n        (when (= reload \"reload-all\")\n          (set! (.-cljsReloadAll_ js/goog) true))\n        (let [reload? (or reload (.-cljsReloadAll__ js/goog))]\n          (when reload?\n            (let [path (aget js/goog.dependencies_.nameToPath src)]\n              (js-delete js/goog.dependencies_.visited path)\n              (js-delete js/goog.dependencies_.written\n                (str js/goog.basePath path))))\n          (let [ret (.require__ js/goog src)]\n            (when (= reload \"reload-all\")\n              (set! (.-cljsReloadAll_ js/goog) false))\n            ret))))))",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [114 168]},
 :full-name "clojure.browser.repl/bootstrap",
 :docstring "Reusable browser REPL bootstrapping. Patches the essential functions\nin goog.base to support re-loading of namespaces after page load."}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/clojure.browser.repl_bootstrap.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl_bootstrap.cljsdoc)
</pre>

