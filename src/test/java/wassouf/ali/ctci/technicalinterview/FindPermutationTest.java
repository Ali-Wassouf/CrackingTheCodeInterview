package wassouf.ali.ctci.technicalinterview;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindPermutationTest
{
    FindPermutation findPermutation = new FindPermutation();

    @Test
    public void whenFindingPermutationReturnTwo(){
        Assert.assertTrue(findPermutation.findPermutations("ab","abtcba").contains(0));
        Assert.assertTrue(findPermutation.findPermutations("ab","abtcba").contains(4));
    }
}