class Solution {
    public int calculate(String s) {
        Stack<int[]> stack=new Stack<>();
        int sign=1;
        int result=0;
        int num=0;
        char[] nums=s.toCharArray();
        for(int i=0;i<nums.length;i++){
            char n=nums[i];
            if(Character.isDigit(n)){
                //digit so start building number
                num=num*10 +(int)(n - '0');;
                // System.out.println(num);
            }
            else{
                switch(n){
                    case ' ':
                            break;
                    case '+':
                        result+=sign*num;
                        num=0;
                        sign=1;
                        break;
                    case '-':
                        result+=sign*num;
                        num=0;sign=-1;
                        break;
                    case '(':
                        stack.push(new int[]{result,sign});
                        result=0;
                        sign=1;
                        break;
                    case ')':
                        result+=sign*num;
                        num=0;
                        int res[]=stack.pop();
                        result=result*res[1];
                        result+=res[0];
                        break;
                    default:
                        
                }
                // prevOp=n;
            }
        }
        result+=sign*num;
        return result;
    }
}