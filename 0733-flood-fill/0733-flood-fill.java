class Solution {
    int[][] grid;
    int[][] dir;
    int m,n;
    boolean[][] seen;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //dfs
        if(image[sr][sc]==color)
            return image;
             m=image.length;
         n=image[0].length;
       seen=new boolean[m][n];
        
        Queue<int[]> q=new LinkedList<>();
        dir=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        q.add(new int[]{sr,sc});
        int prevColor=image[sr][sc];
        image[sr][sc] = color;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cell=q.poll();
                int row=cell[0];
                int col=cell[1];
                for(int[] direct:dir){
                    int nextR= row +direct[0];
                    int nextC=col+direct[1];
                    if(isValid(nextR,nextC) && !seen[nextR][nextC] && image[nextR][nextC]==prevColor){
                                seen[nextR][nextC]=true;
                                image[nextR][nextC] = color;
                        q.offer(new int[] { nextR, nextC });
                        }
                }
            }
        }
        return image;
    }
    private boolean isValid(int nextR,int nextC){
        return nextR >= 0 && nextC >= 0 && nextR < m && nextC < n;
    }

}