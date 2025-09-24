class Solution {
    public int longestPalindrome(String s) {
        //create a freq map ,sort the values and check if it is even or odd,if even consider it ,atmost I can consider one odd elemnt
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray())
            freq.put(c,freq.getOrDefault(c,0)+1);
        int[] charFre=new int[freq.size()];
        int i=0;
        for(int value:freq.values())
            charFre[i++]=value;
        Arrays.sort(charFre);
        int ans=0;
        
        for(int j=charFre.length-1;j>=0;j--){
            int element=charFre[j];
            // System.out.println(element);
            //if even elemnt consider
            if(element%2==0){
                ans+=element;
                // System.out.println("im even");
            }
            else{
                //aTake even numbers out of it if elemnt is 27,we can take 26 elemnts for forming palindrome
                    ans+=element-1;
                    // System.out.println("im odd");
            }
        }
        return ans+1;
    }
}