package wassouf.ali.ctci.technicalinterview;

import org.junit.Assert;
import org.junit.Test;

public class PairsOfElementsTest
{
    PairsOfElements pairsOfElements = new PairsOfElements();


    @Test
    public void whenFindingPairsReturnCorrectNumberOfPairs()
    {
        int[] array = {1, 7, 5, 9, 2, 12, 3};

        Assert.assertEquals(8,pairsOfElements.countNumberOfPairs(array,2).intValue());
    }
}