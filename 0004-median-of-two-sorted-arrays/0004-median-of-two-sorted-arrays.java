class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //merge the array using two pointer since both are sorted and find median for the sorted array
        int m = nums1.length;
        int n = nums2.length;
        int[] merge = new int[m + n];
        int i = 0;
        int n1 = 0;
        int n2 = 0;
        while (n1 < m && n2 < n) {
            if (nums1[n1] < nums2[n2]) {
                merge[i] = nums1[n1];
                n1++;

            } else {
                merge[i] = nums2[n2];
                n2++;

            }
            i++;
        }
        int length = m + n;
        // System.out.println("length "+ length);
        while (n2 < n) {
            merge[i] = nums2[n2];
            i++;
            n2++;
        }
        while (n1 < m) {
            //System.out.println(n1 + " :" + i);
            merge[i] = nums1[n1];
            i++;
            n1++;
        }

        if (merge.length % 2 == 0) {//length is even so we get 2 middle elemnts
            int median = merge.length / 2;

            //System.out.println(median);
            return (merge[median] + merge[median - 1]) / 2.0;
        }
        return merge[merge.length / 2];

    }
}

//         //first merge sorted array using two pointer
//         //now find the middle of the array
//         int s1=0;
//         int s2=0;
//         int i=0;
//         int[] result=new int[nums1.length+nums2.length];
//         while(s1<nums1.length && s2<nums2.length){
//             if(nums1[s1]<nums2[s2]){
//                 result[i]=nums1[s1];
//                 s1++;
//             }
//             else{
//                 result[i]=nums2[s2];
//                 s2++;
//             }
//             i++;
//         }
//         while(s1<nums1.length){
//             result[i++]=nums1[s1++];
//         }
//         while(s2<nums2.length){
//             result[i++]=nums2[s2++];
//         }
//         int total=result.length;
//         double median;
//         if(total%2==0){
//         //which means length is in even number so have to do mid-1)+mid+1)/2
//         int rem=total/2;
//          median=(result[rem]+result[rem-1])/2.0;//take a look of why i have added 2.0
//          //System.out.println(median);
//         }
//         else{
//             median=result[total/2];
//         }
//         return median;
//     }
// }