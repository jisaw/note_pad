(ns note-pad.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[note_pad started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[note_pad has shut down successfully]=-"))
   :middleware identity})
