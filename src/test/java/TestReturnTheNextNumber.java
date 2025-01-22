import com.digital_nomads.veryEasy.ReturnTheNextNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestReturnTheNextNumber {

    ReturnTheNextNumber returnTheNextNumber = new ReturnTheNextNumber();

    @Test
    public void testReturntheNextNumber() {
        Assert.assertEquals(returnTheNextNumber.returnTheNextNumber(5), 6);
    }
}
