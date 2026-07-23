import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int tem = number;
        int DigitCount = 0;


        // special case : 0 has  one digit 

        if(tem == 0 ){
            DigitCount = 1;

        }
        else{
            while (tem != 0) {

                tem = tem / 10;
                DigitCount++;
                
            }
        }
   
        System.out.println("number of digits: " + DigitCount);
    
    
    
        scanner.close();
    }





}