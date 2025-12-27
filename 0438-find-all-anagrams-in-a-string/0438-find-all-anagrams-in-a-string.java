class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //fixed sliding window
        //space complexity=usinh hashmap so O(n) n->p's length
        //time complexity=O(n+m)->s and p's length
        List<Integer> ans=new ArrayList<>();
        int start=0;
        if(p.length()>s.length())
            return ans;
        Map<Character,Integer> dict=new HashMap<>();
        for(char c:p.toCharArray())
            dict.put(c,dict.getOrDefault(c,0)+1);
        int end=p.length();
        Map<Character,Integer> temp=new HashMap<>();
        //create a fixed window of lengthp.length()
        for(int i=0;i<p.length();i++)
            temp.put(s.charAt(i),temp.getOrDefault(s.charAt(i),0)+1);
        if(dict.equals(temp))
            ans.add(0);
        while(end<s.length()){
            System.out.println("inside while loop :" + s.charAt(end));
            temp.put(s.charAt(end),temp.getOrDefault(s.charAt(end),0)+1);
            int value=temp.get(s.charAt(start))-1;
            if(value==0)
                temp.remove(s.charAt(start));
            else
                temp.put(s.charAt(start),temp.getOrDefault(s.charAt(start),0)-1);
            start++;
            if(dict.equals(temp)){
                // System.out.println("start character is " + s.charAt(start));
                ans.add(start);
            }
            end++;
        }
        return ans;
    }
}