class Solution {
    public List<Integer> countSmaller(int[] nums) {
       //start from end and do binary search to check which position that numberr can be added to keep elemnt sorted
       int n=nums.length;
       List<Integer> sortedList=new ArrayList<>();
       List<Integer> result=new ArrayList<>();
       for(int i=nums.length-1;i>=0;i--){
          int index=binarySearch(sortedList,nums[i]);
          sortedList.add(index,nums[i]);
          result.add(index);
        //   System.out.println(index);
       }
        Collections.reverse(result); 
        return result;
    }
    private int binarySearch(List<Integer> list,int num){
        int left=0;
        int right=list.size()-1;
        while(left<=right){
            int mid=(left+right)/2;
            
            if(list.get(mid)>=num){
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return left;
    }
}