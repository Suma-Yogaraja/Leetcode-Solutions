class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
        return false;
    //there are diff ways,one way im thinking is create a map using s string and for 
    //each character in t,check if exist and remoive the character,else check for equality by using two maps
    Map<Character,Integer> s1=new HashMap<>();
    Map<Character,Integer> t1=new HashMap<>();
    for(char ch:s.toCharArray()){
        s1.put(ch,s1.getOrDefault(ch,0)+1);
    } 
    for(char c: t.toCharArray()){
        t1.put(c,t1.getOrDefault(c,0)+1);
    }
    if(s1.equals(t1))
        return true;
    return false;
    }
}


















//         int l1 = s.length();
//         int l2 = t.length();
//         if (l1 != l2)
//             return false;
//         int[] s1 = new int[26];
//         int[] t1 = new int[26];

//         for (char c : s.toCharArray())
//             s1[c - 'a'] = s1[c - 'a'] + 1;

//         for (char c : t.toCharArray())
//             t1[c - 'a'] = t1[c - 'a'] + 1;

//         for (int i = 0; i < s1.length; i++) {
//             if (s1[i] != t1[i])
//                 return false;
//         }
//         return true;
//     }
// }

// Map<Character,Integer> fre=new HashMap<>();

// for(char c:s.toCharArray())
//     fre.put(c,fre.getOrDefault(c,0)+1);

// for(char i=0;i<t.length();i++){

//     char c=t.charAt(i);

//     if(fre.get(c)!=null)
//         {
//             if(fre.get(c)==1){

//               fre.remove(c);
//             }

//             else

//              fre.put(c,fre.get(c)-1);

//         }

//     else
//     return false;

// }
// return fre.isEmpty();
// int res = 0;
// for(int i=0;i<l1;i++){
//     res = res ^ (s.charAt(i) ^ t.charAt(i));
// }
// return res==0;
