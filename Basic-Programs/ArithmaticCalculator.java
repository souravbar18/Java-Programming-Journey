//edited version
import java.util.Scanner;
class Calculator {
    double firstNumber;
    double secondNumber;

    Calculator(double firstNumber,double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
   public double addition() {
        return this.firstNumber + this.secondNumber;
   }
    public double substraction() {
        return this.firstNumber - this.secondNumber;
    }
    public double multiplication() {
        return this.firstNumber * this.secondNumber;
    }
    public double division() {
        if (this.secondNumber == 0) {
            System.out.println("Syntax Error !");
            return 0;
        }
        else {
            return this.firstNumber / this.secondNumber;
        }
    }
}
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter Your Second Number : ");
        double secondNumber =input.nextDouble();
        Calculator myCal = new Calculator(firstNumber,secondNumber);

        System.out.println("Sum : " + myCal.addition());
        System.out.println("Sub : " + myCal.substraction());
        System.out.println("Mul : " + myCal.multiplication());
        System.out.println("Div : " + myCal.division());
    }
}
