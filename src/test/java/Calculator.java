//import java.util.Scanner;
//
//public class Calculator {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input two numbers
//        System.out.print("Enter first number: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.print("Enter second number: ");
//        double num2 = scanner.nextDouble();
//
//        // Perform operations
//        double sum = num1 + num2;
//        double difference = num1 - num2;
//        double product = num1 * num2;
//
//        // Output results
//        System.out.println("Sum: " + sum);
//        System.out.println("Difference: " + difference);
//        System.out.println("Product: " + product);
//
//        scanner.close();
//    }
//}

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {

    @Test
    public void testMethod() {
        Assert.assertTrue(true);
    }
}

