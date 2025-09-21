class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int start=0;
        int end=n-1;
        int ans=Math.min(citations[0],n);
        while(start<=end){
            int mid=start+(end-start)/2;
            // System.out.println("mid: "+mid);
            // System.out.print("")
            if((n-mid)>=citations[mid]){
                ans=Math.max(ans, citations[mid]);
                // Systemout.println("if---ans:"+ans);
                start=mid+1;
            }
            else {
                ans = Math.max(ans, Math.min(n-mid, citations[mid]));
                // System.out.println("else---ans:"+ans);
                end=mid-1;
            }
        }
        return ans;
    }
}