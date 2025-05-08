package TestNg;

import org.testng.annotations.Test;

public class SkipTest {

    @Test(enabled = false)
    public void testToSkip(){
        System.out.println("Test skipped");
    }

    @Test
    public void testToExecute(){
        System.out.println("Test Executed");
    }
}
