class Solution {
    public int removeElement(int[] nums, int val) {
        int start=0;
       // int count=0;
        int end=nums.length-1;
        int temp=0;
        while(start<=end){
            if(nums[start]==val){
                //System.out.println(start + " :" + end);
                //count++;
                nums[start]=-1;
                //swap with last elemnt
                temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                //System.out.println("start and end is " + nums[start] + " :" + nums[end]);
                //start++;
                end--;
            }
            else{
                start++;
            }
        }
        return start;
    }
}











//         int n=nums.length;
//         int count=0;
//         for(int i=0;i<n;){
//             if(nums[i]==val){
//                 count++;
//                 for(int j=i;j<n-1;j++){
//                     nums[j]=nums[j+1];
//                 }
//                 n--;    
//             }
//             else{
//                 i++;
//             }
                
//         }
//         return n;
//     }
// }