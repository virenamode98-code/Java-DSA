
public class task1 {
    public static void main(String[] args) {
       int year = 2026;
       
       if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0 )) {
        System.out.println("this is a leap year");
       }
       else{
        System.out.println("this is a normal year ");
       }
    }
}
