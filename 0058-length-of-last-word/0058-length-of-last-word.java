class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] index=s.split(" ");
        return index[index.length-1].length();
       
    }
}