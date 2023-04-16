public class Binary_Search2DArray{
    public static void main(String[] args){
        int[][] arr ={
             {1,2,3},
             {4,5,6},
             {7,8,9}
        };
        int target = 9;
        int ans[] = binarySearching(arr,target);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] binarySearching(int[][]arr,int target){
        int row = 0;
        int col = arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            else if(arr[row][col] > target){
                  col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}