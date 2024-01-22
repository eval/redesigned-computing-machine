(ns testing.core-test
  (:require [cljs.test :refer [deftest is testing]]
            [testing.core :as sut]))

(deftest hello-test
  (is (= "Hello, World" (sut/hello "World"))))
