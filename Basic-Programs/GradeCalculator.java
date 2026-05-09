import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();
        
        // Grading Logic
        if (marks >= 80 && marks <= 100) {
            System.out.println("Grade: A+ (Excellent!)");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: A-");
        } else if (marks >= 50) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else if (marks >= 33) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 33) {
            System.out.println("Grade: F (Better luck next time)");
        } else {
            System.out.println("Invalid Marks! Please enter between 0 and 100.");
        }
        
        sc.close();
    }
}
