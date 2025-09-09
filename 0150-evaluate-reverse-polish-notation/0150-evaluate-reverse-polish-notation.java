class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> num = new Stack<>();
        for (String x : tokens) {
            int a;
            int b;
            switch (x) {
                case "+":
                     a = Integer.valueOf(num.pop());
                     b = Integer.valueOf(num.pop());
                    num.push(a + b);
                    break;
                case "-":
                     a = Integer.valueOf(num.pop());
                     b = Integer.valueOf(num.pop());
                    num.push(b- a);
                    break;
                case "/":
                     a = Integer.valueOf(num.pop());
                     b = Integer.valueOf(num.pop());
                    num.push(b / a);
                    break;
                case "*":
                     a = Integer.valueOf(num.pop());
                     b = Integer.valueOf(num.pop());
                    num.push(a * b);
                    break;
                default:
                    num.push(Integer.valueOf(x));
            }

        }

        return num.pop();
    }
}