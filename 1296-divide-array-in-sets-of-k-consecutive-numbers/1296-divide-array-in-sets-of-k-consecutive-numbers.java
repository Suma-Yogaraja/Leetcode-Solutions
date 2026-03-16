class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0)
            return false;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);

        while(!map.isEmpty()){
            int start=map.firstKey();
            int count=map.get(start);
            for(int i=0;i<k;i++){
                int curr=start+i;
                if(!map.containsKey(curr) || map.get(curr)<count)
                    return false;
                if(map.get(curr)==count)
                    map.remove(curr);
                else
                    map.put(curr,map.get(curr)-count);
            }
        }
        return true;
    }
}