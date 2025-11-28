name := "LongLineExample"

version := "0.1.0"

scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  "org.apache.beam" % "beam-runners-direct-java" % "2.54.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.14.3",

  // Vulnerable dependency (CVE-2021-44228)
  "org.apache.logging.log4j" % "log4j-core" % "2.14.0"
)
