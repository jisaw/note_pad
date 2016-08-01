(ns user
  (:require [mount.core :as mount]
            note-pad.core))

(defn start []
  (mount/start-without #'note-pad.core/repl-server))

(defn stop []
  (mount/stop-except #'note-pad.core/repl-server))

(defn restart []
  (stop)
  (start))


