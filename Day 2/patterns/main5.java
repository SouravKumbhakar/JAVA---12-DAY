import java.util.*;

public class main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of row:");
        int n= sc.nextInt(); //4

        for(int i=1 ; i<=n; i++){ //1 to 4
            for(int k=n-1; k>=i; k--){ //k=3
                System.out.print(" ");
            }
            for(int j=1; j<=i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
