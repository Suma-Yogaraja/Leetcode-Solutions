class Solution {
    public int[][] merge(int[][] intervals) {
        //take interval and compare interval[0][1]>interval[1][0] if so merge with next interval 
        int n = intervals.length;
        if (n <= 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> res = new ArrayList<>();
        int[] prev = intervals[0];
        for (int i = 1; i < n; i++) {
            int[] curr = intervals[i];
            //List<Integer> ans=new ArrayList<>();
            // System.out.println(prev[0] + " :" + curr[1]);
            if (prev[1] >= curr[0]) {
                //prev[0] = Math.min(prev[0], curr[0]);
                prev[1] = Math.max(prev[1], curr[1]);

            } else {
                res.add(Arrays.asList(prev[0], prev[1]));
                prev = curr;
            }
        }
        res.add(Arrays.asList(prev[0], prev[1]));
        int[][] interval = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            List<Integer> innerList = res.get(i);
            interval[i] = new int[innerList.size()];
            for (int j = 0; j < innerList.size(); j++) {
                interval[i][j] = innerList.get(j);
            }
        }
        return interval;
    }
}