//edit : error handling
import java.lang.module.FindException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        String marks = input.next();
        try {
            int mark = Integer.parseInt(marks);
            // Grading Logic
            if (mark > 100) {
                System.out.println("You're trying to input useless numbers !");
            }
            else if (mark >= 80 ) {
                System.out.println("Grade: A+ (Excellent!)");
            } else if (mark >= 70) {
                System.out.println("Grade: A");
            } else if (mark >= 60) {
                System.out.println("Grade: A-");
            } else if (mark >= 50) {
                System.out.println("Grade: B");
            } else if (mark >= 40) {
                System.out.println("Grade: C");
            } else if (mark >= 33) {
                System.out.println("Grade: D");
            } else if (mark >= 0) {
                System.out.println("Grade: F (Better luck next time)");
            } else {
                System.out.println("Invalid Marks! Please enter between 0 and 100.");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error ! Please Input a number.");
        }

        input.close();
    }
}
