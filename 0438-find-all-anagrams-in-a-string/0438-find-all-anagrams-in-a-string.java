class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //edge case slength less than p
        if(s.length()<p.length())
            return new ArrayList<>();
        //now take two hash map for s and p string
        Map<Character,Integer> sFre=new HashMap<>();
        Map<Character,Integer> pFre=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        //creating a map for p string
        for(char c: p.toCharArray()){
            pFre.put(c,pFre.getOrDefault(c,0)+1);
        }
        int l=p.length();
        //initilase a window of size p and add elements to s
        for(int i=0;i<l;i++){
            sFre.put(s.charAt(i),sFre.getOrDefault(s.charAt(i),0)+1);
        }
        if(sFre.equals(pFre))//if first window is equal then we got an anagram with index zero
            ans.add(0);
        for(int j=l;j<s.length();j++){
            char last=s.charAt(j);
            char first=s.charAt(j-l);
            //add last character,check for freq of last character to be added and remove accordingly
            sFre.put(last,sFre.getOrDefault(last,0)+1);
            int firstCharCount=sFre.get(first);
            if(firstCharCount==1)
                sFre.remove(first);
            else{
                sFre.put(first,sFre.getOrDefault(first,0)-1);
            }
            if(sFre.equals(pFre))
                ans.add(j-l+1);
        }
        return ans;
    }   
}



















//             //also create a hash map for p
//             if(s.length()<p.length())
//                 return new ArrayList<Integer>();
            
//             Map<Character,Integer> pFreq=new HashMap<>();
//             Map<Character,Integer> sFreq=new HashMap<>();
//             List<Integer> res=new ArrayList<>();
//             int len=p.length();
//             for(char c:p.toCharArray()){
//                 pFreq.put(c,pFreq.getOrDefault(c,0)+1);
//             }
//             //first create a window of size p,
//             for(int i=0;i<len;i++){
//                 sFreq.put(s.charAt(i),sFreq.getOrDefault(s.charAt(i),0)+1);
//             }
//            if(sFreq.equals(pFreq))
//              res.add(0);
            
//         //then do sliding window of fixed size
//         for(int j=len;j<s.length();j++){
//             char last=s.charAt(j);
//             char first=s.charAt(j-len);
//             sFreq.put(last,sFreq.getOrDefault(last,0)+1);
//             int firstCount=sFreq.get(first);
//             if(firstCount==1){
//                 sFreq.remove(first);
//             }
//             else
//             {
//             sFreq.put(first,sFreq.getOrDefault(first,0)-1);
//             }
//             //System.out.println(sFreq + ":" + pFreq);
//              if(sFreq.equals(pFreq)){
//                     res.add(j-len+1);
//                     //System.out.println("adding " + j);
//              }
                

//         }
//         return res;
//     }
// }