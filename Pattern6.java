/*
        *
       * *
      * * *
       * *
        * 
 */

public class Pattern6 {
    public static void main(String[] args) {
        int rows = 5;

        for(int i=1;i<2*rows;i++){
            int spaces = i<=rows ? rows - i : i - rows;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            int cols = i<=rows ? i : 2*rows - i;  
            for(int j=1;j<=cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


