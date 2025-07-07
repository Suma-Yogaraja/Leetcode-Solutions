class Solution {
    public boolean wordPattern(String pattern, String s) {
        //s1=split the s string and get the words 
        String[] str=s.split(" ");
        Map<Character,String> map=new HashMap<>();
        Map<String,Character> strToChar=new HashMap<>();
        if(pattern.length()!=str.length)
            return false;
        //for each character in pattern string,
        for(int i=0;i<pattern.length();i++){
            //check if character appeared before in map
            char ch=pattern.charAt(i);
            // check if char is not in Map, and string is not mapped to any character
            if(!map.containsKey(ch) && !strToChar.containsKey(str[i])){
                map.put(ch,str[i]);
                strToChar.put(str[i],ch);
            }
            else{ 
                // check if str is mapped to some other character && that character is not the current character
                // This checks for condition where 'b' trying to map to 'dog', but 'a' already is mapped to 'dog'
                if(strToChar.containsKey(str[i]) && strToChar.get(str[i])!=ch)
                    return false;
                // this checks if 'b' itself is mapped to any other string    
                if(!map.get(ch).equals(str[i]))
                    return false;
            }
        }
         return true;

        
    }
}