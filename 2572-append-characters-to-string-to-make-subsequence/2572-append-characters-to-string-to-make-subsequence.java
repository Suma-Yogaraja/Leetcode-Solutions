class Solution {
    public int appendCharacters(String s, String t) {
        //two pointer
        int ptr1=0;
        int ptr2=0;
        while(ptr1<s.length() && ptr2<t.length()){
            if(s.charAt(ptr1)==t.charAt(ptr2)){
                ptr2++;
                System.out.println("im ptr2" + ptr2);
            }
            ptr1++;
        }
        System.out.println(ptr1 + " " + ptr2);
       return t.length()-ptr2;
    }
}