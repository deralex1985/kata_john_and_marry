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
        def nrOfCities = 3
        int[] distances = [50, 55, 57, 58, 60]
        List<int[]> expectedCombinations = [[50,55,57],[50,55,58],[50,55,60],[50,57,58],[50,57,60],[50,58,60],[55,57,58],[55,57,60],[55,58,60],[57,58,60]]

        when:
        def combinations = routeOptimizer.calculateAllPossibleCombinations(nrOfCities, distances)

        then:
        combinations == expectedCombinations

    }


}
