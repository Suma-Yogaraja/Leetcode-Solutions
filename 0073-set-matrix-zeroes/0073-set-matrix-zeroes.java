class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero=false;
        boolean firstColZero=false;
        //check first ro and col for zero and set boolean value to true if so
        for(int r=0;r<m;r++){
            if(matrix[r][0]==0){
                firstColZero=true;
                // System.out.println("first row has zero");
                break;
            }
        }

        for(int c=0;c<n;c++){
            if(matrix[0][c]==0){
                firstRowZero=true;
                // System.out.println("first col has zero");
                break;
            }
        }
        //use first ro first col as markers 
        for(int r=1;r<m;r++){
            for(int c=1;c<n;c++){
                if(matrix[r][c]==0){
                    matrix[r][0]=0;
                    matrix[0][c]=0;
                //    System.out.println("inside marker"); 
                }
            }
        }
        //make all row as zero for marked row and col
        for(int r=1;r<m;r++){
            if(matrix[r][0]==0){
                for(int c=1;c<n;c++){
                    matrix[r][c]=0;
                }
            }
        }
        for(int c=1;c<n;c++){
            if(matrix[0][c]==0){
                for(int r=1;r<m;r++){
                    matrix[r][c]=0;
                }
            }
        }
        if(firstRowZero){
            for(int c=0;c<n;c++){
                matrix[0][c]=0;
            }
        }
        if(firstColZero){
            for(int r=0;r<m;r++){
                matrix[r][0]=0;
                // System.out.println("making all ro zero");
            }
        }

    }
}