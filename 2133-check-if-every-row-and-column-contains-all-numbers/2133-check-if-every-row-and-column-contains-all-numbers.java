class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        Set<Integer>[] row=new HashSet[n];
        Set<Integer>[] col=new HashSet[n];

        //initialise
        for(int i=0;i<n;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int node=matrix[i][j];
                if(row[i].contains(node))
                    return false;
                else
                    row[i].add(node);
                if(col[j].contains(node))
                    return false;
                else
                    col[j].add(node);
            }
        }
        return true;
    }
}