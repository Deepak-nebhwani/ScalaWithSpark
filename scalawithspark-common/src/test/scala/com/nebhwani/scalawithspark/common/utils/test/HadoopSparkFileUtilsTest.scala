package com.nebhwani.scalawithspark.common.utils.test

import com.nebhwani.scalawithspark.common.utils.SparkUtils
import com.nebhwani.scalawithspark.common.utils.HadoopSparkFileUtils

object HadoopSparkFileUtilsTest extends App {
  val spark = SparkUtils.getSparkSession()
  val fileLocation = raw"src\main\resources\"
  val fileName = "avrosamplefile.avro"
  val renamedFileLocation = raw"src\main\resources\"
  val renamedFileName = "renamedAvrosamplefile.avro"
  
  HadoopSparkFileUtils.renameHdfsFile(spark, fileLocation, fileName, renamedFileLocation, renamedFileName)
}