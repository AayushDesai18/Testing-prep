import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
      System.out.println("Enter your age");
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      switch (age) {
        case 18:
            System.out.println("You are in adult category");
            break;
        case 25:
        System.out.println("You are ready for marriage");
            break;
            default:
            System.out.println("Enjoy your life");
      }
    }
}
