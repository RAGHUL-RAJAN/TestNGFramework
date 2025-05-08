package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassSetupTeardownTest {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before test class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After the test class");
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
