class Solution {
    public void sortColors(int[] nums) {
        //we have n value as o 1 0r 2
        int[] count=new int[3];//since number can be either 0 , 1 or 2
        if(nums.length<=1)
            return ;
        for(int num:nums){
            count[num]++;
        }
        // for(int i=0;i<3;i++){
        //     System.out.println(count[i]);
        // }
        int j=0;
        int i=0;
        while(i<nums.length){
            // System.out.println(count[j]);
            if(count[j]==0){
                j++;
                continue;
            }
            int numberCount=j;
            nums[i]=numberCount;
            count[j]--;
            i++;
        }
    }
}