class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //first merge sorted array using two pointer
        //now find the middle of the array
        int s1=0;
        int s2=0;
        int i=0;
        int[] result=new int[nums1.length+nums2.length];
        while(s1<nums1.length && s2<nums2.length){
            if(nums1[s1]<nums2[s2]){
                result[i]=nums1[s1];
                s1++;
            }
            else{
                result[i]=nums2[s2];
                s2++;
            }
            i++;
        }
        while(s1<nums1.length){
            result[i++]=nums1[s1++];
        }
        while(s2<nums2.length){
            result[i++]=nums2[s2++];
        }
        int total=result.length;
        double median;
        if(total%2==0){
        //which means length is in even number so have to do mid-1)+mid+1)/2
        int rem=total/2;
         median=(result[rem]+result[rem-1])/2.0;//take a look of why i have added 2.0
         //System.out.println(median);
        }
        else{
            median=result[total/2];
        }
        return median;
    }
}