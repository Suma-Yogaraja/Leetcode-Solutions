class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        if(words.length<=1){
             ans.add(words[0]);
            return ans;
        }
        for(char c:words[0].toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=1;i<words.length;i++){
            Map<Character,Integer> temp=new HashMap<>();
            for(char c:words[i].toCharArray())
                temp.put(c,temp.getOrDefault(c,0)+1);
             Map<Character, Integer> next = new HashMap<>();
            for(char key:map.keySet()){
                if(temp.containsKey(key) && !map.isEmpty()){
                    int value=Math.min(map.get(key),temp.get(key));
                    next.put(key,value);
                }
            }
            map=next;
        }
        for(char key:map.keySet()){
            int freq=map.get(key);
            while(freq>0){
               ans.add(String.valueOf(key));
               freq--; 
            }
           
        }
        return ans;
    }
}