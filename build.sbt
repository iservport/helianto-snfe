import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._
import com.typesafe.sbt.SbtNativePackager.packageArchetype

packageArchetype.akka_application

name := "sNFe"

scalaVersion := "2.11.7"

version := "1.0"

mainClass in Compile := Some("org.helianto.snfe.Bootstrap")

// add dependencies

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-xml" % "2.11.0-M4",
  "com.typesafe.akka" %% "akka-kernel" % "2.3.8",
  "com.typesafe.akka" %% "akka-actor" % "2.3.8",
  "com.typesafe.akka" %% "akka-slf4j" % "2.3.8",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.8",
  "com.typesafe.akka" %% "akka-http-experimental" % "1.0-M2",
  "org.ccil.cowan.tagsoup" % "tagsoup"               % "1.2",
  "com.datastax.cassandra" % "cassandra-driver-core" % "2.1.2",
  "joda-time" % "joda-time" % "2.7"
)

// add resolvers

resolvers ++= Seq(
  "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/",
  "spring-snapshot-repo" at "http://repo.springsource.org/libs-snapshot"
)

// append several options to the list of options passed to the Java compiler

javacOptions ++= Seq("-source", "1.7", "-target", "1.7", "-encoding", "UTF8")

