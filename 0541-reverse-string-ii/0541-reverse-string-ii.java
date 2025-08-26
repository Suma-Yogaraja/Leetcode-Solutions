class Solution {
    public String reverseStr(String s, int k) {
        char[] chars=s.toCharArray();
        int n=s.length();
        int i=0;
        while(i<n){
            int j=Math.min(i+k-1,n-1);
            reverse(chars,i,j);
            i+=2*k;
        }
        return new String(chars);
    }
    private void reverse(char[] chars,int start,int end){
        while(start<end){
            char c=chars[start];
            chars[start]=chars[end];
            chars[end]=c;
            start++;
            end--;
        }
    }
}