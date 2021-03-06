(ns cljs-api-gen.encode
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.string :refer [replace]]))

(def encoding
  {"."  "DOT"
   ">"  "GT"
   "<"  "LT"
   "!"  "BANG"
   "?"  "QMARK"
   "*"  "STAR"
   "+"  "PLUS"
   "="  "EQ"
   "/"  "SLASH"
   })

(defn encode-name [name-]
  (reduce (fn [s [a b]] (replace s a b))
    (name name-) encoding))

(defn decode-name [name-]
  (reduce (fn [s [a b]] (replace s b a))
    (name name-) encoding))

(defn decode-fullname
  [fullname]
  (let [[_ ns- name-] (re-find #"([^_]*)_(.*)" fullname)]
    (str ns- "/" (decode-name name-))))

(defn encode-fullname
  [fullname]
  (let [[ns- name-] ((juxt namespace name) (symbol fullname))
        encoded (str ns- "_" (encode-name name-))]
    encoded))

(defn assert-lossless
  [fullname]
  (let [encoded (encode-fullname fullname)
        decoded (decode-fullname encoded)]
    (assert (= decoded fullname)
            (str "Symbol name was lost during encoding and decoding:\n"
                 "  " fullname "  ->  " encoded "  ->  " decoded))))

