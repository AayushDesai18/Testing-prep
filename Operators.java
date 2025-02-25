import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
       /*  int y =7;
        int x = y++ * 8;
        System.out.println(x);
        System.out.println(y); */

        // encrypting the grade.
       /*  char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // decrypting the grade.
        grade = (char) (grade - 8);
        System.out.println(grade); */

        int a = 10;
        System.out.println(a);
        System.out.println("Enter value for b");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (a>b) {
            System.out.println(b);
        } else {
            System.out.println("a is not greater than b");
        }
    }
}
