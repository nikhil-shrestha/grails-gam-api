package gam.api.utils

import gam.api.contants.DateRangeType

import java.text.SimpleDateFormat

class DateParseUtils {

  private static final String defaultDateFormat = "yyyy-MM-dd"

  /**
   * @params : MAP
   * @dateRangeType : id of DateRangeType
   *
   * @Return : MAP<String, Date>
   *
   * This function is responsible for to calculate the from and to date on the basis of provided date range type
   *
   * @Note : If value of dateRangeType is null then the default date range type will be LAST7DAYS
   * */
  def static getFromToDate(params) {
    def dateRange = DateRangeType.LAST7DAYS ?: params["dateRangeType"]

    Calendar calFrom = Calendar.getInstance()

    calFrom.set(Calendar.HOUR_OF_DAY, 0)
    calFrom.set(Calendar.MINUTE, 0)
    calFrom.set(Calendar.SECOND, 0)
    calFrom.set(Calendar.MILLISECOND, 0)

    Calendar calTo = Calendar.getInstance()

    calTo.set(Calendar.HOUR_OF_DAY, 23)
    calTo.set(Calendar.MINUTE, 59)
    calTo.set(Calendar.SECOND, 59)
    calTo.set(Calendar.MILLISECOND, 999)

    switch (dateRange) {
      case DateRangeType.YESTERDAY:
        calFrom.add(Calendar.DATE, -1)
        calTo.add(Calendar.DATE, -1)
        break
      case DateRangeType.LAST7DAYS:
        calFrom.add(Calendar.DATE, -7)
        calTo.add(Calendar.DATE, -1)
        break
      case DateRangeType.LAST30DAYS:
        calFrom.add(Calendar.DATE, -30)
        calTo.add(Calendar.DATE, -1)
        break
      case DateRangeType.LAST3MONTHS:
        calFrom.add(Calendar.MONTH, -3)
        calTo.add(Calendar.DATE, -1)
        break
      default:
        calFrom.add(Calendar.DATE, -7)
        calTo.add(Calendar.DATE, -1)
        break
    }

    Date from = calFrom.getTime()
    Date to = calTo.getTime()

    return [from: from, to: to]
  }

  /**
   * @Param : Date, String
   * @Return : String
   *
   * This function is responsible to format the date as provided format.
   * If the provided format if null or invalid then the provided date will be
   * formatted in "yyyy-MM-dd" format
   * */
  static def format(Date date) {
    if (date == null) {
      return null
    }

    def df = new SimpleDateFormat(defaultDateFormat)
    return df.format(date)

  }
}
