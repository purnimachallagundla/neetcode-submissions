class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i<=n-1;i++){
            for( int j =0;j<=m-1;j++){
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
