class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        if (s.length() != (t.length()))
            return 0;
        int start = 0;
        int end = 0;
        int n = s.length();
        int[] diff = new int[n];
        int currCost = 0;
        int maxLength = 0;
        for (int i = 0; i < n; i++)
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        while (end < n) {
            currCost += diff[end];
            while (currCost > maxCost) {
                currCost -= diff[start];
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        return maxLength;
    }
}