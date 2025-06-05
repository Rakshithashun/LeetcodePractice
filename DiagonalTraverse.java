class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat==null||mat.length==0) 
            return new int[0];
        int m=mat.length;
        int n=mat[0].length;
        int[] a=new int[m*n];
        int i=0,row=0,col=0;
        boolean up=true;
        while (i<m*n) {
            a[i++] = mat[row][col];
            if (up){
                if (col==n - 1) {
                    row++;
                    up = false;
                } else if (row==0) {
                    col++;
                    up=false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row==m - 1) {
                    col++;
                    up=true;
                } 
                else if (col==0) {
                    row++;
                    up=true;
                }
                 else {
                    row++;
                    col--;
                }
            }
        }

        return a;

        
    }
}
