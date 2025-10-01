class Solution {
    public String makeSmallestPalindrome(String s) {
        //string is immutable so cant use s.car at(start)=s.charAt(end)
        char[] chars = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                // Replace both with the smaller character
                char smaller = (chars[start] < chars[end]) ? chars[start] : chars[end];
                chars[start] = smaller;
                chars[end] = smaller;
            }
            start++;
            end--;
        }

        return new String(chars);
    }
}