;; minhas respostas pros problemas do 4clojure

;; http://www.4clojure.com/problems

;; 01: Nothing but the Truth

(= true true)

;; 02: Simple Math

(= (- 10 (* 2 3)) 4)

;; 03: Intro to Strings

(= "HELLO WORLD" (.toUpperCase "hello world"))

;; 04: Intro to Lists

(= (list :a :b :c) '(:a :b :c))

;; 05: conj

(= '(1 2 3 4) (conj '(2 3 4) 1))

(= '(1 2 3 4) (conj '(3 4) 2 1))

;; 06: Intro to Vectors

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; 07: Vector: conj

(= [1 2 3 4] (conj [1 2 3] 4))

(= [1 2 3 4] (conj [1 2] 3 4))

;; 08: Intro to Sets

(= #{:c :b :d :a} (set '(:a :a :b :c :c :c :c :d :d)))

(= #{:c :b :d :a} (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; 09: Sets: conj

(= #{1 2 3 4} (conj #{1 4 3} 2))

;; 10: Intro to Maps

(= 20 ((hash-map :a 10, :b 20, :c 30) :b))

(= 20 (:b {:a 10, :b 20, :c 30}))

;; 11: Maps: conj

(= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3]))

;; 12: Intro to Sequences

(= 3 (first '(3 2 1)))

(= 3 (second [2 3 4]))
	
(= 3 (last (list 1 2 3)))

;; 13: Sequences: rest
 
(= [20 30 40] (rest [10 20 30 40])

;; 14: Intro to Functions

(= 8 ((fn add-five [x] (+ x 5)) 3))

(= 8 ((fn [x] (+ x 5)) 3))

(= 8 (#(+ % 5) 3))

(= 8 ((partial + 5) 3))

;; 15: Double Down

(= (* 2 2) 4)

;; 16: Hello World

(= (#(str "Hello, " % "!")"Dave") "Hello, Dave!")