package ramon.alex.kata

import spock.lang.Specification

class RouteOptimizerTest extends Specification {

    def "Choose_best_sum"() {
        given:
        var a = 7
        var b = 3

        when:
        var c = a + b

        then:
        c == 10

    }
}
