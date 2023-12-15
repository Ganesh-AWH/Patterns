/*

*
* *
* * *
* * 
* 

*/
public class Pattern5 {
    public static void main(String[] args) {
        int rows = 3;
    
        for(int i=1;i<rows*2;i++){
            int col = i <= rows ? i : 2*rows - i; 
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
