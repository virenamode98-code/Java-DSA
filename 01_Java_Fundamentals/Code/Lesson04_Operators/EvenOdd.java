import java.util.Scanner;



public class EvenOdd {
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);


    System.out.println("enter a number: ");
    int number = scanner.nextInt();


    System.out.println("is number even: " + (number % 2 == 0));
    

    scanner.close();
}
   
}