package wassouf.ali.ctci.technicalinterview;

import java.util.HashMap;
import java.util.Map;

public class FindSolutionsToEquation
{

    /*
     * find all integer solutions to the equation a^3 + b^3 = c^3 + d^3
     * */


    public void printSolutions()
    {
        int n = 1000;
        Map<Integer, Pair> results = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                Pair pair = new Pair(i, j);
                int cubicSum = (i * i * i) + (j * j * j);
                if (!results.containsKey(cubicSum))
                {
                    results.put(cubicSum, pair);
                }
            }
        }
        System.out.println("The solution holds when (a = c or a = d) and (b = c or b = d), thus, the printed pairs can be ((a,c), (b,d)) values " +
            "or ((a,d),(b,c))");
        results.forEach((key, value) -> System.out.println(value.first + "," + value.second));
    }


    class Pair
    {
        int first;
        int second;


        public Pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
}
