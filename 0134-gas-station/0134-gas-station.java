class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;
        int tank = 0;
        if(gas.length==1 && gas[0]==cost[0])
            return 0;
        long[] pathValue = new long[gas.length];
        for (int i = 0; i < pathValue.length; i++) {
            pathValue[i] = (gas[i] - cost[i]);
        }
        for (int i = 0; i < pathValue.length; i++) {
            if (pathValue[i] > 0) {
                if (isFeasible(i, pathValue))
                    return i;
            }
        }
        return -1;
    }

    public boolean isFeasible(int startIndex,long[] pathValue){
        long cost=0;
        long count=0;
        while(count<pathValue.length){
            count++;
                if(cost+pathValue[startIndex]>=0){
                    cost+=pathValue[startIndex];
                    startIndex=(startIndex+1)%pathValue.length;
                }
                else
                    return false;   
        }
        return true;
    }
}