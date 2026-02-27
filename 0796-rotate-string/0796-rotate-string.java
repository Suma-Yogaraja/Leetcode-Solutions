class Solution {
    public boolean rotateString(String s, String goal) {
        //striver
        //concatienate itself and check if goal exists
        if(s.length()!=goal.length())
            return false;
        String concat=s+s;
        return concat.contains(goal);

    }
}