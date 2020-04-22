package wassouf.ali.ctci.bigO;

import java.util.LinkedList;
import org.junit.Test;

public class ListsCombinationsTest
{

    ListsCombinations listsCombinations = new ListsCombinations();

    @Test
    public void test(){
        LinkedList<Integer> first = new LinkedList<>();
        first.add(1);
        first.add(3);
//        first.add(5);

        LinkedList<Integer> second = new LinkedList<>();
        second.add(2);
        second.add(4);
//        second.add(6);

        listsCombinations.combineTwoListsWhileKeepingOrderOfInsertionInEachList(first,second);
    }
}