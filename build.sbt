scalaVersion := "2.10.3"

seq(giter8Settings :_*)

resolvers ++= Seq(
	"Sonatype Releases" at "https://oss.sonatype.org/content/groups/scala-tools",
	"typesafe repo"   at "http://repo.typesafe.com/typesafe/releases",
	"typesafe ivy release" at "http://repo.typesafe.com/typesafe/ivy-releases"
)

