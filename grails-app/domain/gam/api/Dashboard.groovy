package gam.api

class Dashboard {

    Long parentId;
    Date date;
    String advertiserName;
    String deviceName;
    String adUnitName;
    Long adUnitId;
    Double totalUnfilledImpressions;
    Double totalImpressions;
    Double totalItemClicks;
    Double totalRevenue;
    Double totalAdRequest;
    Double totalResponseServed;
    Double totalFillRate;

    static constraints = {
        parentId nullable: false
        date nullable: false
        advertiserName nullable: false
        deviceName nullable: true
        adUnitName nullable: false
        adUnitId nullable: false
        totalUnfilledImpressions nullable: false
        totalImpressions nullable: false
        totalItemClicks nullable: false
        totalRevenue nullable: false
        totalAdRequest nullable: false
        totalResponseServed nullable: false
        totalFillRate nullable: false
    }
}
