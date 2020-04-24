package wassouf.ali.ctci.bigO;

import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class ListsCombinationsTest
{

    ListsCombinations listsCombinations = new ListsCombinations();

    @Test
    public void whenCombiningTwoListsTheOrderOfElementsInTheSeparateListsDoesntChange(){
        LinkedList<Integer> first = new LinkedList<>();
        first.add(1);
        first.add(3);
        first.add(5);

        LinkedList<Integer> second = new LinkedList<>();
        second.add(2);
        second.add(4);
        second.add(6);

       ArrayList<LinkedList<Integer>> results =  listsCombinations.combineTwoListsWhileKeepingOrderOfInsertionInEachList(first,second);
       for(LinkedList<Integer> result : results){
           Assert.assertTrue(result.indexOf(1) < result.indexOf(3));
           Assert.assertTrue(result.indexOf(1) < result.indexOf(5));
           Assert.assertTrue(result.indexOf(3) < result.indexOf(5));
           Assert.assertTrue(result.indexOf(2) < result.indexOf(4));
           Assert.assertTrue(result.indexOf(2) < result.indexOf(6));
           Assert.assertTrue(result.indexOf(4) < result.indexOf(6));

       }
    }
}