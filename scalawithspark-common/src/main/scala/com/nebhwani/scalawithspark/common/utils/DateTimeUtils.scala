package com.nebhwani.scalawithspark.common.utils

import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.LocalDateTime

object DateTimeUtils {

  val currentGMTTimeStamp = (dateTimeFormat: String) =>
    ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern(dateTimeFormat))

  val currentLocalTimeStamp = (dateTimeFormat: String) =>
    LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateTimeFormat))

}