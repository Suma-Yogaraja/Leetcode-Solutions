class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
            //also create a hash map for p
            if(s.length()<p.length())
                return new ArrayList<Integer>();
            
            Map<Character,Integer> pFreq=new HashMap<>();
            Map<Character,Integer> sFreq=new HashMap<>();
            List<Integer> res=new ArrayList<>();
            int len=p.length();
            for(char c:p.toCharArray()){
                pFreq.put(c,pFreq.getOrDefault(c,0)+1);
            }
            //first create a window of size p,
            for(int i=0;i<len;i++){
                sFreq.put(s.charAt(i),sFreq.getOrDefault(s.charAt(i),0)+1);
            }
           if(sFreq.equals(pFreq))
             res.add(0);
            
        //then do sliding window of fixed size
        for(int j=len;j<s.length();j++){
            char last=s.charAt(j);
            char first=s.charAt(j-len);
            sFreq.put(last,sFreq.getOrDefault(last,0)+1);
            int firstCount=sFreq.get(first);
            if(firstCount==1){
                sFreq.remove(first);
            }
            else
            {
            sFreq.put(first,sFreq.getOrDefault(first,0)-1);
            }
            //System.out.println(sFreq + ":" + pFreq);
             if(sFreq.equals(pFreq)){
                    res.add(j-len+1);
                    //System.out.println("adding " + j);
             }
                

        }
        return res;
    }
}