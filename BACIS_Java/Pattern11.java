/*  Print:-     1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5 
*/
public class Pattern11{
    public static void main(String[] args){
        int n = 5;
        int i =1;
        int j = 1;
        for(i=1;i<=n;i++){
            int number = i;
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print(number +" ");
                number--;
            }
            for(j=2;j<=i;j++){
            System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}