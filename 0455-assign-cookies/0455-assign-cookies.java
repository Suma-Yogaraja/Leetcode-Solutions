class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length<=0)
            return 0;
        // System.out.println(s.length);
        //sort both s and greed
        Arrays.sort(g);
        Arrays.sort(s);
        int maxContent=0;
        int j=0;
        for(int i=0;i<s.length && j<g.length;i++){
            if(s[i]>=g[j]){
                maxContent++;
                j++;
            }
        }

        return maxContent;

    }
}