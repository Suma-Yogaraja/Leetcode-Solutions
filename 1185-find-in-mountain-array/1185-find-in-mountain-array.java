/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {


        int start=0;
        int end= mountainArr.length()-1;
        int peak= peakIndexInMountainArray(mountainArr);
        if(target==mountainArr.get(peak)) return peak;
        
        if(binarySearch(mountainArr,start,peak,target)!=-1)
          return binarySearch(mountainArr,start,peak,target);
        else 
         return binarySearch(mountainArr,peak,end,target);
        

       
        
    }


    int binarySearch(MountainArray mountainArr,int start,int end,int target){


        if(mountainArr.get(start)<mountainArr.get(start+1))

        {
        while (start <= end) {
        int mid = start + (end - start) / 2;
        int midVal = mountainArr.get(mid);
        
        if (midVal == target) {
            return mid;
        } else if (midVal < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        }
    return -1;
    }
     else {
         while (start <= end) {
        int mid = start + (end - start) / 2;
        int midVal = mountainArr.get(mid);
        
        if (midVal == target) {
            return mid;
        } else if (midVal > target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
        }
    return -1;

     }


    }

     int peakIndexInMountainArray(MountainArray mountainArr) {

        int start=0;
        int end= mountainArr.length()-1;
        //int mid= (start+end)/2;
        while(start<end){
             int mid= (start+end)/2;
             int midVal = mountainArr.get(mid);
            //System.out.println(mid + ":" + end);
            if(mountainArr.get(mid)>mountainArr.get(mid+1))
                {
                    end=mid;
                    //System.out.println(mid + ":" + end);
                }

            else if(mountainArr.get(mid)<mountainArr.get(mid+1))
                    start=mid+1;

        }
        return end;
   
    }
}