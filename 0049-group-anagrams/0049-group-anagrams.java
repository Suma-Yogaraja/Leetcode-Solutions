class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>  res=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            StringBuilder sb=new StringBuilder();
            int[] pattern=new int[26];
            for(char c: s.toCharArray()){
                pattern[c-'a']++;
            }
            for(int i:pattern){
            sb.append(i);
            sb.append('#');
            }
            String key=sb.toString();
            List<String> group=map.getOrDefault(key,new ArrayList<>());
            group.add(s);
            map.put(key,group);
           
        }
    

    return new ArrayList<>(map.values());
    }
}