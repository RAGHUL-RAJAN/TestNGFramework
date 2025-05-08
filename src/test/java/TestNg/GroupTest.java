package TestNg;

import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = "group1")
    public void test1(){
        System.out.println("Test 1 Executed");
    }

    @Test(groups = "group2")
    public void test2(){
        System.out.println("Test 2 executed");
    }

    @Test(groups = "group1")
    public void test3(){
        System.out.println("Test 3 executed");
    }
}
