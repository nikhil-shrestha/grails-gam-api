package gam.api

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DashboardServiceSpec extends Specification {

    DashboardService dashboardService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Dashboard(...).save(flush: true, failOnError: true)
        //new Dashboard(...).save(flush: true, failOnError: true)
        //Dashboard dashboard = new Dashboard(...).save(flush: true, failOnError: true)
        //new Dashboard(...).save(flush: true, failOnError: true)
        //new Dashboard(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //dashboard.id
    }

    void "test get"() {
        setupData()

        expect:
        dashboardService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Dashboard> dashboardList = dashboardService.list(max: 2, offset: 2)

        then:
        dashboardList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        dashboardService.count() == 5
    }

    void "test delete"() {
        Long dashboardId = setupData()

        expect:
        dashboardService.count() == 5

        when:
        dashboardService.delete(dashboardId)
        sessionFactory.currentSession.flush()

        then:
        dashboardService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Dashboard dashboard = new Dashboard()
        dashboardService.save(dashboard)

        then:
        dashboard.id != null
    }
}
