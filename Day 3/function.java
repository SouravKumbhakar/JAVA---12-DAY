import java.util.Scanner;

public class function {
    public static void printMyName(String myName){
        System.out.println(myName);
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        printMyName(name); //function call
    }
}
