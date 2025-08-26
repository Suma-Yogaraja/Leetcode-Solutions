class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       // System.out.println(s);
        String[] str=s.split(" ");
        int start=0;
        int end=str.length-1;
        StringBuilder sb=new StringBuilder();
        for(int i=end;i>=start;i--){
            //str[i]=str[i].trim();
            //System.out.println(" 1" + "" +str[i]);
            if(str[i].equals(""))
              continue;
             sb.append(str[i]);
             sb.append(" ");
        }
       // return String.join(" ",res);
       return sb.toString().trim();

        // StringBuilder sb=new StringBuilder();
        // for(int i=end;i>=start;i--){
        //     str[i].trim();
        //     if(str[i]==" ")continue;
        //     sb.append(str[i]);
        //     if(i==start)
        //         continue;
        //     sb.append(" ");
        // }
        // return new String(sb);
    }
}