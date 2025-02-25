public class Recursion {
    // Recursion approach
   /*  static int factorial(int n){
        if (n==0 || n==1) {
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    } */

    // Iterative approach
    /* static int factorial(int n){
        if (n==0 || n==1) {
            return 1;
        }
        else{
            int product = 1;
            for(int i=1;i<=n;i++){
                product *= i;
            } 
            return product;
        }
        
    } */

    /* // practice set 1
    static int fibonacci(int n){
        if (n<=1 ) {
            return n;
        }
            return fibonacci(n-1) + fibonacci(n-2);
        
    }
    public static void main(String[] args) {
        int terms=10; 
       System.out.print("The Fibonacci series up to " + terms + " terms:"); 
       for (int i = 0; i<terms; i++){
        System.out.print(fibonacci(i) + " ");
       }
    } */

     static int sumRec(int n){
        if (n==1){
        return 1;
       }
          return n + sumRec(n-1);
    }

    public static void main(String[] args){
    int c = sumRec(4);
    System.out.println(c);
    }
}
    

