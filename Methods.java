public class Methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z = x*y;
        }
        else{
            z = (x+y)*10;
        }
        return z;
    }
    public static void main(String[] args) {
        int a =5;
        int b =7;
        int c;
        c = logic(a, b);
        int a1 = 2;
        int b2 = 1;
        int c1;
        c1 = logic(a1, b2);
        System.out.println(c);
        System.out.println(c1);
    }
}
