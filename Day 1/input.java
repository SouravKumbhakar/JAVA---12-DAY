import java.util.*;

public class input {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in); 

        // String name = sc.next();
        // System.out.println(name);

        // Q) Take two numbers a and b and print their sum.

        int a,b;

        System.out.println("Enter two numbers;");
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = a+b;
        System.out.println("the sum of a and b is ");
        System.out.println(sum);

    }
}
