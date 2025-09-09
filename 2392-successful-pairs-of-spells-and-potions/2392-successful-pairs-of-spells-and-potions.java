class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        //practise!!! its binary search
        Arrays.sort(potions);
        int n=potions.length;
        int[] ans=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int j=binarySearch(potions,success/(double)spells[i]);
            ans[i]=n-j;
        }
        return ans;
    }
    private int binarySearch(int[] potions,double target){
        int left=0;
        int right=potions.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int num=potions[mid];
            // if(num==target)
            //     return mid;
             if(num<target)
                left=mid+1;
            else
              right=mid-1;
        }
        return left;
    }
}