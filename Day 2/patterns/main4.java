// Q) print the pattern>

// * * * *
// * * *
// * *         Decreasing pyramid
// *

import java.util.*;

public class main4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the row nnumber:");
        int n= sc.nextInt();

        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // //ANOTHER APPROCH

        // for(int i=n; i>=0 ; i--){
        //     for(int j=0; j<i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}