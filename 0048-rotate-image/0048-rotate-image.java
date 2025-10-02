class Solution {
    public void rotate(int[][] matrix) {
        List<List<Integer>> list=new ArrayList<>();
        for(int j=0;j<matrix[0].length;j++)
            list.add(new ArrayList<>());
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                list.get(j).add(matrix[i][j]);
                // System.out.println(j+ " " +matrix[i][j]);
            }
        }
        for(int i=0;i<list.size();i++){
            Collections.reverse(list.get(i));
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=list.get(i).get(j);
            }
        }
        
    }
}