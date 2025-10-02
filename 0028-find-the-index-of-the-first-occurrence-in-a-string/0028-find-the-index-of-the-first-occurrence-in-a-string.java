class Solution {
    public int strStr(String haystack, String needle) {
        //two pointers
        int ptr1=0;
        int ptr2=0;
        if(needle.length()>haystack.length())
            return -1;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            String subString=haystack.substring(i,i+needle.length());
            // System.out.prntln()
            if(subString.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}