class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0,high=matrix.length-1,mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(matrix[mid][0]<target && matrix[mid][matrix[mid].length-1]>target){
                break;
            }
            else if(matrix[mid][0]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        } 
        int row=(low+high)/2;
        int left=0,right=matrix[row].length-1;
        while(left<=right){
            mid=(left+right)/2;
            if(matrix[row][mid]>target){
                right=mid-1;
            }
            else if(matrix[row][mid]==target){
                return true;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}
