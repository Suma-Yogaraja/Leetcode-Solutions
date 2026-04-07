class Solution {
    public int hIndex(int[] citations) {
        
        //im thinking of binary serch
        Arrays.sort(citations);
        int n=citations.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            //System.out.println(mid);
            if(citations[mid]>=(n-mid)){
                //System.out.println("min citation is :" + citations[mid]);
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return n-low;
    }
}