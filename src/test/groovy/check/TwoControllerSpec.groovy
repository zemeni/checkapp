package check

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class TwoControllerSpec extends Specification implements ControllerUnitTest<TwoController> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
