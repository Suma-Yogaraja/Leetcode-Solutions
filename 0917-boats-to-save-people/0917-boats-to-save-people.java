class Solution {
    public int numRescueBoats(int[] people, int limit) {
        //two pointer
        int start=0;
        int end=people.length-1;
        int boat=0;
        Arrays.sort(people);
        while(start<=end){
            if((people[start]+people[end])<=limit){
                start++;
            }
            
            end--;
            boat++;
            // if(start==end)break;
        }
        return boat;
    }
}