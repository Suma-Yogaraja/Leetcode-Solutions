class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            //  System.out.println(mid);
            if(arr[mid]<arr[mid+1]) //left is sorted
                low=mid+1;
            else
                high=mid;
              
        }
           
        return low;
    }
}