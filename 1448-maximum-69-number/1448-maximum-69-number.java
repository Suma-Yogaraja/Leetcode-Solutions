class Solution {
    public int maximum69Number (int num) {
        char[] nums=String.valueOf(num).toCharArray();
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]=='6'){
               // System.out.println(nums[i]);
                nums[i]='9';
                break;
            }     
        }

        return Integer.valueOf(new String(nums));
        
    }
}