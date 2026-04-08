class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] split=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=split.length-1;i>=0;i--){
            if(split[i].equals(""))
                continue;
            sb.append(split[i]);
            sb.append(" ");
        }
        

        return sb.toString().trim();

    }
    
}