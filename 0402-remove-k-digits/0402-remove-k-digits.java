class Solution {

    public String removeKdigits(String num, int k) {

        //think of stack
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            char ch = num.charAt(i);
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(ch);
            i++;
        }
        while (k > 0 && !stack.isEmpty()) {//if string is 1234
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        if (sb.length() == 0) 
            return "0";
        return sb.toString();
    }

}