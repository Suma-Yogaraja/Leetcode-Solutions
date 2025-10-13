class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        long arrowPos=points[0][1];
        int arrow=1;
        for(int i=1;i<points.length;i++){
            int[] currPos=points[i];
            if(arrowPos>=currPos[0]){
                continue;
            }
            // System.out.println(arrowPos);
            arrowPos=currPos[1];
            arrow++; 
        }
        return arrow;
    }
}