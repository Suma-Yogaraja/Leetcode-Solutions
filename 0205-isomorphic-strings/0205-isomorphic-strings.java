class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> s1=new HashMap<>();
       // Map<Character,Integer> t1=new HashMap<>();
        Set<Character> set=new HashSet<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            char value=t.charAt(i);
            
            if(s1.containsKey(key)){//checking s
                 if(s1.get(key)!=value)
                    return false;   
            }
            else{
                if(s1.containsValue(value))
                    return false;
                s1.put(key,value);
                set.add(value);   

            } 
        }

        return true;
    }
}



















        
//         for(int i=0;i<s.length();i++){
//             s1.put(s.charAt(i),s1.getOrDefault(s.charAt(i),0)+1);
//             t1.put(t.charAt(i),t1.getOrDefault(t.charAt(i),0)+1);
//         }
//         List<Integer> sFre=new ArrayList(s1.values());
//         List<Integer> tFre=new ArrayList(t1.values());

//         Collections.sort(sFre);
//         Collections.sort(tFre);
//         if(sFre.equals(tFre))
//             return true;
//         else return false;

        
//     }
// }