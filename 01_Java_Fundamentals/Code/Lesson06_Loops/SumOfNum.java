import java.util.Scanner;

public class SumOfNum {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);




        System.out.println("enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum = sum + i ;
        }

        System.out.println("Sum : "+ sum);


    }
}