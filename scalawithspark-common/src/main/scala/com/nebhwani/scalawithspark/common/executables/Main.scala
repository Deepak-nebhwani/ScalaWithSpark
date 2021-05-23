package com.nebhwani.scalawithspark.common.executables

import com.nebhwani.scalawithspark.common.utils.DateTimeUtils

object Main extends App {
  
  println(DateTimeUtils.currentGMTTimeStamp("yyyy-MMM-dd-HH:mm:ss"))
  println(DateTimeUtils.currentLocalTimeStamp("yyyy-MMM-dd-HH:mm:ss"))
}