class Solution {
    public int majorityElement(int[] nums) {
        //use hash map,nums as key and freq count as value
        //iterate through map and check for highest value
        Map<Integer,Integer> map=new HashMap<>();
        int maxi=0;
        int result=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>maxi){
                maxi=map.get(key);
                result=key;
            }
        }
        return result;
    }
}