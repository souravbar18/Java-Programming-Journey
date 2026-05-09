import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        boolean isLeapYear = false;

        // The logic behind leap years
        // The year must be divisible by 400.
        // 2. Or, the year must be divisible by 4 but not divisible by 100.
        
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        
        sc.close();
    }
}
