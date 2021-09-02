package gam.api.contants;

public enum DateRangeType {

  YESTERDAY("YESTERDAY", "yesterday"),
  LAST7DAYS("LAST7DAYS", "last7days"),
  LAST30DAYS("LAST30DAYS", "last30days"),
  LAST3MONTHS("LAST3MONTHS", "last3monts");

  private String type;
  private String display;

  DateRangeType(String type, String display) {
    this.type = type;
    this.display = display;
  }

  public String getType() {
    return type;
  }

  public String getDisplay() {
    return display;
  }

  public static DateRangeType getByType(String type) {

    for (DateRangeType entry : DateRangeType.values()) {
      if (entry.type.equals(type)) {
        return entry;
      }
    }
    return null;
  }

  public static DateRangeType getByDisplay(String display) {
    for (DateRangeType entry : DateRangeType.values()) {
      if (entry.display.equals(display)) {
        return entry;
      }
    }
    return null;
  }

  public static String[] getByList() {
    int i = 0;
    String[] typeList = new String[DateRangeType.values().length];
    for (DateRangeType entry : DateRangeType.values()) {
      typeList[i] = entry.display;
      i++;
    }
    return typeList;
  }

}
