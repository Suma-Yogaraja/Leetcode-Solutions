class Solution {
    public int videoStitching(int[][] clips, int time) {
        int i = 0;
        int n = clips.length;
        int endTime = 0;
        int minClip = 0;
        Arrays.sort(clips, (a, b) -> a[0] - b[0]);
        while (i < n && endTime < time) {
            int furthest = endTime;
            while (i < n && clips[i][0] <= endTime) {
                furthest = Math.max(furthest, clips[i][1]);
                i++;

            }
            if (furthest == endTime) return -1; // No progress made
            endTime = furthest;
            minClip++;
            if (endTime >= time)
                return minClip;

        }
        return -1;
    }
}