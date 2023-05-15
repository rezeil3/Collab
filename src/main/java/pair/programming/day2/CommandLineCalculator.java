package pair.programming.day2;
import java.util.Scanner;

public class CommandLineCalculator {
    public static void main(String[] args) {
        boolean isLoop = true;
        int a, b;
        int operation = 0;

        while(isLoop){
            Scanner scn = new Scanner(System.in);
            System.out.println("Please select from below choices:");
            System.out.println("1   -   Add");
            System.out.println("2   -   Subtract");
            System.out.println("3   -   Multiply");
            System.out.println("4   -   Divide");
            System.out.println("5   -   Exit the program");
            System.out.print("Please enter your first choice: ");
            operation = scn.nextInt();

            if (operation>0 && operation<5) {
                System.out.print("Enter your first number: ");
                a = scn.nextInt();
                System.out.print("Enter your second number: ");
                b = scn.nextInt();
                System.out.println(calculateNow(operation, a, b));
            }else{
                System.out.println("Will now exit the program");
                isLoop = false;
            }
        }
    }
    public static String calculateNow(int ope, int a, int b) {
        switch (ope) {
            case 1:
                return "Result: " + add(a,b);
            case 2:
                return "Result: " + subtract(a,b);
            case 3:
                return "Result: " + multiply(a,b);
            case 4:
                return "Result: " + divide(a,b);
            default:
                return "error";
        }
    }

    public static int add(int a, int b) {
        return (a + b);
    }
    public static int subtract(int a, int b) {
        return (a - b);
    }
    public static int multiply(int a, int b) {
        return (a * b);
    }
    public static int divide(int a, int b) {
        return (a / b);
    }
}
