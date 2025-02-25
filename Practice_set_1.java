import java.util.Scanner;

public class Practice_set_1 {

    public static void main(String[] args) {
    // Question 1
        /* int a = 23;
         int b = 24;
         int c = 25;
         int sum = a + b + c;
         System.out.println(sum); */
    // Question 2
        /* float a = 74;
        float b = 65;
        float c = 59;
        float cgpa = (a + b + c)/30;
        System.out.println(cgpa); */
    // Question 3
       /*  System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in); 
        String str = sc.next();
        System.out.println("Hello " + str + ", have a good day.");  */
    // Question 4 & 5
       System.out.println("Enter kilometers");
       Scanner sc = new Scanner(System.in);
       double kms = sc.nextDouble();
       double miles = (kms / 1.609);
       System.out.println("miles = " +miles);
       if (miles == (int)miles){
        System.out.println("Miles is an integer");
       }else {
        System.out.println("Miles is not a integer");
       }
           
    }
}