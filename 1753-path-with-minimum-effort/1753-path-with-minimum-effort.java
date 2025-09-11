class Pair{
    int row;
    int col;
     Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}

class Solution {
    int m;
    int n;
    int[][] dirs=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int minimumEffortPath(int[][] heights) {
        //here we have to find min effort,so its like space solution in binary search ,min=0,max=max number in the grid=8(in 1st ex))
        m=heights.length;
        n=heights[0].length;
        int left=0;
        int right=0;
        for(int[] row:heights){
            for(int col:row)
                right=Math.max(right,col);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(dfs(heights,mid))
                right=mid-1;
            else
                left=mid+1;
        }
        //System.out.println(right);
        return left;
    }
    private boolean dfs(int[][] heights,int effort){
        boolean[][] seen=new boolean[m][n];
        Stack<Pair> stack=new Stack<>();
        seen[0][0]=true;
        stack.push(new Pair(0,0));
        while(!stack.isEmpty()){
            Pair pair=stack.pop();
            int row=pair.row, col=pair.col;
            if(row==m-1 && col==n-1)
                return true;
            for(int[] direction:dirs){
                int nextRow=row+direction[0];
                int nextCol=col+direction[1];
                if(isValid(nextRow,nextCol) && !seen[nextRow][nextCol]){
                    if(Math.abs(heights[nextRow][nextCol]-heights[row][col])<=effort){
                        seen[nextRow][nextCol]=true;
                        stack.push(new Pair(nextRow,nextCol));
                    }
                }
            }
        }
         return false;
    }
    private boolean isValid(int row,int col){
        return row>=0 && col>=0 && row<m && col<n;
    }
}