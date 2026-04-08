class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
       //i will create a cost array of size s,then it will maxsize subarray <=maxCost
       int n=s.length();
       int[] cost=new int[n];
        if(s.length()!=t.length())
            return 0;
        for(int i=0;i<n;i++){
            cost[i]=Math.abs(t.charAt(i)-s.charAt(i));
            //  System.out.println(cost[i]);
        }
        int start=0;
        int end=0;
        int sum=0;
        int ans=0;
        for(end=0;end<cost.length;end++){
             sum+=cost[end];
            //  System.out.println(sum);
                while(start<=end && sum>maxCost){
                sum-=cost[start];
                start++;
                }
                if(sum<=maxCost)
                    ans=Math.max(ans,end-start+1);
           
        }
        return ans;
    }
}