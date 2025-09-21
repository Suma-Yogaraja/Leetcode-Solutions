class Solution {
    public int[] productExceptSelf(int[] nums) {
        //prefix sum,suffix sum
        //suffix produc[i]=nums[i-1]*nums[i-1]*.....*nums[0]
        //prefix[i]=nums[i+1]*nums[i+2]*nus[i+3]*...nums[nums.length-1]
        int[] res=new int[nums.length];
        res[0]=1;
        //first find prefix product
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int suffixProduct=1;
        for(int j=nums.length-1;j>=0;j--){
            //System.out.println(j);
             
            res[j]*=suffixProduct;
            suffixProduct*=nums[j];
           
        }
        return res;
    }
}