package wassouf.ali.ctci.interviewQuestions.customSortMethods;

public class DualPivotQuickSort
{
    public static void sort(int[] array)
    {
        sort(array, 0, array.length - 1);
    }


    private static void sort(int[] array, int left, int right)
    {
        if(left>right)
            return;

        int leftPivot = array[left];
        int rightPivot = array[right];
        int leftPointer = left + 1;
        int rightPointer = right - 1;
        int loopVariable = leftPointer;

        while (loopVariable <= rightPointer)
        {
            if (array[loopVariable] < leftPivot)
            {
                swap(array, loopVariable, leftPointer);
                leftPointer++;
            }
            else if (array[loopVariable] >= rightPivot)
            {
                while (array[rightPointer] > rightPivot && loopVariable < rightPointer)
                {
                    rightPointer--;
                }
                swap(array, loopVariable, rightPointer);
                rightPointer--;
                if (array[loopVariable] < leftPivot)
                {
                    swap(array, loopVariable, leftPointer);
                    leftPointer++;

                }
            }

            loopVariable++;
        }
        leftPointer--; rightPointer++;
        swap(array, leftPointer,left);
        swap(array, rightPointer, right);
        sort(array, left, leftPointer-1);
        sort(array, right+1, right);
        sort(array, leftPointer+1, right-1);
    }


    private static void swap(int[] array, int firstIndex, int secondIndex)
    {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
