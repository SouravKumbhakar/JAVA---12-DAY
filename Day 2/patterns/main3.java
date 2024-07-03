// Q) print the pattern>

// *
// **
// ***     increasing loop
// ****

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the nth term");
        int n= sc.nextInt();

        for(int i=0 ; i<=n ; i++){
            for(int j=0; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
