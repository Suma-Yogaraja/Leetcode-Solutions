class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
            Arrays.sort(nums);
            int[] prefix=new int[nums.length];
            for(int i=1;i<nums.length;i++)
                nums[i]+=nums[i-1];
            
            int[] ans=new int[queries.length];
            for(int j=0;j<queries.length;j++){
                int q=queries[j];
                System.out.println("queries:" +q);
                //aplly binary serach
                int left=0;
                int right=nums.length-1;
                while(left<=right){
                    int mid=left+(right-left)/2;
                    if(nums[mid]==q){
                        ans[j]=mid+1;
                        break;
                    }
                    else if(nums[mid]<q){
                        ans[j]=mid+1;
                        left=mid+1;
                    }
                    else
                     right=mid-1;
           
                }

            }

        return ans;
    }
}