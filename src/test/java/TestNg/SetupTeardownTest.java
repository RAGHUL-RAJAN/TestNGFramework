package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SetupTeardownTest {

    @BeforeMethod
    public void setup(){
        System.out.println("Setup before test");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("Teardown after test");
    }

    @Test
    public void test1(){
        System.out.println("Test 1 executed");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 executed");
    }
}

