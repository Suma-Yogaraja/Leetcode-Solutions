class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        paint(image, image[sr][sc], sr,sc,color);
        return image;
    }
    private void paint(int[][]image, int originColor, int sr, int sc, int color){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc] != originColor || image[sr][sc] == color) return;
        image[sr][sc] = color;

        paint(image, originColor, sr-1, sc, color);
        paint(image, originColor, sr+1, sc, color);
        paint(image, originColor, sr, sc-1, color);
        paint(image, originColor, sr, sc+1, color);
        return;
    }
}