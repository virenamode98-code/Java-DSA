import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);


         System.out.println("Enter your First number: ");
         int First = scanner.nextInt();
         System.out.println("Enter your second number: ");
         int Second = scanner.nextInt();


         if (First > Second) {
            System.out.println("first number is larger");
         }
         else if (First == Second) {
            System.out.println(" numbers are equal  ");
         }
         else {
            System.out.println("second number is larger ");
         }
        scanner.close();
    }
}