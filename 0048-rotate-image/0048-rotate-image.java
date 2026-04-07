class Solution {
    public void rotate(int[][] matrix) {
        //90 degree=transpose + reverse row
        int n=matrix.length;
        //transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               
                int temp=matrix[i][j];
                int x=matrix[j][i];
                matrix[i][j]=x;
                matrix[j][i]=temp;
            }
        }
        //reverse row
        for(int i=0;i<n;i++){
            //reverse
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;

            }
        }

    }
}