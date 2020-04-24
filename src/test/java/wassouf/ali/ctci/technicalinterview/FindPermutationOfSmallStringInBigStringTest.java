package wassouf.ali.ctci.technicalinterview;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPermutationOfSmallStringInBigStringTest
{

    FindPermutationOfSmallStringInBigString findPermutationOfSmallStringInBigString = new FindPermutationOfSmallStringInBigString();

    @Test
    public void test(){
        findPermutationOfSmallStringInBigString.findAllPermutations("lwtr","rlwtioaqqyanpkzirwlt");
    }
}