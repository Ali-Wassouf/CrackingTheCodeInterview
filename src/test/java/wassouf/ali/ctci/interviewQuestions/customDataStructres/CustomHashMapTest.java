package wassouf.ali.ctci.interviewQuestions.customDataStructres;

import java.util.Arrays;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class CustomHashMapTest
{
    CustomHashMap<String, String> hashMap = new CustomHashMap<>();


    @Test
    public void testPut() throws CloneNotSupportedException
    {
        hashMap.put("A","AA");
        hashMap.put("B","BB");

        Assert.assertEquals(2, hashMap.size);
    }



}