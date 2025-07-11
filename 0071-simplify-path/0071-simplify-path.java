class Solution {
    public String simplifyPath(String path) {
        //List<String> res=new ArrayList<>();
        StringBuilder res=new StringBuilder();
        Stack<String> stack=new Stack<>();
        String[] paths=path.split("/");
        for(String s:paths){
            System.out.print(s + ",");
        }
        //check for all elemnts in paths
        for(String s:paths){
            switch(s){
                case "" :
                case "." :
                    break;
                case ".." :
                 if(stack.size()>0)
                    stack.pop();
                    break;
                default:
                    stack.push(s);
                    break;
            }
 
        }
        if(stack.isEmpty())
            return "/";
         while(!stack.isEmpty()){
            res.insert(0,stack.pop());
            res.insert(0,"/");
         }
        


        return res.toString();
        
    }
}