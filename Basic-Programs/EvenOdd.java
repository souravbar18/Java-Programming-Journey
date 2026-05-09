import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner to take input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int num = input.nextInt();

        // Logic : if a number can devide by 2 , it's a Even number
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }

        input.close();
    }
}
