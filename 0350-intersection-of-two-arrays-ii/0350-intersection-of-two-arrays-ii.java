class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        int count=0;
        List<Integer> res=new ArrayList<>();
        for(int num:nums1)
            map1.put(num,map1.getOrDefault(num,0)+1);
        for(int n:nums2)
            map2.put(n,map2.getOrDefault(n,0)+1);
        for(int key:map1.keySet()){
            if(map2.containsKey(key)){
                 count=Math.min(map1.get(key),map2.get(key));
                 while(count>0){
                    //System.out.println(key);
                    res.add(key);
                    count--;
                 }
            }      
        }
        int[] ans=new int[res.size()];
       for(int i=0;i<ans.length;i++){
            ans[i]=res.get(i);
        }

        return ans;
    }
}