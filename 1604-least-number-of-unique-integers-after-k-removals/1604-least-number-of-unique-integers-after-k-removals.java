class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> dict=new HashMap<>();
        for(int num:arr)
            dict.put(num,dict.getOrDefault(num,0)+1);//create map to store freq of each num
        //sort the values of map(sorting frequency) and keep in an array
        List<Integer> freq=new ArrayList<>();
        for(int value:dict.values())
            freq.add(value);
        Collections.sort(freq,Comparator.reverseOrder());
        while(k>0){
            int val=freq.get(freq.size()-1);
            if(val<=k){
                k-=val;
                freq.remove(freq.size()-1);
            }
            else
                break;

        }
        return freq.size();
    }
}