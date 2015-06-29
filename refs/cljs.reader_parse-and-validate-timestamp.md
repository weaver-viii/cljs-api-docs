## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.reader/parse-and-validate-timestamp

 <table border="1">
<tr>

<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1853"><img valign="middle" alt="[+] 0.0-1853" src="https://img.shields.io/badge/+-0.0--1853-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__parse-and-validate-timestamp__ s)<br>
</samp>

---





Source code:

```clj
(defn parse-and-validate-timestamp [s]
  (let [[_ years months days hours minutes seconds fraction offset-sign offset-hours offset-minutes :as v] 
        (re-matches timestamp-regex s)]
    (if-not v
      (reader-error nil (str "Unrecognized date/time syntax: " s))
      (let [years (parse-int years)
            months (or (parse-int months) 1)
            days (or (parse-int days) 1)
            hours (or (parse-int hours) 0)
            minutes (or (parse-int minutes) 0)
            seconds (or (parse-int seconds) 0)
            fraction (or (parse-int (zero-fill-right-and-truncate fraction 3)) 0)
            offset-sign (if (= offset-sign "-") -1 1)
            offset-hours (or (parse-int offset-hours) 0)
            offset-minutes (or (parse-int offset-minutes) 0)
            offset (* offset-sign (+ (* offset-hours 60) offset-minutes))]
        [years
         (check 1 months 12 "timestamp month field must be in range 1..12")
         (check 1 days (days-in-month months (leap-year? years)) "timestamp day field must be in range 1..last day in month")
         (check 0 hours 23 "timestamp hour field must be in range 0..23")
         (check 0 minutes 59 "timestamp minute field must be in range 0..59")
         (check 0 seconds (if (= minutes 59) 60 59) "timestamp second field must be in range 0..60")
         (check 0 fraction 999 "timestamp millisecond field must be in range 0..999")
         offset]))))
```

 <pre>
clojurescript @ r1978
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:480-503](https://github.com/clojure/clojurescript/blob/r1978/src/cljs/cljs/reader.cljs#L480-L503)</ins>
</pre>


---

__Meta__ - To retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/parse-and-validate-timestamp"]))
```

```clj
{:ns "cljs.reader",
 :name "parse-and-validate-timestamp",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn parse-and-validate-timestamp [s]\n  (let [[_ years months days hours minutes seconds fraction offset-sign offset-hours offset-minutes :as v] \n        (re-matches timestamp-regex s)]\n    (if-not v\n      (reader-error nil (str \"Unrecognized date/time syntax: \" s))\n      (let [years (parse-int years)\n            months (or (parse-int months) 1)\n            days (or (parse-int days) 1)\n            hours (or (parse-int hours) 0)\n            minutes (or (parse-int minutes) 0)\n            seconds (or (parse-int seconds) 0)\n            fraction (or (parse-int (zero-fill-right-and-truncate fraction 3)) 0)\n            offset-sign (if (= offset-sign \"-\") -1 1)\n            offset-hours (or (parse-int offset-hours) 0)\n            offset-minutes (or (parse-int offset-minutes) 0)\n            offset (* offset-sign (+ (* offset-hours 60) offset-minutes))]\n        [years\n         (check 1 months 12 \"timestamp month field must be in range 1..12\")\n         (check 1 days (days-in-month months (leap-year? years)) \"timestamp day field must be in range 1..last day in month\")\n         (check 0 hours 23 \"timestamp hour field must be in range 0..23\")\n         (check 0 minutes 59 \"timestamp minute field must be in range 0..59\")\n         (check 0 seconds (if (= minutes 59) 60 59) \"timestamp second field must be in range 0..60\")\n         (check 0 fraction 999 \"timestamp millisecond field must be in range 0..999\")\n         offset]))))",
          :repo "clojurescript",
          :tag "r1978",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [480 503]},
 :full-name "cljs.reader/parse-and-validate-timestamp",
 :full-name-encode "cljs.reader_parse-and-validate-timestamp",
 :history [["+" "0.0-1853"]]}

```

---

__Contributions__ to this document are accepted as Pull Requests to the following file:

 <pre>
[cljsdoc/cljs.reader_parse-and-validate-timestamp.cljsdoc](https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader_parse-and-validate-timestamp.cljsdoc)
</pre>

