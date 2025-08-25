class Solution {
    public String longestPalindrome(String s) {

        //edge case if string is null or 1
        if(s.length()<=1)
            return s;
        //map creation ,use character as key,its index as values
        Map<Character,List<Integer>> map=new HashMap<>();
        int resStart=0;
        int maxLength=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            List<Integer> index=map.get(ch);
            if(index==null)
                index=new ArrayList<>();
            index.add(i);
            map.put(ch,index);
        }
        //now for each chaindex of a character,check for palindrom
        for(char key:map.keySet()){
            List<Integer> values=map.get(key);
          for(int i=0;i<values.size();i++){
            for(int j=i+1;j<values.size();j++){
                int start=values.get(i);
                int end=values.get(j);
                if(isPalindrome(start,end,s) && (end-start+1)>maxLength){
                    maxLength=end-start+1;
                    resStart=start;
                }
            }
          }
        }
        return s.substring(resStart,resStart+maxLength);
    }
    private boolean isPalindrome(int start,int end,String s){
        if(start-end==0 || s.length()<=1)
            return true;
        while(start<=end){
            if(s.charAt(start)!=(s.charAt(end)))
                return false;
            start++;
            end--;
        }
        return true;
    }
}















//         //create hashmap key as character and value as indices of the character 
//         Map<Character, List<Integer>> map = new HashMap<>();
//         if(s==null || s.length()==0)
//             return "";
//             int maxLength=1;//if s="a" then we have to return a 
//             int maxJ=0;
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             List<Integer> indices = map.get(c); //get list
//             if (indices == null)
//                 indices = new ArrayList<>();
//             indices.add(i);
//             map.put(c, indices);
//         }
//         for (char key : map.keySet()) {
//             List<Integer> value=map.get(key);
//             for(int j=0;j<value.size();j++){
//                 for(int k=j+1;k<value.size();k++){
//                     int start=value.get(j);
//                     int end=value.get(k);
//                     if(isPlaindrome(start,end,s) && (end-start+1)>maxLength){
//                         maxLength=end-start+1;
//                         maxJ=start;
//                     }              
//                  }
//             }
    
//         }
//         return s.substring(maxJ,maxJ+maxLength);
//     }
//     boolean isPlaindrome(int start,int end,String s){
//         while(start<=end){
//             if(s.charAt(end)!=s.charAt(start))
//                 return false;
//             end--;
//             start++;
//         }
//         return true;
//     }
// }