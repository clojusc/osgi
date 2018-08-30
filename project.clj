(defproject clojusc/clojure.osgi "1.9.0-3-SNAPSHOT"
  :description "Clojure - OSGi-ified with support library"
  :url "https://github.com/clojusc/clojure.osgi"
  :license {:name "Eclipse Public License"}
  :dependencies [
    [org.osgi/org.osgi.core "6.0.0"]
    [org.osgi/org.osgi.compendium "5.0.0"]
    [org.clojure/clojure "1.9.0"]
    [org.clojure/core.specs.alpha "0.1.24"]
    [org.clojure/spec.alpha "0.1.143"]]
  :plugins [
    [lein-shell "0.5.0"]
    [org.apache.felix/maven-bundle-plugin "3.5.1"]
    [org.apache.maven.plugins/maven-compiler-plugin "3.8.0"
    [org.apache.maven.plugins/maven-release-plugin "2.5.3"]
    [org.apache.maven.plugins/maven-source-plugin "3.0.1"]]]
  :aliases {
    "clean" ["do"
      ["shell" "echo"]
      ["shell" "echo" "Cleaning build ..."]
      ["shell" "echo"]
      ["shell" "mvn" "clean:clean"]]
    "compile" ["do"
      ["shell" "echo"]
      ["shell" "echo" "Compiling clojure.osgi ..."]
      ["shell" "echo"]
      ["shell" "mvn" "compile"]]
    "bundle" ["do"
      ["shell" "echo"]
      ["shell" "echo" "Packaging clojure.osgi bundle ..."]
      ["shell" "echo"]
      ["shell" "mvn" "bundle:bundle"]]
    "build" ["do"
      ["clean"]
      ["compile"]
      ["bundle"]]
    "local" ["do"
      ["shell" "echo"]
      ["shell" "echo" "Deploying clojure.osgi locally ..."]
      ["shell" "echo"]
      ["shell" "mvn" "install"]]
    "clojars" ["do"
      ["shell" "echo"]
      ["shell" "echo"
       "Publishing"
       :project/group
       :project/name
       :project/version
       "to Clojars ..."]
      ["shell" "echo"]
      ["shell" "./scripts/clojars-deploy"
       :project/group
       :project/name
       :project/version
       :project/target-path]]})
