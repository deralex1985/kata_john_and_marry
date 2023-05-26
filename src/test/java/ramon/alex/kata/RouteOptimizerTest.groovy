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

    def "ensure all possible array combinations are calculated"() {
        given:
        def routeOptimizer = new RouteOptimizer()
        def nrOfCities = 2
        int[] distances = [50, 55, 57]
        List<int[]> expectedCombinations = [
                [50, 55],
                [50, 57],
                [55, 50],
                [55, 57],
                [57, 50],
                [57, 55]
        ]

        when:
        def combinations = routeOptimizer.calculateAllPossibleCombinations(nrOfCities, distances)

        then:
        combinations == expectedCombinations

    }


}
