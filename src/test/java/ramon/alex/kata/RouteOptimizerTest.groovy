package ramon.alex.kata

import spock.lang.Specification

class RouteOptimizerTest extends Specification {

    def "test to illustrate spock"() {
        given:
        def a = 7
        def b = 3

        when:
        def c = a + b

        then:
        c == 10

    }

    def "ensure all possible array combinations are calculated"(int nrOfCities, int[] distances, List<int[]> combinations) {
        given:
        def routeOptimizer = new RouteOptimizer()

        expect:
        combinations == routeOptimizer.calculateAllPossibleCombinations(nrOfCities, distances)
        println "Groovy" + combinations

        where:
        nrOfCities | distances        | combinations
        2          | [50, 55, 57]     | [[50, 55], [50, 57], [55, 50], [55, 57], [57, 50], [57, 55]]
        3          | [50, 55, 57, 90] | [[50, 55, 57], [50, 55, 90], [50, 57, 90], [55, 57, 90]]

    }


}
