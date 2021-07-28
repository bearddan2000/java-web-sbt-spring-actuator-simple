lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-cli-sb)",

  // orgnization name (e.g., the package name of the project)
  organization := "com.treasure-data",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Treasure Data Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "2.4.1",
  "org.springframework.boot" % "spring-boot-starter-data-rest" % "2.4.1",
  "org.springframework.boot" % "spring-boot-starter-actuator" % "2.4.1"
   ),

  mainClass := Some("example.Application")
)
