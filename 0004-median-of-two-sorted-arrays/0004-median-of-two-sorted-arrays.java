class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //i can do brute force or two pointer
        int ptr1=0,ptr2=0;
        int m=nums1.length;
        int n=nums2.length;
        int i=0,j=0;
        for(int count=0;count<=(m+n)/2;count++){
            ptr2=ptr1;//stroing in a ptr
            if(i!=m && j!=n){
                if(nums1[i]>nums2[j]){
                    ptr1=nums2[j++];
                }
                else
                    ptr1=nums1[i++];
            }
            else if(i<m){
                ptr1=nums1[i++];
            }
            else
                ptr1=nums2[j++];
        }
        if((n+m)%2==1){
            return (double) ptr1;
        }
        else{
            double ans=(double) ptr1+(double) ptr2;
            return ans/2.0;
        }
    }
}