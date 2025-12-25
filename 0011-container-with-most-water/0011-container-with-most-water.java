class Solution {
    public int maxArea(int[] height) {
        //find rectangle area,find heighest from left and right
        //use two pointer
        int left=0;
        int area=0;
        int maxArea=Integer.MIN_VALUE;
        int right=height.length-1;
        while(left<=right){
            area=(right-left)* Math.min(height[left],height[right]); //length*breadth 
            maxArea=Math.max(area,maxArea);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}