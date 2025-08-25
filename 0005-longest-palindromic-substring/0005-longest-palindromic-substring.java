class Solution {
    public String longestPalindrome(String s) {
        //using expand around center approach
        if(s.length()<=1)//edge case
            return s;
        //s=s.toLowerCase();
        int len=0;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            //lets say we have got odd numbered palindrom
            int len1=expandAoundCenter(s,i,i);
            int len2=expandAoundCenter(s,i,i+1);//even numbered palindrome has 2 centers
           // System.out.println(len1 + " :" + len2);
            len=Math.max(len1,len2);//get the max palindrome 
            if(len>end-start){
                //we got new palindrome of higher length at center i
                start= i-(len-1)/2;
                end=i+len/2 ;  
            }
        }
             
        return s.substring(start,end+1);
    }
    private int expandAoundCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;//cause at last iteration the charcaters not equal and come out of while loop so actual length is from left+1 to right-1
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