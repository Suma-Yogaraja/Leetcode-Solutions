class Solution {
    public boolean backspaceCompare(String s, String t) {
        return (resultString(s).equals(resultString(t)));
  
    }
//function that create string when typed into empty text editors
    String resultString(String s){
        //intialize a builder whick acts as stack  to store the character
        StringBuilder str=new StringBuilder();
        //check if charcater is backspace
        for(char c:s.toCharArray()){
            //check if the charcter is equal to backspace
            if(c=='#' && str.length()>0){
                //if backspace ,delete the last charcater of string str
                str.deleteCharAt(str.length()-1);
            }
            else
                if(c!='#')
                 str.append(c);
            
        }
        return str.toString();

    }
}