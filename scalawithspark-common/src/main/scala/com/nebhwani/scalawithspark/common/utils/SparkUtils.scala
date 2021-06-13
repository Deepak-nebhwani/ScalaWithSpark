package com.nebhwani.scalawithspark.common.utils

import org.apache.spark.sql.SparkSession

object SparkUtils {
  
  def getSparkSession() ={
    SparkSession.builder().appName("ScalaWithSpark").master("local").getOrCreate()
  }
}