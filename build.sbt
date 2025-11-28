name := "LongLineExample"

version := "0.1.0"

scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  "org.apache.beam" % "beam-runners-direct-java" % "2.54.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.14.3",

  // Vulnerable dependency (CVE-2021-44228)
  "org.apache.logging.log4j" % "log4j-core" % "2.14.0",

  // CVE-2017-1000487 (Commons-Collections deserialization RCE)
  "org.apache.commons" % "commons-collections4" % "4.0",

  // CVE-2022-25857 (SnakeYAML arbitrary code execution)
  "org.yaml" % "snakeyaml" % "1.31",

  // CVE-2022-22965 (Spring4Shell RCE)
  "org.springframework" % "spring-core" % "5.3.17",

  // CVE-2020-9488 (Apache Tomcat session fixation / serialization issue)
  "org.apache.tomcat" % "tomcat-catalina" % "9.0.30",

  // CVE-2021-22118 (Elasticsearch RCE / DoS)
  "org.elasticsearch" % "elasticsearch" % "7.11.1"
)

