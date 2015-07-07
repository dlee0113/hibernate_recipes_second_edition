name := "sbt-chapter1"

version := "1.0"

libraryDependencies ++= Seq(
	"com.h2database" % "h2" % "1.4.178",
	"org.hibernate" % "hibernate-core" % "4.3.5.Final",
	"org.testng" % "testng" % "6.8.7" % "test",
	"org.hibernate" % "hibernate-entitymanager" % "4.3.5.Final"
)