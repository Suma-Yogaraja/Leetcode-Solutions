class Solution {
    public int rangeBitwiseAnd(int left, int right) {
       //range is given so nums=[left,left+1,left+2,.....right]
       int shift=0;
       while(left<right){
        left=left>>1;
        right=right>>1;
        shift++;
       }
       return left<<shift;
    }
}