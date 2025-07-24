class Solution {
    boolean[][] visited;
    public int numIslands(char[][] grid) {
        /* take global boolean visited array of same lenght as grid and keep is false by default.initialize island count to zero*/
        int isLand=0;
        int m=grid.length;
        int n=grid[0].length;
        //System.out.println(m +" : " + n);
        visited=new boolean[m][n];  
       /* 2.Loop through all elments of grid
         2.1 check if visted[row,col] is false and is land(=1) 
            2.1.1 if yes call dfs(grid,row,col) and increment islandCount
        return island count*/
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid,i,j);
                    isLand++;
                }
            }
        }
        return isLand;   
    }

    void dfs(char[][] grid,int row,int col){
        int m=grid.length;
        int n=grid[0].length;
        /*
        1.Make visited[row][col]as true*/
        visited[row][col]=true;
        /*2.check if left position is valid
            2.1 check whether left neighbour is not  visited and if land
             2.1.1 call dfs(grid,row,col-1)*/
        if(col-1>=0){
            if(!visited[row][col-1] && grid[row][col-1]=='1'){
                dfs(grid,row,col-1);
            }
        }
        
        //3. do same for right,top,bottom position
        if(col+1<n){
            if(!visited[row][col+1] && grid[row][col+1]=='1'){
                dfs(grid,row,col+1);
            }
        }
        if(row-1>=0){
            if(!visited[row-1][col] && grid[row-1][col]=='1'){
                dfs(grid,row-1,col);
            }
        }
        if(row+1<m){
            if(!visited[row+1][col] && grid[row+1][col]=='1'){
                dfs(grid,row+1,col);
            }
        }
        
    }
}