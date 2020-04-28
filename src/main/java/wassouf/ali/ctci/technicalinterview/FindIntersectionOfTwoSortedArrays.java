package wassouf.ali.ctci.technicalinterview;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionOfTwoSortedArrays
{
    //The arrays are of the same size, all unique values, and sorted
    public List<Integer> findIntersectionOfTwoArrays(int[] A, int[] B)
    {
        List<Integer> result = new ArrayList<>();
        int lastCheckedInB = 0;
        for (int number : A)
        {
            while (lastCheckedInB < B.length)
            {
                if (B[lastCheckedInB] > number)
                {
                    break;
                }
                if (B[lastCheckedInB] == number)
                {
                    result.add(number);
                }
                lastCheckedInB++;
            }
        }
        return result;
    }
}
