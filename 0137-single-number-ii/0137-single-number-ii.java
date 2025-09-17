class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        //since problem ask for constant space we have to think about xor
        //here at each bit,we check number of 1s if 1s is modulo of 3 then it appeared thrice 
        //0010
        //0010
        //0011
        //0010
        //0041 //bit count (4%3)==1 so its 0011-which is 3
        for(int i=0;i<32;i++){//32 bits 
            int bitSum=0;
            for(int num:nums){
             if((num>>i&1)==1)
                bitSum++;
            }
         
         if(bitSum % 3 !=0)
            result|=1<<i;
         
        }
        return result;
    }
}