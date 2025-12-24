class Solution {
    public int[] sortArrayByParityII(int[] nums) {
       int odd=1;
       int even=0;
       int n=nums.length;
        while(even<n && odd<n){
            if(nums[even]%2==0){
                even=even+2;
            }
            else if(nums[odd]%2!=0){
                odd=odd+2;
            }
            else{
                //both are wrong so swap
                swap(even,odd,nums);
            }
        }  
               return nums;
    }
    private void swap(int even,int odd,int[] nums){
        int temp=nums[even];
        nums[even]=nums[odd];
        nums[odd]=temp;
        return;

    }
}