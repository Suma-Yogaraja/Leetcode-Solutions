class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        //use hashmap, to find freq of a string in string array
        //keep key as string and value as its fre
        Map<String,Integer> freq=new HashMap<>();
        for(String word:words){
            freq.put(word,freq.getOrDefault(word,0)+1);
        }
        //create minheap from the freq and maintain size of heap less than k
        PriorityQueue<Map.Entry<String,Integer>> minHeap=new PriorityQueue<>(
            (a,b)->{if(!a.getValue().equals(b.getValue())){
                return Integer.compare(a.getValue(),b.getValue());
            }
            else{
                return b.getKey().compareTo(a.getKey());
            }
        });
        
        for(Map.Entry<String,Integer> entry:freq.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k)
                minHeap.poll();
        }
        //now heap contains top k fre string,add it to an ans and return ans
        List<String> ans=new ArrayList<>();
        
        while(!minHeap.isEmpty()){
            ans.add(minHeap.poll().getKey());
        }
         Collections.reverse(ans);
         return ans;
    }
}