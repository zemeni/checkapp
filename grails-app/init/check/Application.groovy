package check

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.context.annotation.Bean

class Application extends GrailsAutoConfiguration {

//    @Override
//    Collection<String> packageNames() {
//        return super.packageNames() // + ['check']  to scan for extra packages
//    }

//    @Bean defining bean

    //lifecycle
    @Override
    Closure doWithSpring() {
        return super.doWithSpring()
    }

    static void main(String[] args) {
        HelloService helloService
//        println "running grails application"
       println ""+ helloService.display()
        GrailsApp.run(Application, args)

    }
}