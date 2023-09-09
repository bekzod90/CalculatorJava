import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        System.out.println("Enter the operation");
        String op = sc.next();
        int result = 0;
        switch (op) {
            case "+":
                result = a + b - c;
                break;
            case "-":
                result = a - b + c;
                break;
            case "*":
                result = a * b - c;
                break;
            case "/":
                result = a / b * c;
                break;
            default:
                System.out.println("Invalid operation");
                System.exit(0);
        }
        System.out.println("Result: " + result);
    }
}
