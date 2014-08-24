name := "bitcask"

version := "1.0"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
                    "org.scalatest"  % "scalatest_2.10"  % "2.0"   % "test",
                    "ch.qos.logback" % "logback-classic" % "1.1.2",
                    "com.typesafe"   % "config"          % "1.2.1"
                    )