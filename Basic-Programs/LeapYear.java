//edit version : user friendly

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For Stop Program , type 'stop'");
        while (true) {
            System.out.print("Enter your Year : ");
            String year = input.next();
            if (year.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                int newYear = Integer.parseInt(year);

                //checking it is possible to be a year or not
                if (newYear <= 0) {
                    System.out.println("It is not possible ! Enter a correct year.");
                    continue;
                }

                //checking leap year
                else if (newYear % 400 == 0 || newYear % 100 != 0 && newYear % 4 == 0) {
                    System.out.println(newYear + " : Leap Year");
                }
                else {
                    System.out.println(newYear + " : Not Leap Year");
                }
            }

            //format checking
            catch (NumberFormatException e) {
                System.out.println(year + " : It is not a number or year. Please input a valid year.Thanks.");
                continue;
            }
        }

        input.close();
    }
}
