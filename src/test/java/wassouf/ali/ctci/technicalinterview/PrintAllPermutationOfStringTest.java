package wassouf.ali.ctci.technicalinterview;

import org.junit.Assert;
import org.junit.Test;

public class PrintAllPermutationOfStringTest
{
    PrintAllPermutationOfString printAllPermutationOfString = new PrintAllPermutationOfString();


    @Test
    public void whenStringNotEmptyReturnNonNull()
    {
        Assert.assertEquals(6, printAllPermutationOfString.print("abc").size());
    }


    @Test
    public void whenStringIsEmptyReturnNull()
    {
        Assert.assertNull(printAllPermutationOfString.print(""));
    }
}