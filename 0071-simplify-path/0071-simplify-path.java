class Solution {
    public String simplifyPath(String path) {
        //im thinking of a stack here
        String[] s = path.split("/");
        
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            String ch = s[i];
            if (ch.isEmpty())
                continue;
            switch (ch) {
                case "."://do nothing
                    break;
                case "..":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                case " ":
                    break;
                default:
                    stack.push(ch);
            }
            //    System.out.println(ch);
        }
        if(stack.isEmpty()) 
            return "/";
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0,stack.pop()).insert(0,"/");  
        }
        // System.out.println(res[0]);
        return sb.toString();
    }
}
