class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==1 && gas[0]==cost[0])
            return 0;
        int[] pathValue = new int[gas.length];
        for (int i = 0; i < gas.length; i++) {
            pathValue[i] = gas[i] - cost[i];
            //System.out.println(pathValue[i]);
        }
        // List<Integer> possibleAnswer = new ArrayList<>();
        // int max = 0;
        // for (int i = 0; i < pathValue.length; i++) {
        //     if (pathValue[max] < pathValue[i])
        //         max = i;
        // }
        // possibleAnswer.add(max);

        // for (int i = 0; i < pathValue.length; i++) {
        //     if (pathValue[max] == pathValue[i] && i != max) {
        //         possibleAnswer.add(i);
        //         //System.out.println(i);
        //     }
        // }
        for (int index=0;index<pathValue.length;index++) {
            if(pathValue[index]>0){
            if (isFeasible(index, pathValue))
                return index;
            }
        }
        return -1;
    }

    private boolean isFeasible(int startIndex, int[] pathValue) {
        int count = 0;
        int cost = 0;
        while (count < pathValue.length) {
            count++;
            if (cost + pathValue[startIndex] >= 0) {
                cost += pathValue[startIndex];
                startIndex = (startIndex + 1) % pathValue.length;
            } else {
                return false;
            }
        }
        return true;
    }
}