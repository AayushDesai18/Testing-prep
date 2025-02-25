public class loop {
    public static void main(String[] args) {
        /* do{
            System.out.println(a);
            a++;
        }while(a<5); */
        /* int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            // Move to the next line
            System.out.println();
        }  */
        int sum = 0;
        int n = 3;
        for(int i=0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of even number is: ");
        System.out.println(sum);
    }
}
