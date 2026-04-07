class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow=false;
        boolean firstCol=false;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstRow=true;
                break;
            }
        }
         for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                firstCol=true;
                break;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    //make first row and first col as zero
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                    System.out.println("make row" + i + "as zero" );
                     System.out.println("make col" + j + "as zero" );
                }
            }
        }
        //row
        for(int i=1;i<m;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<n;j++){
                    matrix[i][j]=0;
                    
                }
            }
        }
        //col
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                for(int i=0;i<m;i++){
                    matrix[i][j]=0;
                    
                }
            }
        }
        if(firstRow){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        if(firstCol){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
    }
}