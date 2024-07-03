// Q) print the sum of all natural numbers.

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n th term:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }

        System.out.println("the sum is = "+ sum);
    }    
}
