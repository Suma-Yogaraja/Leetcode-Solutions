class Solution {
    public int maximizeSweetness(int[] sweetness, int k) {
       // Arrays.sort(sweetness);
        int left=1,right=0;
        for(int sweet :sweetness){
            //left=Math.min(left,sweet);
            right+=sweet;
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isValidCut(sweetness,k,mid)){
                ans=mid;
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return ans;
    }
    private boolean isValidCut(int[] sweetness,int cuts,int maxSweet){
        int currCut=0;
        int currSweetness=0;
        for(int sweet:sweetness){
            if(currSweetness+sweet>maxSweet){
                currCut++;
                currSweetness=0;
                if(currCut>cuts)
                    return false;
            }
            else
                currSweetness+=sweet;
        }
        return true;
    }
}