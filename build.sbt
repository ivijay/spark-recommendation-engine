import AssemblyKeys._ // put this at the top of the file,leave the next line blank

assemblySettings

name := "Spark recommendation engine"

version := "0.1"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.6.1" % "test"
)