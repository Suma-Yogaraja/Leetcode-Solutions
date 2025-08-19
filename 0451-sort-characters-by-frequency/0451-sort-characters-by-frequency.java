class Solution {
    public String frequencySort(String s) {
            //freq of  characters using hashmap,key as character and freq as integer
            Map<Character,Integer> freq=new HashMap<>();
            for(char c:s.toCharArray()){
                freq.put(c,freq.getOrDefault(c,0)+1);
            }
            //create maxheap using freq ,in this way we will get character in decresing order if we remove 
            PriorityQueue<Map.Entry<Character,Integer>> maxHeap=new PriorityQueue<>(
                (a,b)-> Integer.compare(b.getValue(),a.getValue())
            );

            StringBuilder sb=new StringBuilder();
            for(Map.Entry<Character,Integer> entry:freq.entrySet()){
                maxHeap.offer(entry);
            }

            while(!maxHeap.isEmpty()){
                char ch=maxHeap.poll().getKey();
               for(int i=0;i<freq.get(ch);i++){
                    sb.append(ch);
               }

                
            }

            return new String(sb);
    }
}















//         //first find frequency
//         Map<Character,Integer> map=new HashMap<>();
//         for(char c:s.toCharArray())
//             map.put(c,map.getOrDefault(c,0)+1);

//         //create alist of elemnts and sort it acording to frequency
//         List<Character> chars = new ArrayList<>(map.keySet());
//             chars.sort((a,b)->map.get(b)-map.get(a));

//         //append the character with frequency
//         StringBuilder res=new StringBuilder();
//         for(char ch:chars){
//             int fre=map.get(ch);
//             for(int i=0;i<fre;i++)
//                 res.append(ch);
//         }

//         return new String(res);
//     }
// }