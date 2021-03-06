(defproject fullcontact/full.contacts-api-client "0.2.4"
    :description "Clojure SDK for FullContact Contacts API"
    :url "https://github.com/fullcontact/contacts-contacts-api-client-clojure"
    :license {:name "Eclipse Public License - v 1.0"
              :url "http://www.eclipse.org/legal/epl-v10.html"
              :distribution :repo}
    :dependencies [[org.clojure/clojure "1.9.0"]
                   [com.fasterxml.jackson.core/jackson-core "2.10.1"]
                   [com.fasterxml.jackson.core/jackson-databind "2.10.1"]
                   [org.curbside.http-kit "2.2.0+sni"]
                   [ring/ring-codec "1.0.1"]
                   [fullcontact/full.core "1.0.3"]
                   [clj-time "0.14.0"]
                   [fullcontact/full.async "1.0.0"]]
    :profiles {:dev {:dependencies [[midje "1.9.0"] [mockery "0.1.2"]]}}
    :plugins [[lein-environ "1.0.2"]
              [lein-midje "3.1.3"]]
    :deploy-repositories [["releases" {:url "https://clojars.org/repo/" :creds :gpg}]]
    :min-lein-version "2.5.0"
    :clean-targets ^{:protect false} ["target"]
    :aot :all)
