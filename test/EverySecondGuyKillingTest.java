import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EverySecondGuyKillingTest {

    @Test
    public void testTimeToRoulet() throws Exception {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);//
        arr.add(22);//
        arr.add(3);
        arr.add(13);//
        arr.add(11);//
        arr.add(111);//
        arr.add(31);//
        arr.add(14);//
        arr.add(21);//
        Assert.assertEquals((Integer)EverySecondGuyKilling.timeToRoulet(arr), (Integer)3);
    }
}