import java.util.Scanner;

public class Practice_set_2 {
    public static void main(String[] args) {
        System.out.println("Taking Input From Users");
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        float income = 0;
        for (float f=0;f<3;f++){
            System.out.println("Enter Your Income");
            float a = sc.nextFloat();
            income = income + a;
            if (a<=2.5f) {
                tax = tax + 0;
            } else if (a>2.5f && a<=5.0f) {
                tax = tax + 0.05f * (a - 2.5f);
            } else if (a>5.0f && a<=10.0f) {
                tax = tax + 0.05f * (a - 2.5f);
                tax = tax + 0.2f * (a - 5.0f);
            } else if (a>10.0f) {
                tax = tax + 0.05f * (a - 2.5f);
                tax = tax + 0.2f * (a - 5.0f);
                tax = tax + 0.3f * (a -10.0f);
            }
            System.out.println("The Total Tax Paid By The Employee is: " +tax);
        }  
        

        }
    }
