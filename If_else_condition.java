import java.util.Scanner;

public class If_else_condition {
    public static void main(String[] args) {
     /*    int age = 18;
        if (age>18) {
            System.out.println("You can drive");
        } else{
            System.out.println("You can't drive.");
        } */
       /* boolean a = true;
       boolean b = false;
       boolean c = true;
       if (a && b && c) {
        System.out.println("Y");
       } else{
        System.out.println("N"); */
       /* boolean a = true;
       boolean b = false;
       boolean c = true;
       if (a || b || c) {
        System.out.println("Y");
       } else{
        System.out.println("N");
       }
       */
      
      System.out.println("Enter your age");
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      if (age>46) {
        System.out.println("You are experienced");
      } else if (age>30) {
        System.out.println("You are semi-experienced");
      } else {
        System.out.println("You are not experienced");
      }
    }
}
