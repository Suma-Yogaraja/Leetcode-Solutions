class Solution {
    public void reverseString(char[] s) {
        int l=s.length-1;
        int f=0;
        if(l<1)
            return;
        while(f<=l){
            char temp=s[f];
            s[f]=s[l];
            s[l]=temp;
            f++;
            l--;
        }
        return;
    }
    
}