class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        //two pointer 
        int start=0;
        int end=0;
        int ans=Integer.MIN_VALUE;
        int currCost=0;
       while(end<t.length() && start<=end){
         char c=t.charAt(end);//b
         currCost+=Math.abs(c-s.charAt(end));
        //   System.out.println(currCost);
            if(currCost<=maxCost){
                ans=Math.max(ans,end-start+1);
            }
            else{
                while(currCost>maxCost){
                    // System.out.println(t.charAt(start));
                    currCost-=Math.abs(t.charAt(start)-s.charAt(start));
                    start++;
                }
            }  
            end++;      
       }
       return ans;
    }
}































//         int n = s.length();
//         int l = 0, r = 0, ans = 0, curr = 0;
//         int[] diff = new int[n];
//         for (int i = 0; i < s.length(); i++) {

//             diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
//            // System.out.println(diff[i]);
//         }

//         // when first cost is greater than maxcost
//         while (r<n && diff[r] > maxCost) {
//             l++;
//             r++;
//         }

//         while (r < n) {
//             curr += diff[r];
            
//             if (curr > maxCost) {
//                 curr -= diff[l];
//                 l++;
//             }
//             else {
//                 ans = Math.max(ans, r - l + 1);
//             }
//             r++;
//         }
        
        
//         return ans;

//     }

// }
