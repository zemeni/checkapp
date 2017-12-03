package check

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class OneControllerSpec extends Specification implements ControllerUnitTest<OneController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
