class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(x==1)
            return 1;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double result=1.0;
        while(N>0){
            if(N%2==1){//N is odd
                result*=x;
            }
            x*=x;
            N/=2;
        }
        
           return result; 
    }
}