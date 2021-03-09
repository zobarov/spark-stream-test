package com.epam.awg
import org.apache.spark.{SparkConf, SparkContext}

object HelloSpark {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setAppName("HelloSpark")
      .setMaster("local[*]")
    val sc = new SparkContext(conf)

    println("Hello, Spark World!")
    sc.stop()
  }

}
