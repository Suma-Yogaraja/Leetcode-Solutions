class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        if(n<=0)
            return;
        k=k%nums.length;
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);

    }
    private void reverse(int[] nums,int start,int end){
        int temp=0;
        System.out.println(end);
        while(start<=end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
}