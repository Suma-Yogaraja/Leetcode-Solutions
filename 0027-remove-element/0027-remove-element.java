class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;){
            if(nums[i]==val){
                count++;
                for(int j=i;j<n-1;j++){
                    nums[j]=nums[j+1];
                }
                n--;    
            }
            else{
                i++;
            }
                
        }
        return n;
    }
}