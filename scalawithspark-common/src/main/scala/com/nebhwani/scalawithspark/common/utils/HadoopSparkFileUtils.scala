package com.nebhwani.scalawithspark.common.utils

import org.apache.spark.sql.SparkSession
import org.apache.hadoop.fs.FileSystem
import org.apache.hadoop.fs.Path

object HadoopSparkFileUtils {

  def renameHdfsFile(spark: SparkSession, srcFilePath: String, srcFileName: String, dstFilePath: String, dstFileLocation: String) = {
    val fileToBeRenamed = srcFilePath + srcFileName
    val renamedFile = dstFilePath + dstFileLocation
    val fs = FileSystem.get(spark.sparkContext.hadoopConfiguration)

    fs.rename(new Path(fileToBeRenamed), new Path(renamedFile))
  }

}