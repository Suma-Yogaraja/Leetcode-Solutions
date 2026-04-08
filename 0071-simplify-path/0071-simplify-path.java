class Solution {
    public String simplifyPath(String path) {
       String[] paths=path.split("/");
    //    for(String s:paths)
    //     System.out.println(s);
     Stack<String> stack=new Stack<>();
        for(String s:paths){
            if(s.equals(""))
                continue;
            switch(s){  
                case ".":
                         break;
                case ".." : if(!stack.isEmpty()){
                                stack.pop();
                            }
                         break;
                default: stack.push(s);
            }
        }
        StringBuilder sb=new StringBuilder();
        if(stack.isEmpty()){
            return "/";
        }
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
            sb.insert(0,"/");
        }
        return new String(sb);
    }
}
