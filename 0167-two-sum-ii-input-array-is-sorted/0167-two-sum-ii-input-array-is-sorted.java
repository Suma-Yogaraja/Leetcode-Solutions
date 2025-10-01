class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //two pointer
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            if((numbers[start]+numbers[end])>target)
                end--;
            else if((numbers[start]+numbers[end]<target))
                start++;
            else
                return new int[]{start+1,end+1};
        }
        return new int[]{-1,-1};
    }
}





















//             int start=0,end=numbers.length-1;
//             while(start<=end){
//                 //int mid= start=(end-start)/2;
//                 int sum=numbers[start]+ numbers[end];
//                 if(sum>target)
//                  end=end-1;
//                 if(sum<target)
//                  start=start+1;
//                 if(sum==target)
//                  return new int[] {start+1,end+1};
//             }
//        return new int[] {-1,-1}; 
//     }  
// }