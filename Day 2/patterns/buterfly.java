// Q)

//  *             *
//  * *         * *
//  * * *     * * *
//  * * * * * * * *    BUTTERFLY PATTERN
//  * * * * * * * *
//  * * *     * * * 
//  * *         * *
//  *             *  

import java.util.Scanner;

public class buterfly {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int n= sc.nextInt();

        //upper wings

       for(int i=1; i<=n; i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            for(int j = 1 ; j<=(2*(n-i)) ;j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
       }

       //lower wings
       
       for(int i=1; i<=n; i++){
            for(int j=n ; j>=i ;j--){
                System.out.print("*");
            }
            for(int j = 1 ; j<=(2*(i-1)) ;j++){
                System.out.print(" ");
            }
            for(int j=n ; j>=i ;j--){
                System.out.print("*");
            }
            System.out.println();
       }
    }  
}
