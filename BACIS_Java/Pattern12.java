/* print:-  
1 2 3 4 5 6 7 8 
 2 3 4 5 6 7 8 
  3 4 5 6 7 8 
   4 5 6 7 8 
    5 6 7 8 
     6 7 8 
      7 8 
       8 
       8 
      7 8 
     6 7 8 
    5 6 7 8 
   4 5 6 7 8 
  3 4 5 6 7 8 
 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8
*/
public class Pattern12{
    public static void main(String[] args){
        int n = 8;
        int i = 1;
        int j = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
    }
}