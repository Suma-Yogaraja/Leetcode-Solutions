class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length<=0)
            return 0;
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
          
            if(s.equals("+")){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n1+n2);
            }
            else if(s.equals("-")){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n2-n1);
            }
            else if(s.equals("*")){
                int n1=stack.pop();
                int n2=stack.pop();
                stack.push(n1*n2);
            }
            else if(s.equals("/")){
                int n1=stack.pop();
                int n2=stack.pop();
                // System.out.println(n1/n2);
                stack.push(n2/n1);
            }
            else{
                int num=Integer.parseInt(s);
                //  System.out.println(num);
                stack.add(num);
            }
        }
        
        return stack.isEmpty()?0:stack.pop();

    }
}