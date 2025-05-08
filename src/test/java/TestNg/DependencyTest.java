package TestNg;

import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void test1(){
        System.out.println("Test 1 executed");
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("Test 2 executed, depends on test 1");
    }

    @Test(dependsOnMethods = "test1")
    public void test3(){
        System.out.println("test 3 executed, depends on test 1");
    }
}
