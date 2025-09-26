class Solution {
    public List<String> letterCombinations(String digits) {
        int k=digits.length();
        String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res=new ArrayList<>();
        if(k==0|| digits==null)
            return res;
        List<String> path=new ArrayList<>();
        backtrack(res,digits,new StringBuilder(),mapping,0);
        return res;
    }
    private void backtrack(List<String> res,String digits,StringBuilder path,String[] mapping,int index){
        if(index==digits.length()){
            res.add(path.toString());
            return; 
        }   
            char digit=digits.charAt(index);
            String letters=mapping[digit-'0'];
            for(char letter:letters.toCharArray()){
                path.append(letter);
                backtrack(res,digits,path,mapping,index+1);
                path.deleteCharAt(path.length()-1);
        }
    }
}