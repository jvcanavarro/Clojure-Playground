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