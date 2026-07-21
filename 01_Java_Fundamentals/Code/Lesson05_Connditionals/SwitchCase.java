import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your favorite day");
        int day = scanner.nextInt();

        switch (day) {
                case 1:
                System.out.println(" today is sunday and its numeric value is: 0");
                break;

                case 2:
                System.out.println(" today is monday and its numeric value is: 2");
                break;

                case 3:
                System.out.println(" today is tuesday and its numeric value is: 3");
                break;
                case 4:
                System.out.println(" today is thursday and its numeric value is: 4");
                break;
                case 5:
                System.out.println(" today is wednesday and its numeric value is: 5");
                break;
                 case 6:
                System.out.println("  today is friday and its numeric value is: 6");
                break;
                 case 7:
                System.out.println(" today is saturday and its numeric value is: 7");
                break;

        
            default:

                System.out.println("please enter a valid day !");
                break;
        }

     scanner.close();   
    }
}
