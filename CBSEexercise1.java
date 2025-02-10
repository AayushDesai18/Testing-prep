import java.util.Scanner;

public class CBSEexercise1 {
    public static void main(String[] args) {
     System.out.println("Taking Input From The Users");
     Scanner sc = new Scanner(System.in);
     int sum = 0;
     for (int i=0;i<5;i++){
        System.out.println("Enter Subject Name");
        String subject = sc.next();
        System.out.println("Enter Marks For "+subject);
        int a = sc.nextInt();
        sum = sum + a;
     }
     System.out.println("Total Marks = " + sum);
    int per = (sum*100)/500;
    System.out.println("Total percentage =" + per +"%");
    if (per >=33 & per <= 100) {
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }

    
    }
}
