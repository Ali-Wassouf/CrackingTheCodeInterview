package wassouf.ali.ctci.technicalinterview;

import org.junit.Assert;
import org.junit.Test;

public class FindIntersectionOfTwoSortedArraysTest
{
    FindIntersectionOfTwoSortedArrays findIntersectionOfTwoSortedArrays = new FindIntersectionOfTwoSortedArrays();

    @Test
    public void whenFindingIntersectionReturnCorrectResult(){
        int[] A = {13, 27, 35, 40, 49, 55, 59};
        int[] B = {17, 35, 39, 40, 55, 58, 60};

        Assert.assertEquals(3,findIntersectionOfTwoSortedArrays.findIntersectionOfTwoArrays(A, B).size());
    }
}