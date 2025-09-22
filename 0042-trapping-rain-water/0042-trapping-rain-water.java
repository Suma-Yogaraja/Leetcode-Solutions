class Solution {
    public int trap(int[] height) {
        //find left max and right max for each index 
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];
        leftMax[0]=height[0];
        rightMax[height.length-1]=height[height.length-1];
        //System.out.println(leftMax[0] + "  " + rightMax[height.length-1]);
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
            
        }
        for(int j=height.length-2;j>=0;j--){
            rightMax[j]=Math.max(rightMax[j+1],height[j]);
            //System.out.print(rightMax[j]);
        }
        int totalWater=0;
        for(int i=0;i<height.length;i++){
            totalWater+=Math.max(0,(Math.min(leftMax[i],rightMax[i])-height[i]));
        }
        return totalWater;
        
    }
}