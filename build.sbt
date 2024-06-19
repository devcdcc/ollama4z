ThisBuild / scalaVersion := "3.3.3"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "com.github.devcdcc"
ThisBuild / organizationName := "devcdcc"

lazy val root = (project in file("."))
  .settings(
    name := "ollama-zio",
    idePackagePrefix := Some("com.github.devcdcc.ollama"),
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.1.3",
      "dev.zio" %% "zio-test" % "2.1.3" % Test,
      "dev.zio" %% "zio-json" % "0.7.0",
      "dev.zio" %% "zio-test-sbt" % "2.1.3" % Test,
      "dev.zio" %% "zio-http" % "3.0.0-RC8",
      "dev.zio" %% "zio-schema-json" % "1.2.1"
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
