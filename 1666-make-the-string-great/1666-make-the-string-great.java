class Solution {
    public String makeGood(String s) {
        //create a string builser as stack to store the good adjacent character 
        StringBuilder res=new StringBuilder();

        for(char c:s.toCharArray()){
            //check if charcater and its last char  f res ascii diff is 32,if yes,delet that character
            if(res.length()>0 && Math.abs(c-res.charAt(res.length()-1))==32)
                res.deleteCharAt(res.length()-1);
            //if not append that character
            else
             res.append(c);

        }

        return res.toString();

    }
}