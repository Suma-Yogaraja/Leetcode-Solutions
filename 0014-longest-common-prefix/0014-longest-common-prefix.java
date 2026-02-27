class Solution {
    public String longestCommonPrefix(String[] strs) {
        //sort and comoare first and last string
        if(strs.length<=0)
            return null;
        if(strs.length==1)
            return strs[0];
        Arrays.sort(strs);
        String end=strs[strs.length-1];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<Math.min(strs[0].length(),end.length());i++){
            if(strs[0].charAt(i)!=end.charAt(i))
                break;
            else
                ans.append(strs[0].charAt(i));
        }
        if(ans.length()==0)
            return "";
        return ans.toString();
    }
}