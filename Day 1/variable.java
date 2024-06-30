public class variable {
    public static void main(String[] args) {
        
        //variables
        String name = "Tony stark";
        int age = 48;
        double price = 25.5;
        int a = 25;
        int b = 10;
        
        //after initializing we can change  the variable value correspond to the data type

        name = "Ironman";
        b = 5; 

        int sum = a+b;
        int diff = a-b;
        
        // [here a and b allocated to a memory address and the a sum varible use to hold
        //  the data of a+b which takes another memory adress ]

        System.out.println(sum);
        System.out.println(diff);
    }
}
