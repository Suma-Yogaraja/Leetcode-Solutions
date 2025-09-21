class Solution {
    public int[] productExceptSelf(int[] nums) {
        //prefix sum,suffix sum
        //suffix produc[i]=nums[i-1]*nums[i-2]*.....*nums[0]
        //prefix[i]=nums[i+1]*nums[i+2]*nus[i+3]*...nums[nums.length-1]
        int[] res=new int[nums.length];
        res[0]=1;
        //first find prefix product
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int[] suffixProduct=new int[nums.length];
        suffixProduct[nums.length-1]=1;
        for(int j=nums.length-2;j>=0;j--){
             suffixProduct[j]=suffixProduct[j+1]*nums[j+1]; 
            // System.out.println(suffixProduct[j]);

        }
        for(int i=0;i<nums.length;i++){
            res[i]=res[i]*suffixProduct[i];
        }
        return res;
    }
}