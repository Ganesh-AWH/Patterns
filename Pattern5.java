/*

*
* *
* * *
* *
*

*/
public class Pattern5 {
    public static void main(String[] args) {
        int rows = 5;
    
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0;i<rows-1;i++){
            for(int j=0;j<rows-i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
