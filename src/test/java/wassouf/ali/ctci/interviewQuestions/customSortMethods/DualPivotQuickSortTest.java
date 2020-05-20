package wassouf.ali.ctci.interviewQuestions.customSortMethods;

import org.junit.Assert;
import org.junit.Test;

public class DualPivotQuickSortTest
{
    @Test
    public void testSorting()
    {
        int[] array = {1, 4, 6, 3, 564, 3, 4, 2, 1, 77, 4, 355};
        DualPivotQuickSort.sort(array);
        Assert.assertEquals(564,array[array.length-1]);
    }

}