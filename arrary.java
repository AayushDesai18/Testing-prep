public class arrary {
    public static void main(String[] args) {
      /*   int [] marks = {10, 20, 30, 40, 50};
        // System.out.println(marks[3]);
        // System.out.println(marks.length);
       /*  for(int i=0; i<marks.length; i++){
              System.out.println(marks[i]);
        } */
       /*  for (int element: marks){
           System.out.println(element);
        } */ 
      /*  char [][][] Div = new char[3][3][3];
       Div[0][0][0] = 'A';
       Div[0][1][1] = 'B';
       Div[0][2][2] = 'C';
       Div[1][0][0] = 'D';
       Div[1][1][1] = 'E';
       Div[1][2][2] = 'F';
       Div[2][0][0] = 'G';
       Div[2][1][1] = 'H';
       Div[2][2][2] = 'I';
       for(char i=0;i<Div.length;i++){
            for(char j=0;j<Div[i].length;j++){
                for(char k=0;k<Div[j].length;k++){
                    System.out.print(Div[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println("");
                }
            
            } */
           int [] arr = {1, 2, 3, 4, 5};
           int l = arr.length;
           int n = Math.floorDiv(l, l);
           int temp;
           for(int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
           }
           for(int element: arr){
            System.out.print(element+ " ");
           }
       } 
       
    }

