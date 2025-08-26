class Solution {
    public boolean isPalindrome(int x) {
        //compare only first half since its palindrome problem
        int reverse=0;
        if(x<0 || (x%10==0 && x>0))
            return false;

        while(x>reverse){
            reverse=reverse*10+x%10;
            x=x/10;
        }
        return x==reverse || x==reverse/10;
    }
}
//         String s=String.valueOf(x);
//         int start=0;
//         int end=s.length()-1;
//         while(start<end){
//             if(s.charAt(start)!=s.charAt(end))
//                 return false;
//             start++;
//             end--;
//         }
//         return true;
//     }
// }