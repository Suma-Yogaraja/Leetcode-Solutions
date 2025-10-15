class Solution {
    public int calculate(String s) {
        int sign = 1;
        int result = 0;
        int num = 0;
        char opr='+';//to remeber last operator
        Stack<Integer> stack = new Stack<>();
        for (char c : (s + "+").toCharArray()) {
            if (c == ' ')
                continue;
            else if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                // System.out.println(num);
            } else {
                switch (opr) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                        break;
                    default:
                        return -1;
                }
                opr=c;
                num = 0;
            }
        }
        while(!stack.isEmpty())result += stack.pop();
        return result;
    }
}