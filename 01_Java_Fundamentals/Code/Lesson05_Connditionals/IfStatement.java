import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // with user input
        System.out.println("enter your age for checking you can drive or not?: ");
        int age = scanner.nextInt();

        if (age >= 18){

            System.out.println("you can drive");
        }
        else{
            System.out.println("you are minor drive");
        }

            

            
     scanner.close();
    }
}










// with fixed input 

// public class IfStatement {

//     public static void main(String[] args){
//         int age = 21;

//         if(age >= 18){
//             System.out.println("you are adult");
//         }
//     }
// }