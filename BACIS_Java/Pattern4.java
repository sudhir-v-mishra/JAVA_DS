/* Print:- * * * *
           * * *
           * * 
           *
*/

public class Pattern4{
    public static void main(String[] args){
        int n = 4;
        int i = 1;
        int j = 1;
        for(i=n;i>=1;i--){
            
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}