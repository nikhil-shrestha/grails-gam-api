package gam.api

import grails.gorm.transactions.Transactional

@Transactional
class DataLoadService {

  def dashboardService

  def serviceMethod() {}

  def saveDashboardData() {
    def parentIds = [
        "21887933792",
        "21915945038",
        "21876718147",
        "21876902145",
        "21875886579",
        "21897089670",
        "21887988623",
        "21887783590",
        "21876587060",
        "21876425862",
    ]

    for (String parentId : parentIds) {
      dashboardService.save(parentId, "runner");
      System.out.println("DASHBOARD ALL SAVED... ");
      System.out.println("\n\n\n");
    }
  }
}
