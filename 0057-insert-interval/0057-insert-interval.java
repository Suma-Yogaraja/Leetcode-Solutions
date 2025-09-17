class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        if (n < 1)
            return new int[][]{{newInterval[0],newInterval[1]}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> res = new ArrayList<>();

        for (int[] interval : intervals) {

            if (interval[1] < newInterval[0]) {
                //System.out.println(" im here in  if ");
                res.add(Arrays.asList(interval[0], interval[1]));
            } else if (interval[0] > newInterval[1]) {
                //System.out.println(" im here in else if ");
                res.add(Arrays.asList(newInterval[0], newInterval[1]));
                newInterval = interval;
            } else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
               // System.out.println("new interval update" + newInterval[0] + " : " + newInterval[1]);

            }
        }
        res.add(Arrays.asList(newInterval[0], newInterval[1]));
        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            List<Integer> innerinterval = res.get(i);
            ans[i] = new int[innerinterval.size()];
            for (int j = 0; j < innerinterval.size(); j++) {
                ans[i][j] = innerinterval.get(j);
            }
        }
        return ans;
    }
}