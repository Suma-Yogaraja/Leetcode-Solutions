class Solution {
    public static class Pair {
        int number;
        int sign;

        public Pair(int number, int sign) {
            this.number = number;
            this.sign = sign;
        }
    }

    public int calculate(String s) {
        //sign,result,stack and num,operand
        //num->start building number
        //sign-set sign=this curr sign
        //any operand(+ or -),result+=sign*num
        //(-calculate the curr result ,push sign and result to stack
        //)-caclulate curr onr and pop prev ,result=prev+num*sign
        //" " ignore
        Stack<Pair> stack = new Stack<>();//{result,sign}
        int result = 0;
        int sign = 1;
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '+':
                    if (sb.length() > 0) {
                        num = Integer.parseInt(sb.toString());
                        result += num * sign;
                        sb.setLength(0);
                    }
                    sign = 1;
                    break;
                case '-':
                    if (sb.length() > 0) {
                        num = Integer.parseInt(sb.toString());
                        result += num * sign;
                        sb.setLength(0);
                    }
                    sign = -1;
                    break;
                case '(':
                    stack.push(new Pair(result, sign));
                    result = 0;
                    sign = 1;
                    break;
                case ')':
                    if (sb.length() > 0) {
                        result += sign * Integer.parseInt(sb.toString());
                        sb.setLength(0);
                    }
                    Pair prev = stack.pop();
                    int prevResult = prev.number;
                    int prevSign = prev.sign;
                    result = prevResult + prevSign * result;
                    break;
                case ' ':
                    break;
                default:
                    sb.append(c);
            }
        }
        //if there are any nums left we have to process
        if (sb.length() > 0) {
            num = Integer.parseInt(sb.toString());
            result += num * sign;
        }
        return result;
    }
}