class Solution {
    public void sortColors(int[] nums) {
        //we can use hashmap/array to check the number of zeros ones and tows 
        int[] freq=new int[3];//sice we have only 0,1 or 2
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0){
                nums[j++]=i;
                freq[i]--;
            }
        }
    }
}