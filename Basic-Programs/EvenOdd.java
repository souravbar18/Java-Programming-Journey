//edit version
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Even Odd Checker & Positive Negative Checker");
        System.out.println("Type 'stop' to stop program");
        while (true) {
            System.out.print("Enter Your Number : ");
            String number = input.next();
            if (number.equalsIgnoreCase("stop") ) {
                System.out.println("Thank You ! Have a great day.");
                break;
            }
            try {
                int num = Integer.parseInt(number);
                if (num >= 0 & num % 2 == 0) {
                    System.out.println(num + " : It is a Positive and Even Number.");
                } else if (num >= 0 & num % 2 != 0) {
                    System.out.println(num + " : It is a Positive number but not a Even number");
                } else if (num < 0 & num % 2 == 0) {
                    System.out.println(num + " : It is a Negative and Even number");
                } else {
                    System.out.println(num + " : It is a Negative number but not a Even number");
                }
            }
            catch (NumberFormatException e) {
                System.out.println(number + " : It is not a number , please input a number !");
                continue;
            }
        }
        input.close();
    }
}
