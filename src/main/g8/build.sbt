name := """$name$"""
organization := "$organization$"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  guice,
  "com.squareup.okhttp3"   % "okhttp"                        % "3.11.0",
  "com.h2database"         %  "h2"                           % "1.4.+", // your jdbc driver here
  "org.mariadb.jdbc"       %  "mariadb-java-client"          % "1.5.+",
  "org.scalikejdbc"        %% "scalikejdbc"                  % scalikejdbcVersion,
  "org.scalikejdbc"        %% "scalikejdbc-config"           % scalikejdbcVersion,
  "org.scalikejdbc"        %% "scalikejdbc-play-initializer" % scalikejdbcPlayVersion,
  "org.flywaydb"           %% "flyway-play"                  % "5.0.0",
  "org.scalikejdbc"        %% "scalikejdbc-test"             % scalikejdbcVersion  % Test,
  "org.scalatestplus.play" %% "scalatestplus-play"           % "3.1.2"             % Test
)

lazy val scalikejdbcVersion = "3.0.+"

lazy val scalikejdbcPlayVersion = "2.6.0-scalikejdbc-3.0"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
