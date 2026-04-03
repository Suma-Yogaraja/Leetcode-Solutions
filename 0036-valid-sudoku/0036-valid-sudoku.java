class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row=new HashSet[9];
        Set<Character>[] col=new HashSet[9];
        Set<Character>[] box=new HashSet[9];

        for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();

        }
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char ch=board[r][c];
                if(ch=='.')
                    continue;
                if(row[r].contains(ch))
                    return false;
                else
                    row[r].add(ch);
                if(col[c].contains(ch))
                    return false;
                else
                    col[c].add(ch);
                int boxNumber=(r/3)*3+c/3;
                if(box[boxNumber].contains(ch))
                    return false;
                else
                    box[boxNumber].add(ch);
            }
        }
        return true;
    }
}