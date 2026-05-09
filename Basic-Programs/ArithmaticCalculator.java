import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Simple Java Calculator ---");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
      ে//all calculation 
        double sum = num1 + num2;
        double diff = num1 - num2;
        double mul = num1 * num2;
        
        System.out.println("\nResults:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + mul);
        
        // A small logic about division (a number cannot be divided by 0)
        if (num2 != 0) {
            double div = num1 / num2;
            System.out.println("Division: " + div);
        } else {
            System.out.println("Division: Error! Cannot divide by zero.");
        }
        
        sc.close();
    }
}
