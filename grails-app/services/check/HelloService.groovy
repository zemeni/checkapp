package check

import grails.core.GrailsApplication
import grails.gorm.transactions.Transactional

@Transactional
class HelloService {
    GrailsApplication grailsApplication

    String greeting() {
        def recipient = grailsApplication.config.getProperty("grails.gorm.reactor.events")
        return "from service "+recipient
    }
    String display() {
        return "returning value"
    }

    def serviceMethod() {

    }
}
