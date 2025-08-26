class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //first create frq[] array for each word and check for that key
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
          char[] c=s.toCharArray();
          Arrays.sort(c);
          String key=new String(c);
           // String key=sb.toString();
            List<String> group=map.getOrDefault(key,new ArrayList<>());//if key not found
            group.add(s);
            map.put(key,group);
        }
        return new ArrayList<>(map.values());
    }
}

















//         Map<String,List<String>> map=new HashMap<>();
//         for(String s:strs){
//             StringBuilder sb=new StringBuilder();
//             int[] pattern=new int[26];
//             for(char c: s.toCharArray()){
//                 pattern[c-'a']++;
//             }
//             for(int i:pattern){
//             sb.append(i);
//             sb.append('#');
//             }
//             String key=sb.toString();
//             List<String> group=map.getOrDefault(key,new ArrayList<>());
//             group.add(s);
//             map.put(key,group);
           
//         }
    

//     return new ArrayList<>(map.values());
//     }
// }