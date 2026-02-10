class Solution {
    public void moveZeroes(int[] nums) {

        //use two pointer
        int j = -1;
        //find first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;

            }
        }
        if(j==-1)//no zeros in the array
            return;
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                //swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }

    }
}