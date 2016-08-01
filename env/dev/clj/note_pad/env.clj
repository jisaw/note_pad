(ns note-pad.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [note-pad.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[note_pad started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[note_pad has shut down successfully]=-"))
   :middleware wrap-dev})
