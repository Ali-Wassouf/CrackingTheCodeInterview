package wassouf.ali.ctci.technicalinterview;

import java.util.PriorityQueue;

public class KeepTrackOfMedian
{
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> -Integer.compare(o1, o2));


    public void addElements(Integer element)
    {
        if (!minHeap.isEmpty() && element > minHeap.peek())
        {
            minHeap.offer(element);
        }
        else
        {
            maxHeap.offer(element);
        }
        balanceHeaps();
    }


    private void balanceHeaps()
    {
        if (Math.abs(minHeap.size() - maxHeap.size()) > 1)
        {
            if (minHeap.size() > maxHeap.size())
            {
                maxHeap.offer(minHeap.poll());
            }
            else
            {
                minHeap.offer(maxHeap.poll());
            }
        }
    }


    public Double getMedian()
    {

        if (minHeap.size() > maxHeap.size())
        {
            return minHeap.peek() * 1.0;
        }
        if (minHeap.size() < maxHeap.size())
        {
            return maxHeap.peek() *1.0;
        }
        return (minHeap.peek() + maxHeap.peek()) / 2.0;
    }


}