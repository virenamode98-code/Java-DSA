import java.util.Scanner;

public class MarksCheck {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);



        System.out.println("enter marks: ");
        int marks = scanner.nextInt();


        System.out.println(" Marks >= 40: " + (marks >= 40));
        System.out.println("Marks >= 90: " + (marks >= 75));
        System.out.println("Marks == 100: " + (marks == 100));

        scanner.close();

    }
}