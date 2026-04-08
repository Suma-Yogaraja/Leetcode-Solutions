class Solution {
    public int maxArea(int[] height) {
       //maximise area of rectangle
       int start=0;
       int end=height.length-1;
       int maxArea=0;

       while(start<end){
            int area=(Math.min(height[start],height[end]))*(end-start);
            // System.out.println(area);
            maxArea=Math.max(maxArea,area);
            if(height[start]>height[end])
                end--;
            else
                start++;

       }
     return maxArea;
    }
}