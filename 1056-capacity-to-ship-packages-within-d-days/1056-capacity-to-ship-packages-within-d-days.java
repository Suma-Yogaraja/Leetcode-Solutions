class Solution {
    public int shipWithinDays(int[] weights, int days) {
//this is more of binary search where the question ask for min capacity within d days  
 //the ans lies in th boundary ->ex1->max=10 so that is the min capacity,max capacity is adding and and shipping in one day
        int left=0;
        int right=0;
        int ans=right;
        for(int weight:weights){
        left=Math.max(left,weight);
        right+=weight;
     } 
    //ex-1-> ans lies between 55 and 10
        while(left<=right){
           int mid=left+(right-left)/2;
           if(isValidCapacity(mid,days,weights)){
            //if mid valid then,with min capacity of mid,we can send all weights so we will check if mid-1 is also possible
                ans=mid;
                right=mid-1;
                //  System.out.println("im possible so numbers below me is also possible " + right);
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    private boolean isValidCapacity(int max,int days,int[] weights){
        int currW=0;
        int day=1;
        for(int weight:weights){
            if(currW+weight>max){
                currW=weight;
                day++;
                if(day>days)
                    return false;
            }
            else{
                currW+=weight;
            }
        }
        return true;
    }
}













//         //find min capacity per day 

//         int left=0 ;
//         int right =0;
//         for(int weight:weights){
//             left=Math.max(left,weight);//worst case where capacity is min
//             right+=weight;// best case ship all in one day
//         }
//         int ans=right;
//         while(left<=right){
//             int mid=left+(right-left)/2;
//             if(canShip(weights,days,mid)){
//                 right=mid-1;
//                 ans=mid;
//             }
//             else
//                 left=mid+1;
//            // System.out.println("left :right" + left + " : " +right);
//         }
//         return ans;
//     }
//     private boolean canShip(int[] weights,int totalDay,int maxCap){
//         int day=1;
//         int curWeight=0;
//         for(int w:weights){
//             if(curWeight+w>maxCap){
//                 day++;
//                 curWeight=w;
//                 if(day>totalDay)
//                     return false;
//             }
//             else
//                 curWeight+=w;
//            // System.out.println("curr weight" + curWeight);     
//         }
//         return true;
//     }
// }