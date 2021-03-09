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

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)
