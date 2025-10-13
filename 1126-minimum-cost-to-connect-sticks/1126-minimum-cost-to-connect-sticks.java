class Solution {
    public int connectSticks(int[] sticks) {
        // List<Integer> ans=new ArrayList<>();
        int res=0;
        if(sticks.length<=1)
            return 0;
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();//min heap
        for(int stick:sticks)
            pq.add(stick);
        while(pq.size()>1){
            int stick1=pq.poll();
            int stick2=pq.poll();
           pq.add(stick1+stick2);
           res+=stick1+stick2;  
        }
        // int res=0;
        // while(!ans.isEmpty())
        //     res+=ans.remove(ans.size()-1);
        return res;
    }
}





























//         PriorityQueue<Integer> heap = new PriorityQueue<>();
//         if (sticks == null || sticks.length <= 1) {
//             return 0;
//         }

//         for (int stick : sticks)
//             heap.add(stick);
//         int total = 0;
//         while (heap.size() > 1) {
//             int first = heap.poll();
//             int second = heap.poll();
//             total += first + second;
//             heap.offer(first + second);
//         }
//         return total;
//     }
// }