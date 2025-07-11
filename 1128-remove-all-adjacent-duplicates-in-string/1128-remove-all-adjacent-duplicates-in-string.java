class Solution {
    public String removeDuplicates(String s) {

        //create a string builder to store result string 
        StringBuilder stack=new StringBuilder();
        //iterate over each character
        for(char c: s.toCharArray()){
    //for each character,if res string not empty and last charcter is equal to c,delet the character
            if(stack.length()>0 && stack.charAt(stack.length()-1)==c)
                stack.deleteCharAt(stack.length()-1);
            else
                stack.append(c);

        }
        return stack.toString();
        
    }
}