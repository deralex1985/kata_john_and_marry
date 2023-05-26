package ramon.alex.kata;

import java.util.ArrayList;
import java.util.List;

public class RouteOptimizer {

    public int chooseBestSum(int maxDistance, int nrOfCities, int[] distances){
        return 0;
    }

    public List<int[]> calculateAllPossibleCombinations(int nrOfCities, int[] distances){
        List<int[]> combinations = new ArrayList<>();

        for (int i = 0; i < distances.length; i++) {
            int a = distances[i];
            for (int j = i+1; j <= nrOfCities; j++) {
                int b = distances[j];

                combinations.add(new int[]{a,b});
            }
        }
        return combinations;
    }
}
