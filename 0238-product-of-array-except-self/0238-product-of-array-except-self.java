class Solution {
    public int[] productExceptSelf(int[] nums) {
        //create suffix product and prefix product
       
        int[] prefixProd=new int[nums.length];
        int[] suffixProd=new int[nums.length];
        prefixProd[0]=1;
        suffixProd[nums.length-1]=1;
        for(int i=1;i<nums.length;i++)
            prefixProd[i]=prefixProd[i-1]*nums[i-1];
        for(int i=nums.length-2;i>=0;i--)
            suffixProd[i]=suffixProd[i+1]*nums[i+1];

        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=prefixProd[i]*suffixProd[i];
        }
        return ans;
    }
}