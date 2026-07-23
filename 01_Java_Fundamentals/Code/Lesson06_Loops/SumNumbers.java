import java.util.Scanner;

public class SumNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int i = 1 ; i <= number; i++){
            sum = sum + i;
        }

        System.out.println("Sum : " + sum);



        scanner.close();
    }
}