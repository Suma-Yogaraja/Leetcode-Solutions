class Solution {
    public int[][] updateMatrix(int[][] mat) {
       int row=mat.length;
       int col=mat[0].length;
       //System.out.println(row + "  " + col); 
       Queue<int[]> q=new LinkedList<>();
       //add all zeros to queue and mark 1 as unvisited(-1)
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                }
                else{
                 mat[i][j]=-1;
                }
            }
        }
        int[][] dirs={{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            for(int[] dir:dirs){
                int nextRow=r+dir[0];
                int nextCol=c+dir[1];
            
             if(nextRow>=0 && nextCol<col && nextRow<row && nextCol>=0 && mat[nextRow][nextCol]==-1){
                mat[nextRow][nextCol]=mat[r][c]+1;
                q.offer(new int[]{nextRow,nextCol});
             }
            }
        } 
       return mat;
    }
}