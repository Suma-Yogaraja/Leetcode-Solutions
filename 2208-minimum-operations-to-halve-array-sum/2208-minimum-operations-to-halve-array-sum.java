class Solution {
    public int halveArray(int[] nums) {
        double totalSum=0.0;
        PriorityQueue<Double> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num:nums){
            totalSum+=num;
            maxHeap.offer(num+0.0);
        }
        double halfSum=totalSum/2.0;
        // System.out.println(totalSum);
        int minOpr=0;
        while(totalSum>halfSum){
            double maxNum=maxHeap.poll();
            totalSum-=(maxNum/2.0);
            maxHeap.offer(maxNum/2.0);
            minOpr++;
        }

        return minOpr;
    }
}