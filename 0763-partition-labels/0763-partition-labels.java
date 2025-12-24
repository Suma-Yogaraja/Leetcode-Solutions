class Solution {
    public List<Integer> partitionLabels(String s) {
        //
        int start=0;
        int end=0;
        List<Integer> ans=new ArrayList<>();
        while(end<s.length() && start<s.length()){
            char c=s.charAt(start);//c='a'
            for(int i=s.length()-1;i>end;i--){//modify end
                // System.out.println(" end is "+ s.charAt(i));
                if(s.charAt(i)==c){
                    end=i;
                    // System.out.println("checking window till " + end);
                    break;
                }
            }
            Set<Character> parts=new HashSet<>();
        
            for(int i=start;i<=end;i++){
                parts.add(s.charAt(i));
            }
            for(int i=end;i<s.length();i++){
                if(parts.contains(s.charAt(i))){
                    for(int j=end;j<=i;j++){
                        parts.add(s.charAt(j));
                    }
                    end=i;
                   
                }
            }
            ans.add(end-start+1);
            start=end+1;
            end=start; 
        }
        return ans;

    }
}