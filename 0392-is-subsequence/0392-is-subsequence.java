class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer=0;
        if(s.length()==0)
            return true;
        if(t.length()==0)
            return false;
        //int pPointer=0;
        for(int i=0;i<t.length()&&sPointer<s.length() ;i++){
            char ch=s.charAt(sPointer);
            if(t.charAt(i)==ch){
                   sPointer++;
            }
        }
        return sPointer==s.length();
    }
}