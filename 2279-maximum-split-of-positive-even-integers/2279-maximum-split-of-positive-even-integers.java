class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
       List<Long> ans=new ArrayList<>();
       if(finalSum%2!=0)
        return new ArrayList<>();
        long currSum=0;
        long evenDigit=2;
        while(currSum+evenDigit<=finalSum){
            ans.add(evenDigit);
            currSum+=evenDigit;
            evenDigit+=2;
        }
        if(currSum<finalSum){
            long last=ans.remove(ans.size()-1);
            ans.add(last+(finalSum-currSum));
        }

        return ans;
    }
}