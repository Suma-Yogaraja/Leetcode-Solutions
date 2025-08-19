class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a hashmap,keep elements in key and its fre as values
        Map<Integer, Integer> fre = new HashMap<>();
        for (int i : nums)
            fre.put(i, fre.getOrDefault(i, 0) + 1);
        //store it in a heap,freq as first
        PriorityQueue<Integer> heap=new PriorityQueue<>((n1,n2)-> fre.get(n1)-fre.get(n2));
        for(int num:fre.keySet()){
            heap.add(num);
            if(heap.size()>k)
                heap.poll();
        }
        int[] ans=new int[heap.size()];
        for(int i=0;i<k;i++){
                ans[i]=heap.poll();
        }
        return ans;
       
    }
}