package CodeWar.DescendingOrder;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DescendingOrderTest {

    @Test
    public void test_01() {

        Assert.assertEquals(0, CodeWar.DescendingOrder.DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        Assert.assertEquals(51, CodeWar.DescendingOrder.DescendingOrder.sortDesc(15));
    }


    @Test
    public void test_03() {
        Assert.assertEquals(987654321, CodeWar.DescendingOrder.DescendingOrder.sortDesc(123456789));
    }
}
