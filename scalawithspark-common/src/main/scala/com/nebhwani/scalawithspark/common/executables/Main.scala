package com.nebhwani.scalawithspark.common.executables

import com.nebhwani.scalawithspark.common.utils.DateTimeUtils
import com.nebhwani.scalawithspark.common.utils.SparkUtils

object Main extends App {
  val spark =SparkUtils.getSparkSession()
  
  val path = raw"C:\Users\we\Downloads\avro_data\covtypeNorm_binary.avro"
  

  val df= spark.read.format("avro").load(path)
  df.limit(100).write.format("avro").save(raw"src\main\resources\avrosamplefile.avro")
  
  println(DateTimeUtils.currentGMTTimeStamp("yyyy-MMM-dd-HH:mm:ss"))
  println(DateTimeUtils.currentLocalTimeStamp("yyyy-MMM-dd-HH:mm:ss"))
}