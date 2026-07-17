class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int ptr=nums.length-1;
        int[] res=new int[nums.length];
        // System.out.println(ptr);
        while(l<=r){
            if((nums[l]*nums[l])>(nums[r]*nums[r])){
                res[ptr]=nums[l]*nums[l];
                l++;
                
            }
            else{
                res[ptr]=nums[r]*nums[r];
                r--;  
            }
            ptr--;
        }
          return res; 
    }
}