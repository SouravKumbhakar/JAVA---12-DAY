// Q) print the pattern>

//     *****
//     *   *     Hollow Rectangle 
//     *   *
//     *****
import java.util.*;
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enetr the row number-");
        int row=sc.nextInt();
        
        System.out.println("enetr the column number-");
        int col=sc.nextInt();

        for(int i=1 ; i<=row; i++){
            for(int j=1; j<=col ;j++){
                if(i==1 || j==1 || i==row || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
