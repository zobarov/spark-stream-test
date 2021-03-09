name := "HelloScala"

version := "0.1"

scalaVersion := "2.12.12"

val sparkVersion = "3.1.0"

// allows us to include spark packages
resolvers += "bintray-spark-packages" at
  "https://dl.bintray.com/spark-packages/maven/"
resolvers += "Typesafe Simple Repository" at
  "https://repo.typesafe.com/typesafe/simple/maven-releases/"
resolvers += "MavenRepository" at
  "https://mvnrepository.com/"
//resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.scalactic" %% "scalactic" % "3.2.5",
  "org.scalatest" %% "scalatest" % "3.2.5" % "test",
  "junit" % "junit" % "4.13" % "test",
  "org.scalatestplus" %% "junit-4-12" % "3.2.2.0" % "test"
)
