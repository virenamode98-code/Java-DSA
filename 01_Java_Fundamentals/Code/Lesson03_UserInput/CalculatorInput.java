import java.util.Scanner;

public class CalculatorInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number: ");
        int number_first = scanner.nextInt();


        System.out.println("enter the second number: ");
        int number_second = scanner.nextInt();


        int sum = number_first + number_second;
        int diff = number_first - number_second;
        int mul = number_first  * number_second;
        double div = number_first / number_second;


        System.out.println("sum of two number is: " + sum);
        System.out.println("difference  of two number is: " + diff);
        System.out.println("product  of two number is: " + mul);
        System.out.println("division of two number is: " + div);
    


        scanner.close();





    }
}