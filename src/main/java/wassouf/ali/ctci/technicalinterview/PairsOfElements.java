package wassouf.ali.ctci.technicalinterview;

import java.util.HashSet;
import java.util.Set;

public class PairsOfElements
{
    /**
     * Given an array of distinct values, count the numbers of pairs of integer having distance equals to K
     */

    public Integer countNumberOfPairs(int[] array, int k)
    {
        int count = 0;
        int i = 0;
        Set<Integer> set = new HashSet<>();
        for (int element : array)
        {
            set.add(element);
        }
        for (int element : array)
        {
            if (set.contains(element - k))
            {
                count++;
            }
            if(set.contains(element + k)){
                count++;
            }
        }
        return count;
    }
}
