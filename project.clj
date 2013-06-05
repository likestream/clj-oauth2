(defproject net.likestream/clj-oauth2 "0.1.1"
  :description "clj-http and ring middlewares for OAuth 2.0"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/data.json "0.1.2"] ;; bumped from 0.1.1
                 [clj-http "0.3.2"] ;; bumped form 0.2.6
                 ]
  :dev-dependencies [[ring "0.3.11"]
                     [com.stuartsierra/lazytest "1.1.2"]]
  :repositories {"stuartsierra-releases" "http://stuartsierra.com/maven2"}
  :aot [clj-oauth2.OAuth2Exception clj-oauth2.OAuth2StateMismatchException])
