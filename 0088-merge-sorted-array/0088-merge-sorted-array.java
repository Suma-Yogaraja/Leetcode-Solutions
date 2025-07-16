class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //use two pointer pointing to last indes of both array
        int last1=m-1;
        int last2=n-1;
        int ansLast=nums1.length-1;
        //edge cases
        if(n==0)
            return;
        

        while(m>0 && n>0){
            //check last elemnts of both array and place at last 
            if(nums2[n-1]>nums1[m-1]){
                nums1[ansLast]=nums2[n-1];
                n--;    
            }
            else {
                nums1[ansLast]=nums1[m-1];
                m--;
            }
            
            ansLast--;
        }
        while(n>0){
            nums1[ansLast]=nums2[n-1];
            n--;
            ansLast--;
        }
            // for(int i:nums1)
            //     System.out.print(i + ",");

    }
}