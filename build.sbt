
sbtPlugin := true

organization := "se.sisyfosdigital.sbt"

name := "sbt-filter"

licenses := Seq( "Apache 2" -> url( "http://www.apache.org/licenses/LICENSE-2.0" ) )

// type safe javascript plugin, required dependency
addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.4")

publishMavenStyle := false
bintrayRepository := "sbt-plugins"
bintrayOrganization := Some("sisyfos-digital")
