(ns test.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(def x 3)
(println x)

(defn funcaoDoFor
"essa função faz um for" 
  []
(for [x (range 0 11)]
  (println x)))
(funcaoDoFor)

(def vetor [ 2 3 4 5])

(reverse vetor)

(filter odd? vetor)

(vec (take 3 vetor))

(list vetor)

