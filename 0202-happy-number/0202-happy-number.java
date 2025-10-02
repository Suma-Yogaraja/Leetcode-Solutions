class Solution {
    public boolean isHappy(int n) {
        if(n==1)
            return true;
        int sum=0;
        Set<Integer> set=new HashSet<>();
        while(n!=1){
           n= sumofSquares(n);
            if(set.contains(n)){//there is a cycle
                return false;
            }
            set.add(n);
        }
        return true;
    }
    private int sumofSquares(int n){
        int sum=0;
        while(n>0){
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}






















//         int sum=0;
//         if(n==1)
//             return true;
//         // if(n>1 && n<=9){
//         //     System.out.println(n);
//         //     return false;
//         // }
//         int digit=digitsCount(n,sum);
//         // System.out.println(digit);
//         if(digit==1 || digit ==7)
//             return true;
//         else
//             return false;
        
//     }
//     private int digitsCount(int n,int sum){
        
//         int count=0;
//         while(n>0){
//             sum+=(n%10)*(n%10);
//             n=n/10;
//             count++;
//         }
//         while(sum>9){
//            sum= digitsCount(sum,0);
//         }
//         return sum;
//     }
// }