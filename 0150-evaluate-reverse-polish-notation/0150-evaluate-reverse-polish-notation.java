class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        if(tokens.length<=0)
            return 0;
        int sum=0;
        for(int i=0;i<tokens.length;i++){
            String n=tokens[i];
            // System.out.println(n);
            switch(n){
                case "+":
                            int num1=stack.pop();
                            int num2=stack.pop();
                            System.out.println(num1+ " " + num2);    
                            stack.push(num1+num2);
                        break;
                case "-":
                        num1=stack.pop();
                        num2=stack.pop();
                        stack.push(num2-num1);
                        break;
                 case "/":
                       num1=stack.pop();
                       num2=stack.pop();
                       System.out.println(num1+ " " + num2);
                          stack.push(num2/num1);
                        break;
                 case "*":
                         num1=stack.pop();
                         num2=stack.pop();
                          stack.push(num1*num2);
                        break;
                default:
                        int num=Integer.parseInt(n);
                        System.out.println(num);
                        stack.push(num);
                        break;
            }
        }
        return stack.isEmpty()?0:stack.pop();
    }
}