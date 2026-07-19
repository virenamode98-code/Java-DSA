import java.util.Scanner;
 
public class PracticeInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = scanner.nextLine();

        System.out.println("enter your age: ");
        int age = scanner.nextInt();

        System.out.println("hello, " + name);
        System.out.println("your age is: " + age);

        scanner.close();



    }
}