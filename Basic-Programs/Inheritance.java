import java.util.Scanner;
class GrandParent {
    public int add( int a , int b) {
        int sum = a + b ;
        return sum;
    }
}
class Parent extends GrandParent{
    public int substraction(int a , int b) {
        int sub = a - b ;
        return sub;
    }
}
class Child extends Parent{
    public int multiplication  (int a , int b) {
        int mul = a * b ;
        return mul;
    }
    public int divided (int a , int b) {
        int div = a / b ;
        return div;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Child myChild = new Child();
        System.out.print("Enter a : ");
        int a = input.nextInt();
        System.out.print("Enter b : ");
        int b = input.nextInt();
        System.out.println("Grand Paren Sum : " + myChild.add(a,b));
        System.out.println("Parent Sum and Sub : " + myChild.add(a,b) +  "," + myChild.substraction(a,b));
        System.out.println("Child Sum , Sub , Mul and Div : " + myChild.add(a,b) + "," + myChild.substraction(a,b) + "," + myChild.multiplication(a,b) + ","  + myChild.divided(a,b));

    }
}
