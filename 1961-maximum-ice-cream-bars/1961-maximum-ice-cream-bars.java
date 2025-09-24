class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int maxBar=0;
        int currCost=0;
        for(int cost:costs){
            currCost+=cost;
            if(currCost>coins)
                break;
            maxBar++;
        }
        return maxBar;
    }
}