class Solution {
    public int longestPalindrome(String s) {
        //create a freq map ,sort the values and check if it is even or odd,if even consider it ,atmost I can consider one odd elemnt
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray())
            freq.put(c,freq.getOrDefault(c,0)+1);
        // int[] charFre=new int[freq.size()];
        int i=0;
        // for(int value:freq.values())
        //     charFre[i++]=value;
        // // Arrays.sort(charFre);
        int ans=0;
        boolean odd=false;
        for(int value:freq.values()){
            //if even elemnt consider
            if(value%2==0){
                ans+=value;
                // System.out.println("im even");
            }
            else{
                //aTake even numbers out of it if elemnt is 27,we can take 26 elemnts for forming palindrome
                    ans+=value-1;
                    odd=true;
                    // System.out.println("im odd");
            }
        }
        return odd?ans+1:ans;
    }
}