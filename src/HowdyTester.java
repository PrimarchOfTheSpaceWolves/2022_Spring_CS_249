import org.testng.Assert;
import org.testng.annotations.Test;

public class HowdyTester {
    @Test()
    public void testGetPassword() {
        String p = HowdyPrinter.getPassword();
        Assert.assertEquals(p, "1234", "Incorrect password!");
    }
}
