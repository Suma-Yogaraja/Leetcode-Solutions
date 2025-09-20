class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums)
            freq.put(num,freq.getOrDefault(num,0)+1);
        int limit=nums.length/2;
       // System.out.println(limit);
    
        for(int key:freq.keySet()){
            if(freq.get(key)>limit)
               return key;
        }
       return -1; 
    }
}













//         //use hash map,nums as key and freq count as value
//         //iterate through map and check for highest value
//         Map<Integer,Integer> map=new HashMap<>();
//         int maxi=0;
//         int result=0;
//         for(int i:nums){
//             map.put(i,map.getOrDefault(i,0)+1);
//         }
//         for(int key:map.keySet()){
//             if(map.get(key)>maxi){
//                 maxi=map.get(key);
//                 result=key;
//             }
//         }
//         return result;
//     }
// }