class Solution {
    int m;
    int n;
    public int[][] onesMinusZeros(int[][] grid) {
         m=grid.length;
         n=grid[0].length;
        int[][] diff=new int[m][n];
        int[] oneRow=new int[m];
        int[] oneCol=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                oneRow[i]+=grid[i][j];
                oneCol[j]+=grid[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                diff[i][j]=oneRow[i]+oneCol[j]-(m-oneRow[i])-(n-oneCol[j]);
            }
        }
        return diff;
    }
}

   