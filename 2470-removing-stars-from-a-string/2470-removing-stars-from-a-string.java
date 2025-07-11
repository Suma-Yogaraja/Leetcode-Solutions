class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        //iterate through  each character in the string 
        for (char c : s.toCharArray()) {
            //check whether the character is *
           // System.out.println(c);
            if (c=='*') {
                if (res.length() > 0) {
                    //pop out the last character
                    //System.out.println(res.length()-1);
                    res.deleteCharAt(res.length()-1);
                }
            }
            //add the character to stringbuilder
            else
                res.append(c);
        }
        return res.toString();
    }
}