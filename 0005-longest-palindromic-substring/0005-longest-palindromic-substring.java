class Solution {
    public String longestPalindrome(String s) {
        //create hashmap key as character and value as indices of the character 
        Map<Character, List<Integer>> map = new HashMap<>();
        if(s==null || s.length()==0)
            return "";
            int maxLength=1;//if s="a" then we have to return a 
            int maxJ=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            List<Integer> indices = map.get(c); //get list
            if (indices == null)
                indices = new ArrayList<>();
            indices.add(i);
            map.put(c, indices);
        }
        for (char key : map.keySet()) {
            List<Integer> value=map.get(key);
            for(int j=0;j<value.size();j++){
                for(int k=j+1;k<value.size();k++){
                    int start=value.get(j);
                    int end=value.get(k);
                    if(isPlaindrome(start,end,s) && (end-start+1)>maxLength){
                        maxLength=end-start+1;
                        maxJ=start;
                    }              
                 }
            }
    
        }
        return s.substring(maxJ,maxJ+maxLength);
    }
    boolean isPlaindrome(int start,int end,String s){
        while(start<=end){
            if(s.charAt(end)!=s.charAt(start))
                return false;
            end--;
            start++;
        }
        return true;
    }
}