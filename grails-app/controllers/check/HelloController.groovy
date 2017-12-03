package check

import org.springframework.beans.factory.annotation.Value


class HelloController {
//    HelloService helloService
    @Value('${grails.gorm.reactor.events}')
    String receipient

    def hello() {
        def recipient = grailsApplication.config.getProperty('grails.gorm.reactor.events',Integer,5)
        def recipient2 = grailsApplication.config.getProperty('grails.gorm.reactor.events',"default value")

//        render "Hello ${recipient} ${recipient2}"
//        render helloService.greeting()
        render receipient +" from annotation"
    }

    public void newChanges() {

    }
}
