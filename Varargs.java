public class Varargs {
    static int sum(int...arr){
        int result=0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorial");
        System.out.println("The sum of a and b is: " + sum(4,5));
        System.out.println("The sum of a, b and c is: " + sum(4,5,6));
        System.out.println("The sum of a, b, c and d is: " + sum(4,5,6,7));
      }
}
