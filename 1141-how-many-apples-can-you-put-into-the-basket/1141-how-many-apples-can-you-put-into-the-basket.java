class Solution {
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int apple=0;
        int totalWeight=0;
        int limit=5000;
        for(int w:weight){
            totalWeight+=w;
            if(totalWeight>limit)
                return apple;
            apple++;
        }
        return apple;
    }
}