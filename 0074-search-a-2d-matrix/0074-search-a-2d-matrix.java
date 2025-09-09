class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //here since the matrix is sorted,i will apply binary serach
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=m*n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/n;
            int col=mid%n;
            int num=matrix[row][col];
            if(num==target)
                return true;
            if(num>target)
                right=mid-1;
            else
             left=mid+1;

        }
        return false;
    }
}