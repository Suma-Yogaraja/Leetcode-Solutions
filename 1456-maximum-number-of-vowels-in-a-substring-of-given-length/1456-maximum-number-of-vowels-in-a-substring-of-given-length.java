class Solution {
    public int maxVowels(String s, int k) {
        int maxVowel=0;
        int currVow=0;
        int start=0;
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        //create a window of size k
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(set.contains(c))
                currVow++;
        }
        if(currVow==k)
            return k;
        else
            maxVowel=Math.max(maxVowel,currVow);
        for(int i=k;i<s.length();i++){
            char end=s.charAt(i);
            //add character
            if(set.contains(end))
                currVow++;
            if(set.contains(s.charAt(start)))
                currVow--;
            start++;
            // System.out.println("vowel at end is "+ currVow + " : " + i);
            maxVowel=Math.max(maxVowel,currVow);
        }
        return maxVowel;
    }
}