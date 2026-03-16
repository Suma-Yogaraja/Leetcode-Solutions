class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        Map<Character,Integer> map=new HashMap<>();
        for(char c:tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int time=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int value:map.values())
            pq.offer(value);
        while(!pq.isEmpty()){
            List<Integer> countList=new ArrayList<>();
            int i=0;//number of elemnts in the current cycle
            int cycle=n+1;
            while(i<cycle && !pq.isEmpty()){
                int element=pq.poll();
                element--;
                if(element>0)
                    countList.add(element);
                i++;
                time++;
            }
            for(int rem:countList)
                pq.offer(rem);
            if(!pq.isEmpty())
                time+=cycle-i;//adding idle time
            
        }
        return time;
    }
}