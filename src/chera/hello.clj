(ns chera.hello)

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "step by step, we move forward"
  [& args]
  (greet {:name (first args)}))