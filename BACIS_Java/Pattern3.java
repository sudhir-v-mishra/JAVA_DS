/* Print:- 1
           1 2
           1 2 3
           1 2 3 4 .
*/

public class Pattern3{
    public static void main(String[] args){
        int n = 4;
        int i = 1;
        int j = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}