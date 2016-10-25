name := """play-scalikejdbc-flyway-template"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "com.h2database"         %  "h2"                           % "1.4.+", // your jdbc driver here
  "org.scalikejdbc"        %% "scalikejdbc"                  % scalikejdbcVersion,
  "org.scalikejdbc"        %% "scalikejdbc-config"           % scalikejdbcVersion,
  "org.scalikejdbc"        %% "scalikejdbc-jsr310"           % scalikejdbcVersion,
  "org.scalikejdbc"        %% "scalikejdbc-play-initializer" % scalikejdbcPlayVersion,
  "org.flywaydb"           %% "flyway-play"                  % "3.0.1",
  "org.scalikejdbc"        %% "scalikejdbc-test"             % scalikejdbcVersion  % Test,
  "org.scalatestplus.play" %% "scalatestplus-play"           % "1.5.1"             % Test
)

lazy val scalikejdbcVersion = "2.4.+"

lazy val scalikejdbcPlayVersion = "2.5.+"
