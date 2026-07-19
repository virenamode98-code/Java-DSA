import java.util.Scanner;
public class UserInput {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);


         System.out.println("enter your name: ");
         String name = scanner.nextLine();


         System.out.println("enter your age: ");
         int age = scanner.nextInt();

         System.out.println("Hello, " + name );
         System.out.println("your age is: " + age);


         scanner.close();

    }
}

