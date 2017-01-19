(defproject vocabulary.bing "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-soup/clojure-soup "0.1.3"]
                 [hiccup "1.0.5"]
                 [garden "1.3.2"]]
  :main ^:skip-aot vocabulary.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

