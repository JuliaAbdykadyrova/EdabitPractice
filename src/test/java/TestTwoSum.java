import com.digital_nomads.veryEasy.TwoSum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTwoSum {
   TwoSum twoSum = new TwoSum();

   @Test
  public void testTwoSum() {
      Assert.assertEquals(twoSum.sum(1,5), 6);
      Assert.assertEquals(twoSum.sum(3,8), 11);
      Assert.assertEquals(twoSum.sum(6,13), 19);
   }
}
