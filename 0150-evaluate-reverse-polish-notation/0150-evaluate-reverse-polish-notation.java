class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> num = new Stack<>();
        for (String x : tokens) {
            switch (x) {
                case "+":
                    int add1 = Integer.valueOf(num.pop());
                    int add2 = Integer.valueOf(num.pop());
                    num.push(add1 + add2);
                    break;
                case "-":
                    int sub1 = Integer.valueOf(num.pop());
                    int sub2 = Integer.valueOf(num.pop());
                    num.push(sub1 - sub2);
                    break;
                case "/":
                    int divisor = Integer.valueOf(num.pop());
                    int divident = Integer.valueOf(num.pop());
                    num.push(divident / divisor);
                    break;
                case "*":
                    int mult1 = Integer.valueOf(num.pop());
                    int mult2 = Integer.valueOf(num.pop());
                    num.push(mult1 * mult2);
                    break;
                default:
                    num.push(Integer.valueOf(x));
            }

        }

        return num.pop();
    }
}