import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// //make a condition for adult or not.

        // System.out.println("Please enter your age - ");
        // int age = sc.nextInt();

        // //condition
        // if(age>18){
        //     System.out.println("Adult");
        // } else{
        //     System.out.println("Not adult");
        // }

//    //make a condition for cheking odd or even.
//         System.out.println("please enter a number- ");
//         int num = sc.nextInt();

//         //condition

//         if(num%2 == 0){
//             System.out.println("Even");
//         } else{
//             System.out.println("Odd");

//         }
     
      // make a condition to cheack two numbers are equal or not;
            System.out.println("Enter two number- ");
            int num1= sc.nextInt();
            int num2= sc.nextInt();

            //condition (nested if else);

            if(num1==num2){
                System.out.println("equal");
            } else {
                if(num1>num2){
                    System.out.println("num1 is greater than  num2");
                } else{
                    System.out.println("num2 is greater than num1");
                }
            }
    }
}
