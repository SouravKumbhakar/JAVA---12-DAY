import java.util.*;

public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int n=sc.nextInt();
        int i,j;
        int val=1;

        for(i=0;i<=n;i++){
            int k=40-3*i;
            for(int p=0;p<k;p++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print(val+"      ");
            }
            System.out.println();
            val++;
        }
    }
}