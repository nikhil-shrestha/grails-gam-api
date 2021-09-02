package gam.api.model.csv

import java.text.SimpleDateFormat

class DashboardAllWrapper {
  Date date;
  String advertiserName;
  String deviceName;
  String adUnitName;
  Long adUnitId;
  Double unfilledImpression;
  Double impression;
  Double lineItemClicks;
  Double cpmRevenue;
  Double adRequest;
  Double responseServed;
  Double fillRate;

  DashboardAllWrapper builder(obj) {
    this.date = parseDate(obj[0])
    this.advertiserName = obj[1]
    this.deviceName = obj[2]
    this.adUnitName = obj[3]
    this.adUnitId = Long.parseLong(obj[6])
    this.unfilledImpression = Double.parseDouble(obj[7])
    this.impression = Double.parseDouble(obj[8])
    this.lineItemClicks = Double.parseDouble(obj[9])
    this.cpmRevenue = Double.parseDouble(obj[10])
    this.adRequest = Double.parseDouble(obj[11])
    this.responseServed = Double.parseDouble(obj[12])
    this.fillRate = Double.parseDouble(obj[13])

    return this
  }

  private Date parseDate(String date) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    return sdf.parse(date);
  }
}
