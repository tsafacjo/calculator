val scala3Version = "3.5.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Calculator",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

   libraryDependencies ++= Seq(
  // MUnit for testing
  "org.scalameta" %% "munit" % "1.0.0" % Test,

  // ScalaTest for additional testing capabilities
  "org.scalatest" %% "scalatest" % "3.2.16" % Test,
 )
)
