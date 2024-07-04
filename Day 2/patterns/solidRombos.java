// Q) 

//     *****
//    *****
//   *****     SOLID ROMBOS
//  *****
// *****    

import java.util.Scanner;

public class solidRombos {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int n= sc.nextInt();

        //upper wings

       for(int i=1; i<=n; i++){
           for(int j=1; j<=n-i; j++){
                System.out.print(" ");
           }

           for(int j=1 ; j<=n; j++){
                System.out.print("* ");
           }
           System.out.println();
       }

    }
}