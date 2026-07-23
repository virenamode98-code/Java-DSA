import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int DigitNumber = scanner.nextInt();

        int DigitSum = 0;


        
        while (DigitNumber != 0 ) {
            int digit = DigitNumber % 10;
            DigitSum = DigitSum + digit;
            DigitNumber = DigitNumber/10;
        }


        System.out.println("sum of digit: " +DigitSum);




        scanner.close();
    }
}
