import java.util.Scanner;


public class PracticeOperators{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter your first number: ");
        int b = scanner.nextInt();


        System.out.println("Addition: " + (a + b));
        System.out.println("Substraction: " + (a-b));
        System.out.println("Multiplication: "+ (a*b));
        System.out.println("Division: " + ((double) a / b));
        System.out.println("Remainder: " + (a % b));

        scanner.close();

    }
}