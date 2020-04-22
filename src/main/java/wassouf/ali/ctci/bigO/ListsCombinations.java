package wassouf.ali.ctci.bigO;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsCombinations
{

    // element at index i in a list is always before element at index i+1 in the result

    public ArrayList<LinkedList<Integer>> combineTwoListsWhileKeepingOrderOfInsertionInEachList(LinkedList<Integer> first, LinkedList<Integer> second)
    {
        ArrayList<LinkedList<Integer>> results = new ArrayList<>();
        combine(first,second,new LinkedList<>(), results);
        return results;


    }


    private void combine(
        LinkedList<Integer> first, LinkedList<Integer> second,
        LinkedList<Integer> temp, ArrayList<LinkedList<Integer>> results)
    {
        if (first.isEmpty() || second.isEmpty())
        {
            LinkedList<Integer> result = (LinkedList<Integer>) temp.clone();
            result.addAll(first);
            result.addAll(second);
            results.add(result);
            return;
        }

        Integer firstHead = first.getFirst();
        first.removeFirst();
        temp.addLast(firstHead);
        combine(first, second, temp, results);
        first.addFirst(firstHead);
        temp.removeLast();

        Integer secondHead = second.getFirst();
        second.removeFirst();
        temp.addLast(secondHead);
        combine(first, second, temp, results);
        second.addFirst(secondHead);
        temp.removeLast();
    }
}
