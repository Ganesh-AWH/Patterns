/*
          1
        2 1 2
       3 2 1 2 3
      4 3 2 1 2 3 4
 */
public class Pattern7 {
    public static void main(String[] args) {
        int rows = 5;

        for(int i=1;i<=rows;i++){
            int spaces = rows -i;
            for(int s=1;s<=spaces;s++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
