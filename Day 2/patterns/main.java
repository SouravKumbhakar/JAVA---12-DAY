// Q) print the pattern>

// *****
// *****
// *****
// *****

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the row size");
        int r= sc.nextInt();

        System.out.println("enter the column size");
        int c = sc.nextInt();

        for(int i=0; i<r ; i++){
            for(int j=0; j<c ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
