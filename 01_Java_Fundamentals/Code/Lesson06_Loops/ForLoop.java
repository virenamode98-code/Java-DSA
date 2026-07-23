public class ForLoop {

    public static void main(String[] args){
        //         for(int i = 1; i <= 10; i++){
        //             System.out.println(i);
        //         }
        //     }

            
        // 

            // from 1 to 20 even number 

            for(int i=1; i <=20; i++){
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }
            // odd number from 1 to 20 
            for(int i = 1; i <=20 ; i++){
                if (i % 2 != 0) {
                System.out.println(i);                    
                }
            }

            // task calculate the sum of number from 1 to 100
            int sum = 0;

            for(int i = 1; i <= 100; i++){
                sum = sum + i;
            }

            System.out.println( "sum: " + sum);
}
}