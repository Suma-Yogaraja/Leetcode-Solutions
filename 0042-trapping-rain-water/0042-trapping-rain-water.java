class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int totalWater=0;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        leftMax[0]=height[0];
        rightMax[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
           
        }
        for(int j=n-2;j>=0;j--){
            rightMax[j]=Math.max(height[j],rightMax[j+1]);
        }
        for(int i=0;i<n;i++){
            totalWater+=Math.max(0,(Math.min(leftMax[i],rightMax[i])-height[i]));
        }
        return totalWater;
    }
}