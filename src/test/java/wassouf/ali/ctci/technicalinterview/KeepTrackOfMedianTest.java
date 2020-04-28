package wassouf.ali.ctci.technicalinterview;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeepTrackOfMedianTest
{
    KeepTrackOfMedian keepTrackOfMedian = new KeepTrackOfMedian();

    @Test
    public void whenLookingForMedianReturnTrueMedian(){
        keepTrackOfMedian.addElements(10);
        keepTrackOfMedian.addElements(23);
        keepTrackOfMedian.addElements(15);
        Assert.assertEquals(15.0, keepTrackOfMedian.getMedian(),0.00000001);
        keepTrackOfMedian.addElements(11);
        Assert.assertEquals(13.0, keepTrackOfMedian.getMedian().intValue(),0.00000001);
        keepTrackOfMedian.addElements(16);
        Assert.assertEquals(15.0, keepTrackOfMedian.getMedian(),0.00000001);
        keepTrackOfMedian.addElements(13);
        Assert.assertEquals(14.0, keepTrackOfMedian.getMedian(),0.00000001);
        keepTrackOfMedian.addElements(26);
        keepTrackOfMedian.addElements(27);
        Assert.assertEquals(15.5, keepTrackOfMedian.getMedian(),0.00000001);

    }

}