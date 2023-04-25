public class Search2DArray{
    public static void main(String[] args){
        int[][] arr = {
            {12,15,18},
            {19,10,50},
            {70,100,110}
        };
        int target = 100;
        int[] ans = search2Darray(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] search2Darray(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}