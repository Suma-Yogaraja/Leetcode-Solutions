class Solution {
    public String getSmallestString(int n, int k) {
        char[] ans=new char[n];
       Arrays.fill(ans, 'a');
        k-=n;
        int i=n-1;
        while(k>0 && i>=0){
            int word=Math.min(25,k);
            // System.out.println(k);
            ans[i]=(char) ('a'+word);
            k-=word;
            i--;

        }
        
        return new String(ans);
    }
}