(defproject clojusc/osgi "1.9.0-3-SNAPSHOT"
  :description "Clojure - OSGi-ified with support library"
  :url "https://github.com/talios/clojure.osgi"
  :license {:name "Eclipse Public License"}
  :dependencies [
    [org.osgi/org.osgi.core "6.0.0"]
    [org.osgi/org.osgi.compendium "5.0.0"]
    [org.clojure/clojure "1.9.0"]
    [org.clojure/core.specs.alpha "0.1.24"]
    [org.clojure/spec.alpha "0.1.143"]
    [farana "0.1.0-SNAPSHOT"]]
  :plugins [
    [org.apache.felix/maven-bundle-plugin "3.5.1"]
    [org.apache.maven.plugins/maven-compiler-plugin "3.7.0"
    [org.apache.maven.plugins/maven-source-plugin "3.0.1"]
    [org.apache.maven.plugins/maven-release-plugin "2.5.3"]]])
