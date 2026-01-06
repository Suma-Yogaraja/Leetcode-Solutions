class Solution {
    public int climbStairs(int n) {
        //for n=45,since input is long we may memoize
        int[] memo=new int[n+1];
        return stairs(n,memo);
       
    }
    private int stairs(int n,int[] memo){
        if(n==1)
            memo[1]=1;
        if(n==2)
            memo[2]=2;
        if(memo[n]!=0)
            return memo[n];
        else{
            memo[n]=stairs(n-1,memo)+stairs(n-2,memo);
        }
        return memo[n];
    }
}