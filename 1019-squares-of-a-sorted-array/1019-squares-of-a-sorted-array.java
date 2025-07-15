class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] res=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        int resPointer=nums.length-1;
        while(start<=end){
            
            if((nums[start]*nums[start])>nums[end]*nums[end]){
                
                res[resPointer]=nums[start]*nums[start];
                start++;
                resPointer--;
            }
            else{
                
                res[resPointer]= nums[end]*nums[end];
                end--;
                resPointer--;
            }
            
        }
        return res;
    }    
            
        
           
        
        
}