class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //first thing first ,create freq dict to get freq
        Map<Integer,Integer> dict=new HashMap<>();
        for(int num:nums){
            dict.put(num,dict.getOrDefault(num,0)+1);
        }
        //min heap to store(elemnt,freq)
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)-> (a[1]-b[1])
        );
        int[] ans=new int[k];
        for(int key:dict.keySet()){
            pq.add(new int[]{key,dict.get(key)});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll()[0];
        }
        return ans;
    }
}