class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //heap problem

        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->{
        if(Math.abs(a-x)== Math.abs(b-x)){
            return b-a;
        }
        return Math.abs(b-x)-Math.abs(a-x);
        });

        for(int num:arr){
            heap.offer(num);
            if(heap.size()>k)
                heap.poll();
        }
        List<Integer> ans=new ArrayList<>();
        while(!heap.isEmpty()){
            ans.add(heap.poll());
        }
        Collections.sort(ans);
        return ans;
    }
}