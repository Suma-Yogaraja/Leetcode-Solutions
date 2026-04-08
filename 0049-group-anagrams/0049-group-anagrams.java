class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        //map<word,index>
        Map<String,List<Integer>> dict=new HashMap<>();
       
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            // System.out.println(key);
            dict.putIfAbsent(key, new ArrayList<>()); 
            dict.get(key).add(i);
        }
        for(String key:dict.keySet()){
            List<String> innerList=new ArrayList<>();
            for(int value:dict.get(key)){
                innerList.add(strs[value]);
            }
            ans.add(innerList);
        }
        return ans;
    }
}