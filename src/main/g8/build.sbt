name := """$name$"""
organization := "$organization$"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice,
  "com.squareup.okhttp3"   % "okhttp"                        % "3.8.1",
  "com.h2database"         %  "h2"                           % "1.4.+", // your jdbc driver here
  "org.scalikejdbc"        %% "scalikejdbc"                  % scalikejdbcVersion,
  "org.scalikejdbc"        %% "scalikejdbc-config"           % scalikejdbcVersion,
  "org.scalikejdbc"        %% "scalikejdbc-play-initializer" % scalikejdbcPlayVersion,
  "org.flywaydb"           %% "flyway-play"                  % "4.0.0",
  "org.scalikejdbc"        %% "scalikejdbc-test"             % scalikejdbcVersion  % Test,
  "org.scalatestplus.play" %% "scalatestplus-play"           % "3.1.0"             % Test
)

lazy val scalikejdbcVersion = "3.0.+"

lazy val scalikejdbcPlayVersion = "2.6.0-scalikejdbc-3.0"
