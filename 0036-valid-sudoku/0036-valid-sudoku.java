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

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char character=board[i][j];
                if(character=='.')
                    continue;
                if(row[i].contains(character))
                    return false;
                else
                    row[i].add(character);
                if(col[j].contains(character))
                    return false;
                else
                    col[j].add(character);
                int boxIndex=(i/3)*3+(j/3);
                if(box[boxIndex].contains(character))
                    return false;
                else
                    box[boxIndex].add(character);
                
            }
        }
        return true;
    }
}