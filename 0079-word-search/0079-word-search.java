class Solution {
    boolean[][] visited;
    int m;
    int n;
    public boolean exist(char[][] board, String word) {
         m=board.length;
        n=board[0].length;
        char[] words=word.toCharArray();
        //System.out.println(m + " " +n);
        visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && board[i][j]==word.charAt(0)){
                    //start of the word 
                   if(dfs(board,i,j,words,0))
                    return true;
                }
            }
        }
        return false;
    }

        boolean dfs(char[][] board,int row,int col,char[] words,int index){
                if(index==words.length)//whole word matched
                    return true;
                if(row<0||col<0||row>=m||col>=n || visited[row][col]==true || board[row][col]!=words[index])
                    return false;
                visited[row][col]=true;
                boolean found=dfs(board,row+1,col,words,index+1)||
                              dfs(board,row-1,col,words,index+1) ||
                              dfs(board,row,col-1,words,index+1) ||
                              dfs(board,row,col+1,words,index+1);
                visited[row][col]=false;//back track,very imp point
            return found;
        }
    
}