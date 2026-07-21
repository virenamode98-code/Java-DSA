import java.util.Scanner;

public class ElseIf {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your marks: ");
        int marks = scanner.nextInt();


        // fixed input 
        // int marks = 85;
        if(marks >= 90){
            System.out.println("Grade A+");
            
            
        }
        else if (marks >= 80) {
            System.out.println("Grade A");
        }
        else if (marks >= 70) {
            System.out.println("Grade B");
        }
        else if (marks >= 60) {
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }

        scanner.close();
    }
}