/* Print:-         E
                  D E
                 C D E
                B C D E
               A B C D E
*/
public class Pattern16{
    public static void main(String[] args){
        int n = 5;
        char ch = 'E';
        for(int i=1,k='E';i<=n;i++,k--){
            int p = k;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)p+" ");
                p++;
            }
            System.out.println();
        }
    }
}