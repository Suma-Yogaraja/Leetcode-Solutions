class Solution {
    public int maxArea(int[] height) {
        //the problem is similar to finding the rectangle that has highest area
        //for highesh area,length and breath should be max
        //here length is value of array,width is index of array
        int length=0;
        //int width=0;
        int last=height.length-1;
        int first=0;
        int maxArea=Integer.MIN_VALUE;
        while(first<=last){
        
            length=Math.min(height[first],height[last]);
            //width=last-first;
            maxArea=Math.max(maxArea,length*(last-first));
            if(first<=last && height[last]<=height[first])
                last--;
            else 
                first++;

        }

        return maxArea;
    }
}