/*  Print:-  *             *
             * *         * *
             * * *     * * *
             * * * * * * * * 
             * * * * * * * *
             * * *     * * *
             * *         * *
             *             *
*/
public class Pattern8{
    public static void main(String[] args){
        int n = 4;
        int i = 1;
        int j = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            int space = 2*(n-i);
            for(j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            int space = 2*(n-i);
            for(j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}            
             
            