class Solution {
    public int trailingZeroes(int n) {
        if (n <= 1)
            return 0;
        int count = 0;
        while (n > 0) {
            n /= 5;
            count+=n;
        }
        return count;
    }
}