import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = scanner.nextInt();


        if (age >= 18) {
                System.out.println("do you have id , true and false ? ");
                boolean hasId = scanner.nextBoolean();
            
            if (hasId) {
                
                
                System.out.println("Entry allowed");
                
            }else{
                System.out.println("id required");
            }
        }
        else{

            System.out.println("you are underage");
        }
        scanner.close();
    }

    
}