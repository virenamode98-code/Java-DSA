
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number: ");
        int First = scanner.nextInt();
        System.out.println("enter operator , eg:- +, -, *, /, % ");
        char Opt = scanner.next().charAt(0);
        
        System.out.println("enter second number: ");
        int Second = scanner.nextInt();


        switch (Opt) {
            case '+':
                System.out.println("Result: " + (First + Second));
                
                break;
            case '-':
                System.out.println("Result: " + (First - Second));

                break;
            case '*':
                System.out.println("Result:" + (First * Second));
                break;

            case '/':
                if ( Second != 0 ){
                    System.out.println("Result:" + (First / Second));
                }
                else{
                    System.out.println("number cannot divide by 0 ");
                }
                break;

            case '%':
                System.out.println("Result:" + (First % Second));
                break;
           


            default:
                System.out.println("invalid operator");
                break;
        }


       


        scanner.close();
    }
}