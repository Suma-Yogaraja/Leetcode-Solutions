class Solution {
    public int thirdMax(int[] nums) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //Set<Integer> set=new HashSet<>();
        for(int n:nums){
            if(!pq.contains(n)){
                pq.add(n);
            }
            if(pq.size()>3)
                pq.poll();
        }

        //when there is lesser than 3 elements
        if(pq.size()<3){
            while(pq.size()>1)
                pq.poll();
        }
        return pq.peek();

    }
}