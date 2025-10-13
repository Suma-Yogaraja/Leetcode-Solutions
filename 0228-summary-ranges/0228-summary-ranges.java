class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0)
            return new ArrayList<>();
        List<String> ans = new ArrayList<>();
        int s = 0;
        int e = 0;
        for (e = 1; e<=nums.length-1; e++) {
            if (nums[e] != (nums[e - 1] + 1)) {
                    // System.out.println("start and end is " +nums[s]+ ":" +nums[e]);
                if (Math.abs(s-e)<=1) {
                    ans.add(String.valueOf(nums[s]));
                    s++;
                } else {
                    ans.add(nums[s] + "->" + nums[e - 1]);
                    s = e;
                } 
            }
        }
        //  System.out.println("e is " +e);
         if(Math.abs(s-e)>1)
            ans.add(nums[s] + "->" + nums[e - 1]);
          else
            ans.add(String.valueOf(nums[s]));
        return ans;
    }
}