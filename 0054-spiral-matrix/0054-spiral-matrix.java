class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        if (matrix == null)
            return ans;
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = m - 1;
        int colEnd = n - 1;
        // System.out.println(colEnd);
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            //traverse right
            for (int j = colBegin; j <= colEnd; j++)
                ans.add(matrix[rowBegin][j]);
            rowBegin++;
            //traverse bottom
            for (int j = rowBegin; j <= rowEnd; j++)
                ans.add(matrix[j][colEnd]);
            colEnd--;
            //traverse left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--)
                    ans.add(matrix[rowEnd][j]);
                rowEnd--;
            }
            //traverse up
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--)
                    ans.add(matrix[j][colBegin]);
                colBegin++;
            }

        }

        return ans;
    }
}