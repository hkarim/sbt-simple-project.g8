organization := "$organization$"

name := "$app_name;format="camel"$"

description := "$description$"

scalaVersion := "2.10.3"



resolvers ++= Seq(
	"Sonatype Releases" at "https://oss.sonatype.org/content/groups/scala-tools",
	"typesafe repo"   at "http://repo.typesafe.com/typesafe/releases",
	"Ansvia release repo" at "http://scala.repo.ansvia.com/releases",
	"Ansvia snapshot repo" at "http://scala.repo.ansvia.com/nexus/content/repositories/snapshots"
)

libraryDependencies ++= Seq()


