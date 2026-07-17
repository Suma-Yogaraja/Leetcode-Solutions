class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()>t.length() )
            return false;
        else if (s.length()==0)
            return true;
        int len=s.length()-1;
        int j=0;
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(s.charAt(j)==c){
                if(j==len)
                    return true;
                j++;
            }
        }
        return false;
    }
}