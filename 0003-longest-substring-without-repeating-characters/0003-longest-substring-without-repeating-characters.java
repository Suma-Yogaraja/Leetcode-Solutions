class Solution {
    public int lengthOfLongestSubstring(String s) {
        int first = 0;
        int last = 0;
        int maxLength=0;
        Set<Character> set = new HashSet<>();
        while (last < s.length()) {
            while (set.contains(s.charAt(last))) {
                set.remove(s.charAt(first));
                first++;
            }
                set.add(s.charAt(last));
                maxLength=Math.max(maxLength,set.size());
               // System.out.println(maxLength);
                last++;
        }
        return maxLength;
    }
}

//         Set<Character> seen = new HashSet<>();
//         //use two pointer sliding window concept 
//         int f = 0;
//         int l = 0;
//         int maxLen = 0;

//         while (l < s.length()) {

//             while (seen.contains(s.charAt(l))) {
//                 //remove the left character and increment 
//                 seen.remove(s.charAt(f));
//                 f++;
//             }
//             seen.add(s.charAt(l));
//             maxLen = Math.max(maxLen, seen.size());
//             l++;
//         }

//         return maxLen;

//     }
// }

//         Set<Character> seen=new HashSet<>();
//         int l=0,r=0,maxlen=0;

//             while(r<s.length()){

//                 while(seen.contains(s.charAt(r))){

//                     seen.remove(s.charAt(l));
//                     l++;

//                 }

//                 seen.add(s.charAt(r));
//                 maxlen=Math.max(maxlen,r-l+1);
//                 r++;

//             }

//         return maxlen;

//     }
// }