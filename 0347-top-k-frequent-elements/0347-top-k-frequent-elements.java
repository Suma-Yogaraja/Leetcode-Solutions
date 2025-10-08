class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans ;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->freq.get(a)-freq.get(b));
        for(int key:freq.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.remove();
            }
        }
        ans=new int[pq.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.remove();
        }
        return ans;
    }
}