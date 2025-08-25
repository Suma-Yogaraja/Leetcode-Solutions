class Solution {
    public int compress(char[] chars) {
        //check curr char with next char,if not equal then there is 
        
        int i=0;
         int index=0;
       while(i<chars.length){
           int count=0;
          char ch=chars[i];
          while(i<chars.length && ch==chars[i]){
            i++;
            count++;
          }
            chars[index++]=ch;
            if(count>1){
                for(char c:String.valueOf(count).toCharArray())
                    chars[index++]=c;
            }
        }
        return index;
    }
}