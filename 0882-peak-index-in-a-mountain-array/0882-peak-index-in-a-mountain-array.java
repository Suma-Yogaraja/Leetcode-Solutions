class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end= arr.length-1;
        int mid= (start+end)/2;
        while(end!=mid){
            
            //System.out.println(mid + ":" + end);
            if(arr[mid]>arr[mid+1])
                {
                    end=mid;
                    //System.out.println(mid + ":" + end);
                }

            else if(arr[mid]<arr[mid+1])
                    start=mid+1;

            mid= (start+end)/2;
            
        }
        return mid;




        
    }
}