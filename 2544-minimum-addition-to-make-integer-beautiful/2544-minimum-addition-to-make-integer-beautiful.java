class Solution {

    public long makeIntegerBeautiful(long n, int target) {
        //so if problem is actually making digits from right to left zero
        if(n==target)
            return 0;
        long number=n;
        long currSum=0;
        int pow=1;
        long digitPlace=1;
        currSum=digitSum(n);
        if(currSum<=target)
            return 0;
        // System.out.println("currsum is " +currSum);
        while(currSum>target){
            digitPlace=(long)(n%Math.pow(10,pow));
            // System.out.println("digit place is  is " +digitPlace);
            if(digitPlace!=0){
                n=n+(long)(Math.pow(10,pow)-digitPlace);
            }
        
            // System.out.println("value of n is " +n);
            currSum=digitSum(n);
            if(currSum<=target)
                return n-number;
            pow++;
           
        }
        // System.out.println(currSum);
        return -1;
    }
    private long digitSum(long n){
        long sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
}