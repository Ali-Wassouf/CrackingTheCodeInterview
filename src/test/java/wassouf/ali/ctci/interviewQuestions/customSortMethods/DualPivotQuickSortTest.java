package wassouf.ali.ctci.interviewQuestions.customSortMethods;

import org.junit.Test;

import static org.junit.Assert.*;

public class DualPivotQuickSortTest
{
    @Test
    public void testSorting(){
        int[] array = {1,4,6,3,564,3,4,2,1,77,4,355};
        DualPivotQuickSort.sort(array);
    }

}