package gam.api.utils

class DateUtils {
  public static Date yesterday() {
    final Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DATE, -1);
    return cal.getTime();
  }

  public static Date thirtyDays() {
    final Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DAY_OF_MONTH, -30);
    return cal.getTime();
  }

  public static Date ninetyDays() {
    final Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DAY_OF_MONTH, -90);
    return cal.getTime();
  }
}
