class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //same as graph
        if(!wordList.contains(endWord) || wordList.size()<1)
            return 0;
        Set<String> words=new HashSet<>(wordList);
        int ans=1;
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String s=q.poll();
                if(s.equals(endWord))
                    return ans;
                for(int k=0;k<s.length();k++){
                    for(char j='a';j<='z';j++){
                        if(j == s.charAt(k)) continue;
                         String word=newString(j,k,s);
                        if(words.contains(word)){
                            q.add(word);
                            words.remove(word);
                        }
                        
                        }
                    }
                }
                ans++;
            }
            
        return 0;
    }
    private String newString(char change,int index,String word){
        char[] words=word.toCharArray();
        words[index]=change;
        return new String(words);
    }
}